package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;

import kodlamaio.hrms.entities.concrate.CandidateSchool;

import java.util.List;

public interface CandidateSchoolService {
    Result add(CandidateSchool candidateSchool);

    DataResult<List<CandidateSchool>> getAll();
}
