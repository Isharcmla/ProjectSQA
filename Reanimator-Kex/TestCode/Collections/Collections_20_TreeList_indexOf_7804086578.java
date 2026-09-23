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

public class TreeList_indexOf_7804086578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8016;
     Object term8236;
     Object term15823;
     Object term15825;

    public TreeList_indexOf_7804086578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8016 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term8126 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term8126, term8126.getClass(), "relativePosition", 0);
        setBooleanField(term8126, term8126.getClass(), "leftIsPrevious", false);
        setField(term8126, term8126.getClass(), "left", null);
        setField(term8126, term8126.getClass(), "value", null);
        setField(term8016, term8016.getClass(), "root", term8126);
        term8236 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        term15823 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term15824 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15824, term15824.getClass(), "left", null);
        setBooleanField(term15824, term15824.getClass(), "leftIsPrevious", false);
        setField(term15824, term15824.getClass(), "right", null);
        setBooleanField(term15824, term15824.getClass(), "rightIsNext", false);
        setIntField(term15824, term15824.getClass(), "height", 0);
        setIntField(term15824, term15824.getClass(), "relativePosition", 0);
        setField(term15824, term15824.getClass(), "value", null);
        setField(term15823, term15823.getClass(), "root", term15824);
        setIntField(term15823, term15823.getClass(), "size", 0);
        setIntField(term15823, term15823.getClass(), "modCount", 0);
        term15825 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15825, term15825.getClass(), "left", null);
        setBooleanField(term15825, term15825.getClass(), "leftIsPrevious", false);
        setField(term15825, term15825.getClass(), "right", null);
        setBooleanField(term15825, term15825.getClass(), "rightIsNext", false);
        setIntField(term15825, term15825.getClass(), "height", 0);
        setIntField(term15825, term15825.getClass(), "relativePosition", 0);
        setField(term15825, term15825.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8236;
        Object retValue = callMethod(klass, "indexOf", argTypes, term8016, args);
        assertTrue(recursiveEquals(term8016, term15823));
        assertTrue(recursiveEquals(term8236, term15825));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


