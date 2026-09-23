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

public class Fraction_reduce_5358591312365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773109;
     Object term774078;
     Object term774075;

    public Fraction_reduce_5358591312365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773109 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term773109, term773109.getClass(), "numerator", -1332761438);
        setIntField(term773109, term773109.getClass(), "denominator", 843064759);
        term774078 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term774078, term774078.getClass(), "numerator", -1332761438);
        setIntField(term774078, term774078.getClass(), "denominator", 843064759);
        setField(term774078, term774078.getClass(), "toString", null);
        setField(term774078, term774078.getClass(), "toProperString", null);
        term774075 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term774075, term774075.getClass(), "numerator", -1332761438);
        setIntField(term774075, term774075.getClass(), "denominator", 843064759);
        setField(term774075, term774075.getClass(), "toString", null);
        setField(term774075, term774075.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term773109, args);
        assertTrue(recursiveEquals(term773109, term774078));
        assertTrue(recursiveEquals(retValue, term774075));
    }

};


