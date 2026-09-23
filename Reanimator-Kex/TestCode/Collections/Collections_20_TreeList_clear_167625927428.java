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

public class TreeList_clear_167625927428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term1371;

    public TreeList_clear_167625927428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term44, term44.getClass(), "root", null);
        setIntField(term44, term44.getClass(), "size", 0);
        setIntField(term44, term44.getClass(), "modCount", 0);
        term1371 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term1371, term1371.getClass(), "root", null);
        setIntField(term1371, term1371.getClass(), "size", 0);
        setIntField(term1371, term1371.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term1371));
    }

};


