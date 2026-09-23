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

public class Complex_multiply_1787255358465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116039;
     Object term116123;
     Object term116150;
     Object term116151;
     Object term116147;

    public Complex_multiply_1787255358465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116039 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116039, term116039.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term116039, term116039.getClass(), "imaginary", -9.2188684200475361E18);
        term116123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116123, term116123.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term116123, term116123.getClass(), "imaginary", -9.2166166374137201E18);
        term116150 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116150, term116150.getClass(), "imaginary", -9.2188684200475361E18);
        setDoubleField(term116150, term116150.getClass(), "real", 9.2188684372274053E18);
        term116151 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116151, term116151.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term116151, term116151.getClass(), "real", -9.2166166374137201E18);
        term116147 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116147, term116147.getClass(), "imaginary", -1.5834026814984567E29);
        setDoubleField(term116147, term116147.getClass(), "real", -1.6993355227501638E38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term116123;
        Object retValue = callMethod(klass, "multiply", argTypes, term116039, args);
        assertTrue(recursiveEquals(term116039, term116150));
        assertTrue(recursiveEquals(term116123, term116151));
        assertTrue(recursiveEquals(retValue, term116147));
    }

};


