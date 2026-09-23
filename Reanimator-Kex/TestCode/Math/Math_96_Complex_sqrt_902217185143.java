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

public class Complex_sqrt_902217185143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19975;
     Object term20012;
     Object term20009;

    public Complex_sqrt_902217185143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19975 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19975, term19975.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term19975, term19975.getClass(), "imaginary", -9.2188684372274053E18);
        term20012 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20012, term20012.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term20012, term20012.getClass(), "real", 9.2188684372274053E18);
        term20009 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20009, term20009.getClass(), "imaginary", -1.3817706641177564E9);
        setDoubleField(term20009, term20009.getClass(), "real", 3.335889477402366E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term19975, args);
        assertTrue(recursiveEquals(term19975, term20012));
        assertTrue(recursiveEquals(retValue, term20009));
    }

};


