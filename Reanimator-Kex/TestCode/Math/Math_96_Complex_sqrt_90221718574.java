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

public class Complex_sqrt_90221718574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4663;
     Object term4845;
     Object term4842;

    public Complex_sqrt_90221718574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4663 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4663, term4663.getClass(), "real", -9.223372036854776E18);
        setDoubleField(term4663, term4663.getClass(), "imaginary", 9.2188684372274053E18);
        term4845 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4845, term4845.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term4845, term4845.getClass(), "real", -9.223372036854776E18);
        term4842 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4842, term4842.getClass(), "imaginary", 3.336465624368269E9);
        setDoubleField(term4842, term4842.getClass(), "real", 1.3815320574407115E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term4663, args);
        assertTrue(recursiveEquals(term4663, term4845));
        assertTrue(recursiveEquals(retValue, term4842));
    }

};


