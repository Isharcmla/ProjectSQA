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

public class Fraction_getFraction_68808229771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7677;

    public Fraction_getFraction_68808229771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7677 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term7677, term7677.getClass(), "numerator", 0);
        setIntField(term7677, term7677.getClass(), "denominator", 1073741824);
        setField(term7677, term7677.getClass(), "toString", null);
        setField(term7677, term7677.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 1073741824;
        Object retValue = callMethod(klass, "getFraction", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term7677));
    }

};


