/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.utils;

import com.br.vfbellaver.models.Imovel;
import com.br.vfbellaver.models.Inquilino;
import com.br.vfbellaver.models.ModeloContrato;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

/**
 *
 * @author leonilda
 */
public class CriarContratoRecibo {

    public File criarPDFContrato(ModeloContrato contrato, Imovel imovel,
            Inquilino inquilino, String dataEntrada, String valorAluguel, String localContrato,
            String dataContrato) {
        Document document = new Document();
        try {
            File file = new File("Contratos\\Contrato " + inquilino.getNome() + ".pdf");
        
            PdfWriter.getInstance(document, new FileOutputStream("Contratos\\Contrato " + inquilino.getNome() + ".pdf"));

            document.open();
            Paragraph titulo = new Paragraph(contrato.getNomeModeloContrato(), new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD));
            titulo.setAlignment(Element.ALIGN_CENTER);
            Paragraph locador = new Paragraph("\n\nIDENTIFICAÇÃO DAS PARTES CONTRATANTES\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD));
            document.add(titulo);
            document.add(locador);
            Paragraph conteudo = null;
            locador = new Paragraph("LOCADOR: " + contrato.getNomeLocatario() + ", " + contrato.getNacionalidadeLocatario() + ", "
                    + contrato.getEstadoCivilLocatario() + ", " + contrato.getRgLocatario() + ", "
                    + contrato.getCpfLocatario() + ", " + contrato.getEnderecoLocatario() + ".\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 12));
            locador.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(locador);
            Phrase ph = new Phrase("LOCATÁRIO: ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD));
            locador = new Paragraph("LOCATÁRIO: " + inquilino.getNome() + ", " + inquilino.getNacionalidade() + ", "
                    + inquilino.getRegistroGeral() + " " + inquilino.getOrgaoEmissor() + ", "
                    + inquilino.getCpf() + ", " + inquilino.getProfissao() + ", " + inquilino.getEndereco() + ", "
                    + inquilino.getTelefone() + ".\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 12));
            locador.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(locador);
            String clausulas = contrato.getClausulasContrato().replaceAll("data-atual", dataEntrada);
            
            //gerando valore extenso e replace de valor
            CurrencyWriter cw = new CurrencyWriter();
            clausulas = clausulas.replaceAll("valor-contrato", valorAluguel + "");
            String valorExtenso = cw.write(new BigDecimal(valorAluguel));
            System.out.println("valor extenso - "+valorExtenso);
            clausulas = clausulas.replaceAll("valor-extenso", valorExtenso + "");
            
            conteudo = new Paragraph(clausulas
                    + "\n\n" + localContrato + "\n" + dataContrato + "\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 12));
            conteudo.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(conteudo);
            conteudo = new Paragraph(
                    "_____________________________________\n"
                    + contrato.getNomeLocatario().toUpperCase() + "\nCPF:"
                    + contrato.getCpfLocatario() + "\n LOCADOR\n\n\n\n"
                    + "____________________________________\n"
                    + inquilino.getNome().toUpperCase() + "\nCPF:"
                    + inquilino.getCpf() + "\n LOCATÁRIO\n\n\n\n",
                    new Font(Font.FontFamily.UNDEFINED, 12));
            conteudo.setAlignment(Element.ALIGN_CENTER);
            document.add(conteudo);
            document.close();
            return file;
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return null;
    }

    public File criarPDFRecibo(ModeloContrato contrato,
            Inquilino inquilino, String recibo, String localContrato,
            String dataContrato) {
        Document document = new Document();
        try {
            
            File file = new File("Recibos\\Recibo " + inquilino.getNome() + ".pdf");
           
            PdfWriter.getInstance(document, new FileOutputStream("Recibos\\Recibo " + inquilino.getNome() + ".pdf"));

            document.open();
            Paragraph titulo = new Paragraph("RECIBO DE PAGAMENTO DE ALUGUEL\n\n",
                    new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            Paragraph conteudo = new Paragraph(recibo + "\n\n" + localContrato + ", "
                    + "" + dataContrato + "\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 12));
            conteudo.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(conteudo);
            conteudo = new Paragraph(
                    "_____________________________________\n"
                    + contrato.getNomeLocatario().toUpperCase() + "\nCPF:"
                    + contrato.getCpfLocatario() + "\n LOCADOR",
                    new Font(Font.FontFamily.UNDEFINED, 12));
            conteudo.setAlignment(Element.ALIGN_CENTER);
            document.add(conteudo);
          
            titulo = new Paragraph("\n\n\n\nRECIBO DE PAGAMENTO DE ALUGUEL\n\n",
                    new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            conteudo = new Paragraph(recibo + "\n\n" + localContrato + ", "
                    + "" + dataContrato + "\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 12));
            conteudo.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(conteudo);
            conteudo = new Paragraph(
                    "_____________________________________\n"
                    + contrato.getNomeLocatario().toUpperCase() + "\nCPF:"
                    + contrato.getCpfLocatario() + "\n LOCADOR",
                    new Font(Font.FontFamily.UNDEFINED, 12));
            conteudo.setAlignment(Element.ALIGN_CENTER);
            document.add(conteudo);
            document.close();
            return file;
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return null;
    }

}
