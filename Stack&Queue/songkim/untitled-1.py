# -*- coding: utf-8 -*-
import re

db = {'S':'**1','D':'**2','T':'**3','#':'*-1'}

def solution(dartResult):
    result = ''
    list = re.sub('([SDT][#*]?)','\g<1> ',dartResult).split()
    
    for i in list:
        if i[-1] == '*':
            if result:
                result = result[:-1]+'*2+'
            i +='2'
        for j in db.keys():
            i = i.replace(j, db[i])
        result+=i+'+'
    return eval(result[:-1])