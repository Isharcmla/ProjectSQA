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

public class Fraction_reduce_3355035251700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498825;
     Object term499445;
     Object term499439;

    public Fraction_reduce_3355035251700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498825 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498825, term498825.getClass(), "numerator", 834063634);
        setIntField(term498825, term498825.getClass(), "denominator", 742887441);
        term499445 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term499445, term499445.getClass(), "numerator", 834063634);
        setIntField(term499445, term499445.getClass(), "denominator", 742887441);
        setField(term499445, term499445.getClass(), "toString", null);
        setField(term499445, term499445.getClass(), "toProperString", null);
        term499439 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term499439, term499439.getClass(), "numerator", 43898086);
        setIntField(term499439, term499439.getClass(), "denominator", 39099339);
        setField(term499439, term499439.getClass(), "toString", null);
        setField(term499439, term499439.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term498825, args);
        assertTrue(recursiveEquals(term498825, term499445));
        assertTrue(recursiveEquals(retValue, term499439));
    }

};


