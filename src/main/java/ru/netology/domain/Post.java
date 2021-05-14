package ru.netology.domain;

public class Post {
    private int id;
    private int OwnerId;
    private String imageUrl;
    private String text;
    private boolean video;
    private boolean audio;
    private String accAvatar;
    private String dateOfPost;

    private String fromId;
    private String createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean forFriendsOnly;
    private int postponedId;
    private int canEdit;
    private int canDelete;
    private int canPin;

    private AdvertisingPostInfo advertisingPostInfo;
    private CommentsInfo commentsInfo;
    private CopyrightInfo copyrightInfo;
    private DateInfo dateInfo;
    private DonutsInfo donutsInfo;
    private GeoInfo geoInfo;
    private LikesInfo likesInfo;
    private PinInfo pinInfo;
    private AuthorInfo authorInfo;
    private RepostInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSourceInfo postSourceInfo;




}
