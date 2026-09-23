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

public class Fraction_reduce_5358591311058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340176;
     Object term340848;
     Object term340845;

    public Fraction_reduce_5358591311058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340176 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340176, term340176.getClass(), "numerator", 6693570);
        setIntField(term340176, term340176.getClass(), "denominator", 419562121);
        term340848 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340848, term340848.getClass(), "numerator", 6693570);
        setIntField(term340848, term340848.getClass(), "denominator", 419562121);
        setField(term340848, term340848.getClass(), "toString", null);
        setField(term340848, term340848.getClass(), "toProperString", null);
        term340845 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340845, term340845.getClass(), "numerator", 6693570);
        setIntField(term340845, term340845.getClass(), "denominator", 419562121);
        setField(term340845, term340845.getClass(), "toString", null);
        setField(term340845, term340845.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term340176, args);
        assertTrue(recursiveEquals(term340176, term340848));
        assertTrue(recursiveEquals(retValue, term340845));
    }

};


