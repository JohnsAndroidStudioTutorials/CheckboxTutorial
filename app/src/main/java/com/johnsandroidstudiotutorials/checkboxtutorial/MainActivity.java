package com.johnsandroidstudiotutorials.checkboxtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox impressiveSkillsCheckbox, willingnessToLearnCheckbox, debuggingSkillsCheckbox, workEnvironmentMatchCheckBox, problemSolvingSkillsCheckbox, passionForTheWorkCheckbox, graceUnderFireCheckbox, peopleSkillsCheckbox, lazinessCheckbox, aBusinessPerspectiveCheckbox, abilityToPlanCheckbox, abilityToHandleFailureCheckbox, teamworkMentalityCheckbox, willingnessToResearchCheckbox, respectForDeadlinesCheckbox;
    Button submitButton;

    ArrayList<String> qualitiesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeCheckboxes();
        setupSubmitButton();
    }

    private void initializeCheckboxes() {
        impressiveSkillsCheckbox = (CheckBox) findViewById(R.id.impressive_skills_checkbox);
        willingnessToLearnCheckbox = (CheckBox) findViewById(R.id.willingness_to_learn_checkbox);
        debuggingSkillsCheckbox = (CheckBox) findViewById(R.id.debugging_skills_checkbox);
        workEnvironmentMatchCheckBox = (CheckBox) findViewById(R.id.work_environment_match_checkbox);
        problemSolvingSkillsCheckbox = (CheckBox) findViewById(R.id.problem_solving_skills_checkbox);
        passionForTheWorkCheckbox = (CheckBox) findViewById(R.id.passion_for_the_work_checkbox);
        graceUnderFireCheckbox = (CheckBox) findViewById(R.id.grace_under_fire_checkbox);
        peopleSkillsCheckbox = (CheckBox) findViewById(R.id.people_skills_checkbox);
        lazinessCheckbox = (CheckBox) findViewById(R.id.laziness_checkbox);
        aBusinessPerspectiveCheckbox = (CheckBox) findViewById(R.id.a_business_perspective_checkbox);
        abilityToPlanCheckbox = (CheckBox) findViewById(R.id.ability_to_plan_checkbox);
        abilityToHandleFailureCheckbox = (CheckBox) findViewById(R.id.ability_to_handle_failure_checkbox);
        teamworkMentalityCheckbox = (CheckBox) findViewById(R.id.teamwork_mentality_checkbox);
        willingnessToResearchCheckbox = (CheckBox) findViewById(R.id.willingness_to_research_checkbox);
        respectForDeadlinesCheckbox = (CheckBox) findViewById(R.id.respect_for_deadlines_checkbox);
    }

    private void setupSubmitButton() {
        submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qualitiesArrayList.clear();
                if (impressiveSkillsCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(impressiveSkillsCheckbox));
                }
                if (willingnessToLearnCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(willingnessToLearnCheckbox));
                }
                if (debuggingSkillsCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(debuggingSkillsCheckbox));
                }
                if (workEnvironmentMatchCheckBox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(workEnvironmentMatchCheckBox));
                }
                if (problemSolvingSkillsCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(problemSolvingSkillsCheckbox));
                }
                if (passionForTheWorkCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(passionForTheWorkCheckbox));
                }
                if (graceUnderFireCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(graceUnderFireCheckbox));
                }
                if (peopleSkillsCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(peopleSkillsCheckbox));
                }
                if (lazinessCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(lazinessCheckbox));
                }
                if (aBusinessPerspectiveCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(aBusinessPerspectiveCheckbox));
                }
                if (abilityToPlanCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(abilityToPlanCheckbox));
                }
                if (abilityToHandleFailureCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(abilityToHandleFailureCheckbox));
                }
                if (teamworkMentalityCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(teamworkMentalityCheckbox));
                }
                if (willingnessToResearchCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(willingnessToResearchCheckbox));
                }
                if (respectForDeadlinesCheckbox.isChecked()) {
                    qualitiesArrayList.add(getCheckBoxText(respectForDeadlinesCheckbox));
                }
                displayPopup(qualitiesArrayList.size());
            }

        });
    }

    private String getCheckBoxText(CheckBox checkBox) {
        return checkBox.getText().toString();
    }

    private void displayPopup(int size) {
        String programmerType;

        if (size <= 5)
            programmerType = "you are definitely not a programmer";
        else if (size >= 6 && size <= 10)
            programmerType = "You may be a programmer";
        else if (size > 10)
            programmerType = "you are the programmer master";
        else
            programmerType = "what happened to my code";

        Toast.makeText(this, "You had (" + size + "/" + 15 + ") qualities of a programmer \n\n" +
                        "Your qualities were:\n\n" + qualitiesArrayList.toString() + "\n\n" + programmerType,
                Toast.LENGTH_LONG).show();
    }
}
