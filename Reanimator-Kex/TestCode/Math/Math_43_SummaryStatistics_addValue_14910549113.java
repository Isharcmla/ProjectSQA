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

public class SummaryStatistics_addValue_14910549113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term88;

    public SummaryStatistics_addValue_14910549113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term61 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term67 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term70 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term73 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term76 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term79 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term82 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term83 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term85 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term59, term59.getClass(), "n", -8257434502486459194L);
        setDoubleField(term61, term61.getClass(), "m2", Double.NaN);
        setLongField(term61, term61.getClass(), "n", 0L);
        setDoubleField(term61, term61.getClass(), "m1", Double.NaN);
        setDoubleField(term61, term61.getClass(), "dev", Double.NaN);
        setDoubleField(term61, term61.getClass(), "nDev", Double.NaN);
        setField(term61, term61.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "secondMoment", term61);
        setLongField(term67, term67.getClass(), "n", 0L);
        setDoubleField(term67, term67.getClass(), "value", 0.0);
        setField(term67, term67.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "sum", term67);
        setLongField(term70, term70.getClass(), "n", 0L);
        setDoubleField(term70, term70.getClass(), "value", 0.0);
        setField(term70, term70.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "sumsq", term70);
        setLongField(term73, term73.getClass(), "n", 0L);
        setDoubleField(term73, term73.getClass(), "value", Double.NaN);
        setField(term73, term73.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "min", term73);
        setLongField(term76, term76.getClass(), "n", 0L);
        setDoubleField(term76, term76.getClass(), "value", Double.NaN);
        setField(term76, term76.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "max", term76);
        setIntField(term79, term79.getClass(), "n", 0);
        setDoubleField(term79, term79.getClass(), "value", 0.0);
        setField(term79, term79.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "sumLog", term79);
        setField(term82, term82.getClass(), "sumOfLogs", term79);
        setField(term82, term82.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "geoMean", term82);
        setField(term83, term83.getClass(), "moment", term61);
        setBooleanField(term83, term83.getClass(), "incMoment", false);
        setField(term83, term83.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "mean", term83);
        setField(term85, term85.getClass(), "moment", term61);
        setBooleanField(term85, term85.getClass(), "incMoment", false);
        setBooleanField(term85, term85.getClass(), "isBiasCorrected", true);
        setField(term85, term85.getClass(), "storedData", null);
        setField(term59, term59.getClass(), "variance", term85);
        setField(term59, term59.getClass(), "sumImpl", term67);
        setField(term59, term59.getClass(), "sumsqImpl", term70);
        setField(term59, term59.getClass(), "minImpl", term73);
        setField(term59, term59.getClass(), "maxImpl", term76);
        setField(term59, term59.getClass(), "sumLogImpl", term79);
        setField(term59, term59.getClass(), "geoMeanImpl", term82);
        setField(term59, term59.getClass(), "meanImpl", term83);
        setField(term59, term59.getClass(), "varianceImpl", term85);
        term88 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "addValue", argTypes, term59, args);
    }

};


