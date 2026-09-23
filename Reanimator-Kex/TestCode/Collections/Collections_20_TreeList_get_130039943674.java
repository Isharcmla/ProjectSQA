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

public class TreeList_get_130039943674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6818;
     Object term15348;

    public TreeList_get_130039943674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6818 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term6928 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term6818, term6818.getClass(), "size", 1);
        setField(term6818, term6818.getClass(), "root", term6928);
        term15348 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term15349 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15349, term15349.getClass(), "left", null);
        setBooleanField(term15349, term15349.getClass(), "leftIsPrevious", false);
        setField(term15349, term15349.getClass(), "right", null);
        setBooleanField(term15349, term15349.getClass(), "rightIsNext", false);
        setIntField(term15349, term15349.getClass(), "height", 0);
        setIntField(term15349, term15349.getClass(), "relativePosition", 0);
        setField(term15349, term15349.getClass(), "value", null);
        setField(term15348, term15348.getClass(), "root", term15349);
        setIntField(term15348, term15348.getClass(), "size", 1);
        setIntField(term15348, term15348.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "get", argTypes, term6818, args);
        assertTrue(recursiveEquals(term6818, term15348));
        assertTrue(recursiveEquals(retValue, null));
    }

};


