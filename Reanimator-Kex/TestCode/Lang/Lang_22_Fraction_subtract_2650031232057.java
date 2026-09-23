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

public class Fraction_subtract_2650031232057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669860;
     Object term669942;
     Object term670409;
     Object term670410;
     Object term670406;

    public Fraction_subtract_2650031232057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669860 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term669860, term669860.getClass(), "numerator", 16);
        setIntField(term669860, term669860.getClass(), "denominator", -248);
        term669942 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term669942, term669942.getClass(), "numerator", 16777216);
        setIntField(term669942, term669942.getClass(), "denominator", 164);
        term670409 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term670409, term670409.getClass(), "numerator", 16);
        setIntField(term670409, term670409.getClass(), "denominator", -248);
        setField(term670409, term670409.getClass(), "toString", null);
        setField(term670409, term670409.getClass(), "toProperString", null);
        term670410 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term670410, term670410.getClass(), "numerator", 16777216);
        setIntField(term670410, term670410.getClass(), "denominator", 164);
        setField(term670410, term670410.getClass(), "toString", null);
        setField(term670410, term670410.getClass(), "toProperString", null);
        term670406 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term670406, term670406.getClass(), "numerator", 260047012);
        setIntField(term670406, term670406.getClass(), "denominator", -2542);
        setField(term670406, term670406.getClass(), "toString", null);
        setField(term670406, term670406.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term669942;
        Object retValue = callMethod(klass, "subtract", argTypes, term669860, args);
        assertTrue(recursiveEquals(term669860, term670409));
        assertTrue(recursiveEquals(term669942, term670410));
        assertTrue(recursiveEquals(retValue, term670406));
    }

};


