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

public class Complex_getField_117220667382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;
     Object term4022;
     Object term4015;

    public Complex_getField_117220667382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term276, term276.getClass(), "imaginary", 0.39286935532362843);
        setDoubleField(term276, term276.getClass(), "real", 0.11577948268926874);
        setBooleanField(term276, term276.getClass(), "isNaN", false);
        setBooleanField(term276, term276.getClass(), "isInfinite", false);
        setBooleanField(term276, term276.getClass(), "isZero", false);
        term4022 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4022, term4022.getClass(), "imaginary", 0.39286935532362843);
        setDoubleField(term4022, term4022.getClass(), "real", 0.11577948268926874);
        setBooleanField(term4022, term4022.getClass(), "isNaN", false);
        setBooleanField(term4022, term4022.getClass(), "isInfinite", false);
        setBooleanField(term4022, term4022.getClass(), "isZero", false);
        term4015 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getField", argTypes, term276, args);
        assertTrue(recursiveEquals(term276, term4022));
        assertTrue(recursiveEquals(retValue, term4015));
    }

};


