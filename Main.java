package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Nível 1: O Básico da Tomada de Decisão (O if/else Simples)");
        System.out.println("----------------------------------------");

        // Exercício 1: Validação de Empréstimo Básico
        System.out.println("Exercício 1: Validação de Empréstimo Básico");
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o valor da parcela do empréstimo desejado: R$ ");
        double valorParcela = scanner.nextDouble();

        // Calcula 30% do salário
        double trintaPorcentoSalario = salario * 0.30;

        // Verifica se a parcela ultrapassa 30% do salário
        if (valorParcela > trintaPorcentoSalario) {
            System.out.println("Empréstimo Negado");
        } else {
            System.out.println("Empréstimo Aprovado");
        }

        // Exercício 2: Controle de Estoque Operacional
        System.out.println("Exercício 2: Controle de Estoque Operacional");
        System.out.print("Digite a quantidade de um produto disponível no estoque: ");
        int estoqueAtual = scanner.nextInt();
        System.out.print("Digite a quantidade que o cliente deseja comprar: ");
        int quantidadeDesejada = scanner.nextInt();

        // Verifica se a quantidade desejada é maior que o estoque
        if (quantidadeDesejada > estoqueAtual) {
            System.out.println("Venda Bloqueada: Estoque Insuficiente");
        } else {
            System.out.println("Venda Aprovada");
            // Calcula a quantidade restante no estoque
            int estoqueRestante = estoqueAtual - quantidadeDesejada;
            System.out.println("Quantidade de itens que restou no estoque: " + estoqueRestante);
        }

        System.out.println("----------------------------------------");
        System.out.println("Nível 3: Múltiplos Caminhos e Faixas (else if)");
        System.out.println("----------------------------------------");

        // Exercício 3: Classificação de Clientes por Faturamento
        System.out.println("Exercício 3: Classificação de Clientes por Faturamento");
        System.out.print("Digite o valor total das compras do cliente no ano: R$ ");
        double valorCompras = scanner.nextDouble();

        // Classifica o cliente com base no valor das compras
        if (valorCompras < 1000.00) {
            System.out.println("Categoria do Cliente: Bronze");
        } else if (valorCompras >= 1000.00 && valorCompras < 5000.00) { // De R$ 1.000,00 até R$ 4.999,99
            System.out.println("Categoria do Cliente: Prata");
        } else { // De R$ 5.000,00 para cima
            System.out.println("Categoria do Cliente: Ouro");
        }

        // Exercício 4: Cálculo simplificado de Imposto de Renda
        System.out.println("Exercício 4: Cálculo Simplificado de Imposto de Renda");
        System.out.print("Digite o salário da pessoa para cálculo do IR: R$ ");
        double salarioIR = scanner.nextDouble();
        double impostoAPagar = 0;

        // Calcula o imposto de renda e salário líquido
        if (salarioIR <= 2000.00) {
            System.out.println("Situação: Isento");
        } else if (salarioIR > 2000.00 && salarioIR <= 4000.00) { // De R$ 2.000,01 até R$ 4.000,00
            impostoAPagar = salarioIR * 0.10; // 10% de retenção
            System.out.printf("Valor do imposto a ser pago: R$ %.2f ", impostoAPagar);
            System.out.printf("Salário líquido: R$ %.2f ", (salarioIR - impostoAPagar));
        } else { // Acima de R$ 4.000,00
            impostoAPagar = salarioIR * 0.20; // 20% de retenção
            System.out.printf("Valor do imposto a ser pago: R$ %.2f ", impostoAPagar);
            System.out.printf("Salário líquido: R$ %.2f ", (salarioIR - impostoAPagar));
        }

        System.out.println("----------------------------------------");
        System.out.println("Nível 3: Regras de Negócio Compostas (Operadores && e ||)");
        System.out.println("----------------------------------------");

        // Exercício 5: Política de Descontos Agressiva
        System.out.println("Exercício 5: Política de Descontos Agressiva");
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompraTotal = scanner.nextDouble();
        System.out.print("Digite o tipo de cliente (1 para Novo, 2 para Antigo): ");
        int tipoCliente = scanner.nextInt();
        double valorFinal = valorCompraTotal;

        // Aplica desconto se a compra for maior que R$ 500 OU se for cliente novo
        if (valorCompraTotal > 500.00 || tipoCliente == 1) {
            valorFinal = valorCompraTotal * 0.85; // 15% de desconto
            System.out.printf("Desconto aplicado! Valor final a ser pago: R$ %.2f ", valorFinal);
        } else {
            System.out.printf("Nenhum desconto aplicado. Valor final a ser pago: R$ %.2f ", valorFinal);
        }

        // Exercício 6: Avaliação de Desempenho (RH)
        System.out.println("Exercício 6: Avaliação de Desempenho (RH)");
        System.out.print("Digite a Nota Técnica do colaborador (0 a 10): ");
        double notaTecnica = scanner.nextDouble();
        System.out.print("Digite a Nota de Comportamento do colaborador (0 a 10): ");
        double notaComportamento = scanner.nextDouble();

        // Verifica critérios para promoção
        if (notaTecnica >= 7 && notaComportamento >= 8) {
            System.out.println("Colaborador Promovido!");
        } else {
            System.out.println("Não atende aos critérios para promoção no momento.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Nível 4: Menus e Categorias Discretas (switch-case)");
        System.out.println("----------------------------------------");

        // Exercício 7: Menu de Autoatendimento (URA)
        System.out.println("Exercício 7: Menu de Autoatendimento (URA)");
        System.out.println("Escolha uma opção:");
        System.out.println("[1] Falar com Financeiro");
        System.out.println("[2] Falar com Suporte");
        System.out.println("[3] Falar com Comercial");
        System.out.println("[4] Encerrar");
        System.out.print("Sua escolha: ");
        int escolhaMenu = scanner.nextInt();

        // Usa switch-case para processar a escolha do usuário
        switch (escolhaMenu) {
            case 1:
                System.out.println("Você escolheu Falar com Financeiro. Por favor, aguarde.");
                break;
            case 2:
                System.out.println("Você escolheu Falar com Suporte. Um técnico irá te atender.");
                break;
            case 3:
                System.out.println("Você escolheu Falar com Comercial. Em breve entraremos em contato.");
                break;
            case 4:
                System.out.println("Encerrando o atendimento. Obrigado!");
                break;
            default:
                System.out.println("Opção inválida. Por favor, digite um número de 1 a 4.");
                break;
        }

        // Exercício 8: Calculadora de Frete Fixo por Região
        System.out.println("Exercício 8: Calculadora de Frete Fixo por Região");
        System.out.print("Digite o valor do produto: R$ ");
        double valorProdutoFrete = scanner.nextDouble();
        System.out.println("Digite o código da região para o frete:");
        System.out.println("[1] Sul");
        System.out.println("[2] Sudeste");
        System.out.println("[3] Centro-Oeste");
        System.out.print("Sua escolha: ");
        int codigoRegiao = scanner.nextInt();

        double taxaFretePercentual = 0;
        String nomeRegiao = "";

        // Usa switch para aplicar a taxa de frete correta por região
        switch (codigoRegiao) {
            case 1:
                taxaFretePercentual = 0.10; // 10% do valor para sul
                nomeRegiao = "Sul";
                break;
            case 2:
                taxaFretePercentual = 0.12; // 12% do valor para sudeste
                nomeRegiao = "Sudeste";
                break;
            case 3:
                taxaFretePercentual = 0.15; // 15% do valor para Centro-Oeste
                nomeRegiao = "Centro-Oeste";
                break;
            default:
                System.out.println("Código de região inválido. Não será possível calcular o frete.");
                taxaFretePercentual = -1; // Indica erro
                break;
        }

        if (taxaFretePercentual != -1) {
            double valorFrete = valorProdutoFrete * taxaFretePercentual;
            double totalNota = valorProdutoFrete + valorFrete;
            System.out.printf("Região selecionada: %s ", nomeRegiao);
            System.out.printf("Valor do frete (%.0f%%): R$ %.2f ", (taxaFretePercentual * 100), valorFrete);
            System.out.printf("Total da nota (Produto + Frete): R$ %.2f ", totalNota);
        }


        System.out.println("----------------------------------------");
        System.out.println("Nível 5: O Desafio do Chefe (Integração Total)");
        System.out.println("----------------------------------------");

        // Exercício 9: Sistema de Financiamento de Veículos
        System.out.println("Exercício 9: Sistema de Financiamento de Veículos");
        System.out.print("Digite o valor do veículo: R$ ");
        double valorVeiculo = scanner.nextDouble();
        System.out.print("Digite o valor da entrada: R$ ");
        double valorEntrada = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas (12, 24 ou 36): ");
        int quantidadeParcelas = scanner.nextInt();

        // Regra 1: Entrada mínima de 20% do valor do veículo
        double entradaMinima = valorVeiculo * 0.20;
        if (valorEntrada < entradaMinima) {
            System.out.println("Entrada insuficiente. O valor mínimo de entrada é R$ " + entradaMinima);
        } else {
            // Regra 2: Cálculo dos juros e parcela mensal
            double valorAFinanciar = valorVeiculo - valorEntrada;
            double jurosPercentual = 0;

            switch (quantidadeParcelas) {
                case 12:
                    jurosPercentual = 0; // Sem juros
                    break;
                case 24:
                    jurosPercentual = 0.10; // 10% de juros no montante
                    break;
                case 36:
                    jurosPercentual = 0.15; // 15% de juros no montante
                    break;
                default:
                    System.out.println("Quantidade de parcelas inválida. Escolha 12, 24 ou 36.");
                    jurosPercentual = -1; // Indica erro
                    break;
            }

            if (jurosPercentual != -1) {
                double montanteComJuros = valorAFinanciar * (1 + jurosPercentual);
                double valorParcelaMensal = montanteComJuros / quantidadeParcelas;
                System.out.printf("Valor exato da parcela mensal: R$ %.2f ", valorParcelaMensal);
            }
        }

        // Exercício 10: Tributação Cruzada (ICMS)
        System.out.println("Exercício 10: Tributação Cruzada (ICMS)");
        System.out.print("Digite a sigla do estado destino (1 para SP, 2 para RJ, 3 para MG): ");
        int estadoDestino = scanner.nextInt();
        System.out.print("Digite a Categoria do Produto (1 para Essencial, 2 para Supérfluo): ");
        int categoriaProduto = scanner.nextInt();

        double impostoBase = 0;
        String nomeEstado = "";

        // O switch trata o estado destino
        switch (estadoDestino) {
            case 1:
                impostoBase = 0.10; // SP: 10%
                nomeEstado = "SP";
                break;
            case 2:
                impostoBase = 0.15; // RJ: 15%
                nomeEstado = "RJ";
                break;
            case 3:
                impostoBase = 0.12; // MG: 12%
                nomeEstado = "MG";
                break;
            default:
                System.out.println("Estado destino inválido.");
                impostoBase = -1; // Indica erro
                break;
        }

        if (impostoBase != -1) {
            if (categoriaProduto == 2) {
                impostoBase += 0.05; // Adiciona mais 5% de taxa
            } else if (categoriaProduto != 1) {
                System.out.println("Categoria do produto inválida. A taxa será calculada apenas com o imposto base do estado.");
            }

            System.out.printf("Para o estado %s e categoria %s, a porcentagem total de imposto será de %.0f%% ",
                    nomeEstado,
                    (categoriaProduto == 1 ? "Essencial" : (categoriaProduto == 2 ? "Supérfluo" : "Inválida")),
                    (impostoBase * 100));
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
