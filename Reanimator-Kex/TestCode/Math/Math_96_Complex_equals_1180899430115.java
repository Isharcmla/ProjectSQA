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

public class Complex_equals_1180899430115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13301;
     Object term13385;
     Object term13408;
     Object term13409;

    public Complex_equals_1180899430115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13301 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13301, term13301.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term13301, term13301.getClass(), "imaginary", -9.2166166374137201E18);
        term13385 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13385, term13385.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term13385, term13385.getClass(), "imaginary", -9.2166166374137201E18);
        term13408 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13408, term13408.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term13408, term13408.getClass(), "real", -9.2166166374137201E18);
        term13409 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13409, term13409.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term13409, term13409.getClass(), "real", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13385;
        Object retValue = callMethod(klass, "equals", argTypes, term13301, args);
        assertTrue(recursiveEquals(term13301, term13408));
        assertTrue(recursiveEquals(term13385, term13409));
        assertTrue(recursiveEquals(retValue, true));
    }

};


