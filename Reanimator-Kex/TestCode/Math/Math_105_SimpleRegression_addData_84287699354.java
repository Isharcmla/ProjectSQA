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
import java.lang.Object;

public class SimpleRegression_addData_84287699354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69890;
     Object term69760;
     Object term74001;
     Object term74002;

    public SimpleRegression_addData_84287699354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69890 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        term69760 = (Object[]) newArray("[D", 0);
        term74001 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term74001, term74001.getClass(), "sumX", 0.0);
        setDoubleField(term74001, term74001.getClass(), "sumXX", 0.0);
        setDoubleField(term74001, term74001.getClass(), "sumY", 0.0);
        setDoubleField(term74001, term74001.getClass(), "sumYY", 0.0);
        setDoubleField(term74001, term74001.getClass(), "sumXY", 0.0);
        setLongField(term74001, term74001.getClass(), "n", 0L);
        setDoubleField(term74001, term74001.getClass(), "xbar", 0.0);
        setDoubleField(term74001, term74001.getClass(), "ybar", 0.0);
        term74002 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69760;
        callMethod(klass, "addData", argTypes, term69890, args);
        assertTrue(recursiveEquals(term69890, term74001));
        assertTrue(recursiveEquals(term69760, term74002));
    }

};


