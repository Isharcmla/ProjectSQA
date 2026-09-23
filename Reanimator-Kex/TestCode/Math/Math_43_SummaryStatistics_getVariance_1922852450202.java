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

public class SummaryStatistics_getVariance_1922852450202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44692;
     Object term46360;

    public SummaryStatistics_getVariance_1922852450202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44692 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term44796 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(term44692, term44692.getClass(), "varianceImpl", term44796);
        term46360 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term46361 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setLongField(term46360, term46360.getClass(), "n", 0L);
        setField(term46360, term46360.getClass(), "secondMoment", null);
        setField(term46360, term46360.getClass(), "sum", null);
        setField(term46360, term46360.getClass(), "sumsq", null);
        setField(term46360, term46360.getClass(), "min", null);
        setField(term46360, term46360.getClass(), "max", null);
        setField(term46360, term46360.getClass(), "sumLog", null);
        setField(term46360, term46360.getClass(), "geoMean", null);
        setField(term46360, term46360.getClass(), "mean", null);
        setField(term46360, term46360.getClass(), "variance", null);
        setField(term46360, term46360.getClass(), "sumImpl", null);
        setField(term46360, term46360.getClass(), "sumsqImpl", null);
        setField(term46360, term46360.getClass(), "minImpl", null);
        setField(term46360, term46360.getClass(), "maxImpl", null);
        setField(term46360, term46360.getClass(), "sumLogImpl", null);
        setField(term46360, term46360.getClass(), "geoMeanImpl", null);
        setField(term46360, term46360.getClass(), "meanImpl", null);
        setLongField(term46361, term46361.getClass(), "n", 0L);
        setDoubleField(term46361, term46361.getClass(), "value", 0.0);
        setField(term46361, term46361.getClass(), "storedData", null);
        setField(term46360, term46360.getClass(), "varianceImpl", term46361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVariance", argTypes, term44692, args);
        assertTrue(recursiveEquals(term44692, term46360));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


