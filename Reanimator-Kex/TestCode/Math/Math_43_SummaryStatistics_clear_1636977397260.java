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

public class SummaryStatistics_clear_1636977397260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59475;

    public SummaryStatistics_clear_1636977397260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59475 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term59593 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term59711 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term59829 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        setLongField(term59475, term59475.getClass(), "n", 0L);
        setDoubleField(term59593, term59593.getClass(), "value", 0.0);
        setLongField(term59593, term59593.getClass(), "n", 0L);
        setField(term59475, term59475.getClass(), "minImpl", term59593);
        setDoubleField(term59711, term59711.getClass(), "value", 0.0);
        setLongField(term59711, term59711.getClass(), "n", 0L);
        setField(term59475, term59475.getClass(), "maxImpl", term59711);
        setField(term59475, term59475.getClass(), "sumImpl", term59829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term59475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


