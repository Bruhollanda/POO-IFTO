public abstract class FormaTridimensional extends Forma {

    public FormaTridimensional(String descricao) {
        super(descricao);
    }

    @Override
    public abstract double obterArea();

    public abstract double obterVolume();
}// class
