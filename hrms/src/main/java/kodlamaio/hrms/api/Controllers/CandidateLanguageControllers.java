package kodlamaio.hrms.api.Controllers;


import kodlamaio.hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.hrms.business.abstracts.CandidateSchoolService;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concrate.CandidateLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidateLanguages")
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



}