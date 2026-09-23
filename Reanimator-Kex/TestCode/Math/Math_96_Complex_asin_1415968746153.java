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

public class Complex_asin_1415968746153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21548;
     Object term21798;
     Object term21795;

    public Complex_asin_1415968746153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21548 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21548, term21548.getClass(), "real", 9.024791440785408E15);
        setDoubleField(term21548, term21548.getClass(), "imaginary", -9.205356538833666E18);
        term21798 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21798, term21798.getClass(), "imaginary", -9.205356538833666E18);
        setDoubleField(term21798, term21798.getClass(), "real", 9.024791440785408E15);
        term21795 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21795, term21795.getClass(), "imaginary", -44.35946488213504);
        setDoubleField(term21795, term21795.getClass(), "real", 9.803844654261249E-4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term21548, args);
        assertTrue(recursiveEquals(term21548, term21798));
        assertTrue(recursiveEquals(retValue, term21795));
    }

};


