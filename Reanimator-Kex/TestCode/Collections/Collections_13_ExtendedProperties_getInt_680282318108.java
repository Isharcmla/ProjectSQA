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
     Object term19275;

    public ExtendedProperties_getInt_680282318108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19281 = new ArrayList();
        ArrayList term19330 = new ArrayList();
        ((ArrayList) term19330).add("java.lang.Object@679387c3");
        ((ArrayList) term19330).add("java.lang.Object@5075e2");
        ((ArrayList) term19330).add("java.lang.Object@28462b47");
        HashMap term19507 = new HashMap();
        Set<Object> term61977 =  ((Map) term19507).keySet();
        HashSet term19506 = new HashSet((Collection<? extends Object>) term61977);
        HashMap term19513 = new HashMap();
        Set<Object> term61978 =  ((Map) term19513).keySet();
        HashSet term19512 = new HashSet((Collection<? extends Object>) term61978);
        ArrayList term19518 = new ArrayList();
        term19275 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term19276 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term19285 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term19413 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term19414 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19441 = newInstance(Class.forName("java.lang.Object"));
        Object term19442 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19471 = newInstance(Class.forName("java.lang.Object"));
        Object term19472 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term19501 = newInstance(Class.forName("java.lang.Object"));
        setField(term19276, term19276.getClass(), "defaults", null);
        setField(term19276, term19276.getClass(), "file", null);
        setField(term19276, term19276.getClass(), "basePath", null);
        setField(term19276, term19276.getClass(), "fileSeparator", "/");
        setBooleanField(term19276, term19276.getClass(), "isInitialized", false);
        setField(term19276, term19276.getClass(), "includePropertyName", null);
        setField(term19276, term19276.getClass(), "keysAsListed", term19281);
        setField(term19276, term19276.getClass(), "table", term19285);
        setIntField(term19276, term19276.getClass(), "count", 0);
        setIntField(term19276, term19276.getClass(), "threshold", 8);
        setFloatField(term19276, term19276.getClass(), "loadFactor", 0.75F);
        setIntField(term19276, term19276.getClass(), "modCount", 0);
        setField(term19276, term19276.getClass(), "keySet", null);
        setField(term19276, term19276.getClass(), "entrySet", null);
        setField(term19276, term19276.getClass(), "values", null);
        setField(term19275, term19275.getClass(), "defaults", term19276);
        setField(term19275, term19275.getClass(), "file", "PtirvZmsGt");
        setField(term19275, term19275.getClass(), "basePath", "HWkpTmtlrc");
        setField(term19275, term19275.getClass(), "fileSeparator", "/");
        setBooleanField(term19275, term19275.getClass(), "isInitialized", true);
        setField(term19275, term19275.getClass(), "includePropertyName", "hMmaoREuCK");
        setField(term19275, term19275.getClass(), "keysAsListed", term19330);
        setIntField(term19414, term19414.getClass(), "hash", -206106573);
        setField(term19414, term19414.getClass(), "key", "java.lang.Object@5075e2");
        setField(term19414, term19414.getClass(), "value", term19441);
        setField(term19414, term19414.getClass(), "next", null);
        setElement(term19413, 15, term19414);
        setIntField(term19442, term19442.getClass(), "hash", 1285241928);
        setField(term19442, term19442.getClass(), "key", "java.lang.Object@28462b47");
        setField(term19442, term19442.getClass(), "value", term19471);
        setField(term19442, term19442.getClass(), "next", null);
        setElement(term19413, 38, term19442);
        setIntField(term19472, term19472.getClass(), "hash", -1080440937);
        setField(term19472, term19472.getClass(), "key", "java.lang.Object@679387c3");
        setField(term19472, term19472.getClass(), "value", term19501);
        setField(term19472, term19472.getClass(), "next", null);
        setElement(term19413, 51, term19472);
        setField(term19275, term19275.getClass(), "table", term19413);
        setIntField(term19275, term19275.getClass(), "count", 906181095);
        setIntField(term19275, term19275.getClass(), "threshold", 71);
        setFloatField(term19275, term19275.getClass(), "loadFactor", 0.75F);
        setIntField(term19275, term19275.getClass(), "modCount", 1045657209);
        setField(term19275, term19275.getClass(), "keySet", term19506);
        setField(term19275, term19275.getClass(), "entrySet", term19512);
        setField(term19275, term19275.getClass(), "values", term19518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        try {
            callMethod(klass, "getInt", argTypes, term19275, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


