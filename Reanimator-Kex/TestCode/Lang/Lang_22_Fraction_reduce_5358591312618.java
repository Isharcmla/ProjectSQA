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

public class Fraction_reduce_5358591312618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857597;
     Object term858005;
     Object term858002;

    public Fraction_reduce_5358591312618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857597 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term857597, term857597.getClass(), "numerator", -803855962);
        setIntField(term857597, term857597.getClass(), "denominator", 2081910981);
        term858005 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term858005, term858005.getClass(), "numerator", -803855962);
        setIntField(term858005, term858005.getClass(), "denominator", 2081910981);
        setField(term858005, term858005.getClass(), "toString", null);
        setField(term858005, term858005.getClass(), "toProperString", null);
        term858002 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term858002, term858002.getClass(), "numerator", -803855962);
        setIntField(term858002, term858002.getClass(), "denominator", 2081910981);
        setField(term858002, term858002.getClass(), "toString", null);
        setField(term858002, term858002.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term857597, args);
        assertTrue(recursiveEquals(term857597, term858005));
        assertTrue(recursiveEquals(retValue, term858002));
    }

};


