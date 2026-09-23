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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Collection;

public class IteratorUtils_matchesAll_952901657342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49109;
     Object term49387;
     Object term49705;
     Object term49706;

    public IteratorUtils_matchesAll_952901657342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term49169 = new LinkedHashMap();
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        ((LinkedHashMap) term49169).put((Object)null, (Object)null);
        Collection<Object> term49109_OuterSet = ((LinkedHashMap) term49169).values();
        term49109 = ((Collection) term49109_OuterSet).iterator();
        term49387 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullPredicate"));
        term49705 = newInstance(Class.forName("org.apache.commons.collections4.functors.NullPredicate"));
        LinkedHashMap term49707 = new LinkedHashMap();
        term49706 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValueIterator"));
        Object term49708 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        setField(term49706, term49706.getClass(), "this$0", term49707);
        setField(term49706, term49706.getClass(), "next", null);
        setField(term49708, term49708.getClass(), "before", null);
        setField(term49708, term49708.getClass(), "after", null);
        setIntField(term49708, term49708.getClass(), "hash", 0);
        setField(term49708, term49708.getClass(), "key", null);
        setField(term49708, term49708.getClass(), "value", null);
        setField(term49708, term49708.getClass(), "next", null);
        setField(term49706, term49706.getClass(), "current", term49708);
        setIntField(term49706, term49706.getClass(), "expectedModCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term49109;
        args[1] = term49387;
        Object retValue = callMethod(klass, "matchesAll", argTypes, null, args);
        assertTrue(recursiveEquals(term49109, term49705));
        assertTrue(recursiveEquals(term49387, term49706));
        assertTrue(recursiveEquals(retValue, true));
    }

};


