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

public class Fraction_reduce_5358591311530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497550;
     Object term498517;
     Object term498514;

    public Fraction_reduce_5358591311530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497550 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term497550, term497550.getClass(), "numerator", 1311901086);
        setIntField(term497550, term497550.getClass(), "denominator", 914645383);
        term498517 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term498517, term498517.getClass(), "numerator", 1311901086);
        setIntField(term498517, term498517.getClass(), "denominator", 914645383);
        setField(term498517, term498517.getClass(), "toString", null);
        setField(term498517, term498517.getClass(), "toProperString", null);
        term498514 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term498514, term498514.getClass(), "numerator", 1311901086);
        setIntField(term498514, term498514.getClass(), "denominator", 914645383);
        setField(term498514, term498514.getClass(), "toString", null);
        setField(term498514, term498514.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term497550, args);
        assertTrue(recursiveEquals(term497550, term498517));
        assertTrue(recursiveEquals(retValue, term498514));
    }

};


