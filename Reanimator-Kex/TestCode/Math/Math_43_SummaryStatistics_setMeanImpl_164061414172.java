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
import org.apache.commons.math.exception.MathIllegalStateException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_setMeanImpl_164061414172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932;

    public SummaryStatistics_setMeanImpl_164061414172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term932 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term934 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term940 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term943 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term946 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term949 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term952 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term955 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term956 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term958 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term932, term932.getClass(), "n", 5262507301787091109L);
        setDoubleField(term934, term934.getClass(), "m2", Double.NaN);
        setLongField(term934, term934.getClass(), "n", 0L);
        setDoubleField(term934, term934.getClass(), "m1", Double.NaN);
        setDoubleField(term934, term934.getClass(), "dev", Double.NaN);
        setDoubleField(term934, term934.getClass(), "nDev", Double.NaN);
        setField(term934, term934.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "secondMoment", term934);
        setLongField(term940, term940.getClass(), "n", 0L);
        setDoubleField(term940, term940.getClass(), "value", 0.0);
        setField(term940, term940.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "sum", term940);
        setLongField(term943, term943.getClass(), "n", 0L);
        setDoubleField(term943, term943.getClass(), "value", 0.0);
        setField(term943, term943.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "sumsq", term943);
        setLongField(term946, term946.getClass(), "n", 0L);
        setDoubleField(term946, term946.getClass(), "value", Double.NaN);
        setField(term946, term946.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "min", term946);
        setLongField(term949, term949.getClass(), "n", 0L);
        setDoubleField(term949, term949.getClass(), "value", Double.NaN);
        setField(term949, term949.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "max", term949);
        setIntField(term952, term952.getClass(), "n", 0);
        setDoubleField(term952, term952.getClass(), "value", 0.0);
        setField(term952, term952.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "sumLog", term952);
        setField(term955, term955.getClass(), "sumOfLogs", term952);
        setField(term955, term955.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "geoMean", term955);
        setField(term956, term956.getClass(), "moment", term934);
        setBooleanField(term956, term956.getClass(), "incMoment", false);
        setField(term956, term956.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "mean", term956);
        setField(term958, term958.getClass(), "moment", term934);
        setBooleanField(term958, term958.getClass(), "incMoment", false);
        setBooleanField(term958, term958.getClass(), "isBiasCorrected", true);
        setField(term958, term958.getClass(), "storedData", null);
        setField(term932, term932.getClass(), "variance", term958);
        setField(term932, term932.getClass(), "sumImpl", term940);
        setField(term932, term932.getClass(), "sumsqImpl", term943);
        setField(term932, term932.getClass(), "minImpl", term946);
        setField(term932, term932.getClass(), "maxImpl", term949);
        setField(term932, term932.getClass(), "sumLogImpl", term952);
        setField(term932, term932.getClass(), "geoMeanImpl", term955);
        setField(term932, term932.getClass(), "meanImpl", term956);
        setField(term932, term932.getClass(), "varianceImpl", term958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setMeanImpl", argTypes, term932, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


