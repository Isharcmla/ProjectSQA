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

public class SimpleRegression_getTotalSumSquares_4272719299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public SimpleRegression_getTotalSumSquares_4272719299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term121, term121.getClass(), "sumX", 0.48862955528902696);
        setDoubleField(term121, term121.getClass(), "sumXX", 0.426231085465289);
        setDoubleField(term121, term121.getClass(), "sumY", 0.0027299293098262956);
        setDoubleField(term121, term121.getClass(), "sumYY", 0.29874017652881824);
        setDoubleField(term121, term121.getClass(), "sumXY", 0.32554480512985284);
        setLongField(term121, term121.getClass(), "n", -7237588299778557629L);
        setDoubleField(term121, term121.getClass(), "xbar", 0.8924855581421237);
        setDoubleField(term121, term121.getClass(), "ybar", 0.32237559209193944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSumSquares", argTypes, term121, args);
    }

};


