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
     Object term52138;
     Object term52170;
     Object term51989;

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
        Set<Object> term52262 =  ((Map) term13870).keySet();
        HashSet term13869 = new HashSet((Collection<? extends Object>) term52262);
        HashMap term13876 = new HashMap();
        Set<Object> term52263 =  ((Map) term13876).keySet();
        HashSet term13875 = new HashSet((Collection<? extends Object>) term52263);
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
        ArrayList term52142 = new ArrayList();
        ArrayList term52153 = new ArrayList();
        ((ArrayList) term52153).add("java.lang.Object@51726f0");
        HashMap term52163 = new HashMap();
        Set<Object> term52354 =  ((Map) term52163).keySet();
        HashSet term52162 = new HashSet((Collection<? extends Object>) term52354);
        HashMap term52165 = new HashMap();
        Set<Object> term52355 =  ((Map) term52165).keySet();
        HashSet term52164 = new HashSet((Collection<? extends Object>) term52355);
        ArrayList term52166 = new ArrayList();
        term52138 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term52139 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term52144 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term52157 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term52158 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term52161 = newInstance(Class.forName("java.lang.Object"));
        setField(term52139, term52139.getClass(), "defaults", null);
        setField(term52139, term52139.getClass(), "file", null);
        setField(term52139, term52139.getClass(), "basePath", null);
        setField(term52139, term52139.getClass(), "fileSeparator", "/");
        setBooleanField(term52139, term52139.getClass(), "isInitialized", false);
        setField(term52139, term52139.getClass(), "includePropertyName", null);
        setField(term52139, term52139.getClass(), "keysAsListed", term52142);
        setField(term52139, term52139.getClass(), "table", term52144);
        setIntField(term52139, term52139.getClass(), "count", 0);
        setIntField(term52139, term52139.getClass(), "threshold", 8);
        setFloatField(term52139, term52139.getClass(), "loadFactor", 0.75F);
        setIntField(term52139, term52139.getClass(), "modCount", 0);
        setField(term52139, term52139.getClass(), "keySet", null);
        setField(term52139, term52139.getClass(), "entrySet", null);
        setField(term52139, term52139.getClass(), "values", null);
        setField(term52138, term52138.getClass(), "defaults", term52139);
        setField(term52138, term52138.getClass(), "file", "RYdKCNNMBR");
        setField(term52138, term52138.getClass(), "basePath", "yGtHPyvYiQ");
        setField(term52138, term52138.getClass(), "fileSeparator", "/");
        setBooleanField(term52138, term52138.getClass(), "isInitialized", true);
        setField(term52138, term52138.getClass(), "includePropertyName", "MvRIxilFMJ");
        setField(term52138, term52138.getClass(), "keysAsListed", term52153);
        setIntField(term52158, term52158.getClass(), "hash", -2065840196);
        setField(term52158, term52158.getClass(), "key", "java.lang.Object@51726f0");
        setField(term52158, term52158.getClass(), "value", term52161);
        setField(term52158, term52158.getClass(), "next", null);
        setElement(term52157, 7, term52158);
        setField(term52138, term52138.getClass(), "table", term52157);
        setIntField(term52138, term52138.getClass(), "count", 1090617577);
        setIntField(term52138, term52138.getClass(), "threshold", 17);
        setFloatField(term52138, term52138.getClass(), "loadFactor", 0.75F);
        setIntField(term52138, term52138.getClass(), "modCount", -1547384486);
        setField(term52138, term52138.getClass(), "keySet", term52162);
        setField(term52138, term52138.getClass(), "entrySet", term52164);
        setField(term52138, term52138.getClass(), "values", term52166);
        Object term52172 = newInstance(Class.forName("java.lang.Object"));
        Object term52174 = newInstance(Class.forName("java.lang.Object"));
        Object term52176 = newInstance(Class.forName("java.lang.Object"));
        term52170 = new LinkedList();
        ((LinkedList) term52170).add(term52172);
        ((LinkedList) term52170).add(term52174);
        ((LinkedList) term52170).add(term52176);
        ((LinkedList) term52170).add((Object)null);
        ((LinkedList) term52170).add((Object)null);
        ((LinkedList) term52170).add((Object)null);
        ((LinkedList) term52170).add((Object)null);
        ((LinkedList) term52170).add((Object)null);
        ((LinkedList) term52170).add((Object)null);
        Object term51992 = newInstance(Class.forName("java.lang.Object"));
        Object term51994 = newInstance(Class.forName("java.lang.Object"));
        Object term51996 = newInstance(Class.forName("java.lang.Object"));
        term51989 = new LinkedList();
        ((LinkedList) term51989).add(term51992);
        ((LinkedList) term51989).add(term51994);
        ((LinkedList) term51989).add(term51996);
        ((LinkedList) term51989).add((Object)null);
        ((LinkedList) term51989).add((Object)null);
        ((LinkedList) term51989).add((Object)null);
        ((LinkedList) term51989).add((Object)null);
        ((LinkedList) term51989).add((Object)null);
        ((LinkedList) term51989).add((Object)null);
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
        assertTrue(recursiveEquals(term13750, term52138));
        assertTrue(recursiveEquals(term13897, term52170));
        assertTrue(recursiveEquals(retValue, term51989));
    }

};


