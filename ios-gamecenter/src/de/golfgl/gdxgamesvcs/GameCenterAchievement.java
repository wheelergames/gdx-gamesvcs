package de.golfgl.gdxgamesvcs;

import de.golfgl.gdxgamesvcs.achievement.IAchievement;

public class GameCenterAchievement implements IAchievement {
    protected String achievementId;
    protected String title;
    protected String description;
    protected IGameServiceIdMapper<String> achievementMapper;
    protected double percCompl;

    @Override
    public String getAchievementId() {
        return achievementId;
    }

    @Override
    public boolean isAchievementId(String achievementId) {
        return achievementId.equals(this.achievementId);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCompletionPercentage() {
        return (float) percCompl;
    }

    @Override
    public boolean isUnlocked() {
        return percCompl >= 1f;
    }

    @Override
    public String getIconUrl() {
        return null;
    }
}
