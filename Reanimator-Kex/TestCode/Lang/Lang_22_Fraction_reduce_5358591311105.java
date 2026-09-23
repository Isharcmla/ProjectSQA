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

public class Fraction_reduce_5358591311105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354985;
     Object term355091;
     Object term355088;

    public Fraction_reduce_5358591311105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354985 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term354985, term354985.getClass(), "numerator", -1606418430);
        setIntField(term354985, term354985.getClass(), "denominator", 1375731719);
        term355091 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term355091, term355091.getClass(), "numerator", -1606418430);
        setIntField(term355091, term355091.getClass(), "denominator", 1375731719);
        setField(term355091, term355091.getClass(), "toString", null);
        setField(term355091, term355091.getClass(), "toProperString", null);
        term355088 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term355088, term355088.getClass(), "numerator", -1606418430);
        setIntField(term355088, term355088.getClass(), "denominator", 1375731719);
        setField(term355088, term355088.getClass(), "toString", null);
        setField(term355088, term355088.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term354985, args);
        assertTrue(recursiveEquals(term354985, term355091));
        assertTrue(recursiveEquals(retValue, term355088));
    }

};


