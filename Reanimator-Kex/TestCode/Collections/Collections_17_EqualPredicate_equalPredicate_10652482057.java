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

public class EqualPredicate_equalPredicate_10652482057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term22;
     Object term21;

    public EqualPredicate_equalPredicate_10652482057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("java.lang.Object"));
        term22 = newInstance(Class.forName("java.lang.Object"));
        term21 = newInstance(Class.forName("org.apache.commons.collections.functors.EqualPredicate"));
        Object term20 = newInstance(Class.forName("java.lang.Object"));
        setField(term21, term21.getClass(), "iValue", term20);
        setField(term21, term21.getClass(), "equator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.functors.EqualPredicate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.apache.commons.collections.functors.Equator");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = null;
        Object retValue = callMethod(klass, "equalPredicate", argTypes, null, args);
        assertTrue(recursiveEquals(term2, term22));
        assertTrue(recursiveEquals(retValue, term21));
    }

};


