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

public class Fraction_reduce_3355035252641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788109;
     Object term788687;
     Object term788684;

    public Fraction_reduce_3355035252641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term788109 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788109, term788109.getClass(), "numerator", -539598526);
        setIntField(term788109, term788109.getClass(), "denominator", 2131650471);
        term788687 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788687, term788687.getClass(), "numerator", -539598526);
        setIntField(term788687, term788687.getClass(), "denominator", 2131650471);
        setField(term788687, term788687.getClass(), "toString", null);
        setField(term788687, term788687.getClass(), "toProperString", null);
        term788684 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788684, term788684.getClass(), "numerator", -539598526);
        setIntField(term788684, term788684.getClass(), "denominator", 2131650471);
        setField(term788684, term788684.getClass(), "toString", null);
        setField(term788684, term788684.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term788109, args);
        assertTrue(recursiveEquals(term788109, term788687));
        assertTrue(recursiveEquals(retValue, term788684));
    }

};


