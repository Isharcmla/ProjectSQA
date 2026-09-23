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
import java.lang.Long;

public class ExtendedProperties_getLong_1984760787112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6891;
     Object term6991;
     Object term23482;

    public ExtendedProperties_getLong_1984760787112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6897 = new ArrayList();
        ArrayList term6946 = new ArrayList();
        HashMap term6964 = new HashMap();
        Set<Object> term23546 =  ((Map) term6964).keySet();
        HashSet term6963 = new HashSet((Collection<? extends Object>) term23546);
        HashMap term6970 = new HashMap();
        Set<Object> term23547 =  ((Map) term6970).keySet();
        HashSet term6969 = new HashSet((Collection<? extends Object>) term23547);
        ArrayList term6975 = new ArrayList();
        term6891 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6892 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6901 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6950 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6951 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6953 = newInstance(Class.forName("java.lang.Object"));
        Object term6954 = newInstance(Class.forName("java.lang.Object"));
        Object term6955 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6957 = newInstance(Class.forName("java.lang.Object"));
        Object term6958 = newInstance(Class.forName("java.lang.Object"));
        setField(term6892, term6892.getClass(), "defaults", null);
        setField(term6892, term6892.getClass(), "file", null);
        setField(term6892, term6892.getClass(), "basePath", null);
        setField(term6892, term6892.getClass(), "fileSeparator", "/");
        setBooleanField(term6892, term6892.getClass(), "isInitialized", false);
        setField(term6892, term6892.getClass(), "includePropertyName", null);
        setField(term6892, term6892.getClass(), "keysAsListed", term6897);
        setField(term6892, term6892.getClass(), "table", term6901);
        setIntField(term6892, term6892.getClass(), "count", 0);
        setIntField(term6892, term6892.getClass(), "threshold", 8);
        setFloatField(term6892, term6892.getClass(), "loadFactor", 0.75F);
        setIntField(term6892, term6892.getClass(), "modCount", 0);
        setField(term6892, term6892.getClass(), "keySet", null);
        setField(term6892, term6892.getClass(), "entrySet", null);
        setField(term6892, term6892.getClass(), "values", null);
        setField(term6891, term6891.getClass(), "defaults", term6892);
        setField(term6891, term6891.getClass(), "file", "VGizxZnyHX");
        setField(term6891, term6891.getClass(), "basePath", "kVEZMHmRtR");
        setField(term6891, term6891.getClass(), "fileSeparator", "/");
        setBooleanField(term6891, term6891.getClass(), "isInitialized", true);
        setField(term6891, term6891.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term6891, term6891.getClass(), "keysAsListed", term6946);
        setIntField(term6951, term6951.getClass(), "hash", 2030684694);
        setField(term6951, term6951.getClass(), "key", term6953);
        setField(term6951, term6951.getClass(), "value", term6954);
        setField(term6951, term6951.getClass(), "next", null);
        setElement(term6950, 5, term6951);
        setIntField(term6955, term6955.getClass(), "hash", 472346125);
        setField(term6955, term6955.getClass(), "key", term6957);
        setField(term6955, term6955.getClass(), "value", term6958);
        setField(term6955, term6955.getClass(), "next", null);
        setElement(term6950, 9, term6955);
        setField(term6891, term6891.getClass(), "table", term6950);
        setIntField(term6891, term6891.getClass(), "count", -2015048151);
        setIntField(term6891, term6891.getClass(), "threshold", 8);
        setFloatField(term6891, term6891.getClass(), "loadFactor", 0.75F);
        setIntField(term6891, term6891.getClass(), "modCount", -2063457667);
        setField(term6891, term6891.getClass(), "keySet", term6963);
        setField(term6891, term6891.getClass(), "entrySet", term6969);
        setField(term6891, term6891.getClass(), "values", term6975);
        term6991 = new Long(2442117782898005296L);
        ArrayList term23486 = new ArrayList();
        ArrayList term23497 = new ArrayList();
        HashMap term23507 = new HashMap();
        Set<Object> term23590 =  ((Map) term23507).keySet();
        HashSet term23506 = new HashSet((Collection<? extends Object>) term23590);
        HashMap term23509 = new HashMap();
        Set<Object> term23591 =  ((Map) term23509).keySet();
        HashSet term23508 = new HashSet((Collection<? extends Object>) term23591);
        ArrayList term23510 = new ArrayList();
        term23482 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term23483 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term23488 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term23499 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term23500 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23501 = newInstance(Class.forName("java.lang.Object"));
        Object term23502 = newInstance(Class.forName("java.lang.Object"));
        Object term23503 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23504 = newInstance(Class.forName("java.lang.Object"));
        Object term23505 = newInstance(Class.forName("java.lang.Object"));
        setField(term23483, term23483.getClass(), "defaults", null);
        setField(term23483, term23483.getClass(), "file", null);
        setField(term23483, term23483.getClass(), "basePath", null);
        setField(term23483, term23483.getClass(), "fileSeparator", "/");
        setBooleanField(term23483, term23483.getClass(), "isInitialized", false);
        setField(term23483, term23483.getClass(), "includePropertyName", null);
        setField(term23483, term23483.getClass(), "keysAsListed", term23486);
        setField(term23483, term23483.getClass(), "table", term23488);
        setIntField(term23483, term23483.getClass(), "count", 0);
        setIntField(term23483, term23483.getClass(), "threshold", 8);
        setFloatField(term23483, term23483.getClass(), "loadFactor", 0.75F);
        setIntField(term23483, term23483.getClass(), "modCount", 0);
        setField(term23483, term23483.getClass(), "keySet", null);
        setField(term23483, term23483.getClass(), "entrySet", null);
        setField(term23483, term23483.getClass(), "values", null);
        setField(term23482, term23482.getClass(), "defaults", term23483);
        setField(term23482, term23482.getClass(), "file", "VGizxZnyHX");
        setField(term23482, term23482.getClass(), "basePath", "kVEZMHmRtR");
        setField(term23482, term23482.getClass(), "fileSeparator", "/");
        setBooleanField(term23482, term23482.getClass(), "isInitialized", true);
        setField(term23482, term23482.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term23482, term23482.getClass(), "keysAsListed", term23497);
        setIntField(term23500, term23500.getClass(), "hash", 2030684694);
        setField(term23500, term23500.getClass(), "key", term23501);
        setField(term23500, term23500.getClass(), "value", term23502);
        setField(term23500, term23500.getClass(), "next", null);
        setElement(term23499, 5, term23500);
        setIntField(term23503, term23503.getClass(), "hash", 472346125);
        setField(term23503, term23503.getClass(), "key", term23504);
        setField(term23503, term23503.getClass(), "value", term23505);
        setField(term23503, term23503.getClass(), "next", null);
        setElement(term23499, 9, term23503);
        setField(term23482, term23482.getClass(), "table", term23499);
        setIntField(term23482, term23482.getClass(), "count", -2015048151);
        setIntField(term23482, term23482.getClass(), "threshold", 8);
        setFloatField(term23482, term23482.getClass(), "loadFactor", 0.75F);
        setIntField(term23482, term23482.getClass(), "modCount", -2063457667);
        setField(term23482, term23482.getClass(), "keySet", term23506);
        setField(term23482, term23482.getClass(), "entrySet", term23508);
        setField(term23482, term23482.getClass(), "values", term23510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = "RbVQXSpxXy";
        args[1] = term6991;
        Object retValue = callMethod(klass, "getLong", argTypes, term6891, args);
        assertTrue(recursiveEquals(term6891, term23482));
        assertTrue(recursiveEquals(term6991, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, 2442117782898005296L));
    }

};


