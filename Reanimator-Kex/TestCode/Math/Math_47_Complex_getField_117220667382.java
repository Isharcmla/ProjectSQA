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
     Object term235;
     Object term4570;
     Object term4564;

    public Complex_getField_117220667382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term235, term235.getClass(), "imaginary", 0.39286935532362843);
        setDoubleField(term235, term235.getClass(), "real", 0.11577948268926874);
        setBooleanField(term235, term235.getClass(), "isNaN", true);
        setBooleanField(term235, term235.getClass(), "isInfinite", false);
        term4570 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4570, term4570.getClass(), "imaginary", 0.39286935532362843);
        setDoubleField(term4570, term4570.getClass(), "real", 0.11577948268926874);
        setBooleanField(term4570, term4570.getClass(), "isNaN", true);
        setBooleanField(term4570, term4570.getClass(), "isInfinite", false);
        term4564 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getField", argTypes, term235, args);
        assertTrue(recursiveEquals(term235, term4570));
        assertTrue(recursiveEquals(retValue, term4564));
    }

};


