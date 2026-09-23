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

public class ExtendedProperties_subset_483178658420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410476;
     Object term410567;

    public ExtendedProperties_subset_483178658420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term410528 = new ArrayList();
        ((ArrayList) term410528).add((Object)null);
        ((ArrayList) term410528).add((Object)null);
        term410476 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term410476, term410476.getClass(), "keysAsListed", term410528);
        ArrayList term410568 = new ArrayList();
        ((ArrayList) term410568).add((Object)null);
        ((ArrayList) term410568).add((Object)null);
        term410567 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term410567, term410567.getClass(), "defaults", null);
        setField(term410567, term410567.getClass(), "file", null);
        setField(term410567, term410567.getClass(), "basePath", null);
        setField(term410567, term410567.getClass(), "fileSeparator", null);
        setBooleanField(term410567, term410567.getClass(), "isInitialized", false);
        setField(term410567, term410567.getClass(), "includePropertyName", null);
        setField(term410567, term410567.getClass(), "keysAsListed", term410568);
        setField(term410567, term410567.getClass(), "table", null);
        setIntField(term410567, term410567.getClass(), "count", 0);
        setIntField(term410567, term410567.getClass(), "threshold", 0);
        setFloatField(term410567, term410567.getClass(), "loadFactor", 0.0F);
        setIntField(term410567, term410567.getClass(), "modCount", 0);
        setField(term410567, term410567.getClass(), "keySet", null);
        setField(term410567, term410567.getClass(), "entrySet", null);
        setField(term410567, term410567.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term410476, args);
        assertTrue(recursiveEquals(term410476, term410567));
        assertTrue(recursiveEquals(retValue, null));
    }

};


