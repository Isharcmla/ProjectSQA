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

public class SummaryStatistics_hashCode_200016637319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526;

    public SummaryStatistics_hashCode_200016637319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term528 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term534 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term537 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term540 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term543 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term546 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term549 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term550 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term552 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term526, term526.getClass(), "n", -6573104506744284592L);
        setDoubleField(term528, term528.getClass(), "m2", Double.NaN);
        setLongField(term528, term528.getClass(), "n", 0L);
        setDoubleField(term528, term528.getClass(), "m1", Double.NaN);
        setDoubleField(term528, term528.getClass(), "dev", Double.NaN);
        setDoubleField(term528, term528.getClass(), "nDev", Double.NaN);
        setField(term528, term528.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "secondMoment", term528);
        setLongField(term534, term534.getClass(), "n", 0L);
        setDoubleField(term534, term534.getClass(), "value", 0.0);
        setField(term534, term534.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "sum", term534);
        setLongField(term537, term537.getClass(), "n", 0L);
        setDoubleField(term537, term537.getClass(), "value", 0.0);
        setField(term537, term537.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "sumsq", term537);
        setLongField(term540, term540.getClass(), "n", 0L);
        setDoubleField(term540, term540.getClass(), "value", Double.NaN);
        setField(term540, term540.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "min", term540);
        setLongField(term543, term543.getClass(), "n", 0L);
        setDoubleField(term543, term543.getClass(), "value", Double.NaN);
        setField(term543, term543.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "max", term543);
        setIntField(term546, term546.getClass(), "n", 0);
        setDoubleField(term546, term546.getClass(), "value", 0.0);
        setField(term546, term546.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "sumLog", term546);
        setField(term549, term549.getClass(), "sumOfLogs", term546);
        setField(term549, term549.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "geoMean", term549);
        setField(term550, term550.getClass(), "moment", term528);
        setBooleanField(term550, term550.getClass(), "incMoment", false);
        setField(term550, term550.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "mean", term550);
        setField(term552, term552.getClass(), "moment", term528);
        setBooleanField(term552, term552.getClass(), "incMoment", false);
        setBooleanField(term552, term552.getClass(), "isBiasCorrected", true);
        setField(term552, term552.getClass(), "storedData", null);
        setField(term526, term526.getClass(), "variance", term552);
        setField(term526, term526.getClass(), "sumImpl", term534);
        setField(term526, term526.getClass(), "sumsqImpl", term537);
        setField(term526, term526.getClass(), "minImpl", term540);
        setField(term526, term526.getClass(), "maxImpl", term543);
        setField(term526, term526.getClass(), "sumLogImpl", term546);
        setField(term526, term526.getClass(), "geoMeanImpl", term549);
        setField(term526, term526.getClass(), "meanImpl", term550);
        setField(term526, term526.getClass(), "varianceImpl", term552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term526, args);
    }

};


