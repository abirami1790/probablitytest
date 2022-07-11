package com.tw.probability;

public class ProbabilityEvent {
    private final float totalOutcomes ;
    private final float favourableOutcomes;

    public ProbabilityEvent(int totalOutcomes, int favourableOutcomes) {
        this.totalOutcomes=totalOutcomes;
        this.favourableOutcomes=favourableOutcomes;
    }


//    public boolean compareProbability(ProbabilityEvent eventA, ProbabilityEvent eventB) {
//       int prob_A= eventA.calculateProbablity(eventA);
//       int prob_B=eventB.calculateProbablity(eventB);
//        return Objects.equals(prob_A, prob_B);
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProbabilityEvent that = (ProbabilityEvent) o;
        return Float.compare(that.totalOutcomes, totalOutcomes) == 0 && Float.compare(that.favourableOutcomes, favourableOutcomes) == 0;
    }

    public double calculateProbablity() {
        return (favourableOutcomes/totalOutcomes);
    }
}
