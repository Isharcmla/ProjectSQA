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

public class Fraction_reduce_5358591311488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484489;
     Object term484854;
     Object term484851;

    public Fraction_reduce_5358591311488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484489 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term484489, term484489.getClass(), "numerator", 316035922);
        setIntField(term484489, term484489.getClass(), "denominator", 747641377);
        term484854 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term484854, term484854.getClass(), "numerator", 316035922);
        setIntField(term484854, term484854.getClass(), "denominator", 747641377);
        setField(term484854, term484854.getClass(), "toString", null);
        setField(term484854, term484854.getClass(), "toProperString", null);
        term484851 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term484851, term484851.getClass(), "numerator", 316035922);
        setIntField(term484851, term484851.getClass(), "denominator", 747641377);
        setField(term484851, term484851.getClass(), "toString", null);
        setField(term484851, term484851.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term484489, args);
        assertTrue(recursiveEquals(term484489, term484854));
        assertTrue(recursiveEquals(retValue, term484851));
    }

};


