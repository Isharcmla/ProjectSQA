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
import java.lang.Double;

public class SummaryStatistics_addValue_1491054911303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159691;

    public SummaryStatistics_addValue_1491054911303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159691 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term159817 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term159935 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term160061 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term160187 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setLongField(term159817, term159817.getClass(), "n", -4294967296L);
        setDoubleField(term159817, term159817.getClass(), "m2", 0.0);
        setDoubleField(term159817, term159817.getClass(), "m1", 0.0);
        setDoubleField(term159817, term159817.getClass(), "dev", 0.0);
        setDoubleField(term159817, term159817.getClass(), "nDev", 0.0);
        setField(term159691, term159691.getClass(), "sumImpl", term159817);
        setBooleanField(term159935, term159935.getClass(), "incMoment", false);
        setField(term159691, term159691.getClass(), "sumsqImpl", term159935);
        setLongField(term160061, term160061.getClass(), "n", 0L);
        setDoubleField(term160061, term160061.getClass(), "m1", 0.0);
        setDoubleField(term160061, term160061.getClass(), "dev", 0.0);
        setDoubleField(term160061, term160061.getClass(), "nDev", 0.0);
        setField(term159691, term159691.getClass(), "minImpl", term160061);
        setField(term159691, term159691.getClass(), "maxImpl", term160187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        try {
            callMethod(klass, "addValue", argTypes, term159691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


