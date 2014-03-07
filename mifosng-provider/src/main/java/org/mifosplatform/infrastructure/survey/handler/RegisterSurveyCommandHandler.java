package org.mifosplatform.infrastructure.survey.handler;

import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.mifosplatform.infrastructure.survey.service.WriteLikelihoodService;
import org.mifosplatform.infrastructure.survey.service.WriteSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Cieyou on 3/12/14.
 */

@Service
public class RegisterSurveyCommandHandler implements NewCommandSourceHandler {


    private final WriteSurveyService writePlatformService;

    @Autowired
    public RegisterSurveyCommandHandler(final WriteSurveyService writePlatformService) {
        this.writePlatformService = writePlatformService;
    }

    @Transactional
    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {

        return this.writePlatformService.registerSurvey(command);
    }
}
