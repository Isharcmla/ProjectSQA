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

public class Fraction_reduce_3355035252550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760455;
     Object term761002;
     Object term760996;

    public Fraction_reduce_3355035252550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760455 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760455, term760455.getClass(), "numerator", 145711830);
        setIntField(term760455, term760455.getClass(), "denominator", 536888451);
        term761002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761002, term761002.getClass(), "numerator", 145711830);
        setIntField(term761002, term761002.getClass(), "denominator", 536888451);
        setField(term761002, term761002.getClass(), "toString", null);
        setField(term761002, term761002.getClass(), "toProperString", null);
        term760996 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760996, term760996.getClass(), "numerator", 4415510);
        setIntField(term760996, term760996.getClass(), "denominator", 16269347);
        setField(term760996, term760996.getClass(), "toString", null);
        setField(term760996, term760996.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term760455, args);
        assertTrue(recursiveEquals(term760455, term761002));
        assertTrue(recursiveEquals(retValue, term760996));
    }

};


