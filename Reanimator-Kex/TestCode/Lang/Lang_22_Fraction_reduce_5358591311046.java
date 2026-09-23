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

public class Fraction_reduce_5358591311046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336891;
     Object term337307;
     Object term337304;

    public Fraction_reduce_5358591311046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336891 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term336891, term336891.getClass(), "numerator", -76765942);
        setIntField(term336891, term336891.getClass(), "denominator", 975503635);
        term337307 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term337307, term337307.getClass(), "numerator", -76765942);
        setIntField(term337307, term337307.getClass(), "denominator", 975503635);
        setField(term337307, term337307.getClass(), "toString", null);
        setField(term337307, term337307.getClass(), "toProperString", null);
        term337304 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term337304, term337304.getClass(), "numerator", -76765942);
        setIntField(term337304, term337304.getClass(), "denominator", 975503635);
        setField(term337304, term337304.getClass(), "toString", null);
        setField(term337304, term337304.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term336891, args);
        assertTrue(recursiveEquals(term336891, term337307));
        assertTrue(recursiveEquals(retValue, term337304));
    }

};


