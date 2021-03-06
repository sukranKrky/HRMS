package kodlamaio.hrms.api.Controllers;


import kodlamaio.hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.hrms.business.abstracts.CandidateSchoolService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concrate.CandidateCoverLetter;
import kodlamaio.hrms.entities.concrate.CandidateImage;
import kodlamaio.hrms.entities.concrate.CandidateLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidateLanguages")
@CrossOrigin
public class CandidateLanguageControllers {

    private CandidateLanguageService candidateLanguageService;

    @Autowired
    public CandidateLanguageControllers(CandidateLanguageService candidateLanguageService){
        super();
        this.candidateLanguageService=candidateLanguageService;
    }

    @PostMapping("/add")

    public Result add(@RequestBody CandidateLanguage candidateLanguage){
        return this.candidateLanguageService.add(candidateLanguage);
    }
    @GetMapping("/getAll")

    public DataResult<List<CandidateLanguage>> getAll(){
        return this.candidateLanguageService.getAll();
    }


    @DeleteMapping("/delete")

    public  Result delete( int id){
        return  this.candidateLanguageService.delete(id);
    }

    @GetMapping("/getByCandidateId")

    public DataResult<CandidateLanguage> getByCandidateId(int id){
        return this.candidateLanguageService.getByCandidateId(id);
    }

    @PutMapping("/update")
    public Result update(@RequestBody CandidateLanguage candidateLanguage){
        return this.candidateLanguageService.update(candidateLanguage);}


}
