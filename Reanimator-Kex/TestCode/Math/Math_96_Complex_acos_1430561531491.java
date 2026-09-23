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

public class Complex_acos_1430561531491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123685;
     Object term123896;
     Object term123893;

    public Complex_acos_1430561531491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123685 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123685, term123685.getClass(), "real", 4.503599627374592E15);
        setDoubleField(term123685, term123685.getClass(), "imaginary", 4.6116860184294851E18);
        term123896 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123896, term123896.getClass(), "imaginary", 4.6116860184294851E18);
        setDoubleField(term123896, term123896.getClass(), "real", 4.503599627374592E15);
        term123893 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123893, term123893.getClass(), "imaginary", -43.66827285211394);
        setDoubleField(term123893, term123893.getClass(), "real", 1.569819764605337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term123685, args);
        assertTrue(recursiveEquals(term123685, term123896));
        assertTrue(recursiveEquals(retValue, term123893));
    }

};


