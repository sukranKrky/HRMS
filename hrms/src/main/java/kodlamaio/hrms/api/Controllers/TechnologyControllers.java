package kodlamaio.hrms.api.Controllers;


import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concrate.CandidateCoverLetter;
import kodlamaio.hrms.entities.concrate.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tegnology")
@CrossOrigin
public class TechnologyControllers {

    private TechnologyService technologyService;

    @Autowired
    public TechnologyControllers(TechnologyService technologyService){
        super();
        this.technologyService=technologyService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Technologies>> getAll(){
        return this.technologyService.getAll();

    }

    @PostMapping("/add")
    public Result add(@RequestBody Technologies technologies) {

        return this.technologyService.add(technologies);
    }
    @DeleteMapping("/delete")

    public  Result delete( int id){
        return  this.technologyService.delete(id);
    }

    @GetMapping("/getByCandidateId")

    public DataResult<Technologies> getByCandidateId(int id){
        return this.technologyService.getByCandidateId(id);
    }
    @PutMapping("/update")
    public Result update(@RequestBody Technologies technologies){
        return this.technologyService.update(technologies);}

}
