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
import java.util.ArrayList;

public class TreeList_add_98205841176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7416;
     Object term7578;
     Object term15586;
     Object term15591;

    public TreeList_add_98205841176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7416 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term7526 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term7416, term7416.getClass(), "modCount", 0);
        setIntField(term7416, term7416.getClass(), "size", 58748940);
        setIntField(term7526, term7526.getClass(), "relativePosition", 67108853);
        setBooleanField(term7526, term7526.getClass(), "leftIsPrevious", false);
        setField(term7526, term7526.getClass(), "left", null);
        setBooleanField(term7526, term7526.getClass(), "rightIsNext", true);
        setField(term7416, term7416.getClass(), "root", term7526);
        term7578 = new ArrayList();
        ArrayList term15589 = new ArrayList();
        term15586 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term15587 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        Object term15588 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15588, term15588.getClass(), "left", null);
        setBooleanField(term15588, term15588.getClass(), "leftIsPrevious", true);
        setField(term15588, term15588.getClass(), "right", term15587);
        setBooleanField(term15588, term15588.getClass(), "rightIsNext", true);
        setIntField(term15588, term15588.getClass(), "height", 0);
        setIntField(term15588, term15588.getClass(), "relativePosition", -1);
        setField(term15588, term15588.getClass(), "value", term15589);
        setField(term15587, term15587.getClass(), "left", term15588);
        setBooleanField(term15587, term15587.getClass(), "leftIsPrevious", false);
        setField(term15587, term15587.getClass(), "right", null);
        setBooleanField(term15587, term15587.getClass(), "rightIsNext", true);
        setIntField(term15587, term15587.getClass(), "height", 1);
        setIntField(term15587, term15587.getClass(), "relativePosition", 67108854);
        setField(term15587, term15587.getClass(), "value", null);
        setField(term15586, term15586.getClass(), "root", term15587);
        setIntField(term15586, term15586.getClass(), "size", 58748941);
        setIntField(term15586, term15586.getClass(), "modCount", 1);
        term15591 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 58748940;
        args[1] = term7578;
        callMethod(klass, "add", argTypes, term7416, args);
        assertTrue(recursiveEquals(term7416, term15586));
        assertTrue(recursiveEquals(term7578, term15591));
    }

};


