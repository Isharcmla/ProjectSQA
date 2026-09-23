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

public class SummaryStatistics_addValue_1491054911276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70741;

    public SummaryStatistics_addValue_1491054911276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70741 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term70851 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term70979 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term71083 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term71201 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setDoubleField(term70851, term70851.getClass(), "value", 4.6139367187294454E18);
        setLongField(term70851, term70851.getClass(), "n", 0L);
        setField(term70741, term70741.getClass(), "sumImpl", term70851);
        setDoubleField(term70979, term70979.getClass(), "value", 4.6139367187294454E18);
        setLongField(term70979, term70979.getClass(), "n", 0L);
        setField(term70741, term70741.getClass(), "sumsqImpl", term70979);
        setDoubleField(term71083, term71083.getClass(), "value", 4.6139367187294454E18);
        setLongField(term71083, term71083.getClass(), "n", 0L);
        setField(term70741, term70741.getClass(), "minImpl", term71083);
        setField(term70741, term70741.getClass(), "maxImpl", term71201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.99951171875;
        try {
            callMethod(klass, "addValue", argTypes, term70741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


