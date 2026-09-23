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

public class Fraction_add_1454977021869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246013;
     Object term246093;
     Object term246701;
     Object term246702;
     Object term246698;

    public Fraction_add_1454977021869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246013 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246013, term246013.getClass(), "numerator", -2147483648);
        setIntField(term246013, term246013.getClass(), "denominator", 1694498816);
        term246093 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246093, term246093.getClass(), "numerator", -2147483648);
        setIntField(term246093, term246093.getClass(), "denominator", 1073741824);
        term246701 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246701, term246701.getClass(), "numerator", -2147483648);
        setIntField(term246701, term246701.getClass(), "denominator", 1694498816);
        setField(term246701, term246701.getClass(), "toString", null);
        setField(term246701, term246701.getClass(), "toProperString", null);
        term246702 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246702, term246702.getClass(), "numerator", -2147483648);
        setIntField(term246702, term246702.getClass(), "denominator", 1073741824);
        setField(term246702, term246702.getClass(), "toString", null);
        setField(term246702, term246702.getClass(), "toProperString", null);
        term246698 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246698, term246698.getClass(), "numerator", -21120);
        setIntField(term246698, term246698.getClass(), "denominator", 6464);
        setField(term246698, term246698.getClass(), "toString", null);
        setField(term246698, term246698.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term246093;
        Object retValue = callMethod(klass, "add", argTypes, term246013, args);
        assertTrue(recursiveEquals(term246013, term246701));
        assertTrue(recursiveEquals(term246093, term246702));
        assertTrue(recursiveEquals(retValue, term246698));
    }

};


