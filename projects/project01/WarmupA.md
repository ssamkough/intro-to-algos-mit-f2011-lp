# Warmup A
function cartesianProduct(A, B):
	C ⇜ {}
	for each element i in A:
        for each element j in B:
            C ⇜ C ⋃ {i, j}
    return C

A ⇜ {1, 2}
B ⇜ {3, 4}

cartesianProduct(A, B)