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
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_getVariance_19228524509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;

    public SummaryStatistics_getVariance_19228524509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term237 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term243 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term246 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term249 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term252 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term255 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term258 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term259 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term261 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term235, term235.getClass(), "n", -7237588299778557629L);
        setDoubleField(term237, term237.getClass(), "m2", Double.NaN);
        setLongField(term237, term237.getClass(), "n", 0L);
        setDoubleField(term237, term237.getClass(), "m1", Double.NaN);
        setDoubleField(term237, term237.getClass(), "dev", Double.NaN);
        setDoubleField(term237, term237.getClass(), "nDev", Double.NaN);
        setField(term237, term237.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "secondMoment", term237);
        setLongField(term243, term243.getClass(), "n", 0L);
        setDoubleField(term243, term243.getClass(), "value", 0.0);
        setField(term243, term243.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "sum", term243);
        setLongField(term246, term246.getClass(), "n", 0L);
        setDoubleField(term246, term246.getClass(), "value", 0.0);
        setField(term246, term246.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "sumsq", term246);
        setLongField(term249, term249.getClass(), "n", 0L);
        setDoubleField(term249, term249.getClass(), "value", Double.NaN);
        setField(term249, term249.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "min", term249);
        setLongField(term252, term252.getClass(), "n", 0L);
        setDoubleField(term252, term252.getClass(), "value", Double.NaN);
        setField(term252, term252.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "max", term252);
        setIntField(term255, term255.getClass(), "n", 0);
        setDoubleField(term255, term255.getClass(), "value", 0.0);
        setField(term255, term255.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "sumLog", term255);
        setField(term258, term258.getClass(), "sumOfLogs", term255);
        setField(term258, term258.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "geoMean", term258);
        setField(term259, term259.getClass(), "moment", term237);
        setBooleanField(term259, term259.getClass(), "incMoment", false);
        setField(term259, term259.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "mean", term259);
        setField(term261, term261.getClass(), "moment", term237);
        setBooleanField(term261, term261.getClass(), "incMoment", false);
        setBooleanField(term261, term261.getClass(), "isBiasCorrected", true);
        setField(term261, term261.getClass(), "storedData", null);
        setField(term235, term235.getClass(), "variance", term261);
        setField(term235, term235.getClass(), "sumImpl", term243);
        setField(term235, term235.getClass(), "sumsqImpl", term246);
        setField(term235, term235.getClass(), "minImpl", term249);
        setField(term235, term235.getClass(), "maxImpl", term252);
        setField(term235, term235.getClass(), "sumLogImpl", term255);
        setField(term235, term235.getClass(), "geoMeanImpl", term258);
        setField(term235, term235.getClass(), "meanImpl", term259);
        setField(term235, term235.getClass(), "varianceImpl", term261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariance", argTypes, term235, args);
    }

};


