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
     Object term15802;
     Object term56180;

    public ExtendedProperties_testBoolean_1991462572101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15808 = new ArrayList();
        ArrayList term15857 = new ArrayList();
        ((ArrayList) term15857).add("java.lang.Object@655e5056");
        ((ArrayList) term15857).add("java.lang.Object@3e165aff");
        HashMap term15981 = new HashMap();
        Set<Object> term56350 =  ((Map) term15981).keySet();
        HashSet term15980 = new HashSet((Collection<? extends Object>) term56350);
        HashMap term15987 = new HashMap();
        Set<Object> term56351 =  ((Map) term15987).keySet();
        HashSet term15986 = new HashSet((Collection<? extends Object>) term56351);
        ArrayList term15992 = new ArrayList();
        term15802 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15803 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15812 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15915 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term15916 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15945 = newInstance(Class.forName("java.lang.Object"));
        Object term15946 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15975 = newInstance(Class.forName("java.lang.Object"));
        setField(term15803, term15803.getClass(), "defaults", null);
        setField(term15803, term15803.getClass(), "file", null);
        setField(term15803, term15803.getClass(), "basePath", null);
        setField(term15803, term15803.getClass(), "fileSeparator", "/");
        setBooleanField(term15803, term15803.getClass(), "isInitialized", false);
        setField(term15803, term15803.getClass(), "includePropertyName", null);
        setField(term15803, term15803.getClass(), "keysAsListed", term15808);
        setField(term15803, term15803.getClass(), "table", term15812);
        setIntField(term15803, term15803.getClass(), "count", 0);
        setIntField(term15803, term15803.getClass(), "threshold", 8);
        setFloatField(term15803, term15803.getClass(), "loadFactor", 0.75F);
        setIntField(term15803, term15803.getClass(), "modCount", 0);
        setField(term15803, term15803.getClass(), "keySet", null);
        setField(term15803, term15803.getClass(), "entrySet", null);
        setField(term15803, term15803.getClass(), "values", null);
        setField(term15802, term15802.getClass(), "defaults", term15803);
        setField(term15802, term15802.getClass(), "file", "SdCKLMIYnX");
        setField(term15802, term15802.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term15802, term15802.getClass(), "fileSeparator", "/");
        setBooleanField(term15802, term15802.getClass(), "isInitialized", true);
        setField(term15802, term15802.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term15802, term15802.getClass(), "keysAsListed", term15857);
        setIntField(term15916, term15916.getClass(), "hash", 1371080920);
        setField(term15916, term15916.getClass(), "key", "java.lang.Object@655e5056");
        setField(term15916, term15916.getClass(), "value", term15945);
        setField(term15916, term15916.getClass(), "next", null);
        setElement(term15915, 0, term15916);
        setIntField(term15946, term15946.getClass(), "hash", -69752496);
        setField(term15946, term15946.getClass(), "key", "java.lang.Object@3e165aff");
        setField(term15946, term15946.getClass(), "value", term15975);
        setField(term15946, term15946.getClass(), "next", null);
        setElement(term15915, 2, term15946);
        setField(term15802, term15802.getClass(), "table", term15915);
        setIntField(term15802, term15802.getClass(), "count", -1263114717);
        setIntField(term15802, term15802.getClass(), "threshold", 8);
        setFloatField(term15802, term15802.getClass(), "loadFactor", 0.75F);
        setIntField(term15802, term15802.getClass(), "modCount", -894662984);
        setField(term15802, term15802.getClass(), "keySet", term15980);
        setField(term15802, term15802.getClass(), "entrySet", term15986);
        setField(term15802, term15802.getClass(), "values", term15992);
        ArrayList term56184 = new ArrayList();
        ArrayList term56195 = new ArrayList();
        ((ArrayList) term56195).add("java.lang.Object@655e5056");
        ((ArrayList) term56195).add("java.lang.Object@3e165aff");
        HashMap term56211 = new HashMap();
        Set<Object> term56494 =  ((Map) term56211).keySet();
        HashSet term56210 = new HashSet((Collection<? extends Object>) term56494);
        HashMap term56213 = new HashMap();
        Set<Object> term56495 =  ((Map) term56213).keySet();
        HashSet term56212 = new HashSet((Collection<? extends Object>) term56495);
        ArrayList term56214 = new ArrayList();
        term56180 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term56181 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term56186 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term56201 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term56202 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term56205 = newInstance(Class.forName("java.lang.Object"));
        Object term56206 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term56209 = newInstance(Class.forName("java.lang.Object"));
        setField(term56181, term56181.getClass(), "defaults", null);
        setField(term56181, term56181.getClass(), "file", null);
        setField(term56181, term56181.getClass(), "basePath", null);
        setField(term56181, term56181.getClass(), "fileSeparator", "/");
        setBooleanField(term56181, term56181.getClass(), "isInitialized", false);
        setField(term56181, term56181.getClass(), "includePropertyName", null);
        setField(term56181, term56181.getClass(), "keysAsListed", term56184);
        setField(term56181, term56181.getClass(), "table", term56186);
        setIntField(term56181, term56181.getClass(), "count", 0);
        setIntField(term56181, term56181.getClass(), "threshold", 8);
        setFloatField(term56181, term56181.getClass(), "loadFactor", 0.75F);
        setIntField(term56181, term56181.getClass(), "modCount", 0);
        setField(term56181, term56181.getClass(), "keySet", null);
        setField(term56181, term56181.getClass(), "entrySet", null);
        setField(term56181, term56181.getClass(), "values", null);
        setField(term56180, term56180.getClass(), "defaults", term56181);
        setField(term56180, term56180.getClass(), "file", "SdCKLMIYnX");
        setField(term56180, term56180.getClass(), "basePath", "OJJtVNPyKZ");
        setField(term56180, term56180.getClass(), "fileSeparator", "/");
        setBooleanField(term56180, term56180.getClass(), "isInitialized", true);
        setField(term56180, term56180.getClass(), "includePropertyName", "AKNapTAfmD");
        setField(term56180, term56180.getClass(), "keysAsListed", term56195);
        setIntField(term56202, term56202.getClass(), "hash", 1371080920);
        setField(term56202, term56202.getClass(), "key", "java.lang.Object@655e5056");
        setField(term56202, term56202.getClass(), "value", term56205);
        setField(term56202, term56202.getClass(), "next", null);
        setElement(term56201, 0, term56202);
        setIntField(term56206, term56206.getClass(), "hash", -69752496);
        setField(term56206, term56206.getClass(), "key", "java.lang.Object@3e165aff");
        setField(term56206, term56206.getClass(), "value", term56209);
        setField(term56206, term56206.getClass(), "next", null);
        setElement(term56201, 2, term56206);
        setField(term56180, term56180.getClass(), "table", term56201);
        setIntField(term56180, term56180.getClass(), "count", -1263114717);
        setIntField(term56180, term56180.getClass(), "threshold", 8);
        setFloatField(term56180, term56180.getClass(), "loadFactor", 0.75F);
        setIntField(term56180, term56180.getClass(), "modCount", -894662984);
        setField(term56180, term56180.getClass(), "keySet", term56210);
        setField(term56180, term56180.getClass(), "entrySet", term56212);
        setField(term56180, term56180.getClass(), "values", term56214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term15802, args);
        assertTrue(recursiveEquals(term15802, term56180));
        assertTrue(recursiveEquals(retValue, null));
    }

};


