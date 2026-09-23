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
import java.lang.Double;

public class Complex_divide_886435667105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6679;
     Object term6763;
     Object term6782;
     Object term6783;
     Object term6772;

    public Complex_divide_886435667105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6679 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6679, term6679.getClass(), "isNaN", false);
        term6763 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6763, term6763.getClass(), "isNaN", true);
        term6782 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6782, term6782.getClass(), "imaginary", 0.0);
        setDoubleField(term6782, term6782.getClass(), "real", 0.0);
        setBooleanField(term6782, term6782.getClass(), "isNaN", false);
        setBooleanField(term6782, term6782.getClass(), "isInfinite", false);
        term6783 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6783, term6783.getClass(), "imaginary", 0.0);
        setDoubleField(term6783, term6783.getClass(), "real", 0.0);
        setBooleanField(term6783, term6783.getClass(), "isNaN", true);
        setBooleanField(term6783, term6783.getClass(), "isInfinite", false);
        term6772 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6772, term6772.getClass(), "imaginary", Double.NaN);
        setDoubleField(term6772, term6772.getClass(), "real", Double.NaN);
        setBooleanField(term6772, term6772.getClass(), "isNaN", true);
        setBooleanField(term6772, term6772.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6763;
        Object retValue = callMethod(klass, "divide", argTypes, term6679, args);
        assertTrue(recursiveEquals(term6679, term6782));
        assertTrue(recursiveEquals(term6763, term6783));
        assertTrue(recursiveEquals(retValue, term6772));
    }

};


