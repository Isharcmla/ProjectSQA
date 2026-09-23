package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_matchesAny_952829582523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97125;
     Object term97253;
     Object term98120;
     Object term98121;

    public IteratorUtils_matchesAny_952829582523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97125 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapValueIterator"));
        term97253 = newInstance(Class.forName("org.apache.commons.collections4.functors.TransformedPredicate"));
        term98120 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapValueIterator"));
        setField(term98120, term98120.getClass(), "this$0", null);
        setField(term98120, term98120.getClass(), "lastReturned", null);
        setField(term98120, term98120.getClass(), "next", null);
        setField(term98120, term98120.getClass(), "nextValue", null);
        term98121 = newInstance(Class.forName("org.apache.commons.collections4.functors.TransformedPredicate"));
        setField(term98121, term98121.getClass(), "iTransformer", null);
        setField(term98121, term98121.getClass(), "iPredicate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term97125;
        args[1] = term97253;
        Object retValue = callMethod(klass, "matchesAny", argTypes, null, args);
        assertTrue(recursiveEquals(term97125, term98120));
        assertTrue(recursiveEquals(term97253, term98121));
        assertTrue(recursiveEquals(retValue, false));
    }

};


