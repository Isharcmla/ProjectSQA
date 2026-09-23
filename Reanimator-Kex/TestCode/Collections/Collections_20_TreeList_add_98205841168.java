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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeList_add_98205841168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5819;

    public TreeList_add_98205841168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5819 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term5929 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term5819, term5819.getClass(), "modCount", 0);
        setIntField(term5819, term5819.getClass(), "size", 0);
        setIntField(term5929, term5929.getClass(), "relativePosition", 0);
        setBooleanField(term5929, term5929.getClass(), "leftIsPrevious", false);
        setField(term5929, term5929.getClass(), "left", term5929);
        setField(term5819, term5819.getClass(), "root", term5929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term5819, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


