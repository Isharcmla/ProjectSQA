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

public class SummaryStatistics_getSecondMoment_192984123262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60207;
     Object term66408;

    public SummaryStatistics_getSecondMoment_192984123262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60207 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term60333 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setField(term60207, term60207.getClass(), "secondMoment", term60333);
        term66408 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term66409 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setLongField(term66408, term66408.getClass(), "n", 0L);
        setDoubleField(term66409, term66409.getClass(), "m4", 0.0);
        setDoubleField(term66409, term66409.getClass(), "m3", 0.0);
        setDoubleField(term66409, term66409.getClass(), "nDevSq", 0.0);
        setDoubleField(term66409, term66409.getClass(), "m2", 0.0);
        setLongField(term66409, term66409.getClass(), "n", 0L);
        setDoubleField(term66409, term66409.getClass(), "m1", 0.0);
        setDoubleField(term66409, term66409.getClass(), "dev", 0.0);
        setDoubleField(term66409, term66409.getClass(), "nDev", 0.0);
        setField(term66409, term66409.getClass(), "storedData", null);
        setField(term66408, term66408.getClass(), "secondMoment", term66409);
        setField(term66408, term66408.getClass(), "sum", null);
        setField(term66408, term66408.getClass(), "sumsq", null);
        setField(term66408, term66408.getClass(), "min", null);
        setField(term66408, term66408.getClass(), "max", null);
        setField(term66408, term66408.getClass(), "sumLog", null);
        setField(term66408, term66408.getClass(), "geoMean", null);
        setField(term66408, term66408.getClass(), "mean", null);
        setField(term66408, term66408.getClass(), "variance", null);
        setField(term66408, term66408.getClass(), "sumImpl", null);
        setField(term66408, term66408.getClass(), "sumsqImpl", null);
        setField(term66408, term66408.getClass(), "minImpl", null);
        setField(term66408, term66408.getClass(), "maxImpl", null);
        setField(term66408, term66408.getClass(), "sumLogImpl", null);
        setField(term66408, term66408.getClass(), "geoMeanImpl", null);
        setField(term66408, term66408.getClass(), "meanImpl", null);
        setField(term66408, term66408.getClass(), "varianceImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSecondMoment", argTypes, term60207, args);
        assertTrue(recursiveEquals(term60207, term66408));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


