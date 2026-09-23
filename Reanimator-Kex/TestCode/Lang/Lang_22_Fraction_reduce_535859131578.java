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

public class Fraction_reduce_535859131578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178651;
     Object term179212;
     Object term179209;

    public Fraction_reduce_535859131578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178651 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term178651, term178651.getClass(), "numerator", 843820050);
        setIntField(term178651, term178651.getClass(), "denominator", 1962748801);
        term179212 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term179212, term179212.getClass(), "numerator", 843820050);
        setIntField(term179212, term179212.getClass(), "denominator", 1962748801);
        setField(term179212, term179212.getClass(), "toString", null);
        setField(term179212, term179212.getClass(), "toProperString", null);
        term179209 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term179209, term179209.getClass(), "numerator", 843820050);
        setIntField(term179209, term179209.getClass(), "denominator", 1962748801);
        setField(term179209, term179209.getClass(), "toString", null);
        setField(term179209, term179209.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term178651, args);
        assertTrue(recursiveEquals(term178651, term179212));
        assertTrue(recursiveEquals(retValue, term179209));
    }

};


