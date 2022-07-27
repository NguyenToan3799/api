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
@Table(name = "tbl_workinghour")
public class WorkingHour{

    @Id
    private String workingHourID;

    private String date;

    private String shift;

    private String timeIn;

    private String timeOut;

    private float totalWorkingHour;

    private boolean workingHourStatus;

    // relationship working - user: n-1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    private User user;
}
