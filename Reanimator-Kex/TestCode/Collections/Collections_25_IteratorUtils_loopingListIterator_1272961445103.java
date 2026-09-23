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

public class IteratorUtils_loopingListIterator_1272961445103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term7318;
     Object term7304;

    public IteratorUtils_loopingListIterator_1272961445103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term87 = newInstance(Class.forName("java.lang.Object"));
        term80 = new LinkedList();
        ((LinkedList) term80).add(term83);
        ((LinkedList) term80).add(term85);
        ((LinkedList) term80).add(term87);
        ((LinkedList) term80).add((Object)null);
        ((LinkedList) term80).add((Object)null);
        Object term7320 = newInstance(Class.forName("java.lang.Object"));
        Object term7322 = newInstance(Class.forName("java.lang.Object"));
        term7318 = new LinkedList();
        ((LinkedList) term7318).add(term7320);
        ((LinkedList) term7318).add(term7322);
        ((LinkedList) term7318).add((Object)null);
        ((LinkedList) term7318).add((Object)null);
        ((LinkedList) term7318).add((Object)null);
        Object term7308 = newInstance(Class.forName("java.lang.Object"));
        Object term7310 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term7305 = new LinkedList();
        ((LinkedList) term7305).add(term7308);
        ((LinkedList) term7305).add(term7310);
        ((LinkedList) term7305).add((Object)null);
        ((LinkedList) term7305).add((Object)null);
        ((LinkedList) term7305).add((Object)null);
        term7304 = newInstance(Class.forName("org.apache.commons.collections4.iterators.LoopingListIterator"));
        Object term7315 = newInstance(Class.forName("java.util.LinkedList$ListItr"));
        Object term7307 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term7309 = newInstance(Class.forName("java.util.LinkedList$Node"));
        Object term7311 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setField(term7304, term7304.getClass(), "list", term7305);
        setField(term7315, term7315.getClass(), "lastReturned", null);
        setField(term7307, term7307.getClass(), "item", term7308);
        setField(term7309, term7309.getClass(), "item", term7310);
        setField(term7311, term7311.getClass(), "item", null);
        setField(term7311, term7311.getClass(), "next", null);
        setField(term7311, term7311.getClass(), "prev", term7309);
        setField(term7309, term7309.getClass(), "next", term7311);
        setField(term7309, term7309.getClass(), "prev", term7307);
        setField(term7307, term7307.getClass(), "next", term7309);
        setField(term7307, term7307.getClass(), "prev", null);
        setField(term7315, term7315.getClass(), "next", term7307);
        setIntField(term7315, term7315.getClass(), "nextIndex", 0);
        setIntField(term7315, term7315.getClass(), "expectedModCount", 5);
        setField(term7315, term7315.getClass(), "this$0", term7305);
        setField(term7304, term7304.getClass(), "iterator", term7315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term80;
        Object retValue = callMethod(klass, "loopingListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term80, term7318));
        assertTrue(recursiveEquals(retValue, term7304));
    }

};


