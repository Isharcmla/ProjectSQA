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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_toString_1489406683311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164070;

    public SummaryStatistics_toString_1489406683311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164070 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term164174 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term164296 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term164418 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setLongField(term164070, term164070.getClass(), "n", 0L);
        setDoubleField(term164174, term164174.getClass(), "value", 0.0);
        setField(term164070, term164070.getClass(), "minImpl", term164174);
        setField(term164070, term164070.getClass(), "maxImpl", term164174);
        setDoubleField(term164296, term164296.getClass(), "value", 0.0);
        setField(term164070, term164070.getClass(), "meanImpl", term164296);
        setField(term164070, term164070.getClass(), "geoMeanImpl", term164418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term164070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


