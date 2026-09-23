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

public class IteratorUtils_contains_777550135430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69085;
     Object term69123;
     Object term69142;
     Object term69143;

    public IteratorUtils_contains_777550135430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69085 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        term69123 = newInstance(Class.forName("java.lang.Object"));
        term69142 = newInstance(Class.forName("java.lang.Object"));
        term69143 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term69143, term69143.getClass(), "map", null);
        setField(term69143, term69143.getClass(), "lastReturned", null);
        setField(term69143, term69143.getClass(), "tab", null);
        setField(term69143, term69143.getClass(), "next", null);
        setField(term69143, term69143.getClass(), "stack", null);
        setField(term69143, term69143.getClass(), "spare", null);
        setIntField(term69143, term69143.getClass(), "index", 0);
        setIntField(term69143, term69143.getClass(), "baseIndex", 0);
        setIntField(term69143, term69143.getClass(), "baseLimit", 0);
        setIntField(term69143, term69143.getClass(), "baseSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term69085;
        args[1] = term69123;
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term69085, term69142));
        assertTrue(recursiveEquals(term69123, term69143));
    }

};


