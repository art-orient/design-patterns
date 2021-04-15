package com.epam.rd.autocode.observer.git;

public class GitRepoObservers {

    public static Repository newRepository(){
//        throw new UnsupportedOperationException();
        return new Repo();
    }

    public static WebHook mergeToBranchWebHook(String branchName){
        if (branchName == null) {
            throw new UnsupportedOperationException();
        }
        return new MergeObserver(branchName);
    }

    public static WebHook commitToBranchWebHook(String branchName){
        if (branchName == null) {
            throw new UnsupportedOperationException();
        }
        return new CommitObserver(branchName);
    }
}
