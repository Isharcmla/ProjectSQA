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

public class SetUniqueList_iterator_390351164127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32268;

    public SetUniqueList_iterator_390351164127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32268 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term32372 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term32476 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term32580 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term32476, term32476.getClass(), "collection", term32580);
        setField(term32372, term32372.getClass(), "collection", term32476);
        setField(term32268, term32268.getClass(), "collection", term32372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term32268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


