public class FloAdapter implements IProfessional {
    private final ITrainee florista;

    public FloAdapter(ITrainee florista) {
        this.florista = florista;
    }

    @Override
    public String getInfo() {
        return florista.getDetail();
    }
}
