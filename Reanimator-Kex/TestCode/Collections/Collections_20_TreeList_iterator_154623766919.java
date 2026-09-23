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

public class TreeList_iterator_154623766919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term723;
     Object term719;

    public TreeList_iterator_154623766919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term9, term9.getClass(), "root", null);
        setIntField(term9, term9.getClass(), "size", 0);
        setIntField(term9, term9.getClass(), "modCount", 0);
        term723 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term723, term723.getClass(), "root", null);
        setIntField(term723, term723.getClass(), "size", 0);
        setIntField(term723, term723.getClass(), "modCount", 0);
        term719 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        Object term703 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term703, term703.getClass(), "root", null);
        setIntField(term703, term703.getClass(), "size", 0);
        setIntField(term703, term703.getClass(), "modCount", 0);
        setField(term719, term719.getClass(), "parent", term703);
        setField(term719, term719.getClass(), "next", null);
        setIntField(term719, term719.getClass(), "nextIndex", 0);
        setField(term719, term719.getClass(), "current", null);
        setIntField(term719, term719.getClass(), "currentIndex", -1);
        setIntField(term719, term719.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term9, args);
        assertTrue(recursiveEquals(term9, term723));
        assertTrue(recursiveEquals(retValue, term719));
    }

};


