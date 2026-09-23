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

public class Fraction_reduce_3355035252164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638800;
     Object term639698;
     Object term639692;

    public Fraction_reduce_3355035252164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638800 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term638800, term638800.getClass(), "numerator", 264614742);
        setIntField(term638800, term638800.getClass(), "denominator", 1208615187);
        term639698 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term639698, term639698.getClass(), "numerator", 264614742);
        setIntField(term639698, term639698.getClass(), "denominator", 1208615187);
        setField(term639698, term639698.getClass(), "toString", null);
        setField(term639698, term639698.getClass(), "toProperString", null);
        term639692 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term639692, term639692.getClass(), "numerator", 88204914);
        setIntField(term639692, term639692.getClass(), "denominator", 402871729);
        setField(term639692, term639692.getClass(), "toString", null);
        setField(term639692, term639692.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term638800, args);
        assertTrue(recursiveEquals(term638800, term639698));
        assertTrue(recursiveEquals(retValue, term639692));
    }

};


