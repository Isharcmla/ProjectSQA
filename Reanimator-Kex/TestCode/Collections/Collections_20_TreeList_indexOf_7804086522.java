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

public class TreeList_indexOf_7804086522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term767;

    public TreeList_indexOf_7804086522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term20, term20.getClass(), "root", null);
        setIntField(term20, term20.getClass(), "size", 0);
        setIntField(term20, term20.getClass(), "modCount", 0);
        term767 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term767, term767.getClass(), "root", null);
        setIntField(term767, term767.getClass(), "size", 0);
        setIntField(term767, term767.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term767));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


