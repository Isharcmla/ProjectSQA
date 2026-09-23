package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_toString_46880309249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62018;
     Object term62121;

    public Fraction_toString_46880309249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62018 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setField(term62018, term62018.getClass(), "toString", null);
        term62121 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term62121, term62121.getClass(), "numerator", 0);
        setIntField(term62121, term62121.getClass(), "denominator", 0);
        setField(term62121, term62121.getClass(), "toString", "0/0");
        setField(term62121, term62121.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term62018, args);
        assertTrue(recursiveEquals(term62018, term62121));
        assertTrue(recursiveEquals(retValue, "0/0"));
    }

};


