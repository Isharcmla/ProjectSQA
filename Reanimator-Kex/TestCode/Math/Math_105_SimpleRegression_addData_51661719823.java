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

public class SimpleRegression_addData_51661719823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term10;
     Object term12;
     Object term267;

    public SimpleRegression_addData_51661719823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term1, term1.getClass(), "sumX", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "sumXX", 0.3455959125047594);
        setDoubleField(term1, term1.getClass(), "sumY", 0.5523635872663106);
        setDoubleField(term1, term1.getClass(), "sumYY", 0.544608645520025);
        setDoubleField(term1, term1.getClass(), "sumXY", 0.28570734989730284);
        setLongField(term1, term1.getClass(), "n", 2442117782898005296L);
        setDoubleField(term1, term1.getClass(), "xbar", 0.40176586625454525);
        setDoubleField(term1, term1.getClass(), "ybar", 0.2641345529914265);
        term10 = new Double(0.36923381893433327);
        term12 = new Double(0.6076495596892013);
        term267 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term267, term267.getClass(), "sumX", 0.5016212822462383);
        setDoubleField(term267, term267.getClass(), "sumXX", 0.3466542466076039);
        setDoubleField(term267, term267.getClass(), "sumY", 1.160013146955512);
        setDoubleField(term267, term267.getClass(), "sumYY", 0.6626112053465972);
        setDoubleField(term267, term267.getClass(), "sumXY", 0.2745321034442079);
        setLongField(term267, term267.getClass(), "n", 2442117782898005297L);
        setDoubleField(term267, term267.getClass(), "xbar", 0.40176586625454525);
        setDoubleField(term267, term267.getClass(), "ybar", 0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term10;
        args[1] = term12;
        callMethod(klass, "addData", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term267));
        assertTrue(recursiveEquals(term10, 0.36923381893433327));
        assertTrue(recursiveEquals(term12, 0.6076495596892013));
    }

};


