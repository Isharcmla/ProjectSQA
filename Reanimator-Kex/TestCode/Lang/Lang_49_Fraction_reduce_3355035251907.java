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

public class Fraction_reduce_3355035251907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560249;
     Object term560771;
     Object term560768;

    public Fraction_reduce_3355035251907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term560249, term560249.getClass(), "numerator", -1092937462);
        setIntField(term560249, term560249.getClass(), "denominator", 1607341795);
        term560771 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term560771, term560771.getClass(), "numerator", -1092937462);
        setIntField(term560771, term560771.getClass(), "denominator", 1607341795);
        setField(term560771, term560771.getClass(), "toString", null);
        setField(term560771, term560771.getClass(), "toProperString", null);
        term560768 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term560768, term560768.getClass(), "numerator", -1092937462);
        setIntField(term560768, term560768.getClass(), "denominator", 1607341795);
        setField(term560768, term560768.getClass(), "toString", null);
        setField(term560768, term560768.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term560249, args);
        assertTrue(recursiveEquals(term560249, term560771));
        assertTrue(recursiveEquals(retValue, term560768));
    }

};


