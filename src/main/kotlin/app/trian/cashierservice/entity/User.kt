package app.trian.cashierservice.entity

import app.trian.cashierservice.model.UserType
import javax.persistence.*

@Entity
@Table
data class User(
    @Id
    @GeneratedValue
    var UserID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "RoleID")
    var role:Role,
    @Column
    var uid:String,
    @Column
    var username:String,
    @Column
    var password:String,
    @Column
    var email:String,
    @Column
    var type:UserType,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)