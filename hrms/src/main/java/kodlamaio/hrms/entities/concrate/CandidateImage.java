package kodlamaio.hrms.entities.concrate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name="candidate_image")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateImage {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="image_path")
    private String imagePath;



    @ManyToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;


}
