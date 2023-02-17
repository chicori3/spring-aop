package hello.springaop.exam;

import hello.springaop.exam.annotation.Retry;
import hello.springaop.exam.annotation.Trace;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository {

    private static int seq = 0;

    @Trace
    @Retry
    public String save(String itemId) {
        seq++;

        if (seq % 5 == 0) {
            throw new IllegalStateException("예외 발생");
        }
        return "ok";
    }
}
