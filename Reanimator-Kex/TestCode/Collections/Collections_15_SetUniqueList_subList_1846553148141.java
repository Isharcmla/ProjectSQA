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
import java.lang.NullPointerException;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_subList_1846553148141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38863;

    public SetUniqueList_subList_1846553148141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38863 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term38967 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39071 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39175 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39279 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39383 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39487 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39591 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39695 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39799 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term39903 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term40007 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term40007, term40007.getClass(), "collection", null);
        setField(term39903, term39903.getClass(), "collection", term40007);
        setField(term39799, term39799.getClass(), "collection", term39903);
        setField(term39695, term39695.getClass(), "collection", term39799);
        setField(term39591, term39591.getClass(), "collection", term39695);
        setField(term39487, term39487.getClass(), "collection", term39591);
        setField(term39383, term39383.getClass(), "collection", term39487);
        setField(term39279, term39279.getClass(), "collection", term39383);
        setField(term39175, term39175.getClass(), "collection", term39279);
        setField(term39071, term39071.getClass(), "collection", term39175);
        setField(term38967, term38967.getClass(), "collection", term39071);
        setField(term38863, term38863.getClass(), "collection", term38967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        try {
            callMethod(klass, "subList", argTypes, term38863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


