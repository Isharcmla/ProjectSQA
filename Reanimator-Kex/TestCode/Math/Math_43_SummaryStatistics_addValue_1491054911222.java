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

public class SummaryStatistics_addValue_1491054911222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51348;

    public SummaryStatistics_addValue_1491054911222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51348 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term51458 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term51586 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term51690 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term51816 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setDoubleField(term51458, term51458.getClass(), "value", 4.504699138998324E15);
        setLongField(term51458, term51458.getClass(), "n", 0L);
        setField(term51348, term51348.getClass(), "sumImpl", term51458);
        setDoubleField(term51586, term51586.getClass(), "value", 4.504699138998324E15);
        setLongField(term51586, term51586.getClass(), "n", 0L);
        setField(term51348, term51348.getClass(), "sumsqImpl", term51586);
        setDoubleField(term51690, term51690.getClass(), "value", 4.504699138998324E15);
        setLongField(term51690, term51690.getClass(), "n", 0L);
        setField(term51348, term51348.getClass(), "minImpl", term51690);
        setField(term51348, term51348.getClass(), "maxImpl", term51816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.250488281250011;
        try {
            callMethod(klass, "addValue", argTypes, term51348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


