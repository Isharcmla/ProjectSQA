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

public class EqualPredicate_equalPredicate_13682382306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;
     Object term14;

    public EqualPredicate_equalPredicate_13682382306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term16 = newInstance(Class.forName("java.lang.Object"));
        term14 = newInstance(Class.forName("org.apache.commons.collections.functors.EqualPredicate"));
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("org.apache.commons.collections.functors.DefaultEquator"));
        setField(term14, term14.getClass(), "iValue", term13);
        setField(term14, term14.getClass(), "equator", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.functors.EqualPredicate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "equalPredicate", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term16));
        assertTrue(recursiveEquals(retValue, term14));
    }

};


