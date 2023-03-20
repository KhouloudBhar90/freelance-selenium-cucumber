@Bouletcorp
Feature: Naviger dans l application bouletcorp.com
  En tant qu’utilisateur je me rends sur bouletcorp.com

  @Aleatoire
  Scenario: Naviger sur la page Aleatoire
    Given J accede a l application bouletcorp.com
    When Je clique sur Aleatoire
    Then la page a change "https://bouletcorp.com"
    And les widgets facebook twitter et tumblr sont bien affiches

  
