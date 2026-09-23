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
import java.util.NoSuchElementException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getInt_680282318108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19499;

    public ExtendedProperties_getInt_680282318108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19505 = new ArrayList();
        ArrayList term19554 = new ArrayList();
        ((ArrayList) term19554).add("java.lang.Object@159190f8");
        ((ArrayList) term19554).add("java.lang.Object@53aac988");
        ((ArrayList) term19554).add("java.lang.Object@6301e9ef");
        HashMap term19735 = new HashMap();
        Set<Object> term62656 =  ((Map) term19735).keySet();
        HashSet term19734 = new HashSet((Collection<? extends Object>) term62656);
        HashMap term19741 = new HashMap();
        Set<Object> term62657 =  ((Map) term19741).keySet();
        HashSet term19740 = new HashSet((Collection<? extends Object>) term62657);
        ArrayList term19746 = new ArrayList();
        term19499 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term19500 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term19509 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term19639 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term19640 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19669 = newInstance(Class.forName("java.lang.Object"));
        Object term19670 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19699 = newInstance(Class.forName("java.lang.Object"));
        Object term19700 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19729 = newInstance(Class.forName("java.lang.Object"));
        setField(term19500, term19500.getClass(), "defaults", null);
        setField(term19500, term19500.getClass(), "file", null);
        setField(term19500, term19500.getClass(), "basePath", null);
        setField(term19500, term19500.getClass(), "fileSeparator", "/");
        setBooleanField(term19500, term19500.getClass(), "isInitialized", false);
        setField(term19500, term19500.getClass(), "includePropertyName", null);
        setField(term19500, term19500.getClass(), "keysAsListed", term19505);
        setField(term19500, term19500.getClass(), "table", term19509);
        setIntField(term19500, term19500.getClass(), "count", 0);
        setIntField(term19500, term19500.getClass(), "threshold", 8);
        setFloatField(term19500, term19500.getClass(), "loadFactor", 0.75F);
        setIntField(term19500, term19500.getClass(), "modCount", 0);
        setField(term19500, term19500.getClass(), "keySet", null);
        setField(term19500, term19500.getClass(), "entrySet", null);
        setField(term19500, term19500.getClass(), "values", null);
        setField(term19499, term19499.getClass(), "defaults", term19500);
        setField(term19499, term19499.getClass(), "file", "PtirvZmsGt");
        setField(term19499, term19499.getClass(), "basePath", "HWkpTmtlrc");
        setField(term19499, term19499.getClass(), "fileSeparator", "/");
        setBooleanField(term19499, term19499.getClass(), "isInitialized", true);
        setField(term19499, term19499.getClass(), "includePropertyName", "hMmaoREuCK");
        setField(term19499, term19499.getClass(), "keysAsListed", term19554);
        setIntField(term19640, term19640.getClass(), "hash", -889369087);
        setField(term19640, term19640.getClass(), "key", "java.lang.Object@53aac988");
        setField(term19640, term19640.getClass(), "value", term19669);
        setField(term19640, term19640.getClass(), "next", null);
        setElement(term19639, 16, term19640);
        setIntField(term19670, term19670.getClass(), "hash", 1313578034);
        setField(term19670, term19670.getClass(), "key", "java.lang.Object@159190f8");
        setField(term19670, term19670.getClass(), "value", term19699);
        setField(term19670, term19670.getClass(), "next", null);
        setElement(term19639, 19, term19670);
        setIntField(term19700, term19700.getClass(), "hash", -593655136);
        setField(term19700, term19700.getClass(), "key", "java.lang.Object@6301e9ef");
        setField(term19700, term19700.getClass(), "value", term19729);
        setField(term19700, term19700.getClass(), "next", null);
        setElement(term19639, 57, term19700);
        setField(term19499, term19499.getClass(), "table", term19639);
        setIntField(term19499, term19499.getClass(), "count", 906181095);
        setIntField(term19499, term19499.getClass(), "threshold", 71);
        setFloatField(term19499, term19499.getClass(), "loadFactor", 0.75F);
        setIntField(term19499, term19499.getClass(), "modCount", 1045657209);
        setField(term19499, term19499.getClass(), "keySet", term19734);
        setField(term19499, term19499.getClass(), "entrySet", term19740);
        setField(term19499, term19499.getClass(), "values", term19746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        try {
            callMethod(klass, "getInt", argTypes, term19499, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


