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

public class Fraction_reduce_5358591311018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326550;
     Object term327317;
     Object term327314;

    public Fraction_reduce_5358591311018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326550 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term326550, term326550.getClass(), "numerator", -1734932658);
        setIntField(term326550, term326550.getClass(), "denominator", 2135461153);
        term327317 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term327317, term327317.getClass(), "numerator", -1734932658);
        setIntField(term327317, term327317.getClass(), "denominator", 2135461153);
        setField(term327317, term327317.getClass(), "toString", null);
        setField(term327317, term327317.getClass(), "toProperString", null);
        term327314 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term327314, term327314.getClass(), "numerator", -1734932658);
        setIntField(term327314, term327314.getClass(), "denominator", 2135461153);
        setField(term327314, term327314.getClass(), "toString", null);
        setField(term327314, term327314.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term326550, args);
        assertTrue(recursiveEquals(term326550, term327317));
        assertTrue(recursiveEquals(retValue, term327314));
    }

};


