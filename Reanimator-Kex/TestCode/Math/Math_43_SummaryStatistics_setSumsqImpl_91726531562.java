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

public class SummaryStatistics_setSumsqImpl_91726531562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;

    public SummaryStatistics_setSumsqImpl_91726531562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term644 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term650 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term653 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term656 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term659 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term662 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term665 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term666 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term668 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term642, term642.getClass(), "n", 8059786003080744426L);
        setDoubleField(term644, term644.getClass(), "m2", Double.NaN);
        setLongField(term644, term644.getClass(), "n", 0L);
        setDoubleField(term644, term644.getClass(), "m1", Double.NaN);
        setDoubleField(term644, term644.getClass(), "dev", Double.NaN);
        setDoubleField(term644, term644.getClass(), "nDev", Double.NaN);
        setField(term644, term644.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "secondMoment", term644);
        setLongField(term650, term650.getClass(), "n", 0L);
        setDoubleField(term650, term650.getClass(), "value", 0.0);
        setField(term650, term650.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "sum", term650);
        setLongField(term653, term653.getClass(), "n", 0L);
        setDoubleField(term653, term653.getClass(), "value", 0.0);
        setField(term653, term653.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "sumsq", term653);
        setLongField(term656, term656.getClass(), "n", 0L);
        setDoubleField(term656, term656.getClass(), "value", Double.NaN);
        setField(term656, term656.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "min", term656);
        setLongField(term659, term659.getClass(), "n", 0L);
        setDoubleField(term659, term659.getClass(), "value", Double.NaN);
        setField(term659, term659.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "max", term659);
        setIntField(term662, term662.getClass(), "n", 0);
        setDoubleField(term662, term662.getClass(), "value", 0.0);
        setField(term662, term662.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "sumLog", term662);
        setField(term665, term665.getClass(), "sumOfLogs", term662);
        setField(term665, term665.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "geoMean", term665);
        setField(term666, term666.getClass(), "moment", term644);
        setBooleanField(term666, term666.getClass(), "incMoment", false);
        setField(term666, term666.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "mean", term666);
        setField(term668, term668.getClass(), "moment", term644);
        setBooleanField(term668, term668.getClass(), "incMoment", false);
        setBooleanField(term668, term668.getClass(), "isBiasCorrected", true);
        setField(term668, term668.getClass(), "storedData", null);
        setField(term642, term642.getClass(), "variance", term668);
        setField(term642, term642.getClass(), "sumImpl", term650);
        setField(term642, term642.getClass(), "sumsqImpl", term653);
        setField(term642, term642.getClass(), "minImpl", term656);
        setField(term642, term642.getClass(), "maxImpl", term659);
        setField(term642, term642.getClass(), "sumLogImpl", term662);
        setField(term642, term642.getClass(), "geoMeanImpl", term665);
        setField(term642, term642.getClass(), "meanImpl", term666);
        setField(term642, term642.getClass(), "varianceImpl", term668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setSumsqImpl", argTypes, term642, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


