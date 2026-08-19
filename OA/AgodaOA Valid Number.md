

Problem

You are given n students, where each student has an exam interval [start[i], end[i]].

An invigilator is required whenever at least k students are simultaneously present in the room.

For each query interval [q_start[i], q_end[i]], determine the total amount of time within that query during which the number of students present is greater than or equal to k.

Function

minTime(start, end, q_start, q_end, k)

Input

start[i] — exam start time of student i

end[i] — exam end time of student i

q_start[i] — start time of query i

q_end[i] — end time of query i

k — minimum number of students required to trigger the invigilator

Output

Return an array of integers where each element represents the total time within the corresponding query interval during which at least k students are present.

Example

start = [1, 3, 2, 5]
end   = [3, 5, 3, 6]
k     = 2

q_start = [1]
q_end   = [6]

For the query [1, 6], identify all time intervals where at least 2 students are present and return their total duration.

Key Concept

Interval Overlap + Sweep Line / Difference Array + Prefix Sum

Important

Pay attention to how overlapping intervals are handled and how the query boundaries affect the counted time.
