package com.example.capstoneprojectbe.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter// lombook
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_workhistory")
public class WorkHistory  {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String workHistoryID;

//    private String userID;

//    private String storeID;

    private String dateIn;

    private String dateOut;

    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeID")
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    private User user;




}
