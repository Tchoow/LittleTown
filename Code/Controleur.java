public class Controleur
{
	private Metier metier;

	private IhmCUI ihm;

	public Controleur()
	{
		this.metier = new Metier(this);

		this.ihm    =  new IhmCUI   ( );

		this.lancerJeu();
	}

	private void lancerJeu()
	{
		int action;

		this.ihm.afficher();

		while ( this.metier.getTour() <= 4 )
		{
			action = this.ihm.getChoix();
			System.out.println(action);

			/*
			switch ( action )
			{
				case 1 : this.metier.placerOuvrier     ( );
				case 2 : this.metier.construireBatiment     (  );
				case 3 : this.metier.activerTuile     (  );
				case 4 : this.metier.getInfoBatiment     ( );
				case 5 : this.metier.echangerPiece     (  );
				case 6 : this.metier.finTour     (  );

			}
			*/

			this.metier.changerJoueurActif();

			this.ihm.afficher();
		}
	}

	public static void main(String[] a)
	{
		new Controleur();
	}
}
