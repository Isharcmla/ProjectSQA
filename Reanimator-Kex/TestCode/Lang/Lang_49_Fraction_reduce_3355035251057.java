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

public class Fraction_reduce_3355035251057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305241;
     Object term306005;
     Object term306002;

    public Fraction_reduce_3355035251057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305241 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term305241, term305241.getClass(), "numerator", 102140770);
        setIntField(term305241, term305241.getClass(), "denominator", 48410729);
        term306005 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306005, term306005.getClass(), "numerator", 102140770);
        setIntField(term306005, term306005.getClass(), "denominator", 48410729);
        setField(term306005, term306005.getClass(), "toString", null);
        setField(term306005, term306005.getClass(), "toProperString", null);
        term306002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306002, term306002.getClass(), "numerator", 102140770);
        setIntField(term306002, term306002.getClass(), "denominator", 48410729);
        setField(term306002, term306002.getClass(), "toString", null);
        setField(term306002, term306002.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term305241, args);
        assertTrue(recursiveEquals(term305241, term306005));
        assertTrue(recursiveEquals(retValue, term306002));
    }

};


