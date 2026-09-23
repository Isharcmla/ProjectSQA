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

public class Fraction_reduce_3355035252318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686188;
     Object term686777;
     Object term686771;

    public Fraction_reduce_3355035252318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686188 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686188, term686188.getClass(), "numerator", -2030401002);
        setIntField(term686188, term686188.getClass(), "denominator", 23796513);
        term686777 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686777, term686777.getClass(), "numerator", -2030401002);
        setIntField(term686777, term686777.getClass(), "denominator", 23796513);
        setField(term686777, term686777.getClass(), "toString", null);
        setField(term686777, term686777.getClass(), "toProperString", null);
        term686771 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686771, term686771.getClass(), "numerator", -676800334);
        setIntField(term686771, term686771.getClass(), "denominator", 7932171);
        setField(term686771, term686771.getClass(), "toString", null);
        setField(term686771, term686771.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term686188, args);
        assertTrue(recursiveEquals(term686188, term686777));
        assertTrue(recursiveEquals(retValue, term686771));
    }

};


