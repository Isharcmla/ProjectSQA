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

public class SummaryStatistics_hashCode_2000166373315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165557;

    public SummaryStatistics_hashCode_2000166373315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165557 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term165683 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        Object term165809 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        Object term165927 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term166031 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setDoubleField(term165683, term165683.getClass(), "m4", 0.0);
        setField(term165557, term165557.getClass(), "geoMeanImpl", term165683);
        setDoubleField(term165809, term165809.getClass(), "m4", 0.0);
        setField(term165557, term165557.getClass(), "maxImpl", term165809);
        setDoubleField(term165927, term165927.getClass(), "value", 0.0);
        setField(term165557, term165557.getClass(), "meanImpl", term165927);
        setField(term165557, term165557.getClass(), "minImpl", term166031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term165557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


