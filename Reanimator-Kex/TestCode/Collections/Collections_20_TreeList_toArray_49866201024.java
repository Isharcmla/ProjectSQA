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

public class TreeList_toArray_49866201024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term783;
     Object term782;

    public TreeList_toArray_49866201024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term26, term26.getClass(), "root", null);
        setIntField(term26, term26.getClass(), "size", 0);
        setIntField(term26, term26.getClass(), "modCount", 0);
        term783 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term783, term783.getClass(), "root", null);
        setIntField(term783, term783.getClass(), "size", 0);
        setIntField(term783, term783.getClass(), "modCount", 0);
        term782 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toArray", argTypes, term26, args);
        assertTrue(recursiveEquals(term26, term783));
        assertTrue(recursiveEquals(retValue, term782));
    }

};


