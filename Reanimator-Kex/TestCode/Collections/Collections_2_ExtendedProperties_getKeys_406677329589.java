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

public class ExtendedProperties_getKeys_406677329589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3084987;
     Object term3085701;
     Object term3085693;

    public ExtendedProperties_getKeys_406677329589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3085077 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3085039 = new ArrayList();
        ((ArrayList) term3085039).add(term3085077);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        ((ArrayList) term3085039).add((Object)null);
        term3084987 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term3084987, term3084987.getClass(), "keysAsListed", term3085039);
        Object term3085704 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3085702 = new ArrayList();
        ((ArrayList) term3085702).add(term3085704);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        ((ArrayList) term3085702).add((Object)null);
        term3085701 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term3085701, term3085701.getClass(), "defaults", null);
        setField(term3085701, term3085701.getClass(), "file", null);
        setField(term3085701, term3085701.getClass(), "basePath", null);
        setField(term3085701, term3085701.getClass(), "fileSeparator", null);
        setBooleanField(term3085701, term3085701.getClass(), "isInitialized", false);
        setField(term3085701, term3085701.getClass(), "keysAsListed", term3085702);
        setField(term3085701, term3085701.getClass(), "table", null);
        setIntField(term3085701, term3085701.getClass(), "count", 0);
        setIntField(term3085701, term3085701.getClass(), "threshold", 0);
        setFloatField(term3085701, term3085701.getClass(), "loadFactor", 0.0F);
        setIntField(term3085701, term3085701.getClass(), "modCount", 0);
        setField(term3085701, term3085701.getClass(), "keySet", null);
        setField(term3085701, term3085701.getClass(), "entrySet", null);
        setField(term3085701, term3085701.getClass(), "values", null);
        ArrayList term3085697 = new ArrayList();
        term3085693 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term3085693, term3085693.getClass(), "cursor", 0);
        setIntField(term3085693, term3085693.getClass(), "lastRet", -1);
        setIntField(term3085693, term3085693.getClass(), "expectedModCount", 0);
        setField(term3085693, term3085693.getClass(), "this$0", term3085697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getKeys", argTypes, term3084987, args);
        assertTrue(recursiveEquals(term3084987, term3085701));
        assertTrue(recursiveEquals(retValue, term3085693));
    }

};


