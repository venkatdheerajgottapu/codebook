
n, m, a, b = map(int, input("Enter n, m, a, b (space-separated): ").split())

# Option 1: All single-ride tickets
cost_single_tickets = n * a

# Option 2: Using m-ride tickets as much as possible and then single tickets for the rest
full_sets = n // m
remaining_rides = n % m
cost_mixed = (full_sets * b) + (remaining_rides * a)

# Option 3: Using only m-ride tickets (round up to cover all rides)
cost_full_m_tickets = ((n + m - 1) // m) * b

# Find the minimum cost among the three options and print it
print(min(cost_single_tickets, cost_mixed, cost_full_m_tickets))
