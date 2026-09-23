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

public class ExtendedProperties_getVector_86580217095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13365;
     Object term13457;
     Object term51915;
     Object term51941;
     Object term51829;

    public ExtendedProperties_getVector_86580217095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13371 = new ArrayList();
        ArrayList term13420 = new ArrayList();
        HashMap term13430 = new HashMap();
        Set<Object> term51976 =  ((Map) term13430).keySet();
        HashSet term13429 = new HashSet((Collection<? extends Object>) term51976);
        HashMap term13436 = new HashMap();
        Set<Object> term51977 =  ((Map) term13436).keySet();
        HashSet term13435 = new HashSet((Collection<? extends Object>) term51977);
        ArrayList term13441 = new ArrayList();
        term13365 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13366 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13375 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13424 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term13366, term13366.getClass(), "defaults", null);
        setField(term13366, term13366.getClass(), "file", null);
        setField(term13366, term13366.getClass(), "basePath", null);
        setField(term13366, term13366.getClass(), "fileSeparator", "/");
        setBooleanField(term13366, term13366.getClass(), "isInitialized", false);
        setField(term13366, term13366.getClass(), "includePropertyName", null);
        setField(term13366, term13366.getClass(), "keysAsListed", term13371);
        setField(term13366, term13366.getClass(), "table", term13375);
        setIntField(term13366, term13366.getClass(), "count", 0);
        setIntField(term13366, term13366.getClass(), "threshold", 8);
        setFloatField(term13366, term13366.getClass(), "loadFactor", 0.75F);
        setIntField(term13366, term13366.getClass(), "modCount", 0);
        setField(term13366, term13366.getClass(), "keySet", null);
        setField(term13366, term13366.getClass(), "entrySet", null);
        setField(term13366, term13366.getClass(), "values", null);
        setField(term13365, term13365.getClass(), "defaults", term13366);
        setField(term13365, term13365.getClass(), "file", "qxSDVejjiY");
        setField(term13365, term13365.getClass(), "basePath", "xBsXSDjXYK");
        setField(term13365, term13365.getClass(), "fileSeparator", "/");
        setBooleanField(term13365, term13365.getClass(), "isInitialized", false);
        setField(term13365, term13365.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term13365, term13365.getClass(), "keysAsListed", term13420);
        setField(term13365, term13365.getClass(), "table", term13424);
        setIntField(term13365, term13365.getClass(), "count", -478195677);
        setIntField(term13365, term13365.getClass(), "threshold", 8);
        setFloatField(term13365, term13365.getClass(), "loadFactor", 0.75F);
        setIntField(term13365, term13365.getClass(), "modCount", 972867650);
        setField(term13365, term13365.getClass(), "keySet", term13429);
        setField(term13365, term13365.getClass(), "entrySet", term13435);
        setField(term13365, term13365.getClass(), "values", term13441);
        term13457 = newInstance(Class.forName("java.util.Stack"));
        Object[] term13458 = (Object[]) newArray("java.lang.Object", 10);
        Object term13459 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13458, 0, term13459);
        setField(term13457, term13457.getClass(), "elementData", term13458);
        setIntField(term13457, term13457.getClass(), "elementCount", 1);
        setIntField(term13457, term13457.getClass(), "capacityIncrement", 0);
        setIntField(term13457, term13457.getClass(), "modCount", 1);
        ArrayList term51919 = new ArrayList();
        ArrayList term51930 = new ArrayList();
        HashMap term51934 = new HashMap();
        Set<Object> term52020 =  ((Map) term51934).keySet();
        HashSet term51933 = new HashSet((Collection<? extends Object>) term52020);
        HashMap term51936 = new HashMap();
        Set<Object> term52021 =  ((Map) term51936).keySet();
        HashSet term51935 = new HashSet((Collection<? extends Object>) term52021);
        ArrayList term51937 = new ArrayList();
        term51915 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51916 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51921 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51932 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term51916, term51916.getClass(), "defaults", null);
        setField(term51916, term51916.getClass(), "file", null);
        setField(term51916, term51916.getClass(), "basePath", null);
        setField(term51916, term51916.getClass(), "fileSeparator", "/");
        setBooleanField(term51916, term51916.getClass(), "isInitialized", false);
        setField(term51916, term51916.getClass(), "includePropertyName", null);
        setField(term51916, term51916.getClass(), "keysAsListed", term51919);
        setField(term51916, term51916.getClass(), "table", term51921);
        setIntField(term51916, term51916.getClass(), "count", 0);
        setIntField(term51916, term51916.getClass(), "threshold", 8);
        setFloatField(term51916, term51916.getClass(), "loadFactor", 0.75F);
        setIntField(term51916, term51916.getClass(), "modCount", 0);
        setField(term51916, term51916.getClass(), "keySet", null);
        setField(term51916, term51916.getClass(), "entrySet", null);
        setField(term51916, term51916.getClass(), "values", null);
        setField(term51915, term51915.getClass(), "defaults", term51916);
        setField(term51915, term51915.getClass(), "file", "qxSDVejjiY");
        setField(term51915, term51915.getClass(), "basePath", "xBsXSDjXYK");
        setField(term51915, term51915.getClass(), "fileSeparator", "/");
        setBooleanField(term51915, term51915.getClass(), "isInitialized", false);
        setField(term51915, term51915.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term51915, term51915.getClass(), "keysAsListed", term51930);
        setField(term51915, term51915.getClass(), "table", term51932);
        setIntField(term51915, term51915.getClass(), "count", -478195677);
        setIntField(term51915, term51915.getClass(), "threshold", 8);
        setFloatField(term51915, term51915.getClass(), "loadFactor", 0.75F);
        setIntField(term51915, term51915.getClass(), "modCount", 972867650);
        setField(term51915, term51915.getClass(), "keySet", term51933);
        setField(term51915, term51915.getClass(), "entrySet", term51935);
        setField(term51915, term51915.getClass(), "values", term51937);
        term51941 = newInstance(Class.forName("java.util.Stack"));
        Object[] term51942 = (Object[]) newArray("java.lang.Object", 10);
        Object term51943 = newInstance(Class.forName("java.lang.Object"));
        setElement(term51942, 0, term51943);
        setField(term51941, term51941.getClass(), "elementData", term51942);
        setIntField(term51941, term51941.getClass(), "elementCount", 1);
        setIntField(term51941, term51941.getClass(), "capacityIncrement", 0);
        setIntField(term51941, term51941.getClass(), "modCount", 1);
        term51829 = newInstance(Class.forName("java.util.Stack"));
        Object[] term51830 = (Object[]) newArray("java.lang.Object", 10);
        Object term51831 = newInstance(Class.forName("java.lang.Object"));
        setElement(term51830, 0, term51831);
        setField(term51829, term51829.getClass(), "elementData", term51830);
        setIntField(term51829, term51829.getClass(), "elementCount", 1);
        setIntField(term51829, term51829.getClass(), "capacityIncrement", 0);
        setIntField(term51829, term51829.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Vector");
        Object[] args = new Object[2];
        args[0] = "ZVecLZMLHF";
        args[1] = term13457;
        Object retValue = callMethod(klass, "getVector", argTypes, term13365, args);
        assertTrue(recursiveEquals(term13365, term51915));
        assertTrue(recursiveEquals(term13457, term51941));
        assertTrue(recursiveEquals(retValue, term51829));
    }

};


