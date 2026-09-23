package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class TreeList_listIterator_50816726721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term18;
     Object term761;
     Object term757;

    public TreeList_listIterator_50816726721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term15, term15.getClass(), "root", null);
        setIntField(term15, term15.getClass(), "size", 0);
        setIntField(term15, term15.getClass(), "modCount", 0);
        term18 = new Integer(0);
        term761 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term761, term761.getClass(), "root", null);
        setIntField(term761, term761.getClass(), "size", 0);
        setIntField(term761, term761.getClass(), "modCount", 0);
        term757 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        Object term747 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term747, term747.getClass(), "root", null);
        setIntField(term747, term747.getClass(), "size", 0);
        setIntField(term747, term747.getClass(), "modCount", 0);
        setField(term757, term757.getClass(), "parent", term747);
        setField(term757, term757.getClass(), "next", null);
        setIntField(term757, term757.getClass(), "nextIndex", 0);
        setField(term757, term757.getClass(), "current", null);
        setIntField(term757, term757.getClass(), "currentIndex", -1);
        setIntField(term757, term757.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18;
        Object retValue = callMethod(klass, "listIterator", argTypes, term15, args);
        assertTrue(recursiveEquals(term15, term761));
        assertTrue(recursiveEquals(term18, 0));
        assertTrue(recursiveEquals(retValue, term757));
    }

};


