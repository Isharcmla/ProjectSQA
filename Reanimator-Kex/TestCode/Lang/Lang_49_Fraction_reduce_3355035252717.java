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

public class Fraction_reduce_3355035252717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810321;
     Object term810536;
     Object term810533;

    public Fraction_reduce_3355035252717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810321 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810321, term810321.getClass(), "numerator", 278930);
        setIntField(term810321, term810321.getClass(), "denominator", 2071724193);
        term810536 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810536, term810536.getClass(), "numerator", 278930);
        setIntField(term810536, term810536.getClass(), "denominator", 2071724193);
        setField(term810536, term810536.getClass(), "toString", null);
        setField(term810536, term810536.getClass(), "toProperString", null);
        term810533 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810533, term810533.getClass(), "numerator", 278930);
        setIntField(term810533, term810533.getClass(), "denominator", 2071724193);
        setField(term810533, term810533.getClass(), "toString", null);
        setField(term810533, term810533.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term810321, args);
        assertTrue(recursiveEquals(term810321, term810536));
        assertTrue(recursiveEquals(retValue, term810533));
    }

};


