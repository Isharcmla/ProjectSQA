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
import java.lang.Object;

public class TreeList_listIterator_50816534520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term745;
     Object term741;

    public TreeList_listIterator_50816534520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term12, term12.getClass(), "root", null);
        setIntField(term12, term12.getClass(), "size", 0);
        setIntField(term12, term12.getClass(), "modCount", 0);
        term745 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term745, term745.getClass(), "root", null);
        setIntField(term745, term745.getClass(), "size", 0);
        setIntField(term745, term745.getClass(), "modCount", 0);
        term741 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        Object term725 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term725, term725.getClass(), "root", null);
        setIntField(term725, term725.getClass(), "size", 0);
        setIntField(term725, term725.getClass(), "modCount", 0);
        setField(term741, term741.getClass(), "parent", term725);
        setField(term741, term741.getClass(), "next", null);
        setIntField(term741, term741.getClass(), "nextIndex", 0);
        setField(term741, term741.getClass(), "current", null);
        setIntField(term741, term741.getClass(), "currentIndex", -1);
        setIntField(term741, term741.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "listIterator", argTypes, term12, args);
        assertTrue(recursiveEquals(term12, term745));
        assertTrue(recursiveEquals(retValue, term741));
    }

};


