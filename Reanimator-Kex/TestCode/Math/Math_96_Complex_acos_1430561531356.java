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

public class Complex_acos_1430561531356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81541;
     Object term82248;
     Object term82245;

    public Complex_acos_1430561531356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81541 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term81541, term81541.getClass(), "real", 1.8014398509514752E16);
        setDoubleField(term81541, term81541.getClass(), "imaginary", 1.152921504606848E18);
        term82248 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82248, term82248.getClass(), "imaginary", 1.152921504606848E18);
        setDoubleField(term82248, term82248.getClass(), "real", 1.8014398509514752E16);
        term82245 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82245, term82245.getClass(), "imaginary", -42.282100069570426);
        setDoubleField(term82245, term82245.getClass(), "real", 1.5551725981743914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term81541, args);
        assertTrue(recursiveEquals(term81541, term82248));
        assertTrue(recursiveEquals(retValue, term82245));
    }

};


