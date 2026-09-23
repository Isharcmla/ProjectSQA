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
import java.util.Set;

public class IteratorUtils_apply_1953012169308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41596;
     Object term41716;
     Object term42149;
     Object term42152;

    public IteratorUtils_apply_1953012169308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term41717 = new LinkedHashMap();
        Set<Object> term41596_OuterSet = ((LinkedHashMap) term41717).keySet();
        term41596 = ((Set) term41596_OuterSet).iterator();
        term41716 = newInstance(Class.forName("org.apache.commons.collections4.functors.ExceptionClosure"));
        LinkedHashMap term42150 = new LinkedHashMap();
        term42149 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedKeyIterator"));
        setField(term42149, term42149.getClass(), "this$0", term42150);
        setField(term42149, term42149.getClass(), "next", null);
        setField(term42149, term42149.getClass(), "current", null);
        setIntField(term42149, term42149.getClass(), "expectedModCount", 0);
        term42152 = newInstance(Class.forName("org.apache.commons.collections4.functors.ExceptionClosure"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term41596;
        args[1] = term41716;
        callMethod(klass, "apply", argTypes, null, args);
        assertTrue(recursiveEquals(term41596, term42149));
        assertTrue(recursiveEquals(term41716, term42152));
    }

};


