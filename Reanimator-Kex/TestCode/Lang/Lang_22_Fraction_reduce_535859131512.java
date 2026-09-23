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

public class Fraction_reduce_535859131512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156223;
     Object term156753;
     Object term156750;

    public Fraction_reduce_535859131512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156223 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term156223, term156223.getClass(), "numerator", -253967566);
        setIntField(term156223, term156223.getClass(), "denominator", 2074672479);
        term156753 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term156753, term156753.getClass(), "numerator", -253967566);
        setIntField(term156753, term156753.getClass(), "denominator", 2074672479);
        setField(term156753, term156753.getClass(), "toString", null);
        setField(term156753, term156753.getClass(), "toProperString", null);
        term156750 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term156750, term156750.getClass(), "numerator", -253967566);
        setIntField(term156750, term156750.getClass(), "denominator", 2074672479);
        setField(term156750, term156750.getClass(), "toString", null);
        setField(term156750, term156750.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term156223, args);
        assertTrue(recursiveEquals(term156223, term156753));
        assertTrue(recursiveEquals(retValue, term156750));
    }

};


