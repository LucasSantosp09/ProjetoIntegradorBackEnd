package model;

public class Usuario {
    private String login;
    private String senha;

    private String tipo_usuario;

    public Usuario(String login, String senha, String tipo_usuario) {
        this.login = login;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", tipo_usuario='" + tipo_usuario + '\'' +
                '}';
    }
}
