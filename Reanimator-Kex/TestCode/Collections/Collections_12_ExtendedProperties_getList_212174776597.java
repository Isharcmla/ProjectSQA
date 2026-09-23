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
     Object term13750;
     Object term13897;
     Object term52634;
     Object term52666;
     Object term52485;

    public ExtendedProperties_getList_212174776597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13756 = new ArrayList();
        ArrayList term13805 = new ArrayList();
        ((ArrayList) term13805).add("java.lang.Object@51726f0");
        HashMap term13870 = new HashMap();
        Set<Object> term52758 =  ((Map) term13870).keySet();
        HashSet term13869 = new HashSet((Collection<? extends Object>) term52758);
        HashMap term13876 = new HashMap();
        Set<Object> term52759 =  ((Map) term13876).keySet();
        HashSet term13875 = new HashSet((Collection<? extends Object>) term52759);
        ArrayList term13881 = new ArrayList();
        term13750 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13751 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13760 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13835 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term13836 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13864 = newInstance(Class.forName("java.lang.Object"));
        setField(term13751, term13751.getClass(), "defaults", null);
        setField(term13751, term13751.getClass(), "file", null);
        setField(term13751, term13751.getClass(), "basePath", null);
        setField(term13751, term13751.getClass(), "fileSeparator", "/");
        setBooleanField(term13751, term13751.getClass(), "isInitialized", false);
        setField(term13751, term13751.getClass(), "includePropertyName", null);
        setField(term13751, term13751.getClass(), "keysAsListed", term13756);
        setField(term13751, term13751.getClass(), "table", term13760);
        setIntField(term13751, term13751.getClass(), "count", 0);
        setIntField(term13751, term13751.getClass(), "threshold", 8);
        setFloatField(term13751, term13751.getClass(), "loadFactor", 0.75F);
        setIntField(term13751, term13751.getClass(), "modCount", 0);
        setField(term13751, term13751.getClass(), "keySet", null);
        setField(term13751, term13751.getClass(), "entrySet", null);
        setField(term13751, term13751.getClass(), "values", null);
        setField(term13750, term13750.getClass(), "defaults", term13751);
        setField(term13750, term13750.getClass(), "file", "RYdKCNNMBR");
        setField(term13750, term13750.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term13750, term13750.getClass(), "fileSeparator", "/");
        setBooleanField(term13750, term13750.getClass(), "isInitialized", true);
        setField(term13750, term13750.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term13750, term13750.getClass(), "keysAsListed", term13805);
        setIntField(term13836, term13836.getClass(), "hash", -2065840196);
        setField(term13836, term13836.getClass(), "key", "java.lang.Object@51726f0");
        setField(term13836, term13836.getClass(), "value", term13864);
        setField(term13836, term13836.getClass(), "next", null);
        setElement(term13835, 7, term13836);
        setField(term13750, term13750.getClass(), "table", term13835);
        setIntField(term13750, term13750.getClass(), "count", 1090617577);
        setIntField(term13750, term13750.getClass(), "threshold", 17);
        setFloatField(term13750, term13750.getClass(), "loadFactor", 0.75F);
        setIntField(term13750, term13750.getClass(), "modCount", -1547384486);
        setField(term13750, term13750.getClass(), "keySet", term13869);
        setField(term13750, term13750.getClass(), "entrySet", term13875);
        setField(term13750, term13750.getClass(), "values", term13881);
        Object term13900 = newInstance(Class.forName("java.lang.Object"));
        Object term13902 = newInstance(Class.forName("java.lang.Object"));
        Object term13904 = newInstance(Class.forName("java.lang.Object"));
        term13897 = new LinkedList();
        ((LinkedList) term13897).add(term13900);
        ((LinkedList) term13897).add(term13902);
        ((LinkedList) term13897).add(term13904);
        ((LinkedList) term13897).add((Object)null);
        ((LinkedList) term13897).add((Object)null);
        ((LinkedList) term13897).add((Object)null);
        ((LinkedList) term13897).add((Object)null);
        ((LinkedList) term13897).add((Object)null);
        ((LinkedList) term13897).add((Object)null);
        ArrayList term52638 = new ArrayList();
        ArrayList term52649 = new ArrayList();
        ((ArrayList) term52649).add("java.lang.Object@51726f0");
        HashMap term52659 = new HashMap();
        Set<Object> term52850 =  ((Map) term52659).keySet();
        HashSet term52658 = new HashSet((Collection<? extends Object>) term52850);
        HashMap term52661 = new HashMap();
        Set<Object> term52851 =  ((Map) term52661).keySet();
        HashSet term52660 = new HashSet((Collection<? extends Object>) term52851);
        ArrayList term52662 = new ArrayList();
        term52634 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term52635 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term52640 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term52653 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term52654 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term52657 = newInstance(Class.forName("java.lang.Object"));
        setField(term52635, term52635.getClass(), "defaults", null);
        setField(term52635, term52635.getClass(), "file", null);
        setField(term52635, term52635.getClass(), "basePath", null);
        setField(term52635, term52635.getClass(), "fileSeparator", "/");
        setBooleanField(term52635, term52635.getClass(), "isInitialized", false);
        setField(term52635, term52635.getClass(), "includePropertyName", null);
        setField(term52635, term52635.getClass(), "keysAsListed", term52638);
        setField(term52635, term52635.getClass(), "table", term52640);
        setIntField(term52635, term52635.getClass(), "count", 0);
        setIntField(term52635, term52635.getClass(), "threshold", 8);
        setFloatField(term52635, term52635.getClass(), "loadFactor", 0.75F);
        setIntField(term52635, term52635.getClass(), "modCount", 0);
        setField(term52635, term52635.getClass(), "keySet", null);
        setField(term52635, term52635.getClass(), "entrySet", null);
        setField(term52635, term52635.getClass(), "values", null);
        setField(term52634, term52634.getClass(), "defaults", term52635);
        setField(term52634, term52634.getClass(), "file", "RYdKCNNMBR");
        setField(term52634, term52634.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term52634, term52634.getClass(), "fileSeparator", "/");
        setBooleanField(term52634, term52634.getClass(), "isInitialized", true);
        setField(term52634, term52634.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term52634, term52634.getClass(), "keysAsListed", term52649);
        setIntField(term52654, term52654.getClass(), "hash", -2065840196);
        setField(term52654, term52654.getClass(), "key", "java.lang.Object@51726f0");
        setField(term52654, term52654.getClass(), "value", term52657);
        setField(term52654, term52654.getClass(), "next", null);
        setElement(term52653, 7, term52654);
        setField(term52634, term52634.getClass(), "table", term52653);
        setIntField(term52634, term52634.getClass(), "count", 1090617577);
        setIntField(term52634, term52634.getClass(), "threshold", 17);
        setFloatField(term52634, term52634.getClass(), "loadFactor", 0.75F);
        setIntField(term52634, term52634.getClass(), "modCount", -1547384486);
        setField(term52634, term52634.getClass(), "keySet", term52658);
        setField(term52634, term52634.getClass(), "entrySet", term52660);
        setField(term52634, term52634.getClass(), "values", term52662);
        Object term52668 = newInstance(Class.forName("java.lang.Object"));
        Object term52670 = newInstance(Class.forName("java.lang.Object"));
        Object term52672 = newInstance(Class.forName("java.lang.Object"));
        term52666 = new LinkedList();
        ((LinkedList) term52666).add(term52668);
        ((LinkedList) term52666).add(term52670);
        ((LinkedList) term52666).add(term52672);
        ((LinkedList) term52666).add((Object)null);
        ((LinkedList) term52666).add((Object)null);
        ((LinkedList) term52666).add((Object)null);
        ((LinkedList) term52666).add((Object)null);
        ((LinkedList) term52666).add((Object)null);
        ((LinkedList) term52666).add((Object)null);
        Object term52488 = newInstance(Class.forName("java.lang.Object"));
        Object term52490 = newInstance(Class.forName("java.lang.Object"));
        Object term52492 = newInstance(Class.forName("java.lang.Object"));
        term52485 = new LinkedList();
        ((LinkedList) term52485).add(term52488);
        ((LinkedList) term52485).add(term52490);
        ((LinkedList) term52485).add(term52492);
        ((LinkedList) term52485).add((Object)null);
        ((LinkedList) term52485).add((Object)null);
        ((LinkedList) term52485).add((Object)null);
        ((LinkedList) term52485).add((Object)null);
        ((LinkedList) term52485).add((Object)null);
        ((LinkedList) term52485).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "iNwOJRBEjp";
        args[1] = term13897;
        Object retValue = callMethod(klass, "getList", argTypes, term13750, args);
        assertTrue(recursiveEquals(term13750, term52634));
        assertTrue(recursiveEquals(term13897, term52666));
        assertTrue(recursiveEquals(retValue, term52485));
    }

};


