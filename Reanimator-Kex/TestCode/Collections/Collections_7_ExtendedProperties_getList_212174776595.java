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
import java.util.LinkedList;

public class ExtendedProperties_getList_212174776595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4264;
     Object term4360;
     Object term17269;
     Object term17298;
     Object term17171;

    public ExtendedProperties_getList_212174776595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4270 = new ArrayList();
        ArrayList term4319 = new ArrayList();
        HashMap term4333 = new HashMap();
        Set<Object> term17342 =  ((Map) term4333).keySet();
        HashSet term4332 = new HashSet((Collection<? extends Object>) term17342);
        HashMap term4339 = new HashMap();
        Set<Object> term17343 =  ((Map) term4339).keySet();
        HashSet term4338 = new HashSet((Collection<? extends Object>) term17343);
        ArrayList term4344 = new ArrayList();
        term4264 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4265 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4274 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4323 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term4324 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4326 = newInstance(Class.forName("java.lang.Object"));
        Object term4327 = newInstance(Class.forName("java.lang.Object"));
        setField(term4265, term4265.getClass(), "defaults", null);
        setField(term4265, term4265.getClass(), "file", null);
        setField(term4265, term4265.getClass(), "basePath", null);
        setField(term4265, term4265.getClass(), "fileSeparator", "/");
        setBooleanField(term4265, term4265.getClass(), "isInitialized", false);
        setField(term4265, term4265.getClass(), "includePropertyName", null);
        setField(term4265, term4265.getClass(), "keysAsListed", term4270);
        setField(term4265, term4265.getClass(), "table", term4274);
        setIntField(term4265, term4265.getClass(), "count", 0);
        setIntField(term4265, term4265.getClass(), "threshold", 8);
        setFloatField(term4265, term4265.getClass(), "loadFactor", 0.75F);
        setIntField(term4265, term4265.getClass(), "modCount", 0);
        setField(term4265, term4265.getClass(), "keySet", null);
        setField(term4265, term4265.getClass(), "entrySet", null);
        setField(term4265, term4265.getClass(), "values", null);
        setField(term4264, term4264.getClass(), "defaults", term4265);
        setField(term4264, term4264.getClass(), "file", "RYdKCNNMBR");
        setField(term4264, term4264.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term4264, term4264.getClass(), "fileSeparator", "/");
        setBooleanField(term4264, term4264.getClass(), "isInitialized", true);
        setField(term4264, term4264.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term4264, term4264.getClass(), "keysAsListed", term4319);
        setIntField(term4324, term4324.getClass(), "hash", 561945312);
        setField(term4324, term4324.getClass(), "key", term4326);
        setField(term4324, term4324.getClass(), "value", term4327);
        setField(term4324, term4324.getClass(), "next", null);
        setElement(term4323, 20, term4324);
        setField(term4264, term4264.getClass(), "table", term4323);
        setIntField(term4264, term4264.getClass(), "count", 1090617577);
        setIntField(term4264, term4264.getClass(), "threshold", 17);
        setFloatField(term4264, term4264.getClass(), "loadFactor", 0.75F);
        setIntField(term4264, term4264.getClass(), "modCount", -1547384486);
        setField(term4264, term4264.getClass(), "keySet", term4332);
        setField(term4264, term4264.getClass(), "entrySet", term4338);
        setField(term4264, term4264.getClass(), "values", term4344);
        Object term4363 = newInstance(Class.forName("java.lang.Object"));
        Object term4365 = newInstance(Class.forName("java.lang.Object"));
        Object term4367 = newInstance(Class.forName("java.lang.Object"));
        term4360 = new LinkedList();
        ((LinkedList) term4360).add(term4363);
        ((LinkedList) term4360).add(term4365);
        ((LinkedList) term4360).add(term4367);
        ((LinkedList) term4360).add((Object)null);
        ((LinkedList) term4360).add((Object)null);
        ((LinkedList) term4360).add((Object)null);
        ((LinkedList) term4360).add((Object)null);
        ((LinkedList) term4360).add((Object)null);
        ((LinkedList) term4360).add((Object)null);
        ArrayList term17273 = new ArrayList();
        ArrayList term17284 = new ArrayList();
        HashMap term17291 = new HashMap();
        Set<Object> term17386 =  ((Map) term17291).keySet();
        HashSet term17290 = new HashSet((Collection<? extends Object>) term17386);
        HashMap term17293 = new HashMap();
        Set<Object> term17387 =  ((Map) term17293).keySet();
        HashSet term17292 = new HashSet((Collection<? extends Object>) term17387);
        ArrayList term17294 = new ArrayList();
        term17269 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term17270 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term17275 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term17286 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term17287 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17288 = newInstance(Class.forName("java.lang.Object"));
        Object term17289 = newInstance(Class.forName("java.lang.Object"));
        setField(term17270, term17270.getClass(), "defaults", null);
        setField(term17270, term17270.getClass(), "file", null);
        setField(term17270, term17270.getClass(), "basePath", null);
        setField(term17270, term17270.getClass(), "fileSeparator", "/");
        setBooleanField(term17270, term17270.getClass(), "isInitialized", false);
        setField(term17270, term17270.getClass(), "includePropertyName", null);
        setField(term17270, term17270.getClass(), "keysAsListed", term17273);
        setField(term17270, term17270.getClass(), "table", term17275);
        setIntField(term17270, term17270.getClass(), "count", 0);
        setIntField(term17270, term17270.getClass(), "threshold", 8);
        setFloatField(term17270, term17270.getClass(), "loadFactor", 0.75F);
        setIntField(term17270, term17270.getClass(), "modCount", 0);
        setField(term17270, term17270.getClass(), "keySet", null);
        setField(term17270, term17270.getClass(), "entrySet", null);
        setField(term17270, term17270.getClass(), "values", null);
        setField(term17269, term17269.getClass(), "defaults", term17270);
        setField(term17269, term17269.getClass(), "file", "RYdKCNNMBR");
        setField(term17269, term17269.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term17269, term17269.getClass(), "fileSeparator", "/");
        setBooleanField(term17269, term17269.getClass(), "isInitialized", true);
        setField(term17269, term17269.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term17269, term17269.getClass(), "keysAsListed", term17284);
        setIntField(term17287, term17287.getClass(), "hash", 561945312);
        setField(term17287, term17287.getClass(), "key", term17288);
        setField(term17287, term17287.getClass(), "value", term17289);
        setField(term17287, term17287.getClass(), "next", null);
        setElement(term17286, 20, term17287);
        setField(term17269, term17269.getClass(), "table", term17286);
        setIntField(term17269, term17269.getClass(), "count", 1090617577);
        setIntField(term17269, term17269.getClass(), "threshold", 17);
        setFloatField(term17269, term17269.getClass(), "loadFactor", 0.75F);
        setIntField(term17269, term17269.getClass(), "modCount", -1547384486);
        setField(term17269, term17269.getClass(), "keySet", term17290);
        setField(term17269, term17269.getClass(), "entrySet", term17292);
        setField(term17269, term17269.getClass(), "values", term17294);
        Object term17300 = newInstance(Class.forName("java.lang.Object"));
        Object term17302 = newInstance(Class.forName("java.lang.Object"));
        Object term17304 = newInstance(Class.forName("java.lang.Object"));
        term17298 = new LinkedList();
        ((LinkedList) term17298).add(term17300);
        ((LinkedList) term17298).add(term17302);
        ((LinkedList) term17298).add(term17304);
        ((LinkedList) term17298).add((Object)null);
        ((LinkedList) term17298).add((Object)null);
        ((LinkedList) term17298).add((Object)null);
        ((LinkedList) term17298).add((Object)null);
        ((LinkedList) term17298).add((Object)null);
        ((LinkedList) term17298).add((Object)null);
        Object term17174 = newInstance(Class.forName("java.lang.Object"));
        Object term17176 = newInstance(Class.forName("java.lang.Object"));
        Object term17178 = newInstance(Class.forName("java.lang.Object"));
        term17171 = new LinkedList();
        ((LinkedList) term17171).add(term17174);
        ((LinkedList) term17171).add(term17176);
        ((LinkedList) term17171).add(term17178);
        ((LinkedList) term17171).add((Object)null);
        ((LinkedList) term17171).add((Object)null);
        ((LinkedList) term17171).add((Object)null);
        ((LinkedList) term17171).add((Object)null);
        ((LinkedList) term17171).add((Object)null);
        ((LinkedList) term17171).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "iNwOJRBEjp";
        args[1] = term4360;
        Object retValue = callMethod(klass, "getList", argTypes, term4264, args);
        assertTrue(recursiveEquals(term4264, term17269));
        assertTrue(recursiveEquals(term4360, term17298));
        assertTrue(recursiveEquals(retValue, term17171));
    }

};


