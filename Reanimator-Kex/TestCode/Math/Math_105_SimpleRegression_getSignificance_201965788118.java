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

public class SimpleRegression_getSignificance_201965788118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public SimpleRegression_getSignificance_201965788118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term204, term204.getClass(), "sumX", 0.4355627280318103);
        setDoubleField(term204, term204.getClass(), "sumXX", 0.841460835734741);
        setDoubleField(term204, term204.getClass(), "sumY", 0.7859316615744082);
        setDoubleField(term204, term204.getClass(), "sumYY", 0.6428742553484879);
        setDoubleField(term204, term204.getClass(), "sumXY", 0.6584165706677267);
        setLongField(term204, term204.getClass(), "n", 5127676408959197577L);
        setDoubleField(term204, term204.getClass(), "xbar", 0.44268490778872205);
        setDoubleField(term204, term204.getClass(), "ybar", 0.7507333108648018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignificance", argTypes, term204, args);
    }

};


