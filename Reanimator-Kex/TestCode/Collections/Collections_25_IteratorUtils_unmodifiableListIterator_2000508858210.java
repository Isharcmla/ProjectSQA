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
import java.util.AbstractList;
import java.lang.Object;

public class IteratorUtils_unmodifiableListIterator_2000508858210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25315;
     Object term25438;
     Object term25437;

    public IteratorUtils_unmodifiableListIterator_2000508858210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term25316 = new LinkedList();
        term25315 = ((AbstractList) term25316).listIterator();
        LinkedList term25439 = new LinkedList();
        term25438 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setField(term25438, term25438.getClass(), "lastReturned", null);
        setField(term25438, term25438.getClass(), "next", null);
        setIntField(term25438, term25438.getClass(), "nextIndex", 0);
        setIntField(term25438, term25438.getClass(), "expectedModCount", 0);
        setField(term25438, term25438.getClass(), "this$0", term25439);
        LinkedList term25427 = new LinkedList();
        term25437 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableListIterator"));
        Object term25424 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        setField(term25424, term25424.getClass(), "lastReturned", null);
        setField(term25424, term25424.getClass(), "next", null);
        setIntField(term25424, term25424.getClass(), "nextIndex", 0);
        setIntField(term25424, term25424.getClass(), "expectedModCount", 0);
        setField(term25424, term25424.getClass(), "this$0", term25427);
        setField(term25437, term25437.getClass(), "iterator", term25424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ListIterator");
        Object[] args = new Object[1];
        args[0] = term25315;
        Object retValue = callMethod(klass, "unmodifiableListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25315, term25438));
        assertTrue(recursiveEquals(retValue, term25437));
    }

};


