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

public class ExtendedProperties_getInt_680282318106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5957;

    public ExtendedProperties_getInt_680282318106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5963 = new ArrayList();
        ArrayList term6012 = new ArrayList();
        HashMap term6034 = new HashMap();
        Set<Object> term21373 =  ((Map) term6034).keySet();
        HashSet term6033 = new HashSet((Collection<? extends Object>) term21373);
        HashMap term6040 = new HashMap();
        Set<Object> term21374 =  ((Map) term6040).keySet();
        HashSet term6039 = new HashSet((Collection<? extends Object>) term21374);
        ArrayList term6045 = new ArrayList();
        term5957 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5958 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5967 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6016 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term6017 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6019 = newInstance(Class.forName("java.lang.Object"));
        Object term6020 = newInstance(Class.forName("java.lang.Object"));
        Object term6021 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6023 = newInstance(Class.forName("java.lang.Object"));
        Object term6024 = newInstance(Class.forName("java.lang.Object"));
        Object term6025 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6027 = newInstance(Class.forName("java.lang.Object"));
        Object term6028 = newInstance(Class.forName("java.lang.Object"));
        setField(term5958, term5958.getClass(), "defaults", null);
        setField(term5958, term5958.getClass(), "file", null);
        setField(term5958, term5958.getClass(), "basePath", null);
        setField(term5958, term5958.getClass(), "fileSeparator", "/");
        setBooleanField(term5958, term5958.getClass(), "isInitialized", false);
        setField(term5958, term5958.getClass(), "includePropertyName", null);
        setField(term5958, term5958.getClass(), "keysAsListed", term5963);
        setField(term5958, term5958.getClass(), "table", term5967);
        setIntField(term5958, term5958.getClass(), "count", 0);
        setIntField(term5958, term5958.getClass(), "threshold", 8);
        setFloatField(term5958, term5958.getClass(), "loadFactor", 0.75F);
        setIntField(term5958, term5958.getClass(), "modCount", 0);
        setField(term5958, term5958.getClass(), "keySet", null);
        setField(term5958, term5958.getClass(), "entrySet", null);
        setField(term5958, term5958.getClass(), "values", null);
        setField(term5957, term5957.getClass(), "defaults", term5958);
        setField(term5957, term5957.getClass(), "file", "PtirvZmsGt");
        setField(term5957, term5957.getClass(), "basePath", "HWkpTmtlrc");
        setField(term5957, term5957.getClass(), "fileSeparator", "/");
        setBooleanField(term5957, term5957.getClass(), "isInitialized", false);
        setField(term5957, term5957.getClass(), "includePropertyName", "hMmaoREuCK");
        setField(term5957, term5957.getClass(), "keysAsListed", term6012);
        setIntField(term6017, term6017.getClass(), "hash", 667920976);
        setField(term6017, term6017.getClass(), "key", term6019);
        setField(term6017, term6017.getClass(), "value", term6020);
        setField(term6017, term6017.getClass(), "next", null);
        setElement(term6016, 11, term6017);
        setIntField(term6021, term6021.getClass(), "hash", 174300729);
        setField(term6021, term6021.getClass(), "key", term6023);
        setField(term6021, term6021.getClass(), "value", term6024);
        setField(term6021, term6021.getClass(), "next", null);
        setElement(term6016, 49, term6021);
        setIntField(term6025, term6025.getClass(), "hash", 2126744847);
        setField(term6025, term6025.getClass(), "key", term6027);
        setField(term6025, term6025.getClass(), "value", term6028);
        setField(term6025, term6025.getClass(), "next", null);
        setElement(term6016, 82, term6025);
        setField(term5957, term5957.getClass(), "table", term6016);
        setIntField(term5957, term5957.getClass(), "count", 906181095);
        setIntField(term5957, term5957.getClass(), "threshold", 71);
        setFloatField(term5957, term5957.getClass(), "loadFactor", 0.75F);
        setIntField(term5957, term5957.getClass(), "modCount", 1045657209);
        setField(term5957, term5957.getClass(), "keySet", term6033);
        setField(term5957, term5957.getClass(), "entrySet", term6039);
        setField(term5957, term5957.getClass(), "values", term6045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        try {
            callMethod(klass, "getInt", argTypes, term5957, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


