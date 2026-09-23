package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_init_95711510667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9127;

    public ExtendedProperties_init_95711510667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9130 = new ArrayList();
        term9127 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term9132 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term9127, term9127.getClass(), "defaults", null);
        setField(term9127, term9127.getClass(), "file", null);
        setField(term9127, term9127.getClass(), "basePath", null);
        setField(term9127, term9127.getClass(), "fileSeparator", "/");
        setBooleanField(term9127, term9127.getClass(), "isInitialized", false);
        setField(term9127, term9127.getClass(), "includePropertyName", null);
        setField(term9127, term9127.getClass(), "keysAsListed", term9130);
        setField(term9127, term9127.getClass(), "table", term9132);
        setIntField(term9127, term9127.getClass(), "count", 0);
        setIntField(term9127, term9127.getClass(), "threshold", 8);
        setFloatField(term9127, term9127.getClass(), "loadFactor", 0.75F);
        setIntField(term9127, term9127.getClass(), "modCount", 0);
        setField(term9127, term9127.getClass(), "keySet", null);
        setField(term9127, term9127.getClass(), "entrySet", null);
        setField(term9127, term9127.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9127));
    }

};


