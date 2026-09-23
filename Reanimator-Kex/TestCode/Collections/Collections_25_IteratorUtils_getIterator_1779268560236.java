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
import java.lang.Object;

public class IteratorUtils_getIterator_1779268560236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28250;
     Object term28648;
     Object term28641;

    public IteratorUtils_getIterator_1779268560236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28250 = newInstance(Class.forName("java.util.ImmutableCollections$SubList"));
        term28648 = newInstance(Class.forName("java.util.ImmutableCollections$SubList"));
        setField(term28648, term28648.getClass(), "root", null);
        setIntField(term28648, term28648.getClass(), "offset", 0);
        setIntField(term28648, term28648.getClass(), "size", 0);
        term28641 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        Object term28642 = newInstance(Class.forName("java.util.ImmutableCollections$SubList"));
        setField(term28642, term28642.getClass(), "root", null);
        setIntField(term28642, term28642.getClass(), "offset", 0);
        setIntField(term28642, term28642.getClass(), "size", 0);
        setField(term28641, term28641.getClass(), "list", term28642);
        setIntField(term28641, term28641.getClass(), "size", 0);
        setBooleanField(term28641, term28641.getClass(), "isListIterator", false);
        setIntField(term28641, term28641.getClass(), "cursor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28250;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term28250, term28648));
        assertTrue(recursiveEquals(retValue, term28641));
    }

};


