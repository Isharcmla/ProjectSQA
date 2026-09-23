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

public class Fraction_reduce_335503525481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132717;
     Object term133613;
     Object term133607;

    public Fraction_reduce_335503525481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132717 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term132717, term132717.getClass(), "numerator", -1484783678);
        setIntField(term132717, term132717.getClass(), "denominator", 1077936167);
        term133613 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term133613, term133613.getClass(), "numerator", -1484783678);
        setIntField(term133613, term133613.getClass(), "denominator", 1077936167);
        setField(term133613, term133613.getClass(), "toString", null);
        setField(term133613, term133613.getClass(), "toProperString", null);
        term133607 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term133607, term133607.getClass(), "numerator", -212111954);
        setIntField(term133607, term133607.getClass(), "denominator", 153990881);
        setField(term133607, term133607.getClass(), "toString", null);
        setField(term133607, term133607.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term132717, args);
        assertTrue(recursiveEquals(term132717, term133613));
        assertTrue(recursiveEquals(retValue, term133607));
    }

};


