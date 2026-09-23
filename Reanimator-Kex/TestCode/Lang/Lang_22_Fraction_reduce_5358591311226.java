package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397537;
     Object term398049;
     Object term398046;

    public Fraction_reduce_5358591311226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397537 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term397537, term397537.getClass(), "numerator", -1242362158);
        setIntField(term397537, term397537.getClass(), "denominator", 1892891759);
        term398049 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398049, term398049.getClass(), "numerator", -1242362158);
        setIntField(term398049, term398049.getClass(), "denominator", 1892891759);
        setField(term398049, term398049.getClass(), "toString", null);
        setField(term398049, term398049.getClass(), "toProperString", null);
        term398046 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398046, term398046.getClass(), "numerator", -1242362158);
        setIntField(term398046, term398046.getClass(), "denominator", 1892891759);
        setField(term398046, term398046.getClass(), "toString", null);
        setField(term398046, term398046.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term397537, args);
        assertTrue(recursiveEquals(term397537, term398049));
        assertTrue(recursiveEquals(retValue, term398046));
    }

};


