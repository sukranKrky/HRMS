package kodlamaio.hrms.business.concrate;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologyDao;

import kodlamaio.hrms.entities.concrate.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    private TechnologyDao technologyDao;


    @Autowired
    public TechnologyManager(TechnologyDao technologyDao) {
        super();
        this.technologyDao = technologyDao;
    }

    @Override
    public Result add(Technologies technologies) {
        this.technologyDao.save(technologies);
        return new SuccessResult("Teknoloji bilginiz eklendi eklendi.");
    }

    @Override
    public DataResult<List<Technologies>> getAll() {
        return new SuccessDataResult<List<Technologies>>
                (this.technologyDao.findAll(),"Data Listelendi.");
    }
}
