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

public class Fraction_reduce_335503525694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192162;
     Object term192599;
     Object term192596;

    public Fraction_reduce_335503525694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192162 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192162, term192162.getClass(), "numerator", -1575540350);
        setIntField(term192162, term192162.getClass(), "denominator", 1073743447);
        term192599 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192599, term192599.getClass(), "numerator", -1575540350);
        setIntField(term192599, term192599.getClass(), "denominator", 1073743447);
        setField(term192599, term192599.getClass(), "toString", null);
        setField(term192599, term192599.getClass(), "toProperString", null);
        term192596 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term192596, term192596.getClass(), "numerator", -1575540350);
        setIntField(term192596, term192596.getClass(), "denominator", 1073743447);
        setField(term192596, term192596.getClass(), "toString", null);
        setField(term192596, term192596.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term192162, args);
        assertTrue(recursiveEquals(term192162, term192599));
        assertTrue(recursiveEquals(retValue, term192596));
    }

};


