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
import java.util.LinkedList;
import java.lang.Object;

public class IteratorUtils_toArray_1321955988515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96079;
     Object term96191;
     Object term96190;

    public IteratorUtils_toArray_1321955988515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term96133 = new LinkedList();
        term96079 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setBooleanField(term96079, term96079.getClass(), "isLocked", false);
        setField(term96079, term96079.getClass(), "currentIterator", null);
        setField(term96079, term96079.getClass(), "iteratorChain", term96133);
        LinkedList term96192 = new LinkedList();
        term96191 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term96193 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyIterator"));
        setField(term96191, term96191.getClass(), "iteratorChain", term96192);
        setField(term96191, term96191.getClass(), "currentIterator", term96193);
        setField(term96191, term96191.getClass(), "lastUsedIterator", term96193);
        setBooleanField(term96191, term96191.getClass(), "isLocked", true);
        term96190 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term96079;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term96079, term96191));
        assertTrue(recursiveEquals(retValue, term96190));
    }

};


