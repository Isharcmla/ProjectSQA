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

public class Fraction_reduce_5358591311627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530198;
     Object term530407;
     Object term530404;

    public Fraction_reduce_5358591311627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530198 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530198, term530198.getClass(), "numerator", -2138437598);
        setIntField(term530198, term530198.getClass(), "denominator", 1747401751);
        term530407 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530407, term530407.getClass(), "numerator", -2138437598);
        setIntField(term530407, term530407.getClass(), "denominator", 1747401751);
        setField(term530407, term530407.getClass(), "toString", null);
        setField(term530407, term530407.getClass(), "toProperString", null);
        term530404 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term530404, term530404.getClass(), "numerator", -2138437598);
        setIntField(term530404, term530404.getClass(), "denominator", 1747401751);
        setField(term530404, term530404.getClass(), "toString", null);
        setField(term530404, term530404.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term530198, args);
        assertTrue(recursiveEquals(term530198, term530407));
        assertTrue(recursiveEquals(retValue, term530404));
    }

};


