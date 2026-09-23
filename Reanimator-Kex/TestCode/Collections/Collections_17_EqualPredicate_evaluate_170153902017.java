package org.apache.commons.collections.functors;

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
import static org.apache.commons.collections.functors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.functors.EqualityUtils.*;
import java.lang.Object;

public class EqualPredicate_evaluate_170153902017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;
     Object term544;

    public EqualPredicate_evaluate_170153902017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("org.apache.commons.collections.functors.EqualPredicate"));
        Object term531 = newInstance(Class.forName("org.apache.commons.collections.functors.DefaultEquator"));
        setField(term417, term417.getClass(), "equator", term531);
        setField(term417, term417.getClass(), "iValue", null);
        term544 = newInstance(Class.forName("org.apache.commons.collections.functors.EqualPredicate"));
        Object term545 = newInstance(Class.forName("org.apache.commons.collections.functors.DefaultEquator"));
        setField(term544, term544.getClass(), "iValue", null);
        setField(term544, term544.getClass(), "equator", term545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.functors.EqualPredicate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "evaluate", argTypes, term417, args);
        assertTrue(recursiveEquals(term417, term544));
    }

};


