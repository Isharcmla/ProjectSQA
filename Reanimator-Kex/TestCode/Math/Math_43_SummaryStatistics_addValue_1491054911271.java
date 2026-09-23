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

public class SummaryStatistics_addValue_1491054911271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68751;

    public SummaryStatistics_addValue_1491054911271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68751 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term68861 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term68989 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term69093 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term69219 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        Object term69355 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.StandardDeviation"));
        setDoubleField(term68861, term68861.getClass(), "value", -9.2188684370930483E18);
        setLongField(term68861, term68861.getClass(), "n", -3L);
        setField(term68751, term68751.getClass(), "sumImpl", term68861);
        setDoubleField(term68989, term68989.getClass(), "value", -9.2188684370930483E18);
        setLongField(term68989, term68989.getClass(), "n", -3L);
        setField(term68751, term68751.getClass(), "sumsqImpl", term68989);
        setDoubleField(term69093, term69093.getClass(), "value", -9.2188684370930483E18);
        setLongField(term69093, term69093.getClass(), "n", -16387L);
        setField(term68751, term68751.getClass(), "minImpl", term69093);
        setLongField(term69219, term69219.getClass(), "n", 0L);
        setDoubleField(term69219, term69219.getClass(), "m4", 0.0);
        setDoubleField(term69219, term69219.getClass(), "m3", 0.0);
        setDoubleField(term69219, term69219.getClass(), "m2", 0.0);
        setDoubleField(term69219, term69219.getClass(), "m1", 0.0);
        setDoubleField(term69219, term69219.getClass(), "dev", 0.0);
        setDoubleField(term69219, term69219.getClass(), "nDev", 0.0);
        setDoubleField(term69219, term69219.getClass(), "nDevSq", 0.0);
        setField(term68751, term68751.getClass(), "maxImpl", term69219);
        setField(term68751, term68751.getClass(), "sumLogImpl", term69355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -7.291122562801549E-304;
        try {
            callMethod(klass, "addValue", argTypes, term68751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


