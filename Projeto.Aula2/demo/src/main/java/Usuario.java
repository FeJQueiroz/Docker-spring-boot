import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.InitBinder;

import java.lang.annotation.Repeatable;


@EntityScan
@Repeatable(name = "usuario")

public class Usuario {

    @InitBinder
    private String usuario;
    private String nome;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
