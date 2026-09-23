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

public class Fraction_getProperWhole_197912634743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term2714;

    public Fraction_getProperWhole_197912634743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184, term184.getClass(), "numerator", 1622346318);
        setIntField(term184, term184.getClass(), "denominator", 1048535127);
        setField(term184, term184.getClass(), "toString", "MjGYSRKTNF");
        setField(term184, term184.getClass(), "toProperString", "hRNSzYYIrc");
        term2714 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term2714, term2714.getClass(), "numerator", 1622346318);
        setIntField(term2714, term2714.getClass(), "denominator", 1048535127);
        setField(term2714, term2714.getClass(), "toString", "MjGYSRKTNF");
        setField(term2714, term2714.getClass(), "toProperString", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getProperWhole", argTypes, term184, args);
        assertTrue(recursiveEquals(term184, term2714));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


