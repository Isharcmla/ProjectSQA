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

public class SimpleRegression_getRegressionSumSquares_17028502210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;

    public SimpleRegression_getRegressionSumSquares_17028502210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term130, term130.getClass(), "sumX", 0.53094494792755);
        setDoubleField(term130, term130.getClass(), "sumXX", 0.146431486357265);
        setDoubleField(term130, term130.getClass(), "sumY", 0.24259014218848696);
        setDoubleField(term130, term130.getClass(), "sumYY", 0.1544348383112728);
        setDoubleField(term130, term130.getClass(), "sumXY", 0.5187846213101265);
        setLongField(term130, term130.getClass(), "n", 6967924379644551255L);
        setDoubleField(term130, term130.getClass(), "xbar", 0.045893173090043815);
        setDoubleField(term130, term130.getClass(), "ybar", 0.3626177854778667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegressionSumSquares", argTypes, term130, args);
    }

};


