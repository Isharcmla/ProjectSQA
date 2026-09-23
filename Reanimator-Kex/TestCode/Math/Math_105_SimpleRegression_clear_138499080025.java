package org.apache.commons.math.stat.regression;

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
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.regression.EqualityUtils.*;

public class SimpleRegression_clear_138499080025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term605;

    public SimpleRegression_clear_138499080025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term65, term65.getClass(), "sumX", 0.9737083944266686);
        setDoubleField(term65, term65.getClass(), "sumXX", 0.0668892744806211);
        setDoubleField(term65, term65.getClass(), "sumY", 0.3587267442738795);
        setDoubleField(term65, term65.getClass(), "sumYY", 0.07802449704920456);
        setDoubleField(term65, term65.getClass(), "sumXY", 0.5279279537140873);
        setLongField(term65, term65.getClass(), "n", -8257434502486459194L);
        setDoubleField(term65, term65.getClass(), "xbar", 0.3202192021706908);
        setDoubleField(term65, term65.getClass(), "ybar", 0.22651340641904605);
        term605 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term605, term605.getClass(), "sumX", 0.0);
        setDoubleField(term605, term605.getClass(), "sumXX", 0.0);
        setDoubleField(term605, term605.getClass(), "sumY", 0.0);
        setDoubleField(term605, term605.getClass(), "sumYY", 0.0);
        setDoubleField(term605, term605.getClass(), "sumXY", 0.0);
        setLongField(term605, term605.getClass(), "n", 0L);
        setDoubleField(term605, term605.getClass(), "xbar", 0.3202192021706908);
        setDoubleField(term605, term605.getClass(), "ybar", 0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term65, args);
        assertTrue(recursiveEquals(term65, term605));
    }

};


