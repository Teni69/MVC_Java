package uni.eszterhazy.keretrendszer.dao.relational;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import uni.eszterhazy.keretrendszer.dao.KonyvDAO;
import uni.eszterhazy.keretrendszer.exceptions.KonyvAlreadyAdded;
import uni.eszterhazy.keretrendszer.exceptions.KonyvNotFound;
import uni.eszterhazy.keretrendszer.model.Fajta;
import uni.eszterhazy.keretrendszer.model.Konyv;

import java.util.Collection;

public class KonyvDAORelational implements KonyvDAO {

    private static SessionFactory factory;

    public KonyvDAORelational() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void createKonyv(Konyv konyv) throws KonyvAlreadyAdded {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(konyv);
        tx.commit();
        session.close();
    }

    public Collection<Konyv> readAllKonyv() {
        Session session = factory.openSession();
        Collection<Konyv> result = session.createQuery("FROM Konyv").list();
        return result;
    }

    public Konyv readKonyv(String id) throws KonyvNotFound {
        Session session = factory.openSession();
        Konyv result = session.get(Konyv.class, id);
        return result;
    }

    public void updateKonyv(Konyv konyv) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(konyv);
        tx.commit();
        session.close();
    }

    public void deleteKonyv(Konyv konyv) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(konyv);
        tx.commit();
        session.close();
    }

    public Collection<Konyv> readAllKonyvOfFajta(Fajta fajta) {
        Session session = factory.openSession();
        String hql = "FROM Konyv WHERE fajta = :fajta";
        Query q = session.createQuery(hql);
        q.setParameter("fajta",fajta);
        Collection result = q.list();
        return result;
    }
}
