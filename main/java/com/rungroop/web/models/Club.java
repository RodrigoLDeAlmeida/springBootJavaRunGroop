package com.rungroop.web.models;

//import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.rungroop.web.models.UserEntity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private UserEntity createdBy;

    @OneToMany(mappedBy = "club", cascade = CascadeType.REMOVE)
    private List<Event> events = new ArrayList<>();

    public Club(Long id, String title, String photoUrl, String content, LocalDateTime createdOn, LocalDateTime updatedOn, UserEntity createdBy, List<Event> events) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.createdBy = createdBy;
        this.events = events;
    }

    public Club() {
    }

    public static ClubBuilder builder() {
        return new ClubBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public String getContent() {
        return this.content;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    public UserEntity getCreatedBy() {
        return this.createdBy;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Club)) return false;
        final Club other = (Club) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$photoUrl = this.getPhotoUrl();
        final Object other$photoUrl = other.getPhotoUrl();
        if (this$photoUrl == null ? other$photoUrl != null : !this$photoUrl.equals(other$photoUrl)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$createdOn = this.getCreatedOn();
        final Object other$createdOn = other.getCreatedOn();
        if (this$createdOn == null ? other$createdOn != null : !this$createdOn.equals(other$createdOn)) return false;
        final Object this$updatedOn = this.getUpdatedOn();
        final Object other$updatedOn = other.getUpdatedOn();
        if (this$updatedOn == null ? other$updatedOn != null : !this$updatedOn.equals(other$updatedOn)) return false;
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$events = this.getEvents();
        final Object other$events = other.getEvents();
        if (this$events == null ? other$events != null : !this$events.equals(other$events)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Club;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $photoUrl = this.getPhotoUrl();
        result = result * PRIME + ($photoUrl == null ? 43 : $photoUrl.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $createdOn = this.getCreatedOn();
        result = result * PRIME + ($createdOn == null ? 43 : $createdOn.hashCode());
        final Object $updatedOn = this.getUpdatedOn();
        result = result * PRIME + ($updatedOn == null ? 43 : $updatedOn.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
        final Object $events = this.getEvents();
        result = result * PRIME + ($events == null ? 43 : $events.hashCode());
        return result;
    }

    public String toString() {
        return "Club(id=" + this.getId() + ", title=" + this.getTitle() + ", photoUrl=" + this.getPhotoUrl() + ", content=" + this.getContent() + ", createdOn=" + this.getCreatedOn() + ", updatedOn=" + this.getUpdatedOn() + ", createdBy=" + this.getCreatedBy() + ", events=" + this.getEvents() + ")";
    }

    public static class ClubBuilder {
        private Long id;
        private String title;
        private String photoUrl;
        private String content;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private UserEntity createdBy;
        private List<Event> events;

        ClubBuilder() {
        }

        public ClubBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ClubBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ClubBuilder photoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

        public ClubBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ClubBuilder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        public ClubBuilder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
            return this;
        }

        public ClubBuilder createdBy(UserEntity createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ClubBuilder events(List<Event> events) {
            this.events = events;
            return this;
        }

        public Club build() {
            return new Club(id, title, photoUrl, content, createdOn, updatedOn, createdBy, events);
        }

        public String toString() {
            return "Club.ClubBuilder(id=" + this.id + ", title=" + this.title + ", photoUrl=" + this.photoUrl + ", content=" + this.content + ", createdOn=" + this.createdOn + ", updatedOn=" + this.updatedOn + ", createdBy=" + this.createdBy + ", events=" + this.events + ")";
        }
    }
}
