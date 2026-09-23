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

public class Fraction_reduce_5358591311227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397846;
     Object term398144;
     Object term398141;

    public Fraction_reduce_5358591311227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397846 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term397846, term397846.getClass(), "numerator", 369520674);
        setIntField(term397846, term397846.getClass(), "denominator", 359670025);
        term398144 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398144, term398144.getClass(), "numerator", 369520674);
        setIntField(term398144, term398144.getClass(), "denominator", 359670025);
        setField(term398144, term398144.getClass(), "toString", null);
        setField(term398144, term398144.getClass(), "toProperString", null);
        term398141 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398141, term398141.getClass(), "numerator", 369520674);
        setIntField(term398141, term398141.getClass(), "denominator", 359670025);
        setField(term398141, term398141.getClass(), "toString", null);
        setField(term398141, term398141.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term397846, args);
        assertTrue(recursiveEquals(term397846, term398144));
        assertTrue(recursiveEquals(retValue, term398141));
    }

};


