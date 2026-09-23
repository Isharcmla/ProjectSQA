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

public class TreeList_size_8605413418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term701;

    public TreeList_size_8605413418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term6, term6.getClass(), "root", null);
        setIntField(term6, term6.getClass(), "size", 0);
        setIntField(term6, term6.getClass(), "modCount", 0);
        term701 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        setField(term701, term701.getClass(), "root", null);
        setIntField(term701, term701.getClass(), "size", 0);
        setIntField(term701, term701.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term6, args);
        assertTrue(recursiveEquals(term6, term701));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


