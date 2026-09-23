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

public class SimpleRegression_getInterceptStdErr_149309624236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term2204;

    public SimpleRegression_getInterceptStdErr_149309624236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term166, term166.getClass(), "sumX", 0.623231822150205);
        setDoubleField(term166, term166.getClass(), "sumXX", 0.09037487793444521);
        setDoubleField(term166, term166.getClass(), "sumY", 0.6561919196821765);
        setDoubleField(term166, term166.getClass(), "sumYY", 0.7330178886612495);
        setDoubleField(term166, term166.getClass(), "sumXY", 0.7618164754425794);
        setLongField(term166, term166.getClass(), "n", 2535595959091595249L);
        setDoubleField(term166, term166.getClass(), "xbar", 0.7385589312559342);
        setDoubleField(term166, term166.getClass(), "ybar", 0.7080134263823477);
        term2204 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term2204, term2204.getClass(), "sumX", 0.623231822150205);
        setDoubleField(term2204, term2204.getClass(), "sumXX", 0.09037487793444521);
        setDoubleField(term2204, term2204.getClass(), "sumY", 0.6561919196821765);
        setDoubleField(term2204, term2204.getClass(), "sumYY", 0.7330178886612495);
        setDoubleField(term2204, term2204.getClass(), "sumXY", 0.7618164754425794);
        setLongField(term2204, term2204.getClass(), "n", 2535595959091595249L);
        setDoubleField(term2204, term2204.getClass(), "xbar", 0.7385589312559342);
        setDoubleField(term2204, term2204.getClass(), "ybar", 0.7080134263823477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInterceptStdErr", argTypes, term166, args);
        assertTrue(recursiveEquals(term166, term2204));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


