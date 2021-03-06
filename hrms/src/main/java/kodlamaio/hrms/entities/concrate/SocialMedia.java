package kodlamaio.hrms.entities.concrate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="social_medias")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")


public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="github_link")
    private String githubLink;

    @Column(name="linkedin_link")
    private String linkedinLink;

    @ManyToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="resume_id")
    private Resume resume;



}
