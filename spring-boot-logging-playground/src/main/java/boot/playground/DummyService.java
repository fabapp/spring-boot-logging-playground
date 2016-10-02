/**
 * 
 */
package boot.playground;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Fabian Krüger
 *
 */
@Service
public class DummyService {
	private static final Logger logger = LoggerFactory.getLogger(DummyService.class);
	
	/**
	 * 
	 */
	public DummyService() {
		logger.debug("Constructor called");
	}
	
//	@PostConstruct
//	public void init() {
//		logger.debug("log debug...");
//		logger.info("log info...");
//		logger.warn("log warn...");
//	}
}
