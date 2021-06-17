package packagetwo;

public class Encapsulationpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EncapAttributes att= new EncapAttributes();
		
		System.out.println(att.getColor());
		att.setColor("blue");
		
		System.out.println(att.getColor());
	}

}
