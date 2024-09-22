package classes;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data();

		data1.dia = 25;
		data1.mes = 12;
		data1.ano = 1996;

		Data data2 = new Data();

		System.out.println(data1.dataFormatada());
		System.out.println(data2.dataFormatada());

	}

}
