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

public class Complex_add_61482636380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5871;
     Object term5955;
     Object term6121;
     Object term6122;
     Object term6116;

    public Complex_add_61482636380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5871 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5871, term5871.getClass(), "real", 0.0);
        setDoubleField(term5871, term5871.getClass(), "imaginary", -2.3061217353774853E18);
        term5955 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5955, term5955.getClass(), "real", -4.503599627370496E15);
        setDoubleField(term5955, term5955.getClass(), "imaginary", 6.8950110295042355E18);
        term6121 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6121, term6121.getClass(), "imaginary", -2.3061217353774853E18);
        setDoubleField(term6121, term6121.getClass(), "real", 0.0);
        setBooleanField(term6121, term6121.getClass(), "isNaN", false);
        setBooleanField(term6121, term6121.getClass(), "isInfinite", false);
        term6122 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6122, term6122.getClass(), "imaginary", 6.8950110295042355E18);
        setDoubleField(term6122, term6122.getClass(), "real", -4.503599627370496E15);
        setBooleanField(term6122, term6122.getClass(), "isNaN", false);
        setBooleanField(term6122, term6122.getClass(), "isInfinite", false);
        term6116 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6116, term6116.getClass(), "imaginary", 4.5888892941267502E18);
        setDoubleField(term6116, term6116.getClass(), "real", -4.503599627370496E15);
        setBooleanField(term6116, term6116.getClass(), "isNaN", false);
        setBooleanField(term6116, term6116.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term5955;
        Object retValue = callMethod(klass, "add", argTypes, term5871, args);
        assertTrue(recursiveEquals(term5871, term6121));
        assertTrue(recursiveEquals(term5955, term6122));
        assertTrue(recursiveEquals(retValue, term6116));
    }

};


