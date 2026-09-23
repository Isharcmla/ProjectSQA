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

public class Fraction_reduce_3355035251595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468720;
     Object term469220;
     Object term469217;

    public Fraction_reduce_3355035251595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468720 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term468720, term468720.getClass(), "numerator", 536870926);
        setIntField(term468720, term468720.getClass(), "denominator", 701374175);
        term469220 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term469220, term469220.getClass(), "numerator", 536870926);
        setIntField(term469220, term469220.getClass(), "denominator", 701374175);
        setField(term469220, term469220.getClass(), "toString", null);
        setField(term469220, term469220.getClass(), "toProperString", null);
        term469217 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term469217, term469217.getClass(), "numerator", 536870926);
        setIntField(term469217, term469217.getClass(), "denominator", 701374175);
        setField(term469217, term469217.getClass(), "toString", null);
        setField(term469217, term469217.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term468720, args);
        assertTrue(recursiveEquals(term468720, term469220));
        assertTrue(recursiveEquals(retValue, term469217));
    }

};


