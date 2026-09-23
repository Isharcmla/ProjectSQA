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
import java.lang.Double;

public class SimpleRegression_getRegressionSumSquares_167468494744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term233;
     Object term39121;

    public SimpleRegression_getRegressionSumSquares_167468494744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term224, term224.getClass(), "sumX", 0.5310967137636303);
        setDoubleField(term224, term224.getClass(), "sumXX", 0.6054109236809134);
        setDoubleField(term224, term224.getClass(), "sumY", 0.9165240441138934);
        setDoubleField(term224, term224.getClass(), "sumYY", 0.22227423914231126);
        setDoubleField(term224, term224.getClass(), "sumXY", 0.06480976831423468);
        setLongField(term224, term224.getClass(), "n", -4920224193275732920L);
        setDoubleField(term224, term224.getClass(), "xbar", 0.8490790645379176);
        setDoubleField(term224, term224.getClass(), "ybar", 0.23129126164078717);
        term233 = new Double(0.6047138318674447);
        term39121 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term39121, term39121.getClass(), "sumX", 0.5310967137636303);
        setDoubleField(term39121, term39121.getClass(), "sumXX", 0.6054109236809134);
        setDoubleField(term39121, term39121.getClass(), "sumY", 0.9165240441138934);
        setDoubleField(term39121, term39121.getClass(), "sumYY", 0.22227423914231126);
        setDoubleField(term39121, term39121.getClass(), "sumXY", 0.06480976831423468);
        setLongField(term39121, term39121.getClass(), "n", -4920224193275732920L);
        setDoubleField(term39121, term39121.getClass(), "xbar", 0.8490790645379176);
        setDoubleField(term39121, term39121.getClass(), "ybar", 0.23129126164078717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term233;
        Object retValue = callMethod(klass, "getRegressionSumSquares", argTypes, term224, args);
        assertTrue(recursiveEquals(term224, term39121));
        assertTrue(recursiveEquals(term233, 0.6047138318674447));
        assertTrue(recursiveEquals(retValue, 0.2213859512494542));
    }

};


