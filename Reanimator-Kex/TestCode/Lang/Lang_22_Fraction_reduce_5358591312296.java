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

public class Fraction_reduce_5358591312296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750929;
     Object term751374;
     Object term751371;

    public Fraction_reduce_5358591312296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750929 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term750929, term750929.getClass(), "numerator", -786857346);
        setIntField(term750929, term750929.getClass(), "denominator", 1537115161);
        term751374 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751374, term751374.getClass(), "numerator", -786857346);
        setIntField(term751374, term751374.getClass(), "denominator", 1537115161);
        setField(term751374, term751374.getClass(), "toString", null);
        setField(term751374, term751374.getClass(), "toProperString", null);
        term751371 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751371, term751371.getClass(), "numerator", -786857346);
        setIntField(term751371, term751371.getClass(), "denominator", 1537115161);
        setField(term751371, term751371.getClass(), "toString", null);
        setField(term751371, term751371.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term750929, args);
        assertTrue(recursiveEquals(term750929, term751374));
        assertTrue(recursiveEquals(retValue, term751371));
    }

};


