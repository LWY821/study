package hellojpa;

import javax.persistence.*;

public class JpaMain {
    public static void main(String[]args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx= em.getTransaction();
        tx.begin();

        try{
            Member member= em.find(Member.class,150L);
            member.setName("zzzzz");

//            em.persist(member1);
//            em.persist(member2);
//            member.setId(101L);
//            member.setName("HelloJPA");
//
            System.out.println("====BEFORE===");
//            em.persist(member);
//            System.out.println("===AFTER===");
//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//            System.out.println("findMember.id="+ findMember.getId());
//            System.out.println("findMember=.name=" +findMember.getName());

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
