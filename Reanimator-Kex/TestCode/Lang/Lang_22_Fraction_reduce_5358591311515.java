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

public class Fraction_reduce_5358591311515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492509;
     Object term492814;
     Object term492811;

    public Fraction_reduce_5358591311515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492509 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492509, term492509.getClass(), "numerator", -167145422);
        setIntField(term492509, term492509.getClass(), "denominator", 2064352783);
        term492814 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492814, term492814.getClass(), "numerator", -167145422);
        setIntField(term492814, term492814.getClass(), "denominator", 2064352783);
        setField(term492814, term492814.getClass(), "toString", null);
        setField(term492814, term492814.getClass(), "toProperString", null);
        term492811 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492811, term492811.getClass(), "numerator", -167145422);
        setIntField(term492811, term492811.getClass(), "denominator", 2064352783);
        setField(term492811, term492811.getClass(), "toString", null);
        setField(term492811, term492811.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term492509, args);
        assertTrue(recursiveEquals(term492509, term492814));
        assertTrue(recursiveEquals(retValue, term492811));
    }

};


