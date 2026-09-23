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

public class SimpleRegression_getIntercept_46354947543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term222;
     Object term39109;

    public SimpleRegression_getIntercept_46354947543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term213, term213.getClass(), "sumX", 0.007493740494434409);
        setDoubleField(term213, term213.getClass(), "sumXX", 0.29172553321356776);
        setDoubleField(term213, term213.getClass(), "sumY", 0.9276995636844321);
        setDoubleField(term213, term213.getClass(), "sumYY", 0.7636130748477434);
        setDoubleField(term213, term213.getClass(), "sumXY", 0.07901636960861558);
        setLongField(term213, term213.getClass(), "n", -6573104506744284592L);
        setDoubleField(term213, term213.getClass(), "xbar", 0.18717846301066243);
        setDoubleField(term213, term213.getClass(), "ybar", 0.5335953039331021);
        term222 = new Double(0.5725602309856443);
        term39109 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term39109, term39109.getClass(), "sumX", 0.007493740494434409);
        setDoubleField(term39109, term39109.getClass(), "sumXX", 0.29172553321356776);
        setDoubleField(term39109, term39109.getClass(), "sumY", 0.9276995636844321);
        setDoubleField(term39109, term39109.getClass(), "sumYY", 0.7636130748477434);
        setDoubleField(term39109, term39109.getClass(), "sumXY", 0.07901636960861558);
        setLongField(term39109, term39109.getClass(), "n", -6573104506744284592L);
        setDoubleField(term39109, term39109.getClass(), "xbar", 0.18717846301066243);
        setDoubleField(term39109, term39109.getClass(), "ybar", 0.5335953039331021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term222;
        Object retValue = callMethod(klass, "getIntercept", argTypes, term213, args);
        assertTrue(recursiveEquals(term213, term39109));
        assertTrue(recursiveEquals(term222, 0.5725602309856443));
        assertTrue(recursiveEquals(retValue, -1.4048292476538833E-19));
    }

};


