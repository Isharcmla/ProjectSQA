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

public class SummaryStatistics_addValue_149105491188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12688;

    public SummaryStatistics_addValue_149105491188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12688 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term12798 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term12926 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term13030 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setDoubleField(term12798, term12798.getClass(), "value", 5.666745490604068E15);
        setLongField(term12798, term12798.getClass(), "n", 0L);
        setField(term12688, term12688.getClass(), "sumImpl", term12798);
        setDoubleField(term12926, term12926.getClass(), "value", 5.666745490604068E15);
        setLongField(term12926, term12926.getClass(), "n", 0L);
        setField(term12688, term12688.getClass(), "sumsqImpl", term12926);
        setDoubleField(term13030, term13030.getClass(), "value", 5.666745490604068E15);
        setField(term12688, term12688.getClass(), "minImpl", term13030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.1415405273437575;
        try {
            callMethod(klass, "addValue", argTypes, term12688, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


