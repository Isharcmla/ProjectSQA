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

public class Fraction_reduce_5358591311882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615145;
     Object term615540;
     Object term615537;

    public Fraction_reduce_5358591311882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615145 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term615145, term615145.getClass(), "numerator", 4349966);
        setIntField(term615145, term615145.getClass(), "denominator", 843715199);
        term615540 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term615540, term615540.getClass(), "numerator", 4349966);
        setIntField(term615540, term615540.getClass(), "denominator", 843715199);
        setField(term615540, term615540.getClass(), "toString", null);
        setField(term615540, term615540.getClass(), "toProperString", null);
        term615537 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term615537, term615537.getClass(), "numerator", 4349966);
        setIntField(term615537, term615537.getClass(), "denominator", 843715199);
        setField(term615537, term615537.getClass(), "toString", null);
        setField(term615537, term615537.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term615145, args);
        assertTrue(recursiveEquals(term615145, term615540));
        assertTrue(recursiveEquals(retValue, term615537));
    }

};


