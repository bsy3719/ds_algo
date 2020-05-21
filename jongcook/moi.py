# 모의고사
#https://programmers.co.kr/learn/courses/30/lessons/42840?language=python3


def solution(answers):
    answer = []
    answer1 = [1,2,3,4,5] *2000
    answer2 = [2,1,2,3,2,4,2,5] * 2000
    answer3 = [3,3,1,1,2,2,4,4,5,5] * 2000
    
    answer1 = answer1[:len(answers)]
    answer2 = answer2[:len(answers)]
    answer3 = answer3[:len(answers)]
    
    new1=[]
    new2=[]
    new3=[]
    for i in range(len(answers)):
        if answer1[i] == answers[i]:
            new1.append(answer1[i])
    for i in range(len(answers)):
        if answer2[i] == answers[i]:
            new2.append(answer2[i])
    for i in range(len(answers)):
        if answer3[i] == answers[i]:
            new3.append(answer3[i])
            
    a= [len(new1), len(new2), len(new3)]
    ans = []
    for i in range(len(a)):
        if max(a) == a[i]:
            ans.append(i+1)
    
    return ans