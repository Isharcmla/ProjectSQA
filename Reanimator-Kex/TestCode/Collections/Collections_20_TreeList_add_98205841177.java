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

public class TreeList_add_98205841177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7736;
     Object term7898;
     Object term15782;
     Object term15787;

    public TreeList_add_98205841177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7736 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term7846 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term7736, term7736.getClass(), "modCount", 0);
        setIntField(term7736, term7736.getClass(), "size", 536870915);
        setIntField(term7846, term7846.getClass(), "relativePosition", -2147483648);
        setBooleanField(term7846, term7846.getClass(), "leftIsPrevious", false);
        setField(term7846, term7846.getClass(), "left", null);
        setBooleanField(term7846, term7846.getClass(), "rightIsNext", false);
        setField(term7846, term7846.getClass(), "right", null);
        setIntField(term7846, term7846.getClass(), "height", 0);
        setField(term7736, term7736.getClass(), "root", term7846);
        term7898 = new ArrayList();
        ArrayList term15785 = new ArrayList();
        term15782 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term15783 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        Object term15784 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term15784, term15784.getClass(), "left", null);
        setBooleanField(term15784, term15784.getClass(), "leftIsPrevious", true);
        setField(term15784, term15784.getClass(), "right", term15783);
        setBooleanField(term15784, term15784.getClass(), "rightIsNext", true);
        setIntField(term15784, term15784.getClass(), "height", 0);
        setIntField(term15784, term15784.getClass(), "relativePosition", -1);
        setField(term15784, term15784.getClass(), "value", term15785);
        setField(term15783, term15783.getClass(), "left", term15784);
        setBooleanField(term15783, term15783.getClass(), "leftIsPrevious", false);
        setField(term15783, term15783.getClass(), "right", null);
        setBooleanField(term15783, term15783.getClass(), "rightIsNext", false);
        setIntField(term15783, term15783.getClass(), "height", 1);
        setIntField(term15783, term15783.getClass(), "relativePosition", -2147483648);
        setField(term15783, term15783.getClass(), "value", null);
        setField(term15782, term15782.getClass(), "root", term15783);
        setIntField(term15782, term15782.getClass(), "size", 536870916);
        setIntField(term15782, term15782.getClass(), "modCount", 1);
        term15787 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 536870915;
        args[1] = term7898;
        callMethod(klass, "add", argTypes, term7736, args);
        assertTrue(recursiveEquals(term7736, term15782));
        assertTrue(recursiveEquals(term7898, term15787));
    }

};


