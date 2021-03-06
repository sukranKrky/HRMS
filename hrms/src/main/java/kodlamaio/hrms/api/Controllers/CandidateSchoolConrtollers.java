package kodlamaio.hrms.api.Controllers;

import kodlamaio.hrms.business.abstracts.CandidateSchoolService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concrate.CandidateCoverLetter;
import kodlamaio.hrms.entities.concrate.CandidateSchool;
import kodlamaio.hrms.entities.concrate.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/candidateSchools"})
@CrossOrigin
public class CandidateSchoolConrtollers {

    private CandidateSchoolService candidateSchoolService;

    @Autowired
    public CandidateSchoolConrtollers(CandidateSchoolService candidateSchoolService){
        super();
        this.candidateSchoolService=candidateSchoolService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CandidateSchool>> getAll(){
        return this.candidateSchoolService.getAll();

    }

    @PostMapping("/add")
    public Result add(@RequestBody CandidateSchool candidateSchool) {
        return this.candidateSchoolService.add(candidateSchool);
    }
    @DeleteMapping("/delete")

    public  Result delete( int id){
        return  this.candidateSchoolService.delete(id);
    }

    @GetMapping("/getByCandidateId")

    public DataResult<List<CandidateSchool>> getByCandidateId(int id){
        return this.candidateSchoolService.getByCandidateId(id);
    }
    @PutMapping("/update")
    public Result update(@RequestBody CandidateSchool candidateSchool){
        return this.candidateSchoolService.update(candidateSchool);}


}
