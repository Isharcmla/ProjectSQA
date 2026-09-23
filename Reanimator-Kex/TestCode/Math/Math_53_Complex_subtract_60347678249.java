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

public class Complex_subtract_60347678249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;
     Object term93;
     Object term467;
     Object term468;
     Object term457;

    public Complex_subtract_60347678249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term88, term88.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term88, term88.getClass(), "real", 0.3587267442738795);
        setBooleanField(term88, term88.getClass(), "isNaN", true);
        setBooleanField(term88, term88.getClass(), "isInfinite", true);
        term93 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term93, term93.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term93, term93.getClass(), "real", 0.5279279537140873);
        setBooleanField(term93, term93.getClass(), "isNaN", false);
        setBooleanField(term93, term93.getClass(), "isInfinite", true);
        term467 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term467, term467.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term467, term467.getClass(), "real", 0.3587267442738795);
        setBooleanField(term467, term467.getClass(), "isNaN", true);
        setBooleanField(term467, term467.getClass(), "isInfinite", true);
        term468 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term468, term468.getClass(), "imaginary", 0.07802449704920456);
        setDoubleField(term468, term468.getClass(), "real", 0.5279279537140873);
        setBooleanField(term468, term468.getClass(), "isNaN", false);
        setBooleanField(term468, term468.getClass(), "isInfinite", true);
        term457 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term457, term457.getClass(), "imaginary", Double.NaN);
        setDoubleField(term457, term457.getClass(), "real", Double.NaN);
        setBooleanField(term457, term457.getClass(), "isNaN", true);
        setBooleanField(term457, term457.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term93;
        Object retValue = callMethod(klass, "subtract", argTypes, term88, args);
        assertTrue(recursiveEquals(term88, term467));
        assertTrue(recursiveEquals(term93, term468));
        assertTrue(recursiveEquals(retValue, term457));
    }

};


