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

public class Complex_sqrt1z_86661266491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7535;
     Object term7632;
     Object term7629;

    public Complex_sqrt1z_86661266491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7535 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7535, term7535.getClass(), "real", -9.2188684372274033E18);
        setDoubleField(term7535, term7535.getClass(), "imaginary", -9.2166166374137201E18);
        term7632 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7632, term7632.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term7632, term7632.getClass(), "real", -9.2188684372274033E18);
        term7629 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7629, term7629.getClass(), "imaginary", -9.2188684372274033E18);
        setDoubleField(term7629, term7629.getClass(), "real", 9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term7535, args);
        assertTrue(recursiveEquals(term7535, term7632));
        assertTrue(recursiveEquals(retValue, term7629));
    }

};


