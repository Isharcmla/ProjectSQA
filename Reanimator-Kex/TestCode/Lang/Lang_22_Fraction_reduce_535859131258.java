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

public class Fraction_reduce_535859131258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69205;
     Object term69524;
     Object term69521;

    public Fraction_reduce_535859131258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term69205, term69205.getClass(), "numerator", 8206);
        setIntField(term69205, term69205.getClass(), "denominator", 662411743);
        term69524 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term69524, term69524.getClass(), "numerator", 8206);
        setIntField(term69524, term69524.getClass(), "denominator", 662411743);
        setField(term69524, term69524.getClass(), "toString", null);
        setField(term69524, term69524.getClass(), "toProperString", null);
        term69521 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term69521, term69521.getClass(), "numerator", 8206);
        setIntField(term69521, term69521.getClass(), "denominator", 662411743);
        setField(term69521, term69521.getClass(), "toString", null);
        setField(term69521, term69521.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term69205, args);
        assertTrue(recursiveEquals(term69205, term69524));
        assertTrue(recursiveEquals(retValue, term69521));
    }

};


