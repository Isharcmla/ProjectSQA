package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_pow_62902513887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6354;
     Object term6438;
     Object term6608;
     Object term6609;
     Object term6605;

    public Complex_pow_62902513887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6354 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6354, term6354.getClass(), "real", 1.15292150460685466E18);
        setDoubleField(term6354, term6354.getClass(), "imaginary", 1.44115188075856691E18);
        term6438 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6438, term6438.getClass(), "real", -9.218305487273984E18);
        setDoubleField(term6438, term6438.getClass(), "imaginary", 9.2188684372274053E18);
        term6608 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6608, term6608.getClass(), "imaginary", 1.44115188075856691E18);
        setDoubleField(term6608, term6608.getClass(), "real", 1.15292150460685466E18);
        term6609 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6609, term6609.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term6609, term6609.getClass(), "real", -9.218305487273984E18);
        term6605 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6605, term6605.getClass(), "imaginary", -0.0);
        setDoubleField(term6605, term6605.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6438;
        Object retValue = callMethod(klass, "pow", argTypes, term6354, args);
        assertTrue(recursiveEquals(term6354, term6608));
        assertTrue(recursiveEquals(term6438, term6609));
        assertTrue(recursiveEquals(retValue, term6605));
    }

};


