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

public class ExtendedProperties_getInt_680282318105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5097;

    public ExtendedProperties_getInt_680282318105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5103 = new ArrayList();
        ArrayList term5140 = new ArrayList();
        HashMap term5162 = new HashMap();
        Set<Object> term18287 =  ((Map) term5162).keySet();
        HashSet term5161 = new HashSet((Collection<? extends Object>) term18287);
        HashMap term5168 = new HashMap();
        Set<Object> term18288 =  ((Map) term5168).keySet();
        HashSet term5167 = new HashSet((Collection<? extends Object>) term18288);
        ArrayList term5173 = new ArrayList();
        term5097 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5098 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5107 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5144 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term5145 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5147 = newInstance(Class.forName("java.lang.Object"));
        Object term5148 = newInstance(Class.forName("java.lang.Object"));
        Object term5149 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5151 = newInstance(Class.forName("java.lang.Object"));
        Object term5152 = newInstance(Class.forName("java.lang.Object"));
        Object term5153 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5155 = newInstance(Class.forName("java.lang.Object"));
        Object term5156 = newInstance(Class.forName("java.lang.Object"));
        setField(term5098, term5098.getClass(), "defaults", null);
        setField(term5098, term5098.getClass(), "file", null);
        setField(term5098, term5098.getClass(), "basePath", null);
        setField(term5098, term5098.getClass(), "fileSeparator", "/");
        setBooleanField(term5098, term5098.getClass(), "isInitialized", false);
        setField(term5098, term5098.getClass(), "keysAsListed", term5103);
        setField(term5098, term5098.getClass(), "table", term5107);
        setIntField(term5098, term5098.getClass(), "count", 0);
        setIntField(term5098, term5098.getClass(), "threshold", 8);
        setFloatField(term5098, term5098.getClass(), "loadFactor", 0.75F);
        setIntField(term5098, term5098.getClass(), "modCount", 0);
        setField(term5098, term5098.getClass(), "keySet", null);
        setField(term5098, term5098.getClass(), "entrySet", null);
        setField(term5098, term5098.getClass(), "values", null);
        setField(term5097, term5097.getClass(), "defaults", term5098);
        setField(term5097, term5097.getClass(), "file", "pORebkoRdD");
        setField(term5097, term5097.getClass(), "basePath", "mXGCWJDOqA");
        setField(term5097, term5097.getClass(), "fileSeparator", "/");
        setBooleanField(term5097, term5097.getClass(), "isInitialized", false);
        setField(term5097, term5097.getClass(), "keysAsListed", term5140);
        setIntField(term5145, term5145.getClass(), "hash", 2093759453);
        setField(term5145, term5145.getClass(), "key", term5147);
        setField(term5145, term5145.getClass(), "value", term5148);
        setField(term5145, term5145.getClass(), "next", null);
        setElement(term5144, 18, term5145);
        setIntField(term5149, term5149.getClass(), "hash", 1041481239);
        setField(term5149, term5149.getClass(), "key", term5151);
        setField(term5149, term5149.getClass(), "value", term5152);
        setField(term5149, term5149.getClass(), "next", null);
        setElement(term5144, 39, term5149);
        setIntField(term5153, term5153.getClass(), "hash", 130441225);
        setField(term5153, term5153.getClass(), "key", term5155);
        setField(term5153, term5153.getClass(), "value", term5156);
        setField(term5153, term5153.getClass(), "next", null);
        setElement(term5144, 50, term5153);
        setField(term5097, term5097.getClass(), "table", term5144);
        setIntField(term5097, term5097.getClass(), "count", 906181095);
        setIntField(term5097, term5097.getClass(), "threshold", 71);
        setFloatField(term5097, term5097.getClass(), "loadFactor", 0.75F);
        setIntField(term5097, term5097.getClass(), "modCount", 1045657209);
        setField(term5097, term5097.getClass(), "keySet", term5161);
        setField(term5097, term5097.getClass(), "entrySet", term5167);
        setField(term5097, term5097.getClass(), "values", term5173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        try {
            callMethod(klass, "getInt", argTypes, term5097, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


