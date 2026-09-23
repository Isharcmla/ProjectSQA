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

public class SummaryStatistics_clear_163697739717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;

    public SummaryStatistics_clear_163697739717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term469 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term475 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term478 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term481 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term484 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term487 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term490 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term491 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term493 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term467, term467.getClass(), "n", -316468845751588286L);
        setDoubleField(term469, term469.getClass(), "m2", Double.NaN);
        setLongField(term469, term469.getClass(), "n", 0L);
        setDoubleField(term469, term469.getClass(), "m1", Double.NaN);
        setDoubleField(term469, term469.getClass(), "dev", Double.NaN);
        setDoubleField(term469, term469.getClass(), "nDev", Double.NaN);
        setField(term469, term469.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "secondMoment", term469);
        setLongField(term475, term475.getClass(), "n", 0L);
        setDoubleField(term475, term475.getClass(), "value", 0.0);
        setField(term475, term475.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "sum", term475);
        setLongField(term478, term478.getClass(), "n", 0L);
        setDoubleField(term478, term478.getClass(), "value", 0.0);
        setField(term478, term478.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "sumsq", term478);
        setLongField(term481, term481.getClass(), "n", 0L);
        setDoubleField(term481, term481.getClass(), "value", Double.NaN);
        setField(term481, term481.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "min", term481);
        setLongField(term484, term484.getClass(), "n", 0L);
        setDoubleField(term484, term484.getClass(), "value", Double.NaN);
        setField(term484, term484.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "max", term484);
        setIntField(term487, term487.getClass(), "n", 0);
        setDoubleField(term487, term487.getClass(), "value", 0.0);
        setField(term487, term487.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "sumLog", term487);
        setField(term490, term490.getClass(), "sumOfLogs", term487);
        setField(term490, term490.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "geoMean", term490);
        setField(term491, term491.getClass(), "moment", term469);
        setBooleanField(term491, term491.getClass(), "incMoment", false);
        setField(term491, term491.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "mean", term491);
        setField(term493, term493.getClass(), "moment", term469);
        setBooleanField(term493, term493.getClass(), "incMoment", false);
        setBooleanField(term493, term493.getClass(), "isBiasCorrected", true);
        setField(term493, term493.getClass(), "storedData", null);
        setField(term467, term467.getClass(), "variance", term493);
        setField(term467, term467.getClass(), "sumImpl", term475);
        setField(term467, term467.getClass(), "sumsqImpl", term478);
        setField(term467, term467.getClass(), "minImpl", term481);
        setField(term467, term467.getClass(), "maxImpl", term484);
        setField(term467, term467.getClass(), "sumLogImpl", term487);
        setField(term467, term467.getClass(), "geoMeanImpl", term490);
        setField(term467, term467.getClass(), "meanImpl", term491);
        setField(term467, term467.getClass(), "varianceImpl", term493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term467, args);
    }

};


