package mx.aioria.cucumber.stepdefs;

import mx.aioria.AioriaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AioriaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
