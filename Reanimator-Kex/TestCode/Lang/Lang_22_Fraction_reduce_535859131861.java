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

public class Fraction_reduce_535859131861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274598;
     Object term275539;
     Object term275536;

    public Fraction_reduce_535859131861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274598 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term274598, term274598.getClass(), "numerator", -1564818558);
        setIntField(term274598, term274598.getClass(), "denominator", 807035527);
        term275539 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term275539, term275539.getClass(), "numerator", -1564818558);
        setIntField(term275539, term275539.getClass(), "denominator", 807035527);
        setField(term275539, term275539.getClass(), "toString", null);
        setField(term275539, term275539.getClass(), "toProperString", null);
        term275536 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term275536, term275536.getClass(), "numerator", -1564818558);
        setIntField(term275536, term275536.getClass(), "denominator", 807035527);
        setField(term275536, term275536.getClass(), "toString", null);
        setField(term275536, term275536.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term274598, args);
        assertTrue(recursiveEquals(term274598, term275539));
        assertTrue(recursiveEquals(retValue, term275536));
    }

};


