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

public class IteratorUtils_getIterator_1779268560153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18274;
     Object term19190;
     Object term19185;

    public IteratorUtils_getIterator_1779268560153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18274 = newInstance(Class.forName("java.util.ImmutableCollections$List12"));
        term19190 = newInstance(Class.forName("java.util.ImmutableCollections$List12"));
        setField(term19190, term19190.getClass(), "e0", null);
        setField(term19190, term19190.getClass(), "e1", null);
        term19185 = newInstance(Class.forName("java.util.ImmutableCollections$ListItr"));
        Object term19186 = newInstance(Class.forName("java.util.ImmutableCollections$List12"));
        setField(term19186, term19186.getClass(), "e0", null);
        setField(term19186, term19186.getClass(), "e1", null);
        setField(term19185, term19185.getClass(), "list", term19186);
        setIntField(term19185, term19185.getClass(), "size", 1);
        setBooleanField(term19185, term19185.getClass(), "isListIterator", false);
        setIntField(term19185, term19185.getClass(), "cursor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18274;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term18274, term19190));
        assertTrue(recursiveEquals(retValue, term19185));
    }

};


