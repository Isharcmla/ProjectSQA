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

public class ExtendedProperties_clearProperty_3423515384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8139;
     Object term43190;

    public ExtendedProperties_clearProperty_3423515384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8145 = new ArrayList();
        ArrayList term8194 = new ArrayList();
        ((ArrayList) term8194).add("java.lang.Object@1934e50b");
        ((ArrayList) term8194).add("java.lang.Object@1d6f824b");
        HashMap term8318 = new HashMap();
        Set<Object> term43360 =  ((Map) term8318).keySet();
        HashSet term8317 = new HashSet((Collection<? extends Object>) term43360);
        HashMap term8324 = new HashMap();
        Set<Object> term43361 =  ((Map) term8324).keySet();
        HashSet term8323 = new HashSet((Collection<? extends Object>) term43361);
        ArrayList term8329 = new ArrayList();
        term8139 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term8140 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term8149 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term8252 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8253 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8282 = newInstance(Class.forName("java.lang.Object"));
        Object term8283 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8312 = newInstance(Class.forName("java.lang.Object"));
        setField(term8140, term8140.getClass(), "defaults", null);
        setField(term8140, term8140.getClass(), "file", null);
        setField(term8140, term8140.getClass(), "basePath", null);
        setField(term8140, term8140.getClass(), "fileSeparator", "/");
        setBooleanField(term8140, term8140.getClass(), "isInitialized", false);
        setField(term8140, term8140.getClass(), "includePropertyName", null);
        setField(term8140, term8140.getClass(), "keysAsListed", term8145);
        setField(term8140, term8140.getClass(), "table", term8149);
        setIntField(term8140, term8140.getClass(), "count", 0);
        setIntField(term8140, term8140.getClass(), "threshold", 8);
        setFloatField(term8140, term8140.getClass(), "loadFactor", 0.75F);
        setIntField(term8140, term8140.getClass(), "modCount", 0);
        setField(term8140, term8140.getClass(), "keySet", null);
        setField(term8140, term8140.getClass(), "entrySet", null);
        setField(term8140, term8140.getClass(), "values", null);
        setField(term8139, term8139.getClass(), "defaults", term8140);
        setField(term8139, term8139.getClass(), "file", "hoicvmsovO");
        setField(term8139, term8139.getClass(), "basePath", "eqJfYWRaEL");
        setField(term8139, term8139.getClass(), "fileSeparator", "/");
        setBooleanField(term8139, term8139.getClass(), "isInitialized", true);
        setField(term8139, term8139.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term8139, term8139.getClass(), "keysAsListed", term8194);
        setIntField(term8253, term8253.getClass(), "hash", 400935096);
        setField(term8253, term8253.getClass(), "key", "java.lang.Object@1934e50b");
        setField(term8253, term8253.getClass(), "value", term8282);
        setField(term8253, term8253.getClass(), "next", null);
        setElement(term8252, 1, term8253);
        setIntField(term8283, term8283.getClass(), "hash", 39607864);
        setField(term8283, term8283.getClass(), "key", "java.lang.Object@1d6f824b");
        setField(term8283, term8283.getClass(), "value", term8312);
        setField(term8283, term8283.getClass(), "next", null);
        setElement(term8252, 10, term8283);
        setField(term8139, term8139.getClass(), "table", term8252);
        setIntField(term8139, term8139.getClass(), "count", -1016503457);
        setIntField(term8139, term8139.getClass(), "threshold", 8);
        setFloatField(term8139, term8139.getClass(), "loadFactor", 0.75F);
        setIntField(term8139, term8139.getClass(), "modCount", -1968847289);
        setField(term8139, term8139.getClass(), "keySet", term8317);
        setField(term8139, term8139.getClass(), "entrySet", term8323);
        setField(term8139, term8139.getClass(), "values", term8329);
        ArrayList term43194 = new ArrayList();
        ArrayList term43205 = new ArrayList();
        ((ArrayList) term43205).add("java.lang.Object@1934e50b");
        ((ArrayList) term43205).add("java.lang.Object@1d6f824b");
        HashMap term43221 = new HashMap();
        Set<Object> term43504 =  ((Map) term43221).keySet();
        HashSet term43220 = new HashSet((Collection<? extends Object>) term43504);
        HashMap term43223 = new HashMap();
        Set<Object> term43505 =  ((Map) term43223).keySet();
        HashSet term43222 = new HashSet((Collection<? extends Object>) term43505);
        ArrayList term43224 = new ArrayList();
        term43190 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term43191 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term43196 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term43211 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term43212 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43215 = newInstance(Class.forName("java.lang.Object"));
        Object term43216 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term43219 = newInstance(Class.forName("java.lang.Object"));
        setField(term43191, term43191.getClass(), "defaults", null);
        setField(term43191, term43191.getClass(), "file", null);
        setField(term43191, term43191.getClass(), "basePath", null);
        setField(term43191, term43191.getClass(), "fileSeparator", "/");
        setBooleanField(term43191, term43191.getClass(), "isInitialized", false);
        setField(term43191, term43191.getClass(), "includePropertyName", null);
        setField(term43191, term43191.getClass(), "keysAsListed", term43194);
        setField(term43191, term43191.getClass(), "table", term43196);
        setIntField(term43191, term43191.getClass(), "count", 0);
        setIntField(term43191, term43191.getClass(), "threshold", 8);
        setFloatField(term43191, term43191.getClass(), "loadFactor", 0.75F);
        setIntField(term43191, term43191.getClass(), "modCount", 0);
        setField(term43191, term43191.getClass(), "keySet", null);
        setField(term43191, term43191.getClass(), "entrySet", null);
        setField(term43191, term43191.getClass(), "values", null);
        setField(term43190, term43190.getClass(), "defaults", term43191);
        setField(term43190, term43190.getClass(), "file", "hoicvmsovO");
        setField(term43190, term43190.getClass(), "basePath", "eqJfYWRaEL");
        setField(term43190, term43190.getClass(), "fileSeparator", "/");
        setBooleanField(term43190, term43190.getClass(), "isInitialized", true);
        setField(term43190, term43190.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term43190, term43190.getClass(), "keysAsListed", term43205);
        setIntField(term43212, term43212.getClass(), "hash", 400935096);
        setField(term43212, term43212.getClass(), "key", "java.lang.Object@1934e50b");
        setField(term43212, term43212.getClass(), "value", term43215);
        setField(term43212, term43212.getClass(), "next", null);
        setElement(term43211, 1, term43212);
        setIntField(term43216, term43216.getClass(), "hash", 39607864);
        setField(term43216, term43216.getClass(), "key", "java.lang.Object@1d6f824b");
        setField(term43216, term43216.getClass(), "value", term43219);
        setField(term43216, term43216.getClass(), "next", null);
        setElement(term43211, 10, term43216);
        setField(term43190, term43190.getClass(), "table", term43211);
        setIntField(term43190, term43190.getClass(), "count", -1016503457);
        setIntField(term43190, term43190.getClass(), "threshold", 8);
        setFloatField(term43190, term43190.getClass(), "loadFactor", 0.75F);
        setIntField(term43190, term43190.getClass(), "modCount", -1968847289);
        setField(term43190, term43190.getClass(), "keySet", term43220);
        setField(term43190, term43190.getClass(), "entrySet", term43222);
        setField(term43190, term43190.getClass(), "values", term43224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "clearProperty", argTypes, term8139, args);
        assertTrue(recursiveEquals(term8139, term43190));
    }

};


