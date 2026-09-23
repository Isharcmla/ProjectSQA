package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035252766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825921;
     Object term826454;
     Object term826448;

    public Fraction_reduce_3355035252766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825921 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825921, term825921.getClass(), "numerator", -1629588006);
        setIntField(term825921, term825921.getClass(), "denominator", 781235211);
        term826454 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term826454, term826454.getClass(), "numerator", -1629588006);
        setIntField(term826454, term826454.getClass(), "denominator", 781235211);
        setField(term826454, term826454.getClass(), "toString", null);
        setField(term826454, term826454.getClass(), "toProperString", null);
        term826448 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term826448, term826448.getClass(), "numerator", -543196002);
        setIntField(term826448, term826448.getClass(), "denominator", 260411737);
        setField(term826448, term826448.getClass(), "toString", null);
        setField(term826448, term826448.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term825921, args);
        assertTrue(recursiveEquals(term825921, term826454));
        assertTrue(recursiveEquals(retValue, term826448));
    }

};


