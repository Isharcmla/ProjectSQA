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

public class ExtendedProperties_subset_483178658627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163163;
     Object term163582;

    public ExtendedProperties_subset_483178658627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term163215 = new ArrayList();
        ((ArrayList) term163215).add((Object)null);
        ((ArrayList) term163215).add((Object)null);
        term163163 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term163163, term163163.getClass(), "keysAsListed", term163215);
        ArrayList term163583 = new ArrayList();
        ((ArrayList) term163583).add((Object)null);
        ((ArrayList) term163583).add((Object)null);
        term163582 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term163582, term163582.getClass(), "defaults", null);
        setField(term163582, term163582.getClass(), "file", null);
        setField(term163582, term163582.getClass(), "basePath", null);
        setField(term163582, term163582.getClass(), "fileSeparator", null);
        setBooleanField(term163582, term163582.getClass(), "isInitialized", false);
        setField(term163582, term163582.getClass(), "includePropertyName", null);
        setField(term163582, term163582.getClass(), "keysAsListed", term163583);
        setField(term163582, term163582.getClass(), "table", null);
        setIntField(term163582, term163582.getClass(), "count", 0);
        setIntField(term163582, term163582.getClass(), "threshold", 0);
        setFloatField(term163582, term163582.getClass(), "loadFactor", 0.0F);
        setIntField(term163582, term163582.getClass(), "modCount", 0);
        setField(term163582, term163582.getClass(), "keySet", null);
        setField(term163582, term163582.getClass(), "entrySet", null);
        setField(term163582, term163582.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term163163, args);
        assertTrue(recursiveEquals(term163163, term163582));
        assertTrue(recursiveEquals(retValue, null));
    }

};


