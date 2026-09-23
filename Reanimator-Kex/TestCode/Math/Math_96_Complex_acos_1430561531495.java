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

public class Complex_acos_1430561531495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124848;
     Object term125064;
     Object term125061;

    public Complex_acos_1430561531495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124848 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term124848, term124848.getClass(), "real", 1.44117387099111424E17);
        setDoubleField(term124848, term124848.getClass(), "imaginary", 2.147483648E9);
        term125064 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term125064, term125064.getClass(), "imaginary", 2.147483648E9);
        setDoubleField(term125064, term125064.getClass(), "real", 1.44117387099111424E17);
        term125061 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term125061, term125061.getClass(), "imaginary", -40.20255173114948);
        setDoubleField(term125061, term125061.getClass(), "real", 1.4900933823641605E-8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term124848, args);
        assertTrue(recursiveEquals(term124848, term125064));
        assertTrue(recursiveEquals(retValue, term125061));
    }

};


