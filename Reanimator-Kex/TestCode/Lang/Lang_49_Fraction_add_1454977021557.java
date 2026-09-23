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

public class Fraction_add_1454977021557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153636;
     Object term153716;
     Object term154190;
     Object term154191;
     Object term154187;

    public Fraction_add_1454977021557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153636 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term153636, term153636.getClass(), "numerator", -2147483648);
        setIntField(term153636, term153636.getClass(), "denominator", 524288);
        term153716 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term153716, term153716.getClass(), "numerator", -2147483648);
        setIntField(term153716, term153716.getClass(), "denominator", 131072);
        term154190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154190, term154190.getClass(), "numerator", -2147483648);
        setIntField(term154190, term154190.getClass(), "denominator", 524288);
        setField(term154190, term154190.getClass(), "toString", null);
        setField(term154190, term154190.getClass(), "toProperString", null);
        term154191 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154191, term154191.getClass(), "numerator", -2147483648);
        setIntField(term154191, term154191.getClass(), "denominator", 131072);
        setField(term154191, term154191.getClass(), "toString", null);
        setField(term154191, term154191.getClass(), "toProperString", null);
        term154187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154187, term154187.getClass(), "numerator", -81920);
        setIntField(term154187, term154187.getClass(), "denominator", 4);
        setField(term154187, term154187.getClass(), "toString", null);
        setField(term154187, term154187.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term153716;
        Object retValue = callMethod(klass, "add", argTypes, term153636, args);
        assertTrue(recursiveEquals(term153636, term154190));
        assertTrue(recursiveEquals(term153716, term154191));
        assertTrue(recursiveEquals(retValue, term154187));
    }

};


