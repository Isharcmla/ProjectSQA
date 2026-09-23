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

public class Fraction_reduce_335503525467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128433;
     Object term128905;
     Object term128902;

    public Fraction_reduce_335503525467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128433 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term128433, term128433.getClass(), "numerator", -1296737034);
        setIntField(term128433, term128433.getClass(), "denominator", 853903469);
        term128905 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term128905, term128905.getClass(), "numerator", -1296737034);
        setIntField(term128905, term128905.getClass(), "denominator", 853903469);
        setField(term128905, term128905.getClass(), "toString", null);
        setField(term128905, term128905.getClass(), "toProperString", null);
        term128902 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term128902, term128902.getClass(), "numerator", -1296737034);
        setIntField(term128902, term128902.getClass(), "denominator", 853903469);
        setField(term128902, term128902.getClass(), "toString", null);
        setField(term128902, term128902.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term128433, args);
        assertTrue(recursiveEquals(term128433, term128905));
        assertTrue(recursiveEquals(retValue, term128902));
    }

};


