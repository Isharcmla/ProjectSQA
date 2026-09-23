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

public class Fraction_reduce_535859131113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22288;
     Object term23172;
     Object term23169;

    public Fraction_reduce_535859131113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22288 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term22288, term22288.getClass(), "numerator", -331064062);
        setIntField(term22288, term22288.getClass(), "denominator", 1946544055);
        term23172 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term23172, term23172.getClass(), "numerator", -331064062);
        setIntField(term23172, term23172.getClass(), "denominator", 1946544055);
        setField(term23172, term23172.getClass(), "toString", null);
        setField(term23172, term23172.getClass(), "toProperString", null);
        term23169 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term23169, term23169.getClass(), "numerator", -331064062);
        setIntField(term23169, term23169.getClass(), "denominator", 1946544055);
        setField(term23169, term23169.getClass(), "toString", null);
        setField(term23169, term23169.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term22288, args);
        assertTrue(recursiveEquals(term22288, term23172));
        assertTrue(recursiveEquals(retValue, term23169));
    }

};


