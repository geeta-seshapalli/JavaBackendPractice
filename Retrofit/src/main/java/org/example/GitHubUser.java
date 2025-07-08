package org.example;

public class GitHubUser {
    public String login;
    public String name;
    public String bio;
    public int public_repos;

    @Override
    public String toString() {
        return "GitHubUser{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", public_repos=" + public_repos +
                '}';
    }
}