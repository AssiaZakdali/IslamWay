package a3.emsi.theislamway.service;

import a3.emsi.theislamway.dao.GroupRepository;
import a3.emsi.theislamway.dao.HizbRepository;
import a3.emsi.theislamway.dao.UserRepository;
import a3.emsi.theislamway.entities.Group;
import a3.emsi.theislamway.entities.Hizb;
import a3.emsi.theislamway.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class Utilisateurs implements UtilisateurInit{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HizbRepository hizbRepository;
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void initUser() {
        for(int i=1;i<=10;i++){
           User user = new User();
           user.setNom("Nom"+i);
           user.setPrenom("Prenom"+i);
           user.setAlias("Alias"+i);
           user.setGroup(null);
           user.setAbsence(i);
           user.setMail("Mail"+i);
           user.setPassWord("PassWord"+i);
           user.setCapLecture(i);
           user.setPoints(i);
           user.setHizbs(null);
           user.setPrivilege("Privilege"+1);

           userRepository.save(user);
        }

    }

    @Override
    public void initHizb() {
        for (int i=1;i<=60;i++){
            Hizb hizb=new Hizb();
            hizb.setLu(false);
            hizb.setUser(null);
            hizbRepository.save(hizb);
        }

    }

    @Override
    public void initGroup() {
        for(int i=1;i<=5;i++){
            Group group =new Group();
            group.setComplet(false);
            group.setUsers(null);
            groupRepository.save(group);
        }

    }
}
