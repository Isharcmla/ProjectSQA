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

public class TreeList_indexOf_7804086575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7045;
     Object term15394;

    public TreeList_indexOf_7804086575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7045 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term7155 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        Object term7265 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term7155, term7155.getClass(), "relativePosition", 0);
        setBooleanField(term7155, term7155.getClass(), "leftIsPrevious", false);
        setField(term7155, term7155.getClass(), "left", null);
        setField(term7155, term7155.getClass(), "value", term7265);
        setField(term7045, term7045.getClass(), "root", term7155);
        term15394 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term15395 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        Object term15396 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15395, term15395.getClass(), "left", null);
        setBooleanField(term15395, term15395.getClass(), "leftIsPrevious", false);
        setField(term15395, term15395.getClass(), "right", null);
        setBooleanField(term15395, term15395.getClass(), "rightIsNext", false);
        setIntField(term15395, term15395.getClass(), "height", 0);
        setIntField(term15395, term15395.getClass(), "relativePosition", 0);
        setField(term15396, term15396.getClass(), "left", null);
        setBooleanField(term15396, term15396.getClass(), "leftIsPrevious", false);
        setField(term15396, term15396.getClass(), "right", null);
        setBooleanField(term15396, term15396.getClass(), "rightIsNext", false);
        setIntField(term15396, term15396.getClass(), "height", 0);
        setIntField(term15396, term15396.getClass(), "relativePosition", 0);
        setField(term15396, term15396.getClass(), "value", null);
        setField(term15395, term15395.getClass(), "value", term15396);
        setField(term15394, term15394.getClass(), "root", term15395);
        setIntField(term15394, term15394.getClass(), "size", 0);
        setIntField(term15394, term15394.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term7045, args);
        assertTrue(recursiveEquals(term7045, term15394));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


