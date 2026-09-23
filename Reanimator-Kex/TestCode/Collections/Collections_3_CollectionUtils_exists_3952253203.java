package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;

public class CollectionUtils_exists_3952253203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21805;
     Object term21939;
     Object term22505;
     Object term22507;

    public CollectionUtils_exists_3952253203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21805 = new ArrayList();
        term21939 = newInstance(Class.forName("org.apache.commons.collections.functors.NullIsExceptionPredicate"));
        term22505 = new ArrayList();
        term22507 = newInstance(Class.forName("org.apache.commons.collections.functors.NullIsExceptionPredicate"));
        setField(term22507, term22507.getClass(), "iPredicate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("org.apache.commons.collections.Predicate");
        Object[] args = new Object[2];
        args[0] = term21805;
        args[1] = term21939;
        Object retValue = callMethod(klass, "exists", argTypes, null, args);
        assertTrue(recursiveEquals(term21805, term22505));
        assertTrue(recursiveEquals(term21939, term22507));
        assertTrue(recursiveEquals(retValue, false));
    }

};


