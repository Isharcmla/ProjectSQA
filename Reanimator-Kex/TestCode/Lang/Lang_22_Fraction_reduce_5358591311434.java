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

public class Fraction_reduce_5358591311434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467702;
     Object term468252;
     Object term468249;

    public Fraction_reduce_5358591311434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467702 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term467702, term467702.getClass(), "numerator", -1192602418);
        setIntField(term467702, term467702.getClass(), "denominator", 1107329617);
        term468252 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term468252, term468252.getClass(), "numerator", -1192602418);
        setIntField(term468252, term468252.getClass(), "denominator", 1107329617);
        setField(term468252, term468252.getClass(), "toString", null);
        setField(term468252, term468252.getClass(), "toProperString", null);
        term468249 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term468249, term468249.getClass(), "numerator", -1192602418);
        setIntField(term468249, term468249.getClass(), "denominator", 1107329617);
        setField(term468249, term468249.getClass(), "toString", null);
        setField(term468249, term468249.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term467702, args);
        assertTrue(recursiveEquals(term467702, term468252));
        assertTrue(recursiveEquals(retValue, term468249));
    }

};


