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

public class Fraction_reduce_5358591311095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351967;
     Object term352079;
     Object term352073;

    public Fraction_reduce_5358591311095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351967 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term351967, term351967.getClass(), "numerator", -1056898542);
        setIntField(term351967, term351967.getClass(), "denominator", 2139193503);
        term352079 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352079, term352079.getClass(), "numerator", -1056898542);
        setIntField(term352079, term352079.getClass(), "denominator", 2139193503);
        setField(term352079, term352079.getClass(), "toString", null);
        setField(term352079, term352079.getClass(), "toProperString", null);
        term352073 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352073, term352073.getClass(), "numerator", -352299514);
        setIntField(term352073, term352073.getClass(), "denominator", 713064501);
        setField(term352073, term352073.getClass(), "toString", null);
        setField(term352073, term352073.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term351967, args);
        assertTrue(recursiveEquals(term351967, term352079));
        assertTrue(recursiveEquals(retValue, term352073));
    }

};


