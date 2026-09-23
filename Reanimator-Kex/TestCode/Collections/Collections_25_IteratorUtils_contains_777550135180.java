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
import java.util.HashMap;
import java.lang.Object;
import java.util.Collection;

public class IteratorUtils_contains_777550135180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22491;
     Object term22529;
     Object term22687;
     Object term22688;

    public IteratorUtils_contains_777550135180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22530 = new HashMap();
        Collection<Object> term22491_OuterSet = ((HashMap) term22530).values();
        term22491 = ((Collection) term22491_OuterSet).iterator();
        term22529 = newInstance(Class.forName("java.lang.Object"));
        term22687 = newInstance(Class.forName("java.lang.Object"));
        HashMap term22689 = new HashMap();
        term22688 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        setField(term22688, term22688.getClass(), "this$0", term22689);
        setField(term22688, term22688.getClass(), "next", null);
        setField(term22688, term22688.getClass(), "current", null);
        setIntField(term22688, term22688.getClass(), "expectedModCount", 0);
        setIntField(term22688, term22688.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term22491;
        args[1] = term22529;
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term22491, term22687));
        assertTrue(recursiveEquals(term22529, term22688));
    }

};


