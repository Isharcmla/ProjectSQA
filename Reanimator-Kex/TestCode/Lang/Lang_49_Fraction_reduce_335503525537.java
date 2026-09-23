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

public class Fraction_reduce_335503525537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148189;
     Object term149031;
     Object term149028;

    public Fraction_reduce_335503525537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148189 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term148189, term148189.getClass(), "numerator", 546325778);
        setIntField(term148189, term148189.getClass(), "denominator", 1363465249);
        term149031 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term149031, term149031.getClass(), "numerator", 546325778);
        setIntField(term149031, term149031.getClass(), "denominator", 1363465249);
        setField(term149031, term149031.getClass(), "toString", null);
        setField(term149031, term149031.getClass(), "toProperString", null);
        term149028 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term149028, term149028.getClass(), "numerator", 546325778);
        setIntField(term149028, term149028.getClass(), "denominator", 1363465249);
        setField(term149028, term149028.getClass(), "toString", null);
        setField(term149028, term149028.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term148189, args);
        assertTrue(recursiveEquals(term148189, term149031));
        assertTrue(recursiveEquals(retValue, term149028));
    }

};


