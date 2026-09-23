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

public class Fraction_reduce_5358591311263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409422;
     Object term410300;
     Object term410297;

    public Fraction_reduce_5358591311263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409422 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term409422, term409422.getClass(), "numerator", 263852562);
        setIntField(term409422, term409422.getClass(), "denominator", 410403041);
        term410300 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term410300, term410300.getClass(), "numerator", 263852562);
        setIntField(term410300, term410300.getClass(), "denominator", 410403041);
        setField(term410300, term410300.getClass(), "toString", null);
        setField(term410300, term410300.getClass(), "toProperString", null);
        term410297 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term410297, term410297.getClass(), "numerator", 263852562);
        setIntField(term410297, term410297.getClass(), "denominator", 410403041);
        setField(term410297, term410297.getClass(), "toString", null);
        setField(term410297, term410297.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term409422, args);
        assertTrue(recursiveEquals(term409422, term410300));
        assertTrue(recursiveEquals(retValue, term410297));
    }

};


