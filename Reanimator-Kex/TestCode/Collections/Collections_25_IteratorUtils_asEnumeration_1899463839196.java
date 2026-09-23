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

public class IteratorUtils_asEnumeration_1899463839196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24038;
     Object term24118;
     Object term24114;

    public IteratorUtils_asEnumeration_1899463839196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24038 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        term24118 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        setLongField(term24118, term24118.getClass(), "unseen", 0L);
        setLongField(term24118, term24118.getClass(), "lastReturned", 0L);
        setField(term24118, term24118.getClass(), "this$0", null);
        term24114 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorEnumeration"));
        Object term24115 = newInstance(Class.forName("java.util.RegularEnumSet$EnumSetIterator"));
        setLongField(term24115, term24115.getClass(), "unseen", 0L);
        setLongField(term24115, term24115.getClass(), "lastReturned", 0L);
        setField(term24115, term24115.getClass(), "this$0", null);
        setField(term24114, term24114.getClass(), "iterator", term24115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term24038;
        Object retValue = callMethod(klass, "asEnumeration", argTypes, null, args);
        assertTrue(recursiveEquals(term24038, term24118));
        assertTrue(recursiveEquals(retValue, term24114));
    }

};


