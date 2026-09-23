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

public class Fraction_reduce_535859131534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163854;
     Object term164894;
     Object term164891;

    public Fraction_reduce_535859131534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163854 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term163854, term163854.getClass(), "numerator", 537034770);
        setIntField(term163854, term163854.getClass(), "denominator", 941622929);
        term164894 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term164894, term164894.getClass(), "numerator", 537034770);
        setIntField(term164894, term164894.getClass(), "denominator", 941622929);
        setField(term164894, term164894.getClass(), "toString", null);
        setField(term164894, term164894.getClass(), "toProperString", null);
        term164891 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term164891, term164891.getClass(), "numerator", 537034770);
        setIntField(term164891, term164891.getClass(), "denominator", 941622929);
        setField(term164891, term164891.getClass(), "toString", null);
        setField(term164891, term164891.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term163854, args);
        assertTrue(recursiveEquals(term163854, term164894));
        assertTrue(recursiveEquals(retValue, term164891));
    }

};


