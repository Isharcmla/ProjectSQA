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

public class Fraction_reduce_5358591311667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541457;
     Object term541890;
     Object term541887;

    public Fraction_reduce_5358591311667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term541457, term541457.getClass(), "numerator", 939591698);
        setIntField(term541457, term541457.getClass(), "denominator", 1616994625);
        term541890 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term541890, term541890.getClass(), "numerator", 939591698);
        setIntField(term541890, term541890.getClass(), "denominator", 1616994625);
        setField(term541890, term541890.getClass(), "toString", null);
        setField(term541890, term541890.getClass(), "toProperString", null);
        term541887 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term541887, term541887.getClass(), "numerator", 939591698);
        setIntField(term541887, term541887.getClass(), "denominator", 1616994625);
        setField(term541887, term541887.getClass(), "toString", null);
        setField(term541887, term541887.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term541457, args);
        assertTrue(recursiveEquals(term541457, term541890));
        assertTrue(recursiveEquals(retValue, term541887));
    }

};


