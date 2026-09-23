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

public class SummaryStatistics_getStandardDeviation_881864418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;

    public SummaryStatistics_getStandardDeviation_881864418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term208 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term214 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term217 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term220 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term223 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term226 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term229 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term230 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term232 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term206, term206.getClass(), "n", 6811161968424632369L);
        setDoubleField(term208, term208.getClass(), "m2", Double.NaN);
        setLongField(term208, term208.getClass(), "n", 0L);
        setDoubleField(term208, term208.getClass(), "m1", Double.NaN);
        setDoubleField(term208, term208.getClass(), "dev", Double.NaN);
        setDoubleField(term208, term208.getClass(), "nDev", Double.NaN);
        setField(term208, term208.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "secondMoment", term208);
        setLongField(term214, term214.getClass(), "n", 0L);
        setDoubleField(term214, term214.getClass(), "value", 0.0);
        setField(term214, term214.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "sum", term214);
        setLongField(term217, term217.getClass(), "n", 0L);
        setDoubleField(term217, term217.getClass(), "value", 0.0);
        setField(term217, term217.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "sumsq", term217);
        setLongField(term220, term220.getClass(), "n", 0L);
        setDoubleField(term220, term220.getClass(), "value", Double.NaN);
        setField(term220, term220.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "min", term220);
        setLongField(term223, term223.getClass(), "n", 0L);
        setDoubleField(term223, term223.getClass(), "value", Double.NaN);
        setField(term223, term223.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "max", term223);
        setIntField(term226, term226.getClass(), "n", 0);
        setDoubleField(term226, term226.getClass(), "value", 0.0);
        setField(term226, term226.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "sumLog", term226);
        setField(term229, term229.getClass(), "sumOfLogs", term226);
        setField(term229, term229.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "geoMean", term229);
        setField(term230, term230.getClass(), "moment", term208);
        setBooleanField(term230, term230.getClass(), "incMoment", false);
        setField(term230, term230.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "mean", term230);
        setField(term232, term232.getClass(), "moment", term208);
        setBooleanField(term232, term232.getClass(), "incMoment", false);
        setBooleanField(term232, term232.getClass(), "isBiasCorrected", true);
        setField(term232, term232.getClass(), "storedData", null);
        setField(term206, term206.getClass(), "variance", term232);
        setField(term206, term206.getClass(), "sumImpl", term214);
        setField(term206, term206.getClass(), "sumsqImpl", term217);
        setField(term206, term206.getClass(), "minImpl", term220);
        setField(term206, term206.getClass(), "maxImpl", term223);
        setField(term206, term206.getClass(), "sumLogImpl", term226);
        setField(term206, term206.getClass(), "geoMeanImpl", term229);
        setField(term206, term206.getClass(), "meanImpl", term230);
        setField(term206, term206.getClass(), "varianceImpl", term232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardDeviation", argTypes, term206, args);
    }

};


