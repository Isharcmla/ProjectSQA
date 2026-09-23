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
import java.lang.Double;

public class Complex_subtract_60347678259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;
     Object term128;
     Object term625;
     Object term626;
     Object term613;

    public Complex_subtract_60347678259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term122, term122.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term122, term122.getClass(), "real", 0.6397214730945112);
        setBooleanField(term122, term122.getClass(), "isNaN", true);
        setBooleanField(term122, term122.getClass(), "isInfinite", false);
        setBooleanField(term122, term122.getClass(), "isZero", false);
        term128 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128, term128.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term128, term128.getClass(), "real", 0.5873228247510078);
        setBooleanField(term128, term128.getClass(), "isNaN", true);
        setBooleanField(term128, term128.getClass(), "isInfinite", false);
        setBooleanField(term128, term128.getClass(), "isZero", false);
        term625 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term625, term625.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term625, term625.getClass(), "real", 0.6397214730945112);
        setBooleanField(term625, term625.getClass(), "isNaN", true);
        setBooleanField(term625, term625.getClass(), "isInfinite", false);
        setBooleanField(term625, term625.getClass(), "isZero", false);
        term626 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term626, term626.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term626, term626.getClass(), "real", 0.5873228247510078);
        setBooleanField(term626, term626.getClass(), "isNaN", true);
        setBooleanField(term626, term626.getClass(), "isInfinite", false);
        setBooleanField(term626, term626.getClass(), "isZero", false);
        term613 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term613, term613.getClass(), "imaginary", Double.NaN);
        setDoubleField(term613, term613.getClass(), "real", Double.NaN);
        setBooleanField(term613, term613.getClass(), "isNaN", true);
        setBooleanField(term613, term613.getClass(), "isInfinite", false);
        setBooleanField(term613, term613.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term128;
        Object retValue = callMethod(klass, "subtract", argTypes, term122, args);
        assertTrue(recursiveEquals(term122, term625));
        assertTrue(recursiveEquals(term128, term626));
        assertTrue(recursiveEquals(retValue, term613));
    }

};


