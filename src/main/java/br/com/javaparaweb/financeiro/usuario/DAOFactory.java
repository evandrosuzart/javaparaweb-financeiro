package br.com.javaparaweb.financeiro.usuario;

import br.com.javaparaweb.financeiro.util.HibernateUtil;

public class DAOFactory {
	public static UsuarioDAOHibernate criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
