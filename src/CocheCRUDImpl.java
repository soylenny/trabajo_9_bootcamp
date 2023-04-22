import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }
    String delete = "borrar";
    String save = "guardar";
    String findAll = "todo";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "delete='" + delete + '\'' +
                ", save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                '}';
    }
}
