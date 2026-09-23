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

public class Complex_asin_1415968746497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125651;
     Object term125862;
     Object term125859;

    public Complex_asin_1415968746497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125651 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term125651, term125651.getClass(), "real", -8.9351416263433257E18);
        setDoubleField(term125651, term125651.getClass(), "imaginary", -9.223372036854776E18);
        term125862 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term125862, term125862.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term125862, term125862.getClass(), "real", -8.9351416263433257E18);
        term125859 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term125859, term125859.getClass(), "imaginary", -44.69237074773571);
        setDoubleField(term125859, term125859.getClass(), "real", -0.7695264784838964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term125651, args);
        assertTrue(recursiveEquals(term125651, term125862));
        assertTrue(recursiveEquals(retValue, term125859));
    }

};


