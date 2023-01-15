package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.feedback.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, String> {
}
