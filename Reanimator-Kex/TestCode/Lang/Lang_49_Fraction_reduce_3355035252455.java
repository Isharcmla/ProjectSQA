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

public class Fraction_reduce_3355035252455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731137;
     Object term731245;
     Object term731239;

    public Fraction_reduce_3355035252455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731137 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731137, term731137.getClass(), "numerator", -2079136818);
        setIntField(term731137, term731137.getClass(), "denominator", 34820529);
        term731245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731245, term731245.getClass(), "numerator", -2079136818);
        setIntField(term731245, term731245.getClass(), "denominator", 34820529);
        setField(term731245, term731245.getClass(), "toString", null);
        setField(term731245, term731245.getClass(), "toProperString", null);
        term731239 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term731239, term731239.getClass(), "numerator", -693045606);
        setIntField(term731239, term731239.getClass(), "denominator", 11606843);
        setField(term731239, term731239.getClass(), "toString", null);
        setField(term731239, term731239.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term731137, args);
        assertTrue(recursiveEquals(term731137, term731245));
        assertTrue(recursiveEquals(retValue, term731239));
    }

};


