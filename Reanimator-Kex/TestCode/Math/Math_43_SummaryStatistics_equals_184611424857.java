package org.apache.commons.math.stat.descriptive;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_equals_184611424857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;
     Object term525;
     Object term3585;
     Object term3595;

    public SummaryStatistics_equals_184611424857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term498 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term504 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term507 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term510 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term513 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term516 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term519 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term520 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term522 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term496, term496.getClass(), "n", 5127676408959197577L);
        setDoubleField(term498, term498.getClass(), "m2", Double.NaN);
        setLongField(term498, term498.getClass(), "n", 0L);
        setDoubleField(term498, term498.getClass(), "m1", Double.NaN);
        setDoubleField(term498, term498.getClass(), "dev", Double.NaN);
        setDoubleField(term498, term498.getClass(), "nDev", Double.NaN);
        setField(term498, term498.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "secondMoment", term498);
        setLongField(term504, term504.getClass(), "n", 0L);
        setDoubleField(term504, term504.getClass(), "value", 0.0);
        setField(term504, term504.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "sum", term504);
        setLongField(term507, term507.getClass(), "n", 0L);
        setDoubleField(term507, term507.getClass(), "value", 0.0);
        setField(term507, term507.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "sumsq", term507);
        setLongField(term510, term510.getClass(), "n", 0L);
        setDoubleField(term510, term510.getClass(), "value", Double.NaN);
        setField(term510, term510.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "min", term510);
        setLongField(term513, term513.getClass(), "n", 0L);
        setDoubleField(term513, term513.getClass(), "value", Double.NaN);
        setField(term513, term513.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "max", term513);
        setIntField(term516, term516.getClass(), "n", 0);
        setDoubleField(term516, term516.getClass(), "value", 0.0);
        setField(term516, term516.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "sumLog", term516);
        setField(term519, term519.getClass(), "sumOfLogs", term516);
        setField(term519, term519.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "geoMean", term519);
        setField(term520, term520.getClass(), "moment", term498);
        setBooleanField(term520, term520.getClass(), "incMoment", false);
        setField(term520, term520.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "mean", term520);
        setField(term522, term522.getClass(), "moment", term498);
        setBooleanField(term522, term522.getClass(), "incMoment", false);
        setBooleanField(term522, term522.getClass(), "isBiasCorrected", true);
        setField(term522, term522.getClass(), "storedData", null);
        setField(term496, term496.getClass(), "variance", term522);
        setField(term496, term496.getClass(), "sumImpl", term504);
        setField(term496, term496.getClass(), "sumsqImpl", term507);
        setField(term496, term496.getClass(), "minImpl", term510);
        setField(term496, term496.getClass(), "maxImpl", term513);
        setField(term496, term496.getClass(), "sumLogImpl", term516);
        setField(term496, term496.getClass(), "geoMeanImpl", term519);
        setField(term496, term496.getClass(), "meanImpl", term520);
        setField(term496, term496.getClass(), "varianceImpl", term522);
        term525 = newInstance(Class.forName("java.lang.Object"));
        term3585 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term3586 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term3587 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term3588 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term3589 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term3590 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term3591 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term3592 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term3593 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term3594 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term3585, term3585.getClass(), "n", 5127676408959197577L);
        setDoubleField(term3586, term3586.getClass(), "m2", Double.NaN);
        setLongField(term3586, term3586.getClass(), "n", 0L);
        setDoubleField(term3586, term3586.getClass(), "m1", Double.NaN);
        setDoubleField(term3586, term3586.getClass(), "dev", Double.NaN);
        setDoubleField(term3586, term3586.getClass(), "nDev", Double.NaN);
        setField(term3586, term3586.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "secondMoment", term3586);
        setLongField(term3587, term3587.getClass(), "n", 0L);
        setDoubleField(term3587, term3587.getClass(), "value", 0.0);
        setField(term3587, term3587.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "sum", term3587);
        setLongField(term3588, term3588.getClass(), "n", 0L);
        setDoubleField(term3588, term3588.getClass(), "value", 0.0);
        setField(term3588, term3588.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "sumsq", term3588);
        setLongField(term3589, term3589.getClass(), "n", 0L);
        setDoubleField(term3589, term3589.getClass(), "value", Double.NaN);
        setField(term3589, term3589.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "min", term3589);
        setLongField(term3590, term3590.getClass(), "n", 0L);
        setDoubleField(term3590, term3590.getClass(), "value", Double.NaN);
        setField(term3590, term3590.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "max", term3590);
        setIntField(term3591, term3591.getClass(), "n", 0);
        setDoubleField(term3591, term3591.getClass(), "value", 0.0);
        setField(term3591, term3591.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "sumLog", term3591);
        setField(term3592, term3592.getClass(), "sumOfLogs", term3591);
        setField(term3592, term3592.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "geoMean", term3592);
        setField(term3593, term3593.getClass(), "moment", term3586);
        setBooleanField(term3593, term3593.getClass(), "incMoment", false);
        setField(term3593, term3593.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "mean", term3593);
        setField(term3594, term3594.getClass(), "moment", term3586);
        setBooleanField(term3594, term3594.getClass(), "incMoment", false);
        setBooleanField(term3594, term3594.getClass(), "isBiasCorrected", true);
        setField(term3594, term3594.getClass(), "storedData", null);
        setField(term3585, term3585.getClass(), "variance", term3594);
        setField(term3585, term3585.getClass(), "sumImpl", term3587);
        setField(term3585, term3585.getClass(), "sumsqImpl", term3588);
        setField(term3585, term3585.getClass(), "minImpl", term3589);
        setField(term3585, term3585.getClass(), "maxImpl", term3590);
        setField(term3585, term3585.getClass(), "sumLogImpl", term3591);
        setField(term3585, term3585.getClass(), "geoMeanImpl", term3592);
        setField(term3585, term3585.getClass(), "meanImpl", term3593);
        setField(term3585, term3585.getClass(), "varianceImpl", term3594);
        term3595 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term525;
        Object retValue = callMethod(klass, "equals", argTypes, term496, args);
        assertTrue(recursiveEquals(term496, term3585));
        assertTrue(recursiveEquals(term525, term3595));
        assertTrue(recursiveEquals(retValue, false));
    }

};


