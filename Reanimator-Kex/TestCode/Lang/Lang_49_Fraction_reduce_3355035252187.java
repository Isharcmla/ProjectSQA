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

public class Fraction_reduce_3355035252187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645937;
     Object term646113;
     Object term646107;

    public Fraction_reduce_3355035252187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645937 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645937, term645937.getClass(), "numerator", 1073741838);
        setIntField(term645937, term645937.getClass(), "denominator", 15);
        term646113 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646113, term646113.getClass(), "numerator", 1073741838);
        setIntField(term646113, term646113.getClass(), "denominator", 15);
        setField(term646113, term646113.getClass(), "toString", null);
        setField(term646113, term646113.getClass(), "toProperString", null);
        term646107 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646107, term646107.getClass(), "numerator", 357913946);
        setIntField(term646107, term646107.getClass(), "denominator", 5);
        setField(term646107, term646107.getClass(), "toString", null);
        setField(term646107, term646107.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term645937, args);
        assertTrue(recursiveEquals(term645937, term646113));
        assertTrue(recursiveEquals(retValue, term646107));
    }

};


