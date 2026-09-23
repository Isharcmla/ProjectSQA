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

public class Fraction_reduce_3355035252351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695984;
     Object term696814;
     Object term696808;

    public Fraction_reduce_3355035252351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695984 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term695984, term695984.getClass(), "numerator", -1400898030);
        setIntField(term695984, term695984.getClass(), "denominator", 113082335);
        term696814 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term696814, term696814.getClass(), "numerator", -1400898030);
        setIntField(term696814, term696814.getClass(), "denominator", 113082335);
        setField(term696814, term696814.getClass(), "toString", null);
        setField(term696814, term696814.getClass(), "toProperString", null);
        term696808 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term696808, term696808.getClass(), "numerator", -280179606);
        setIntField(term696808, term696808.getClass(), "denominator", 22616467);
        setField(term696808, term696808.getClass(), "toString", null);
        setField(term696808, term696808.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term695984, args);
        assertTrue(recursiveEquals(term695984, term696814));
        assertTrue(recursiveEquals(retValue, term696808));
    }

};


