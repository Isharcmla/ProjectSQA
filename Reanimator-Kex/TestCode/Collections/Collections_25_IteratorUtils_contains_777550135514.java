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

public class IteratorUtils_contains_777550135514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95505;
     Object term95639;
     Object term96160;
     Object term96161;

    public IteratorUtils_contains_777550135514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95505 = newInstance(Class.forName("org.apache.commons.collections4.list.TreeList$TreeListIterator"));
        Object term95601 = newInstance(Class.forName("org.apache.commons.collections4.list.TreeList"));
        setIntField(term95505, term95505.getClass(), "nextIndex", 0);
        setField(term95505, term95505.getClass(), "parent", term95601);
        term95639 = newInstance(Class.forName("java.lang.Object"));
        term96160 = newInstance(Class.forName("java.lang.Object"));
        term96161 = newInstance(Class.forName("org.apache.commons.collections4.list.TreeList$TreeListIterator"));
        Object term96162 = newInstance(Class.forName("org.apache.commons.collections4.list.TreeList"));
        setField(term96162, term96162.getClass(), "root", null);
        setIntField(term96162, term96162.getClass(), "size", 0);
        setIntField(term96162, term96162.getClass(), "modCount", 0);
        setField(term96161, term96161.getClass(), "parent", term96162);
        setField(term96161, term96161.getClass(), "next", null);
        setIntField(term96161, term96161.getClass(), "nextIndex", 0);
        setField(term96161, term96161.getClass(), "current", null);
        setIntField(term96161, term96161.getClass(), "currentIndex", 0);
        setIntField(term96161, term96161.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term95505;
        args[1] = term95639;
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term95505, term96160));
        assertTrue(recursiveEquals(term95639, term96161));
    }

};


