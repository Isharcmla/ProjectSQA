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

public class Fraction_reduce_535859131166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38743;
     Object term39127;
     Object term39124;

    public Fraction_reduce_535859131166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38743 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term38743, term38743.getClass(), "numerator", -2141893882);
        setIntField(term38743, term38743.getClass(), "denominator", 1128382581);
        term39127 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term39127, term39127.getClass(), "numerator", -2141893882);
        setIntField(term39127, term39127.getClass(), "denominator", 1128382581);
        setField(term39127, term39127.getClass(), "toString", null);
        setField(term39127, term39127.getClass(), "toProperString", null);
        term39124 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term39124, term39124.getClass(), "numerator", -2141893882);
        setIntField(term39124, term39124.getClass(), "denominator", 1128382581);
        setField(term39124, term39124.getClass(), "toString", null);
        setField(term39124, term39124.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term38743, args);
        assertTrue(recursiveEquals(term38743, term39127));
        assertTrue(recursiveEquals(retValue, term39124));
    }

};


