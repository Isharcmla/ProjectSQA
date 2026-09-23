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

public class SummaryStatistics_toString_148940668316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;

    public SummaryStatistics_toString_148940668316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term440 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term446 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term449 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term452 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term455 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term458 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term461 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term462 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term464 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term438, term438.getClass(), "n", -872011222785455006L);
        setDoubleField(term440, term440.getClass(), "m2", Double.NaN);
        setLongField(term440, term440.getClass(), "n", 0L);
        setDoubleField(term440, term440.getClass(), "m1", Double.NaN);
        setDoubleField(term440, term440.getClass(), "dev", Double.NaN);
        setDoubleField(term440, term440.getClass(), "nDev", Double.NaN);
        setField(term440, term440.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "secondMoment", term440);
        setLongField(term446, term446.getClass(), "n", 0L);
        setDoubleField(term446, term446.getClass(), "value", 0.0);
        setField(term446, term446.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "sum", term446);
        setLongField(term449, term449.getClass(), "n", 0L);
        setDoubleField(term449, term449.getClass(), "value", 0.0);
        setField(term449, term449.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "sumsq", term449);
        setLongField(term452, term452.getClass(), "n", 0L);
        setDoubleField(term452, term452.getClass(), "value", Double.NaN);
        setField(term452, term452.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "min", term452);
        setLongField(term455, term455.getClass(), "n", 0L);
        setDoubleField(term455, term455.getClass(), "value", Double.NaN);
        setField(term455, term455.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "max", term455);
        setIntField(term458, term458.getClass(), "n", 0);
        setDoubleField(term458, term458.getClass(), "value", 0.0);
        setField(term458, term458.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "sumLog", term458);
        setField(term461, term461.getClass(), "sumOfLogs", term458);
        setField(term461, term461.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "geoMean", term461);
        setField(term462, term462.getClass(), "moment", term440);
        setBooleanField(term462, term462.getClass(), "incMoment", false);
        setField(term462, term462.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "mean", term462);
        setField(term464, term464.getClass(), "moment", term440);
        setBooleanField(term464, term464.getClass(), "incMoment", false);
        setBooleanField(term464, term464.getClass(), "isBiasCorrected", true);
        setField(term464, term464.getClass(), "storedData", null);
        setField(term438, term438.getClass(), "variance", term464);
        setField(term438, term438.getClass(), "sumImpl", term446);
        setField(term438, term438.getClass(), "sumsqImpl", term449);
        setField(term438, term438.getClass(), "minImpl", term452);
        setField(term438, term438.getClass(), "maxImpl", term455);
        setField(term438, term438.getClass(), "sumLogImpl", term458);
        setField(term438, term438.getClass(), "geoMeanImpl", term461);
        setField(term438, term438.getClass(), "meanImpl", term462);
        setField(term438, term438.getClass(), "varianceImpl", term464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term438, args);
    }

};


