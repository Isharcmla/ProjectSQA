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

public class SetUniqueList_iterator_390351164113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27192;

    public SetUniqueList_iterator_390351164113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27192 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27296 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27400 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term27296, term27296.getClass(), "collection", term27400);
        setField(term27192, term27192.getClass(), "collection", term27296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term27192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


