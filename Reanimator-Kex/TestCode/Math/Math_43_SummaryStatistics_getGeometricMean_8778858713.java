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

public class SummaryStatistics_getGeometricMean_8778858713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;

    public SummaryStatistics_getGeometricMean_8778858713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term353 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term359 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term362 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term365 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term368 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term371 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term374 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term375 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term377 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term351, term351.getClass(), "n", -4325723315152823407L);
        setDoubleField(term353, term353.getClass(), "m2", Double.NaN);
        setLongField(term353, term353.getClass(), "n", 0L);
        setDoubleField(term353, term353.getClass(), "m1", Double.NaN);
        setDoubleField(term353, term353.getClass(), "dev", Double.NaN);
        setDoubleField(term353, term353.getClass(), "nDev", Double.NaN);
        setField(term353, term353.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "secondMoment", term353);
        setLongField(term359, term359.getClass(), "n", 0L);
        setDoubleField(term359, term359.getClass(), "value", 0.0);
        setField(term359, term359.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "sum", term359);
        setLongField(term362, term362.getClass(), "n", 0L);
        setDoubleField(term362, term362.getClass(), "value", 0.0);
        setField(term362, term362.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "sumsq", term362);
        setLongField(term365, term365.getClass(), "n", 0L);
        setDoubleField(term365, term365.getClass(), "value", Double.NaN);
        setField(term365, term365.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "min", term365);
        setLongField(term368, term368.getClass(), "n", 0L);
        setDoubleField(term368, term368.getClass(), "value", Double.NaN);
        setField(term368, term368.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "max", term368);
        setIntField(term371, term371.getClass(), "n", 0);
        setDoubleField(term371, term371.getClass(), "value", 0.0);
        setField(term371, term371.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "sumLog", term371);
        setField(term374, term374.getClass(), "sumOfLogs", term371);
        setField(term374, term374.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "geoMean", term374);
        setField(term375, term375.getClass(), "moment", term353);
        setBooleanField(term375, term375.getClass(), "incMoment", false);
        setField(term375, term375.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "mean", term375);
        setField(term377, term377.getClass(), "moment", term353);
        setBooleanField(term377, term377.getClass(), "incMoment", false);
        setBooleanField(term377, term377.getClass(), "isBiasCorrected", true);
        setField(term377, term377.getClass(), "storedData", null);
        setField(term351, term351.getClass(), "variance", term377);
        setField(term351, term351.getClass(), "sumImpl", term359);
        setField(term351, term351.getClass(), "sumsqImpl", term362);
        setField(term351, term351.getClass(), "minImpl", term365);
        setField(term351, term351.getClass(), "maxImpl", term368);
        setField(term351, term351.getClass(), "sumLogImpl", term371);
        setField(term351, term351.getClass(), "geoMeanImpl", term374);
        setField(term351, term351.getClass(), "meanImpl", term375);
        setField(term351, term351.getClass(), "varianceImpl", term377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometricMean", argTypes, term351, args);
    }

};


