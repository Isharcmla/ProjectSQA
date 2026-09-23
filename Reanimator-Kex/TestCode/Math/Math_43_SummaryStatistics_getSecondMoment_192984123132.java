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

public class SummaryStatistics_getSecondMoment_192984123132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23846;
     Object term24129;

    public SummaryStatistics_getSecondMoment_192984123132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23846 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term23972 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setField(term23846, term23846.getClass(), "secondMoment", term23972);
        term24129 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term24130 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setLongField(term24129, term24129.getClass(), "n", 0L);
        setDoubleField(term24130, term24130.getClass(), "m4", 0.0);
        setDoubleField(term24130, term24130.getClass(), "m3", 0.0);
        setDoubleField(term24130, term24130.getClass(), "nDevSq", 0.0);
        setDoubleField(term24130, term24130.getClass(), "m2", 0.0);
        setLongField(term24130, term24130.getClass(), "n", 0L);
        setDoubleField(term24130, term24130.getClass(), "m1", 0.0);
        setDoubleField(term24130, term24130.getClass(), "dev", 0.0);
        setDoubleField(term24130, term24130.getClass(), "nDev", 0.0);
        setField(term24130, term24130.getClass(), "storedData", null);
        setField(term24129, term24129.getClass(), "secondMoment", term24130);
        setField(term24129, term24129.getClass(), "sum", null);
        setField(term24129, term24129.getClass(), "sumsq", null);
        setField(term24129, term24129.getClass(), "min", null);
        setField(term24129, term24129.getClass(), "max", null);
        setField(term24129, term24129.getClass(), "sumLog", null);
        setField(term24129, term24129.getClass(), "geoMean", null);
        setField(term24129, term24129.getClass(), "mean", null);
        setField(term24129, term24129.getClass(), "variance", null);
        setField(term24129, term24129.getClass(), "sumImpl", null);
        setField(term24129, term24129.getClass(), "sumsqImpl", null);
        setField(term24129, term24129.getClass(), "minImpl", null);
        setField(term24129, term24129.getClass(), "maxImpl", null);
        setField(term24129, term24129.getClass(), "sumLogImpl", null);
        setField(term24129, term24129.getClass(), "geoMeanImpl", null);
        setField(term24129, term24129.getClass(), "meanImpl", null);
        setField(term24129, term24129.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSecondMoment", argTypes, term23846, args);
        assertTrue(recursiveEquals(term23846, term24129));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


