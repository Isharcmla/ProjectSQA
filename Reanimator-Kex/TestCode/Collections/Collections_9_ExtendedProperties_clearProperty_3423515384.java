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
     Object term42695;

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
        Set<Object> term42865 =  ((Map) term8318).keySet();
        HashSet term8317 = new HashSet((Collection<? extends Object>) term42865);
        HashMap term8324 = new HashMap();
        Set<Object> term42866 =  ((Map) term8324).keySet();
        HashSet term8323 = new HashSet((Collection<? extends Object>) term42866);
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
        ArrayList term42699 = new ArrayList();
        ArrayList term42710 = new ArrayList();
        ((ArrayList) term42710).add("java.lang.Object@1934e50b");
        ((ArrayList) term42710).add("java.lang.Object@1d6f824b");
        HashMap term42726 = new HashMap();
        Set<Object> term43014 =  ((Map) term42726).keySet();
        HashSet term42725 = new HashSet((Collection<? extends Object>) term43014);
        HashMap term42728 = new HashMap();
        Set<Object> term43043 =  ((Map) term42728).keySet();
        HashSet term42727 = new HashSet((Collection<? extends Object>) term43043);
        ArrayList term42729 = new ArrayList();
        term42695 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term42696 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term42701 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term42716 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term42717 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42720 = newInstance(Class.forName("java.lang.Object"));
        Object term42721 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42724 = newInstance(Class.forName("java.lang.Object"));
        setField(term42696, term42696.getClass(), "defaults", null);
        setField(term42696, term42696.getClass(), "file", null);
        setField(term42696, term42696.getClass(), "basePath", null);
        setField(term42696, term42696.getClass(), "fileSeparator", "/");
        setBooleanField(term42696, term42696.getClass(), "isInitialized", false);
        setField(term42696, term42696.getClass(), "includePropertyName", null);
        setField(term42696, term42696.getClass(), "keysAsListed", term42699);
        setField(term42696, term42696.getClass(), "table", term42701);
        setIntField(term42696, term42696.getClass(), "count", 0);
        setIntField(term42696, term42696.getClass(), "threshold", 8);
        setFloatField(term42696, term42696.getClass(), "loadFactor", 0.75F);
        setIntField(term42696, term42696.getClass(), "modCount", 0);
        setField(term42696, term42696.getClass(), "keySet", null);
        setField(term42696, term42696.getClass(), "entrySet", null);
        setField(term42696, term42696.getClass(), "values", null);
        setField(term42695, term42695.getClass(), "defaults", term42696);
        setField(term42695, term42695.getClass(), "file", "hoicvmsovO");
        setField(term42695, term42695.getClass(), "basePath", "eqJfYWRaEL");
        setField(term42695, term42695.getClass(), "fileSeparator", "/");
        setBooleanField(term42695, term42695.getClass(), "isInitialized", true);
        setField(term42695, term42695.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term42695, term42695.getClass(), "keysAsListed", term42710);
        setIntField(term42717, term42717.getClass(), "hash", 400935096);
        setField(term42717, term42717.getClass(), "key", "java.lang.Object@1934e50b");
        setField(term42717, term42717.getClass(), "value", term42720);
        setField(term42717, term42717.getClass(), "next", null);
        setElement(term42716, 1, term42717);
        setIntField(term42721, term42721.getClass(), "hash", 39607864);
        setField(term42721, term42721.getClass(), "key", "java.lang.Object@1d6f824b");
        setField(term42721, term42721.getClass(), "value", term42724);
        setField(term42721, term42721.getClass(), "next", null);
        setElement(term42716, 10, term42721);
        setField(term42695, term42695.getClass(), "table", term42716);
        setIntField(term42695, term42695.getClass(), "count", -1016503457);
        setIntField(term42695, term42695.getClass(), "threshold", 8);
        setFloatField(term42695, term42695.getClass(), "loadFactor", 0.75F);
        setIntField(term42695, term42695.getClass(), "modCount", -1968847289);
        setField(term42695, term42695.getClass(), "keySet", term42725);
        setField(term42695, term42695.getClass(), "entrySet", term42727);
        setField(term42695, term42695.getClass(), "values", term42729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "clearProperty", argTypes, term8139, args);
        assertTrue(recursiveEquals(term8139, term42695));
    }

};


