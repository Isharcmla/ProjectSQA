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

public class Complex_divide_886435667134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10692;
     Object term10776;
     Object term10828;
     Object term10829;
     Object term10823;

    public Complex_divide_886435667134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10692 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10692, term10692.getClass(), "isNaN", false);
        setBooleanField(term10692, term10692.getClass(), "isInfinite", true);
        term10776 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10776, term10776.getClass(), "isNaN", false);
        setDoubleField(term10776, term10776.getClass(), "real", -9.2188684372274053E18);
        setBooleanField(term10776, term10776.getClass(), "isInfinite", true);
        setDoubleField(term10776, term10776.getClass(), "imaginary", 0.0);
        term10828 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10828, term10828.getClass(), "imaginary", 0.0);
        setDoubleField(term10828, term10828.getClass(), "real", 0.0);
        setBooleanField(term10828, term10828.getClass(), "isNaN", false);
        setBooleanField(term10828, term10828.getClass(), "isInfinite", true);
        term10829 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10829, term10829.getClass(), "imaginary", 0.0);
        setDoubleField(term10829, term10829.getClass(), "real", -9.2188684372274053E18);
        setBooleanField(term10829, term10829.getClass(), "isNaN", false);
        setBooleanField(term10829, term10829.getClass(), "isInfinite", true);
        term10823 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10823, term10823.getClass(), "imaginary", -0.0);
        setDoubleField(term10823, term10823.getClass(), "real", -0.0);
        setBooleanField(term10823, term10823.getClass(), "isNaN", false);
        setBooleanField(term10823, term10823.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term10776;
        Object retValue = callMethod(klass, "divide", argTypes, term10692, args);
        assertTrue(recursiveEquals(term10692, term10828));
        assertTrue(recursiveEquals(term10776, term10829));
        assertTrue(recursiveEquals(retValue, term10823));
    }

};


