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

public class Fraction_reduce_5358591311558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506796;
     Object term507201;
     Object term507198;

    public Fraction_reduce_5358591311558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506796 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term506796, term506796.getClass(), "numerator", -1945108478);
        setIntField(term506796, term506796.getClass(), "denominator", 1096450055);
        term507201 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term507201, term507201.getClass(), "numerator", -1945108478);
        setIntField(term507201, term507201.getClass(), "denominator", 1096450055);
        setField(term507201, term507201.getClass(), "toString", null);
        setField(term507201, term507201.getClass(), "toProperString", null);
        term507198 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term507198, term507198.getClass(), "numerator", -1945108478);
        setIntField(term507198, term507198.getClass(), "denominator", 1096450055);
        setField(term507198, term507198.getClass(), "toString", null);
        setField(term507198, term507198.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term506796, args);
        assertTrue(recursiveEquals(term506796, term507201));
        assertTrue(recursiveEquals(retValue, term507198));
    }

};


