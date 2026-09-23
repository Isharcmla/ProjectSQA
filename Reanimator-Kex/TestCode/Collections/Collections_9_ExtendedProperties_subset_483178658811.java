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
import java.util.Iterator;

public class ExtendedProperties_subset_483178658811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8582016;
     Object term8582224;

    public ExtendedProperties_subset_483178658811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8582167 = new ArrayList();
        Iterator term8582128 =  ((ArrayList) term8582167).iterator();
        Object term8582166 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term8582068 = new ArrayList();
        ((ArrayList) term8582068).add((Object)null);
        ((ArrayList) term8582068).add(term8582128);
        ((ArrayList) term8582068).add(term8582166);
        term8582016 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term8582016, term8582016.getClass(), "keysAsListed", term8582068);
        ArrayList term8582228 = new ArrayList();
        Object term8582227 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term8582227, term8582227.getClass(), "cursor", 0);
        setIntField(term8582227, term8582227.getClass(), "lastRet", -1);
        setIntField(term8582227, term8582227.getClass(), "expectedModCount", 0);
        setField(term8582227, term8582227.getClass(), "this$0", term8582228);
        Object term8582229 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term8582225 = new ArrayList();
        ((ArrayList) term8582225).add((Object)null);
        ((ArrayList) term8582225).add(term8582227);
        ((ArrayList) term8582225).add(term8582229);
        term8582224 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term8582224, term8582224.getClass(), "defaults", null);
        setField(term8582224, term8582224.getClass(), "file", null);
        setField(term8582224, term8582224.getClass(), "basePath", null);
        setField(term8582224, term8582224.getClass(), "fileSeparator", null);
        setBooleanField(term8582224, term8582224.getClass(), "isInitialized", false);
        setField(term8582224, term8582224.getClass(), "includePropertyName", null);
        setField(term8582224, term8582224.getClass(), "keysAsListed", term8582225);
        setField(term8582224, term8582224.getClass(), "table", null);
        setIntField(term8582224, term8582224.getClass(), "count", 0);
        setIntField(term8582224, term8582224.getClass(), "threshold", 0);
        setFloatField(term8582224, term8582224.getClass(), "loadFactor", 0.0F);
        setIntField(term8582224, term8582224.getClass(), "modCount", 0);
        setField(term8582224, term8582224.getClass(), "keySet", null);
        setField(term8582224, term8582224.getClass(), "entrySet", null);
        setField(term8582224, term8582224.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term8582016, args);
        assertTrue(recursiveEquals(term8582016, term8582224));
        assertTrue(recursiveEquals(retValue, null));
    }

};


