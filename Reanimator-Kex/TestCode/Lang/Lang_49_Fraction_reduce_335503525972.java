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

public class Fraction_reduce_335503525972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278850;
     Object term279398;
     Object term279395;

    public Fraction_reduce_335503525972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278850 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term278850, term278850.getClass(), "numerator", -1205805086);
        setIntField(term278850, term278850.getClass(), "denominator", 201798679);
        term279398 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term279398, term279398.getClass(), "numerator", -1205805086);
        setIntField(term279398, term279398.getClass(), "denominator", 201798679);
        setField(term279398, term279398.getClass(), "toString", null);
        setField(term279398, term279398.getClass(), "toProperString", null);
        term279395 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term279395, term279395.getClass(), "numerator", -1205805086);
        setIntField(term279395, term279395.getClass(), "denominator", 201798679);
        setField(term279395, term279395.getClass(), "toString", null);
        setField(term279395, term279395.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term278850, args);
        assertTrue(recursiveEquals(term278850, term279398));
        assertTrue(recursiveEquals(retValue, term279395));
    }

};


