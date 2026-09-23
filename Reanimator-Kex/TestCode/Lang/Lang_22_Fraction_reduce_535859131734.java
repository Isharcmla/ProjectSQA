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

public class Fraction_reduce_535859131734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232139;
     Object term232659;
     Object term232656;

    public Fraction_reduce_535859131734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232139 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term232139, term232139.getClass(), "numerator", -54800266);
        setIntField(term232139, term232139.getClass(), "denominator", 529765101);
        term232659 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term232659, term232659.getClass(), "numerator", -54800266);
        setIntField(term232659, term232659.getClass(), "denominator", 529765101);
        setField(term232659, term232659.getClass(), "toString", null);
        setField(term232659, term232659.getClass(), "toProperString", null);
        term232656 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term232656, term232656.getClass(), "numerator", -54800266);
        setIntField(term232656, term232656.getClass(), "denominator", 529765101);
        setField(term232656, term232656.getClass(), "toString", null);
        setField(term232656, term232656.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term232139, args);
        assertTrue(recursiveEquals(term232139, term232659));
        assertTrue(recursiveEquals(retValue, term232656));
    }

};


