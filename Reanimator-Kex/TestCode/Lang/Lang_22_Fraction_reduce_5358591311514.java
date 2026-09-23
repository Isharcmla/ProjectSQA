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

public class Fraction_reduce_5358591311514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492098;
     Object term492720;
     Object term492717;

    public Fraction_reduce_5358591311514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492098 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492098, term492098.getClass(), "numerator", 536870882);
        setIntField(term492098, term492098.getClass(), "denominator", 1610612745);
        term492720 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492720, term492720.getClass(), "numerator", 536870882);
        setIntField(term492720, term492720.getClass(), "denominator", 1610612745);
        setField(term492720, term492720.getClass(), "toString", null);
        setField(term492720, term492720.getClass(), "toProperString", null);
        term492717 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492717, term492717.getClass(), "numerator", 536870882);
        setIntField(term492717, term492717.getClass(), "denominator", 1610612745);
        setField(term492717, term492717.getClass(), "toString", null);
        setField(term492717, term492717.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term492098, args);
        assertTrue(recursiveEquals(term492098, term492720));
        assertTrue(recursiveEquals(retValue, term492717));
    }

};


