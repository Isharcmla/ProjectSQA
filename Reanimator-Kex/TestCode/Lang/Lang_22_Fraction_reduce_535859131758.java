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

public class Fraction_reduce_535859131758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239251;
     Object term239783;
     Object term239777;

    public Fraction_reduce_535859131758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239251 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239251, term239251.getClass(), "numerator", 1627474050);
        setIntField(term239251, term239251.getClass(), "denominator", 1084444265);
        term239783 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239783, term239783.getClass(), "numerator", 1627474050);
        setIntField(term239783, term239783.getClass(), "denominator", 1084444265);
        setField(term239783, term239783.getClass(), "toString", null);
        setField(term239783, term239783.getClass(), "toProperString", null);
        term239777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239777, term239777.getClass(), "numerator", 325494810);
        setIntField(term239777, term239777.getClass(), "denominator", 216888853);
        setField(term239777, term239777.getClass(), "toString", null);
        setField(term239777, term239777.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term239251, args);
        assertTrue(recursiveEquals(term239251, term239783));
        assertTrue(recursiveEquals(retValue, term239777));
    }

};


