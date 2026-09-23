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

public class Fraction_reduce_3355035252446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728241;
     Object term728633;
     Object term728627;

    public Fraction_reduce_3355035252446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728241 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term728241, term728241.getClass(), "numerator", -58246390);
        setIntField(term728241, term728241.getClass(), "denominator", 667980195);
        term728633 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term728633, term728633.getClass(), "numerator", -58246390);
        setIntField(term728633, term728633.getClass(), "denominator", 667980195);
        setField(term728633, term728633.getClass(), "toString", null);
        setField(term728633, term728633.getClass(), "toProperString", null);
        term728627 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term728627, term728627.getClass(), "numerator", -11649278);
        setIntField(term728627, term728627.getClass(), "denominator", 133596039);
        setField(term728627, term728627.getClass(), "toString", null);
        setField(term728627, term728627.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term728241, args);
        assertTrue(recursiveEquals(term728241, term728633));
        assertTrue(recursiveEquals(retValue, term728627));
    }

};


