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

public class SetUniqueList_retainAll_909762360117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28619;

    public SetUniqueList_retainAll_909762360117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28619 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term28723 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term28827 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term28931 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term28827, term28827.getClass(), "collection", term28931);
        setField(term28723, term28723.getClass(), "collection", term28827);
        setField(term28619, term28619.getClass(), "collection", term28723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "retainAll", argTypes, term28619, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


