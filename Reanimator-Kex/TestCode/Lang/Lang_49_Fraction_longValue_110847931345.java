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

public class Fraction_longValue_110847931345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term2860;

    public Fraction_longValue_110847931345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term278, term278.getClass(), "numerator", -1007160944);
        setIntField(term278, term278.getClass(), "denominator", 1135664017);
        setField(term278, term278.getClass(), "toString", "uuaPigETmJ");
        setField(term278, term278.getClass(), "toProperString", "MxlszYVzRf");
        term2860 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term2860, term2860.getClass(), "numerator", -1007160944);
        setIntField(term2860, term2860.getClass(), "denominator", 1135664017);
        setField(term2860, term2860.getClass(), "toString", "uuaPigETmJ");
        setField(term2860, term2860.getClass(), "toProperString", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "longValue", argTypes, term278, args);
        assertTrue(recursiveEquals(term278, term2860));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


