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

public class Fraction_reduce_5358591312588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848450;
     Object term848902;
     Object term848896;

    public Fraction_reduce_5358591312588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848450 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848450, term848450.getClass(), "numerator", 362886258);
        setIntField(term848450, term848450.getClass(), "denominator", 1562715329);
        term848902 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848902, term848902.getClass(), "numerator", 362886258);
        setIntField(term848902, term848902.getClass(), "denominator", 1562715329);
        setField(term848902, term848902.getClass(), "toString", null);
        setField(term848902, term848902.getClass(), "toProperString", null);
        term848896 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848896, term848896.getClass(), "numerator", 51840894);
        setIntField(term848896, term848896.getClass(), "denominator", 223245047);
        setField(term848896, term848896.getClass(), "toString", null);
        setField(term848896, term848896.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term848450, args);
        assertTrue(recursiveEquals(term848450, term848902));
        assertTrue(recursiveEquals(retValue, term848896));
    }

};


