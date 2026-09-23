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

public class ExtendedProperties_testBoolean_1991462572101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15496;
     Object term54889;

    public ExtendedProperties_testBoolean_1991462572101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15502 = new ArrayList();
        ArrayList term15551 = new ArrayList();
        ((ArrayList) term15551).add("java.lang.Object@378dfb7d");
        ((ArrayList) term15551).add("java.lang.Object@2c9d42ed");
        HashMap term15675 = new HashMap();
        Set<Object> term55059 =  ((Map) term15675).keySet();
        HashSet term15674 = new HashSet((Collection<? extends Object>) term55059);
        HashMap term15681 = new HashMap();
        Set<Object> term55060 =  ((Map) term15681).keySet();
        HashSet term15680 = new HashSet((Collection<? extends Object>) term55060);
        ArrayList term15686 = new ArrayList();
        term15496 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15497 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15506 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15609 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term15610 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15639 = newInstance(Class.forName("java.lang.Object"));
        Object term15640 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15669 = newInstance(Class.forName("java.lang.Object"));
        setField(term15497, term15497.getClass(), "defaults", null);
        setField(term15497, term15497.getClass(), "file", null);
        setField(term15497, term15497.getClass(), "basePath", null);
        setField(term15497, term15497.getClass(), "fileSeparator", "/");
        setBooleanField(term15497, term15497.getClass(), "isInitialized", false);
        setField(term15497, term15497.getClass(), "includePropertyName", null);
        setField(term15497, term15497.getClass(), "keysAsListed", term15502);
        setField(term15497, term15497.getClass(), "table", term15506);
        setIntField(term15497, term15497.getClass(), "count", 0);
        setIntField(term15497, term15497.getClass(), "threshold", 8);
        setFloatField(term15497, term15497.getClass(), "loadFactor", 0.75F);
        setIntField(term15497, term15497.getClass(), "modCount", 0);
        setField(term15497, term15497.getClass(), "keySet", null);
        setField(term15497, term15497.getClass(), "entrySet", null);
        setField(term15497, term15497.getClass(), "values", null);
        setField(term15496, term15496.getClass(), "defaults", term15497);
        setField(term15496, term15496.getClass(), "file", "SdCKLMIYnX");
        setField(term15496, term15496.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term15496, term15496.getClass(), "fileSeparator", "/");
        setBooleanField(term15496, term15496.getClass(), "isInitialized", true);
        setField(term15496, term15496.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term15496, term15496.getClass(), "keysAsListed", term15551);
        setIntField(term15610, term15610.getClass(), "hash", -1995870874);
        setField(term15610, term15610.getClass(), "key", "java.lang.Object@378dfb7d");
        setField(term15610, term15610.getClass(), "value", term15639);
        setField(term15610, term15610.getClass(), "next", null);
        setElement(term15609, 5, term15610);
        setIntField(term15640, term15640.getClass(), "hash", 978837286);
        setField(term15640, term15640.getClass(), "key", "java.lang.Object@2c9d42ed");
        setField(term15640, term15640.getClass(), "value", term15669);
        setField(term15640, term15640.getClass(), "next", null);
        setElement(term15609, 9, term15640);
        setField(term15496, term15496.getClass(), "table", term15609);
        setIntField(term15496, term15496.getClass(), "count", -1263114717);
        setIntField(term15496, term15496.getClass(), "threshold", 8);
        setFloatField(term15496, term15496.getClass(), "loadFactor", 0.75F);
        setIntField(term15496, term15496.getClass(), "modCount", -894662984);
        setField(term15496, term15496.getClass(), "keySet", term15674);
        setField(term15496, term15496.getClass(), "entrySet", term15680);
        setField(term15496, term15496.getClass(), "values", term15686);
        ArrayList term54893 = new ArrayList();
        ArrayList term54904 = new ArrayList();
        ((ArrayList) term54904).add("java.lang.Object@378dfb7d");
        ((ArrayList) term54904).add("java.lang.Object@2c9d42ed");
        HashMap term54920 = new HashMap();
        Set<Object> term55203 =  ((Map) term54920).keySet();
        HashSet term54919 = new HashSet((Collection<? extends Object>) term55203);
        HashMap term54922 = new HashMap();
        Set<Object> term55204 =  ((Map) term54922).keySet();
        HashSet term54921 = new HashSet((Collection<? extends Object>) term55204);
        ArrayList term54923 = new ArrayList();
        term54889 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term54890 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term54895 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term54910 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term54911 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term54914 = newInstance(Class.forName("java.lang.Object"));
        Object term54915 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term54918 = newInstance(Class.forName("java.lang.Object"));
        setField(term54890, term54890.getClass(), "defaults", null);
        setField(term54890, term54890.getClass(), "file", null);
        setField(term54890, term54890.getClass(), "basePath", null);
        setField(term54890, term54890.getClass(), "fileSeparator", "/");
        setBooleanField(term54890, term54890.getClass(), "isInitialized", false);
        setField(term54890, term54890.getClass(), "includePropertyName", null);
        setField(term54890, term54890.getClass(), "keysAsListed", term54893);
        setField(term54890, term54890.getClass(), "table", term54895);
        setIntField(term54890, term54890.getClass(), "count", 0);
        setIntField(term54890, term54890.getClass(), "threshold", 8);
        setFloatField(term54890, term54890.getClass(), "loadFactor", 0.75F);
        setIntField(term54890, term54890.getClass(), "modCount", 0);
        setField(term54890, term54890.getClass(), "keySet", null);
        setField(term54890, term54890.getClass(), "entrySet", null);
        setField(term54890, term54890.getClass(), "values", null);
        setField(term54889, term54889.getClass(), "defaults", term54890);
        setField(term54889, term54889.getClass(), "file", "SdCKLMIYnX");
        setField(term54889, term54889.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term54889, term54889.getClass(), "fileSeparator", "/");
        setBooleanField(term54889, term54889.getClass(), "isInitialized", true);
        setField(term54889, term54889.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term54889, term54889.getClass(), "keysAsListed", term54904);
        setIntField(term54911, term54911.getClass(), "hash", -1995870874);
        setField(term54911, term54911.getClass(), "key", "java.lang.Object@378dfb7d");
        setField(term54911, term54911.getClass(), "value", term54914);
        setField(term54911, term54911.getClass(), "next", null);
        setElement(term54910, 5, term54911);
        setIntField(term54915, term54915.getClass(), "hash", 978837286);
        setField(term54915, term54915.getClass(), "key", "java.lang.Object@2c9d42ed");
        setField(term54915, term54915.getClass(), "value", term54918);
        setField(term54915, term54915.getClass(), "next", null);
        setElement(term54910, 9, term54915);
        setField(term54889, term54889.getClass(), "table", term54910);
        setIntField(term54889, term54889.getClass(), "count", -1263114717);
        setIntField(term54889, term54889.getClass(), "threshold", 8);
        setFloatField(term54889, term54889.getClass(), "loadFactor", 0.75F);
        setIntField(term54889, term54889.getClass(), "modCount", -894662984);
        setField(term54889, term54889.getClass(), "keySet", term54919);
        setField(term54889, term54889.getClass(), "entrySet", term54921);
        setField(term54889, term54889.getClass(), "values", term54923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term15496, args);
        assertTrue(recursiveEquals(term15496, term54889));
        assertTrue(recursiveEquals(retValue, null));
    }

};


