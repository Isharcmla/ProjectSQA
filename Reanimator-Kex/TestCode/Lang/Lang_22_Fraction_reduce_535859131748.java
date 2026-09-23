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

public class Fraction_reduce_535859131748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236429;
     Object term237324;
     Object term237321;

    public Fraction_reduce_535859131748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236429 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term236429, term236429.getClass(), "numerator", -230603198);
        setIntField(term236429, term236429.getClass(), "denominator", 2013274455);
        term237324 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term237324, term237324.getClass(), "numerator", -230603198);
        setIntField(term237324, term237324.getClass(), "denominator", 2013274455);
        setField(term237324, term237324.getClass(), "toString", null);
        setField(term237324, term237324.getClass(), "toProperString", null);
        term237321 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term237321, term237321.getClass(), "numerator", -230603198);
        setIntField(term237321, term237321.getClass(), "denominator", 2013274455);
        setField(term237321, term237321.getClass(), "toString", null);
        setField(term237321, term237321.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term236429, args);
        assertTrue(recursiveEquals(term236429, term237324));
        assertTrue(recursiveEquals(retValue, term237321));
    }

};


