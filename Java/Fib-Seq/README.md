// the problem with this algorithm is that we spend time recalculating the same
    // problem in the recursion tree

    /*
     * example Assume we have n =6
     *                   fib(6)
     *                 /       \
     *             fib(5)     fib(4)
     *              /  \       /  \
     *             4    3      3  2
     * 
     *  we have calculated fib4 and 4 twice
     * 
     * it gets worse
     *                   fib(10)  
     *                      /\  
     *                   9     8
     *                8 7      7 6 
     *               7 6  6 5    6 5 5 4
     *              6 5 5 4 5 4 4 3 5 4 4 3 4 3 3 2
     *              
     *          look at the recursive calls and it becomes obvious that this will take forever given a large input
     */

     fib() is very portable and requires no extra memory locally but the stack space so O(n) because we are going from 0 to n-1 the height of the tree
     but the time complexity requires 2^n calls per tree level

     memoization lets us pass a memo array. So we calculate less and recurse less this saves us time at almost no cost to space because the creation of the array is 1 step one time. at worse we have to calculate n times but never more than that. so space is O(n+1) but that simplifes to O(n) and as stated before we only calculate n times not 2^n times it is now  linear and not exponential.

     tabulation uses an array but does the calculating iteratively not recursively but you can look at them and tell they are virtually the same thing. either way we are filling up an array and using the answer at index n in our array. Remember n = n+1.length.


    which one do we choose... well it depends. Do we need the answer of every sub problem or only some of them. Tabulation requires we find the answer to EVERY subproblem one by one. In cases where we can arrive at the conclusion without figuring out every answer memoization is prefered... so the answer remains... whats the differences.... we can make decisions based on what we already know from the info in our memo so recursion could be better in these cases... I have yet to dive into dynamic programming but this is my first attempt... Ill get there.


    Log

