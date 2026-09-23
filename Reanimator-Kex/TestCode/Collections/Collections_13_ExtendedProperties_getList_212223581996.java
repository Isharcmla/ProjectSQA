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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getList_212223581996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13303;
     Object term51081;
     Object term51077;

    public ExtendedProperties_getList_212223581996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13309 = new ArrayList();
        ArrayList term13358 = new ArrayList();
        ((ArrayList) term13358).add("java.lang.Object@486360db");
        HashMap term13425 = new HashMap();
        Set<Object> term51195 =  ((Map) term13425).keySet();
        HashSet term13424 = new HashSet((Collection<? extends Object>) term51195);
        HashMap term13431 = new HashMap();
        Set<Object> term51196 =  ((Map) term13431).keySet();
        HashSet term13430 = new HashSet((Collection<? extends Object>) term51196);
        ArrayList term13436 = new ArrayList();
        term13303 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13304 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13313 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13389 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13390 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13419 = newInstance(Class.forName("java.lang.Object"));
        setField(term13304, term13304.getClass(), "defaults", null);
        setField(term13304, term13304.getClass(), "file", null);
        setField(term13304, term13304.getClass(), "basePath", null);
        setField(term13304, term13304.getClass(), "fileSeparator", "/");
        setBooleanField(term13304, term13304.getClass(), "isInitialized", false);
        setField(term13304, term13304.getClass(), "includePropertyName", null);
        setField(term13304, term13304.getClass(), "keysAsListed", term13309);
        setField(term13304, term13304.getClass(), "table", term13313);
        setIntField(term13304, term13304.getClass(), "count", 0);
        setIntField(term13304, term13304.getClass(), "threshold", 8);
        setFloatField(term13304, term13304.getClass(), "loadFactor", 0.75F);
        setIntField(term13304, term13304.getClass(), "modCount", 0);
        setField(term13304, term13304.getClass(), "keySet", null);
        setField(term13304, term13304.getClass(), "entrySet", null);
        setField(term13304, term13304.getClass(), "values", null);
        setField(term13303, term13303.getClass(), "defaults", term13304);
        setField(term13303, term13303.getClass(), "file", "fztQhjqwdP");
        setField(term13303, term13303.getClass(), "basePath", "eVpkWxjuki");
        setField(term13303, term13303.getClass(), "fileSeparator", "/");
        setBooleanField(term13303, term13303.getClass(), "isInitialized", true);
        setField(term13303, term13303.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term13303, term13303.getClass(), "keysAsListed", term13358);
        setIntField(term13390, term13390.getClass(), "hash", 530455686);
        setField(term13390, term13390.getClass(), "key", "java.lang.Object@486360db");
        setField(term13390, term13390.getClass(), "value", term13419);
        setField(term13390, term13390.getClass(), "next", null);
        setElement(term13389, 2, term13390);
        setField(term13303, term13303.getClass(), "table", term13389);
        setIntField(term13303, term13303.getClass(), "count", -481533956);
        setIntField(term13303, term13303.getClass(), "threshold", 8);
        setFloatField(term13303, term13303.getClass(), "loadFactor", 0.75F);
        setIntField(term13303, term13303.getClass(), "modCount", 1240914517);
        setField(term13303, term13303.getClass(), "keySet", term13424);
        setField(term13303, term13303.getClass(), "entrySet", term13430);
        setField(term13303, term13303.getClass(), "values", term13436);
        ArrayList term51085 = new ArrayList();
        ArrayList term51096 = new ArrayList();
        ((ArrayList) term51096).add("java.lang.Object@486360db");
        HashMap term51106 = new HashMap();
        Set<Object> term51289 =  ((Map) term51106).keySet();
        HashSet term51105 = new HashSet((Collection<? extends Object>) term51289);
        HashMap term51108 = new HashMap();
        Set<Object> term51290 =  ((Map) term51108).keySet();
        HashSet term51107 = new HashSet((Collection<? extends Object>) term51290);
        ArrayList term51109 = new ArrayList();
        term51081 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51082 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51087 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51100 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51101 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51104 = newInstance(Class.forName("java.lang.Object"));
        setField(term51082, term51082.getClass(), "defaults", null);
        setField(term51082, term51082.getClass(), "file", null);
        setField(term51082, term51082.getClass(), "basePath", null);
        setField(term51082, term51082.getClass(), "fileSeparator", "/");
        setBooleanField(term51082, term51082.getClass(), "isInitialized", false);
        setField(term51082, term51082.getClass(), "includePropertyName", null);
        setField(term51082, term51082.getClass(), "keysAsListed", term51085);
        setField(term51082, term51082.getClass(), "table", term51087);
        setIntField(term51082, term51082.getClass(), "count", 0);
        setIntField(term51082, term51082.getClass(), "threshold", 8);
        setFloatField(term51082, term51082.getClass(), "loadFactor", 0.75F);
        setIntField(term51082, term51082.getClass(), "modCount", 0);
        setField(term51082, term51082.getClass(), "keySet", null);
        setField(term51082, term51082.getClass(), "entrySet", null);
        setField(term51082, term51082.getClass(), "values", null);
        setField(term51081, term51081.getClass(), "defaults", term51082);
        setField(term51081, term51081.getClass(), "file", "fztQhjqwdP");
        setField(term51081, term51081.getClass(), "basePath", "eVpkWxjuki");
        setField(term51081, term51081.getClass(), "fileSeparator", "/");
        setBooleanField(term51081, term51081.getClass(), "isInitialized", true);
        setField(term51081, term51081.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term51081, term51081.getClass(), "keysAsListed", term51096);
        setIntField(term51101, term51101.getClass(), "hash", 530455686);
        setField(term51101, term51101.getClass(), "key", "java.lang.Object@486360db");
        setField(term51101, term51101.getClass(), "value", term51104);
        setField(term51101, term51101.getClass(), "next", null);
        setElement(term51100, 2, term51101);
        setField(term51081, term51081.getClass(), "table", term51100);
        setIntField(term51081, term51081.getClass(), "count", -481533956);
        setIntField(term51081, term51081.getClass(), "threshold", 8);
        setFloatField(term51081, term51081.getClass(), "loadFactor", 0.75F);
        setIntField(term51081, term51081.getClass(), "modCount", 1240914517);
        setField(term51081, term51081.getClass(), "keySet", term51105);
        setField(term51081, term51081.getClass(), "entrySet", term51107);
        setField(term51081, term51081.getClass(), "values", term51109);
        term51077 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        Object retValue = callMethod(klass, "getList", argTypes, term13303, args);
        assertTrue(recursiveEquals(term13303, term51081));
        assertTrue(recursiveEquals(retValue, term51077));
    }

};


