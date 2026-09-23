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

public class Fraction_reduce_335503525375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100472;
     Object term100581;
     Object term100578;

    public Fraction_reduce_335503525375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100472 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term100472, term100472.getClass(), "numerator", -402103402);
        setIntField(term100472, term100472.getClass(), "denominator", 2114588173);
        term100581 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term100581, term100581.getClass(), "numerator", -402103402);
        setIntField(term100581, term100581.getClass(), "denominator", 2114588173);
        setField(term100581, term100581.getClass(), "toString", null);
        setField(term100581, term100581.getClass(), "toProperString", null);
        term100578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term100578, term100578.getClass(), "numerator", -402103402);
        setIntField(term100578, term100578.getClass(), "denominator", 2114588173);
        setField(term100578, term100578.getClass(), "toString", null);
        setField(term100578, term100578.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term100472, args);
        assertTrue(recursiveEquals(term100472, term100581));
        assertTrue(recursiveEquals(retValue, term100578));
    }

};


