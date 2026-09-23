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

public class Complex_acos_1430561531289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57782;
     Object term57985;
     Object term57982;

    public Complex_acos_1430561531289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57782 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57782, term57782.getClass(), "real", 3.6028797018964096E16);
        setDoubleField(term57782, term57782.getClass(), "imaginary", -9.1513144385218806E18);
        term57985 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57985, term57985.getClass(), "imaginary", -9.1513144385218806E18);
        setDoubleField(term57985, term57985.getClass(), "real", 3.6028797018964096E16);
        term57982 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57982, term57982.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term57982, term57982.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term57782, args);
        assertTrue(recursiveEquals(term57782, term57985));
        assertTrue(recursiveEquals(retValue, term57982));
    }

};


