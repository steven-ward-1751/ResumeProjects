#start of qb
qbslist = open('qb.txt').readlines()
qbs = []
for qb in qbslist:
    qb = qb.strip().split('\t')
    qbs.append(qb)

formattedqbs = open('formatted_qb.txt', 'w')

qbstring = ''
for qb in qbs:
    for item in qb:
        qbstring = qbstring.replace(',','')
        qbstring += str(item)
        qbstring += '::'
    qbstring += '\n'


  
formattedqbs.write(qbstring)    
formattedqbs.close()


#start of rb 
rbslist = open('rb.txt').readlines()
rbs = []
for rb in rbslist:
    rb = rb.strip().split('\t')
    rbs.append(rb)

formattedrbs = open('formatted_rb.txt', 'w')

rbstring = ''
for rb in rbs:
    for item in rb:
        rbstring = rbstring.replace(',','')
        rbstring += str(item)
        rbstring += '::'
    rbstring += '\n'


    
formattedrbs.write(rbstring)    
formattedrbs.close()

#start of wr 
wrslist = open('wr.txt').readlines()
wrs = []
for wr in wrslist:
    wr = wr.strip().split('\t')
    wrs.append(wr)

formattedwrs = open('formatted_wr.txt', 'w')

wrstring = ''
for wr in wrs:
    for item in wr:
        wrstring = wrstring.replace(',','')
        wrstring += str(item)
        wrstring += '::'
    wrstring += '\n'


    
formattedwrs.write(wrstring)    
formattedwrs.close()

#start of te 
teslist = open('te.txt').readlines()
tes = []
for te in teslist:
    te = te.strip().split('\t')
    tes.append(te)

formattedtes = open('formatted_te.txt', 'w')

testring = ''
for te in tes:
    for item in te:
        testring = testring.replace(',','')
        testring += str(item)
        testring += '::'
    testring += '\n'


    
formattedtes.write(testring)    
formattedtes.close()

#start of def
defslist = open('def.txt').readlines()
defs = []
for d in defslist:
    d = d.strip().split('\t')
    defs.append(d)

formatted_defs = open('formatted_def.txt', 'w')

defstring = ''
for d in defs:
    for item in d:
        defstring = defstring.replace(',','')
        defstring += str(item)
        defstring += '::'
    defstring += '\n'


    
formatted_defs.write(defstring)    
formatted_defs.close()

