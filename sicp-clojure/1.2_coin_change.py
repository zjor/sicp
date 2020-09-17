def coin_change_count(coins, amount):
	if amount == 0:
		return 1
	elif amount < 0 or len(coins) == 0:
		return 0
	else:
		return coin_change_count(coins[1:], amount) + coin_change_count(coins, amount - coins[0])

print(coin_change_count([1, 2], 5))
print(coin_change_count([1, 2, 5], 10))
print(coin_change_count([1, 5, 10, 25, 50], 100))