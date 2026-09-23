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

public class TreeList_indexOf_7804086535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2073;
     Object term2359;

    public TreeList_indexOf_7804086535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2073 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term2183 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term2073, term2073.getClass(), "root", term2183);
        term2359 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term2360 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term2360, term2360.getClass(), "left", null);
        setBooleanField(term2360, term2360.getClass(), "leftIsPrevious", false);
        setField(term2360, term2360.getClass(), "right", null);
        setBooleanField(term2360, term2360.getClass(), "rightIsNext", false);
        setIntField(term2360, term2360.getClass(), "height", 0);
        setIntField(term2360, term2360.getClass(), "relativePosition", 0);
        setField(term2360, term2360.getClass(), "value", null);
        setField(term2359, term2359.getClass(), "root", term2360);
        setIntField(term2359, term2359.getClass(), "size", 0);
        setIntField(term2359, term2359.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term2073, args);
        assertTrue(recursiveEquals(term2073, term2359));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


