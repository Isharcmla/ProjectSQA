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

public class SummaryStatistics_addValue_149105491191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13976;

    public SummaryStatistics_addValue_149105491191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13976 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term14086 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term14214 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term14318 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setDoubleField(term14086, term14086.getClass(), "value", -9.1603210751359058E18);
        setLongField(term14086, term14086.getClass(), "n", 0L);
        setField(term13976, term13976.getClass(), "sumImpl", term14086);
        setDoubleField(term14214, term14214.getClass(), "value", -9.1603210751359058E18);
        setLongField(term14214, term14214.getClass(), "n", 0L);
        setField(term13976, term13976.getClass(), "sumsqImpl", term14214);
        setDoubleField(term14318, term14318.getClass(), "value", -9.1603210751359058E18);
        setField(term13976, term13976.getClass(), "minImpl", term14318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.823009965630758E-304;
        try {
            callMethod(klass, "addValue", argTypes, term13976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