0) FibMemo 
Result = 0. This Took 5.50075E-4seconds
1) FibMemo 
Result = 1. This Took 2.293E-6seconds
2) FibMemo 
Result = 1. This Took 2.006E-6seconds
3) FibMemo 
Result = 2. This Took 2.267E-6seconds
4) FibMemo 
Result = 3. This Took 2.251E-6seconds
5) FibMemo 
Result = 5. This Took 2.467E-6seconds
6) FibMemo 
Result = 8. This Took 2.601E-6seconds
7) FibMemo 
Result = 13. This Took 2.779E-6seconds
8) FibMemo 
Result = 21. This Took 3.036E-6seconds
9) FibMemo 
Result = 34. This Took 3.206E-6seconds
10) FibMemo 
Result = 55. This Took 3.431E-6seconds
11) FibMemo 
Result = 89. This Took 3.65E-6seconds
12) FibMemo 
Result = 144. This Took 5.554E-6seconds
13) FibMemo 
Result = 233. This Took 4.109E-6seconds
14) FibMemo 
Result = 377. This Took 4.372E-6seconds
15) FibMemo 
Result = 610. This Took 4.414E-6seconds
16) FibMemo 
Result = 987. This Took 1.542E-5seconds
17) FibMemo 
Result = 1597. This Took 5.376E-6seconds
18) FibMemo 
Result = 2584. This Took 5.566E-6seconds
19) FibMemo 
Result = 4181. This Took 5.72E-6seconds
20) FibMemo 
Result = 6765. This Took 1.2622E-5seconds
21) FibMemo 
Result = 10946. This Took 2.161E-6seconds
22) FibMemo 
Result = 17711. This Took 2.009E-6seconds
23) FibMemo 
Result = 28657. This Took 2.085E-6seconds
24) FibMemo 
Result = 46368. This Took 2.116E-6seconds
25) FibMemo 
Result = 75025. This Took 2.082E-6seconds
26) FibMemo 
Result = 121393. This Took 2.095E-6seconds
27) FibMemo 
Result = 196418. This Took 3.448E-6seconds
28) FibMemo 
Result = 317811. This Took 2.696E-6seconds
29) FibMemo 
Result = 514229. This Took 2.425E-6seconds
30) FibMemo 
Result = 832040. This Took 2.382E-6seconds
31) FibMemo 
Result = 1346269. This Took 2.447E-6seconds
32) FibMemo 
Result = 2178309. This Took 2.644E-6seconds
33) FibMemo 
Result = 3524578. This Took 2.477E-6seconds
34) FibMemo 
Result = 5702887. This Took 2.467E-6seconds
35) FibMemo 
Result = 9227465. This Took 4.056E-6seconds
36) FibMemo 
Result = 14930352. This Took 6.291E-6seconds
37) FibMemo 
Result = 24157817. This Took 3.525E-6seconds
38) FibMemo 
Result = 39088169. This Took 4.173E-6seconds
39) FibMemo 
Result = 63245986. This Took 1.2445E-5seconds
40) FibMemo 
Result = 102334155. This Took 3.022E-6seconds
41) FibMemo 
Result = 165580141. This Took 2.902E-6seconds
42) FibMemo 
Result = 267914296. This Took 2.962E-6seconds
43) FibMemo 
Result = 433494437. This Took 3.116E-6seconds
44) FibMemo 
Result = 701408733. This Took 3.09E-6seconds
45) FibMemo 
Result = 1134903170. This Took 3.319E-6seconds
46) FibMemo 
Result = 1836311903. This Took 3.072E-6seconds
47) FibMemo 
Result = 2971215073. This Took 3.174E-6seconds
48) FibMemo 
Result = 4807526976. This Took 5.785E-6seconds
49) FibMemo 
Result = 7778742049. This Took 3.065E-6seconds
50) FibMemo 
Result = 12586269025. This Took 3.095E-6seconds
51) FibMemo 
Result = 20365011074. This Took 3.298E-6seconds
52) FibMemo 
Result = 32951280099. This Took 3.283E-6seconds
53) FibMemo 
Result = 53316291173. This Took 3.381E-6seconds
54) FibMemo 
Result = 86267571272. This Took 3.27E-6seconds
55) FibMemo 
Result = 139583862445. This Took 3.489E-6seconds
56) FibMemo 
Result = 225851433717. This Took 3.538E-6seconds
57) FibMemo 
Result = 365435296162. This Took 3.249E-6seconds
58) FibMemo 
Result = 591286729879. This Took 5.637E-6seconds
59) FibMemo 
Result = 956722026041. This Took 3.607E-6seconds
60) FibMemo 
Result = 1548008755920. This Took 4.243E-6seconds
61) FibMemo 
Result = 2504730781961. This Took 5.55E-6seconds
62) FibMemo 
Result = 4052739537881. This Took 6.946E-6seconds
63) FibMemo 
Result = 6557470319842. This Took 3.886E-6seconds
64) FibMemo 
Result = 10610209857723. This Took 4.586E-6seconds
65) FibMemo 
Result = 17167680177565. This Took 3.731E-6seconds
66) FibMemo 
Result = 27777890035288. This Took 5.895E-6seconds
67) FibMemo 
Result = 44945570212853. This Took 1.0392E-5seconds
68) FibMemo 
Result = 72723460248141. This Took 3.77E-6seconds
69) FibMemo 
Result = 117669030460994. This Took 3.94E-6seconds
70) FibMemo 
Result = 190392490709135. This Took 3.955E-6seconds
71) FibMemo 
Result = 308061521170129. This Took 4.01E-6seconds
72) FibMemo 
Result = 498454011879264. This Took 3.939E-6seconds
73) FibMemo 
Result = 806515533049393. This Took 3.749E-6seconds
74) FibMemo 
Result = 1304969544928657. This Took 1.1867E-5seconds
75) FibMemo 
Result = 2111485077978050. This Took 4.052E-6seconds
76) FibMemo 
Result = 3416454622906707. This Took 4.151E-6seconds
77) FibMemo 
Result = 5527939700884757. This Took 4.248E-6seconds
78) FibMemo 
Result = 8944394323791464. This Took 4.147E-6seconds
79) FibMemo 
Result = 14472334024676221. This Took 4.34E-6seconds
80) FibMemo 
Result = 23416728348467685. This Took 6.578E-6seconds
81) FibMemo 
Result = 37889062373143906. This Took 9.343E-6seconds
82) FibMemo 
Result = 61305790721611591. This Took 4.057E-6seconds
83) FibMemo 
Result = 99194853094755497. This Took 4.305E-6seconds
84) FibMemo 
Result = 160500643816367088. This Took 9.779E-6seconds
85) FibMemo 
Result = 259695496911122585. This Took 4.412E-6seconds
86) FibMemo 
Result = 420196140727489673. This Took 4.605E-6seconds
87) FibMemo 
Result = 679891637638612258. This Took 6.738E-6seconds
88) FibMemo 
Result = 1100087778366101931. This Took 4.657E-6seconds
89) FibMemo 
Result = 1779979416004714189. This Took 4.306E-6seconds
90) FibMemo 
Result = 2880067194370816120. This Took 4.325E-6seconds
91) FibMemo 
Result = 4660046610375530309. This Took 4.677E-6seconds
92) FibMemo 
Result = 7540113804746346429. This Took 6.556E-6seconds
0) FibTab 
Result = 0. This Took 1.0529E-5seconds
1) FibTab 
Result = 1. This Took 1.967E-6seconds
2) FibTab 
Result = 1. This Took 2.046E-6seconds
3) FibTab 
Result = 2. This Took 2.242E-6seconds
4) FibTab 
Result = 3. This Took 2.15E-6seconds
5) FibTab 
Result = 5. This Took 2.08E-6seconds
6) FibTab 
Result = 8. This Took 2.133E-6seconds
7) FibTab 
Result = 13. This Took 2.278E-6seconds
8) FibTab 
Result = 21. This Took 2.282E-6seconds
9) FibTab 
Result = 34. This Took 2.243E-6seconds
10) FibTab 
Result = 55. This Took 2.235E-6seconds
11) FibTab 
Result = 89. This Took 2.367E-6seconds
12) FibTab 
Result = 144. This Took 2.304E-6seconds
13) FibTab 
Result = 233. This Took 2.387E-6seconds
14) FibTab 
Result = 377. This Took 2.746E-6seconds
15) FibTab 
Result = 610. This Took 2.484E-6seconds
16) FibTab 
Result = 987. This Took 2.52E-6seconds
17) FibTab 
Result = 1597. This Took 2.532E-6seconds
18) FibTab 
Result = 2584. This Took 2.653E-6seconds
19) FibTab 
Result = 4181. This Took 2.701E-6seconds
20) FibTab 
Result = 6765. This Took 2.895E-6seconds
21) FibTab 
Result = 10946. This Took 2.751E-6seconds
22) FibTab 
Result = 17711. This Took 2.706E-6seconds
23) FibTab 
Result = 28657. This Took 2.705E-6seconds
24) FibTab 
Result = 46368. This Took 3.024E-6seconds
25) FibTab 
Result = 75025. This Took 9.276E-6seconds
26) FibTab 
Result = 121393. This Took 2.972E-6seconds
27) FibTab 
Result = 196418. This Took 3.01E-6seconds
28) FibTab 
Result = 317811. This Took 3.022E-6seconds
29) FibTab 
Result = 514229. This Took 3.025E-6seconds
30) FibTab 
Result = 832040. This Took 8.694E-6seconds
31) FibTab 
Result = 1346269. This Took 3.072E-6seconds
32) FibTab 
Result = 2178309. This Took 4.621E-6seconds
33) FibTab 
Result = 3524578. This Took 5.867E-6seconds
34) FibTab 
Result = 5702887. This Took 3.273E-6seconds
35) FibTab 
Result = 9227465. This Took 3.493E-6seconds
36) FibTab 
Result = 14930352. This Took 3.393E-6seconds
37) FibTab 
Result = 24157817. This Took 3.425E-6seconds
38) FibTab 
Result = 39088169. This Took 3.431E-6seconds
39) FibTab 
Result = 63245986. This Took 3.408E-6seconds
40) FibTab 
Result = 102334155. This Took 3.514E-6seconds
41) FibTab 
Result = 165580141. This Took 3.497E-6seconds
42) FibTab 
Result = 267914296. This Took 3.553E-6seconds
43) FibTab 
Result = 433494437. This Took 3.553E-6seconds
44) FibTab 
Result = 701408733. This Took 9.527E-6seconds
45) FibTab 
Result = 1134903170. This Took 3.606E-6seconds
46) FibTab 
Result = 1836311903. This Took 6.677E-6seconds
47) FibTab 
Result = 2971215073. This Took 3.676E-6seconds
48) FibTab 
Result = 4807526976. This Took 9.313E-6seconds
49) FibTab 
Result = 7778742049. This Took 3.756E-6seconds
50) FibTab 
Result = 12586269025. This Took 3.817E-6seconds
51) FibTab 
Result = 20365011074. This Took 3.867E-6seconds
52) FibTab 
Result = 32951280099. This Took 3.856E-6seconds
53) FibTab 
Result = 53316291173. This Took 3.895E-6seconds
54) FibTab 
Result = 86267571272. This Took 3.959E-6seconds
55) FibTab 
Result = 139583862445. This Took 3.947E-6seconds
56) FibTab 
Result = 225851433717. This Took 3.985E-6seconds
57) FibTab 
Result = 365435296162. This Took 4.275E-6seconds
58) FibTab 
Result = 591286729879. This Took 4.105E-6seconds
59) FibTab 
Result = 956722026041. This Took 4.099E-6seconds
60) FibTab 
Result = 1548008755920. This Took 9.851E-6seconds
61) FibTab 
Result = 2504730781961. This Took 4.211E-6seconds
62) FibTab 
Result = 4052739537881. This Took 4.289E-6seconds
63) FibTab 
Result = 6557470319842. This Took 4.341E-6seconds
64) FibTab 
Result = 10610209857723. This Took 4.522E-6seconds
65) FibTab 
Result = 17167680177565. This Took 7.61E-6seconds
66) FibTab 
Result = 27777890035288. This Took 4.47E-6seconds
67) FibTab 
Result = 44945570212853. This Took 4.479E-6seconds
68) FibTab 
Result = 72723460248141. This Took 4.611E-6seconds
69) FibTab 
Result = 117669030460994. This Took 4.825E-6seconds
70) FibTab 
Result = 190392490709135. This Took 7.117E-6seconds
71) FibTab 
Result = 308061521170129. This Took 1.6189E-5seconds
72) FibTab 
Result = 498454011879264. This Took 6.961E-6seconds
73) FibTab 
Result = 806515533049393. This Took 5.73E-6seconds
74) FibTab 
Result = 1304969544928657. This Took 6.894E-6seconds
75) FibTab 
Result = 2111485077978050. This Took 7.293E-6seconds
76) FibTab 
Result = 3416454622906707. This Took 5.029E-6seconds
77) FibTab 
Result = 5527939700884757. This Took 4.881E-6seconds
78) FibTab 
Result = 8944394323791464. This Took 1.2919E-5seconds
79) FibTab 
Result = 14472334024676221. This Took 1.1638E-5seconds
80) FibTab 
Result = 23416728348467685. This Took 7.088E-6seconds
81) FibTab 
Result = 37889062373143906. This Took 1.2455E-5seconds
82) FibTab 
Result = 61305790721611591. This Took 5.22E-6seconds
83) FibTab 
Result = 99194853094755497. This Took 5.071E-6seconds
84) FibTab 
Result = 160500643816367088. This Took 5.275E-6seconds
85) FibTab 
Result = 259695496911122585. This Took 5.236E-6seconds
86) FibTab 
Result = 420196140727489673. This Took 5.236E-6seconds
87) FibTab 
Result = 679891637638612258. This Took 5.274E-6seconds
88) FibTab 
Result = 1100087778366101931. This Took 5.39E-6seconds
89) FibTab 
Result = 1779979416004714189. This Took 5.361E-6seconds
90) FibTab 
Result = 2880067194370816120. This Took 5.305E-6seconds
91) FibTab 
Result = 4660046610375530309. This Took 1.1257E-5seconds
92) FibTab 
Result = 7540113804746346429. This Took 8.479E-6seconds
0) Fib 
Result = 0. This Took 4.297E-6seconds
1) Fib 
Result = 1. This Took 5.0E-7seconds
2) Fib 
Result = 1. This Took 3.117E-6seconds
3) Fib 
Result = 2. This Took 9.66E-7seconds
4) Fib 
Result = 3. This Took 1.195E-6seconds
5) Fib 
Result = 5. This Took 1.717E-6seconds
6) Fib 
Result = 8. This Took 2.568E-6seconds
7) Fib 
Result = 13. This Took 3.866E-6seconds
8) Fib 
Result = 21. This Took 8.048E-6seconds
9) Fib 
Result = 34. This Took 1.1552E-5seconds
10) Fib 
Result = 55. This Took 2.0123E-5seconds
11) Fib 
Result = 89. This Took 3.4903E-5seconds
12) Fib 
Result = 144. This Took 4.4168E-5seconds
13) Fib 
Result = 233. This Took 7.0266E-5seconds
14) Fib 
Result = 377. This Took 1.75698E-4seconds
15) Fib 
Result = 610. This Took 1.93913E-4seconds
16) Fib 
Result = 987. This Took 7.578E-5seconds
17) Fib 
Result = 1597. This Took 4.5343E-5seconds
18) Fib 
Result = 2584. This Took 6.6386E-5seconds
19) Fib 
Result = 4181. This Took 5.4614E-5seconds
20) Fib 
Result = 6765. This Took 8.4441E-5seconds
21) Fib 
Result = 10946. This Took 1.42031E-4seconds
22) Fib 
Result = 17711. This Took 2.16136E-4seconds
23) Fib 
Result = 28657. This Took 2.59292E-4seconds
24) Fib 
Result = 46368. This Took 2.63391E-4seconds
25) Fib 
Result = 75025. This Took 4.25162E-4seconds
26) Fib 
Result = 121393. This Took 7.07728E-4seconds
27) Fib 
Result = 196418. This Took 0.001115715seconds
28) Fib 
Result = 317811. This Took 0.001918776seconds
29) Fib 
Result = 514229. This Took 0.003519729seconds
30) Fib 
Result = 832040. This Took 0.005426799seconds
31) Fib 
Result = 1346269. This Took 0.008613118seconds
32) Fib 
Result = 2178309. This Took 0.013380646seconds
33) Fib 
Result = 3524578. This Took 0.021617212seconds
34) Fib 
Result = 5702887. This Took 0.031889818seconds
35) Fib 
Result = 9227465. This Took 0.049996925seconds
36) Fib 
Result = 14930352. This Took 0.085319115seconds
37) Fib 
Result = 24157817. This Took 0.156263619seconds
38) Fib 
Result = 39088169. This Took 0.308354034seconds
39) Fib 
Result = 63245986. This Took 0.377283517seconds
40) Fib 
Result = 102334155. This Took 0.589766954seconds
41) Fib 
Result = 165580141. This Took 1.021506943seconds
42) Fib 
Result = 267914296. This Took 1.712164359seconds
43) Fib 
Result = 433494437. This Took 2.640227914seconds
44) Fib 
Result = 701408733. This Took 4.20525604seconds
45) Fib 
Result = 1134903170. This Took 7.109982389seconds
46) Fib 
Result = 1836311903. This Took 11.615982849seconds
47) Fib 
Result = 2971215073. This Took 16.720640186seconds
48) Fib 
Result = 4807526976. This Took 29.675826813seconds
49) Fib 
Result = 7778742049. This Took 50.904338086seconds
50) Fib 
Result = 12586269025. This Took 77.695705007seconds
51) Fib 
Result = 20365011074. This Took 128.3917448seconds
52) Fib 
Result = 32951280099. This Took 193.879906432seconds
53) Fib 
Result = 53316291173. This Took 329.886982169seconds



Results:
92) FibMemo 
Result = 7540113804746346429. This Took 6.556E-6seconds

92) FibTab 
Result = 7540113804746346429. This Took 8.479E-6seconds

53) Fib 
Result = 53316291173. This Took 329.886982169seconds

looks like tabulation won because iterating is faster it doesnt require a stack... which is my hypothesis...correct... no recursive overhead
