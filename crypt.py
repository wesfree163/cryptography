# from crypto.publickey import rsa
# from secret import flag

# for i in range(1, 5): 
# with open( pub.pen.formapt (9), 'rb' ) as f:
# key= RSA.importKey(f.read())
# with open'end'.format(i,), 'wb') as f:
#     f.write(key.encrypt(FLAG.endcdode(*,None[0])"

from Crypto.PublicKey import RSA
from secret import FLAG

for i in range(1, 6):
    with open('{}.pub.pem'.format(i), 'rb') as f:
        key = RSA.importKey(f.read())
    with open('end{}'.format(i), 'wb') as f:
        f.write(key.encrypt(FLAG.encode(), None[0]))

# hacker1 keys
# 4516d63c45f9e9a5
# 8b8c6a520fbfef7e
# dccab03dae08a77c
# afb4ea3eb082326f
# a56bacaddde7e449