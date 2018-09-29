/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import static entity.studentdetails_.id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.metamodel.SingularAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author QUYNH
 */
@Entity

@Table(name = "STUDENTDETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT b FROM student b")
    , @NamedQuery(name = "Student.findrollNumber", query = "SELECT b FROM studentdetails b WHERE b.rollNumber = :rollNumber")
    , @NamedQuery(name = "Student.findname", query = "SELECT b FROM studentdtails b WHERE b.name = :bookname")
    , @NamedQuery(name = "Student.findclass", query = "SELECT b FROM studentdetails b WHERE b.class = :class")
    , @NamedQuery(name = "Student.findemail", query = "SELECT b studentdetails WHERE b.email = :email")
} )  
public class studentdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNumber;
    private String name;
    private String clas;
    private String email;

   
    public int rollNumber(){
        return rollNumber;
        
    }
    public String name(){
        return name;
    }
    public String clas(){
        return clas;
    }
    public String email(){
        return email;
    }


   
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof studentdetails)) {
            return false;
        }
        studentdetails other = (studentdetails) object;
        if (this.rollNumber == null && (other.rollNumber != null || (this.rollNumber != null && !this.rollNumber.equals(other.rollNumber)))) {
            return false;
        } else {
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.studentdetails[ id=" + id + " ]";
    }

}
