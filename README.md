# SEO Technical Task

Example of what is expected from SEO Test Engineer technical task.

In order to get API test to work you will need to add your key into api.properties

- Updated pom - serinity.verion

-----------------------------------------------------------------------------------

# Overview

* You will be required to clone an existing automation framework and fix any issues preventing the tests from being
  executed successfully according the requirements. You will then use this framework to create new automated tests for
  the various scenarios provided. Finally, you will be asked to improve this framework’s efficiency in some way.

## Submission

To submit your technical assessment, you will be required to create a new project on GitLab - https://gitlab.com/explore
You should use your candidate number as project name, so if your candidate number is 12345, we would see
gitlab.com/{username}/candidate-12345 The project must be private and the user “@HOQAT” must be added as a member of the
project with reporter access.

## Languages/Frameworks

We would like to see submissions using either Java with the Serenity Framework, you may wish to look at

- https://github.com/serenity-bdd/serenity-cucumber-starter
  JavaScript with Cypress, you may wish to look at - https://github.com/TheBrainFamily/cypress-cucumber-preprocessor
  If you wish to use another language, such as Python or .NET Core please make sure that you can demonstrate the
  requirements

## Requirements

The project must include a readme and list any pre-requisites and instructions on how to execute the tests The UI tests
must be written using Gherkin syntax - https://cucumber.io/docs/gherkin/reference/
The UI tests should run on the current stable channel of Chrome The tests should be written so that they are reusable if
additional scenarios were added The tests should be executable from the command line (so that they could be used in a CI
pipeline)
The test execution should be platform agnostic (Windows, macOS, Linux)
The test outputs should include a report of the tests executed

## Assessment Scenarios

### UI - Gov UK Visa Check

For this stage of the assessment, you will need to clone the repo available
at https://gitlab.com/HOQAT/seo_technical_assessment_starter. This repo contains a serenity framework that has been set
up previously but is currently having some issues running. Your brief is as follows:

Resolve any existing issues. Complete the Test Pack so that these scenarios are completed successfully

- An Australian coming to the UK for Tourism.
- A Chilean coming to the UK for Work and plans on staying for longer than 6 months.
- A Columbian national coming to the UK to join a partner for a long stay. The person they are visiting is a British
  citizen.
- Incorporate at least one method to improve either the efficiency of the test framework or the time it takes for the
  scenarios to complete. E.g. Test Parallelisation

### API - Met Office

Your task is to test the Met Office DataPoint API (https://www.metoffice.gov.uk/services/data/datapoint). In order to
access this API you will have to register for an authorisation token and this process can be found
on https://www.metoffice.gov.uk/services/data/datapoint/getting-started. Once you have received your API key you are
ready to proceed with the task at hand. Which is as follows:

Set up a request for the ‘sitelist’ endpoint for which results are available for the daily and three-hourly forecast
data feeds. You should navigate this list in the most efficient way possible and find the Location ID for ‘Croydon’.
With this ID you will then need to query the daily forecast information and assert that, a) you have accessed the
correct location and b) that the parameter with name ‘S’ has a description of wind speed.
