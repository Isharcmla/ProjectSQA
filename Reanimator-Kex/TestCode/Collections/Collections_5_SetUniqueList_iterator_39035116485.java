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

public class SetUniqueList_iterator_39035116485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19081;

    public SetUniqueList_iterator_39035116485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19081 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term19185 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term19289 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term19185, term19185.getClass(), "collection", term19289);
        setField(term19081, term19081.getClass(), "collection", term19185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term19081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


