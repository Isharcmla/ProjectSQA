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

public class Complex_asin_1415968746403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98200;
     Object term98825;
     Object term98822;

    public Complex_asin_1415968746403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98200 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98200, term98200.getClass(), "real", -8.9351394616798085E18);
        setDoubleField(term98200, term98200.getClass(), "imaginary", -9.1513144428168479E18);
        term98825 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98825, term98825.getClass(), "imaginary", -9.1513144428168479E18);
        setDoubleField(term98825, term98825.getClass(), "real", -8.9351394616798085E18);
        term98822 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98822, term98822.getClass(), "imaginary", -44.68833994299134);
        setDoubleField(term98822, term98822.getClass(), "real", -0.7734464182369278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term98200, args);
        assertTrue(recursiveEquals(term98200, term98825));
        assertTrue(recursiveEquals(retValue, term98822));
    }

};


