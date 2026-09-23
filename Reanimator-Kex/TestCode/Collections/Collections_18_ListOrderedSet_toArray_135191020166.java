package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ListOrderedSet_toArray_135191020166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8089;
     Object term8424;
     Object term8418;

    public ListOrderedSet_toArray_135191020166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8141 = new ArrayList();
        term8089 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term8089, term8089.getClass(), "setOrder", term8141);
        ArrayList term8425 = new ArrayList();
        term8424 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term8424, term8424.getClass(), "setOrder", term8425);
        setField(term8424, term8424.getClass(), "collection", null);
        term8418 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toArray", argTypes, term8089, args);
        assertTrue(recursiveEquals(term8089, term8424));
        assertTrue(recursiveEquals(retValue, term8418));
    }

};


