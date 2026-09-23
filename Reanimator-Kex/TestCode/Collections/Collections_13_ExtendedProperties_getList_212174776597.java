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

public class ExtendedProperties_getList_212174776597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13546;
     Object term13693;
     Object term51499;
     Object term51531;
     Object term51350;

    public ExtendedProperties_getList_212174776597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13552 = new ArrayList();
        ArrayList term13601 = new ArrayList();
        ((ArrayList) term13601).add("java.lang.Object@b4e7367");
        HashMap term13666 = new HashMap();
        Set<Object> term51623 =  ((Map) term13666).keySet();
        HashSet term13665 = new HashSet((Collection<? extends Object>) term51623);
        HashMap term13672 = new HashMap();
        Set<Object> term51624 =  ((Map) term13672).keySet();
        HashSet term13671 = new HashSet((Collection<? extends Object>) term51624);
        ArrayList term13677 = new ArrayList();
        term13546 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13547 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13556 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13631 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term13632 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13660 = newInstance(Class.forName("java.lang.Object"));
        setField(term13547, term13547.getClass(), "defaults", null);
        setField(term13547, term13547.getClass(), "file", null);
        setField(term13547, term13547.getClass(), "basePath", null);
        setField(term13547, term13547.getClass(), "fileSeparator", "/");
        setBooleanField(term13547, term13547.getClass(), "isInitialized", false);
        setField(term13547, term13547.getClass(), "includePropertyName", null);
        setField(term13547, term13547.getClass(), "keysAsListed", term13552);
        setField(term13547, term13547.getClass(), "table", term13556);
        setIntField(term13547, term13547.getClass(), "count", 0);
        setIntField(term13547, term13547.getClass(), "threshold", 8);
        setFloatField(term13547, term13547.getClass(), "loadFactor", 0.75F);
        setIntField(term13547, term13547.getClass(), "modCount", 0);
        setField(term13547, term13547.getClass(), "keySet", null);
        setField(term13547, term13547.getClass(), "entrySet", null);
        setField(term13547, term13547.getClass(), "values", null);
        setField(term13546, term13546.getClass(), "defaults", term13547);
        setField(term13546, term13546.getClass(), "file", "RYdKCNNMBR");
        setField(term13546, term13546.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term13546, term13546.getClass(), "fileSeparator", "/");
        setBooleanField(term13546, term13546.getClass(), "isInitialized", true);
        setField(term13546, term13546.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term13546, term13546.getClass(), "keysAsListed", term13601);
        setIntField(term13632, term13632.getClass(), "hash", -654366205);
        setField(term13632, term13632.getClass(), "key", "java.lang.Object@b4e7367");
        setField(term13632, term13632.getClass(), "value", term13660);
        setField(term13632, term13632.getClass(), "next", null);
        setElement(term13631, 16, term13632);
        setField(term13546, term13546.getClass(), "table", term13631);
        setIntField(term13546, term13546.getClass(), "count", 1090617577);
        setIntField(term13546, term13546.getClass(), "threshold", 17);
        setFloatField(term13546, term13546.getClass(), "loadFactor", 0.75F);
        setIntField(term13546, term13546.getClass(), "modCount", -1547384486);
        setField(term13546, term13546.getClass(), "keySet", term13665);
        setField(term13546, term13546.getClass(), "entrySet", term13671);
        setField(term13546, term13546.getClass(), "values", term13677);
        Object term13696 = newInstance(Class.forName("java.lang.Object"));
        Object term13698 = newInstance(Class.forName("java.lang.Object"));
        Object term13700 = newInstance(Class.forName("java.lang.Object"));
        term13693 = new LinkedList();
        ((LinkedList) term13693).add(term13696);
        ((LinkedList) term13693).add(term13698);
        ((LinkedList) term13693).add(term13700);
        ((LinkedList) term13693).add((Object)null);
        ((LinkedList) term13693).add((Object)null);
        ((LinkedList) term13693).add((Object)null);
        ((LinkedList) term13693).add((Object)null);
        ((LinkedList) term13693).add((Object)null);
        ((LinkedList) term13693).add((Object)null);
        ArrayList term51503 = new ArrayList();
        ArrayList term51514 = new ArrayList();
        ((ArrayList) term51514).add("java.lang.Object@b4e7367");
        HashMap term51524 = new HashMap();
        Set<Object> term51715 =  ((Map) term51524).keySet();
        HashSet term51523 = new HashSet((Collection<? extends Object>) term51715);
        HashMap term51526 = new HashMap();
        Set<Object> term51716 =  ((Map) term51526).keySet();
        HashSet term51525 = new HashSet((Collection<? extends Object>) term51716);
        ArrayList term51527 = new ArrayList();
        term51499 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51500 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51505 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51518 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term51519 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51522 = newInstance(Class.forName("java.lang.Object"));
        setField(term51500, term51500.getClass(), "defaults", null);
        setField(term51500, term51500.getClass(), "file", null);
        setField(term51500, term51500.getClass(), "basePath", null);
        setField(term51500, term51500.getClass(), "fileSeparator", "/");
        setBooleanField(term51500, term51500.getClass(), "isInitialized", false);
        setField(term51500, term51500.getClass(), "includePropertyName", null);
        setField(term51500, term51500.getClass(), "keysAsListed", term51503);
        setField(term51500, term51500.getClass(), "table", term51505);
        setIntField(term51500, term51500.getClass(), "count", 0);
        setIntField(term51500, term51500.getClass(), "threshold", 8);
        setFloatField(term51500, term51500.getClass(), "loadFactor", 0.75F);
        setIntField(term51500, term51500.getClass(), "modCount", 0);
        setField(term51500, term51500.getClass(), "keySet", null);
        setField(term51500, term51500.getClass(), "entrySet", null);
        setField(term51500, term51500.getClass(), "values", null);
        setField(term51499, term51499.getClass(), "defaults", term51500);
        setField(term51499, term51499.getClass(), "file", "RYdKCNNMBR");
        setField(term51499, term51499.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term51499, term51499.getClass(), "fileSeparator", "/");
        setBooleanField(term51499, term51499.getClass(), "isInitialized", true);
        setField(term51499, term51499.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term51499, term51499.getClass(), "keysAsListed", term51514);
        setIntField(term51519, term51519.getClass(), "hash", -654366205);
        setField(term51519, term51519.getClass(), "key", "java.lang.Object@b4e7367");
        setField(term51519, term51519.getClass(), "value", term51522);
        setField(term51519, term51519.getClass(), "next", null);
        setElement(term51518, 16, term51519);
        setField(term51499, term51499.getClass(), "table", term51518);
        setIntField(term51499, term51499.getClass(), "count", 1090617577);
        setIntField(term51499, term51499.getClass(), "threshold", 17);
        setFloatField(term51499, term51499.getClass(), "loadFactor", 0.75F);
        setIntField(term51499, term51499.getClass(), "modCount", -1547384486);
        setField(term51499, term51499.getClass(), "keySet", term51523);
        setField(term51499, term51499.getClass(), "entrySet", term51525);
        setField(term51499, term51499.getClass(), "values", term51527);
        Object term51533 = newInstance(Class.forName("java.lang.Object"));
        Object term51535 = newInstance(Class.forName("java.lang.Object"));
        Object term51537 = newInstance(Class.forName("java.lang.Object"));
        term51531 = new LinkedList();
        ((LinkedList) term51531).add(term51533);
        ((LinkedList) term51531).add(term51535);
        ((LinkedList) term51531).add(term51537);
        ((LinkedList) term51531).add((Object)null);
        ((LinkedList) term51531).add((Object)null);
        ((LinkedList) term51531).add((Object)null);
        ((LinkedList) term51531).add((Object)null);
        ((LinkedList) term51531).add((Object)null);
        ((LinkedList) term51531).add((Object)null);
        Object term51353 = newInstance(Class.forName("java.lang.Object"));
        Object term51355 = newInstance(Class.forName("java.lang.Object"));
        Object term51357 = newInstance(Class.forName("java.lang.Object"));
        term51350 = new LinkedList();
        ((LinkedList) term51350).add(term51353);
        ((LinkedList) term51350).add(term51355);
        ((LinkedList) term51350).add(term51357);
        ((LinkedList) term51350).add((Object)null);
        ((LinkedList) term51350).add((Object)null);
        ((LinkedList) term51350).add((Object)null);
        ((LinkedList) term51350).add((Object)null);
        ((LinkedList) term51350).add((Object)null);
        ((LinkedList) term51350).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "iNwOJRBEjp";
        args[1] = term13693;
        Object retValue = callMethod(klass, "getList", argTypes, term13546, args);
        assertTrue(recursiveEquals(term13546, term51499));
        assertTrue(recursiveEquals(term13693, term51531));
        assertTrue(recursiveEquals(retValue, term51350));
    }

};


