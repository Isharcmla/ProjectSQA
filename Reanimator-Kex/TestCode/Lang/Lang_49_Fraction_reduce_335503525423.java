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

public class Fraction_reduce_335503525423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115856;
     Object term116078;
     Object term116072;

    public Fraction_reduce_335503525423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115856 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term115856, term115856.getClass(), "numerator", 35652114);
        setIntField(term115856, term115856.getClass(), "denominator", 1611658695);
        term116078 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116078, term116078.getClass(), "numerator", 35652114);
        setIntField(term116078, term116078.getClass(), "denominator", 1611658695);
        setField(term116078, term116078.getClass(), "toString", null);
        setField(term116078, term116078.getClass(), "toProperString", null);
        term116072 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116072, term116072.getClass(), "numerator", 11884038);
        setIntField(term116072, term116072.getClass(), "denominator", 537219565);
        setField(term116072, term116072.getClass(), "toString", null);
        setField(term116072, term116072.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term115856, args);
        assertTrue(recursiveEquals(term115856, term116078));
        assertTrue(recursiveEquals(retValue, term116072));
    }

};


