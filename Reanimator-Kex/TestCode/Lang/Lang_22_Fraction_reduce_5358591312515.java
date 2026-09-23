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

public class Fraction_reduce_5358591312515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824179;
     Object term824789;
     Object term824786;

    public Fraction_reduce_5358591312515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824179 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term824179, term824179.getClass(), "numerator", -1171094266);
        setIntField(term824179, term824179.getClass(), "denominator", 774376965);
        term824789 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term824789, term824789.getClass(), "numerator", -1171094266);
        setIntField(term824789, term824789.getClass(), "denominator", 774376965);
        setField(term824789, term824789.getClass(), "toString", null);
        setField(term824789, term824789.getClass(), "toProperString", null);
        term824786 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term824786, term824786.getClass(), "numerator", -1171094266);
        setIntField(term824786, term824786.getClass(), "denominator", 774376965);
        setField(term824786, term824786.getClass(), "toString", null);
        setField(term824786, term824786.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term824179, args);
        assertTrue(recursiveEquals(term824179, term824789));
        assertTrue(recursiveEquals(retValue, term824786));
    }

};


