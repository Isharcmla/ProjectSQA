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

public class Complex_acos_1430561531345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77511;
     Object term77938;
     Object term77935;

    public Complex_acos_1430561531345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77511 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77511, term77511.getClass(), "real", -6.9173882901527265E18);
        setDoubleField(term77511, term77511.getClass(), "imaginary", 1.15292152178671616E18);
        term77938 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77938, term77938.getClass(), "imaginary", 1.15292152178671616E18);
        setDoubleField(term77938, term77938.getClass(), "real", -6.9173882901527265E18);
        term77935 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term77935, term77935.getClass(), "imaginary", -44.08741717550523);
        setDoubleField(term77935, term77935.getClass(), "real", 2.9764406744957705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term77511, args);
        assertTrue(recursiveEquals(term77511, term77938));
        assertTrue(recursiveEquals(retValue, term77935));
    }

};


