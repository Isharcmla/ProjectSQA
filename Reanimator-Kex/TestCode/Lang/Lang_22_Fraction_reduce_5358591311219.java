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

public class Fraction_reduce_5358591311219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395819;
     Object term396454;
     Object term396451;

    public Fraction_reduce_5358591311219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395819 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term395819, term395819.getClass(), "numerator", -1073709038);
        setIntField(term395819, term395819.getClass(), "denominator", 1107310799);
        term396454 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term396454, term396454.getClass(), "numerator", -1073709038);
        setIntField(term396454, term396454.getClass(), "denominator", 1107310799);
        setField(term396454, term396454.getClass(), "toString", null);
        setField(term396454, term396454.getClass(), "toProperString", null);
        term396451 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term396451, term396451.getClass(), "numerator", -1073709038);
        setIntField(term396451, term396451.getClass(), "denominator", 1107310799);
        setField(term396451, term396451.getClass(), "toString", null);
        setField(term396451, term396451.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term395819, args);
        assertTrue(recursiveEquals(term395819, term396454));
        assertTrue(recursiveEquals(retValue, term396451));
    }

};


