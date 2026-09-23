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

public class ExtendedProperties_addPropertyInternal_138228817180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6004;
     Object term6184;
     Object term39000;
     Object term39043;

    public ExtendedProperties_addPropertyInternal_138228817180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6010 = new ArrayList();
        ArrayList term6059 = new ArrayList();
        ((ArrayList) term6059).add("java.lang.Object@20163488");
        ((ArrayList) term6059).add("java.lang.Object@34f0840f");
        HashMap term6157 = new HashMap();
        Set<Object> term39151 =  ((Map) term6157).keySet();
        HashSet term6156 = new HashSet((Collection<? extends Object>) term39151);
        HashMap term6163 = new HashMap();
        Set<Object> term39152 =  ((Map) term6163).keySet();
        HashSet term6162 = new HashSet((Collection<? extends Object>) term39152);
        ArrayList term6168 = new ArrayList();
        term6004 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6005 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6014 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6117 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6118 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6147 = newInstance(Class.forName("java.lang.Object"));
        Object term6148 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6151 = newInstance(Class.forName("java.lang.Object"));
        setField(term6005, term6005.getClass(), "defaults", null);
        setField(term6005, term6005.getClass(), "file", null);
        setField(term6005, term6005.getClass(), "basePath", null);
        setField(term6005, term6005.getClass(), "fileSeparator", "/");
        setBooleanField(term6005, term6005.getClass(), "isInitialized", false);
        setField(term6005, term6005.getClass(), "includePropertyName", null);
        setField(term6005, term6005.getClass(), "keysAsListed", term6010);
        setField(term6005, term6005.getClass(), "table", term6014);
        setIntField(term6005, term6005.getClass(), "count", 0);
        setIntField(term6005, term6005.getClass(), "threshold", 8);
        setFloatField(term6005, term6005.getClass(), "loadFactor", 0.75F);
        setIntField(term6005, term6005.getClass(), "modCount", 0);
        setField(term6005, term6005.getClass(), "keySet", null);
        setField(term6005, term6005.getClass(), "entrySet", null);
        setField(term6005, term6005.getClass(), "values", null);
        setField(term6004, term6004.getClass(), "defaults", term6005);
        setField(term6004, term6004.getClass(), "file", "BndsHwAFMv");
        setField(term6004, term6004.getClass(), "basePath", "GzFkzHGYFt");
        setField(term6004, term6004.getClass(), "fileSeparator", "/");
        setBooleanField(term6004, term6004.getClass(), "isInitialized", true);
        setField(term6004, term6004.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term6004, term6004.getClass(), "keysAsListed", term6059);
        setIntField(term6118, term6118.getClass(), "hash", 904088426);
        setField(term6118, term6118.getClass(), "key", "java.lang.Object@34f0840f");
        setField(term6118, term6118.getClass(), "value", term6147);
        setIntField(term6148, term6148.getClass(), "hash", -1605721967);
        setField(term6148, term6148.getClass(), "key", "");
        setField(term6148, term6148.getClass(), "value", term6151);
        setField(term6148, term6148.getClass(), "next", null);
        setField(term6118, term6118.getClass(), "next", term6148);
        setElement(term6117, 10, term6118);
        setField(term6004, term6004.getClass(), "table", term6117);
        setIntField(term6004, term6004.getClass(), "count", -1179120540);
        setIntField(term6004, term6004.getClass(), "threshold", 8);
        setFloatField(term6004, term6004.getClass(), "loadFactor", 0.75F);
        setIntField(term6004, term6004.getClass(), "modCount", -73683643);
        setField(term6004, term6004.getClass(), "keySet", term6156);
        setField(term6004, term6004.getClass(), "entrySet", term6162);
        setField(term6004, term6004.getClass(), "values", term6168);
        term6184 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term39004 = new ArrayList();
        ArrayList term39015 = new ArrayList();
        ((ArrayList) term39015).add("java.lang.Object@20163488");
        ((ArrayList) term39015).add("java.lang.Object@34f0840f");
        ((ArrayList) term39015).add("LvtrsXUliU");
        HashMap term39036 = new HashMap();
        Set<Object> term39290 =  ((Map) term39036).keySet();
        HashSet term39035 = new HashSet((Collection<? extends Object>) term39290);
        HashMap term39038 = new HashMap();
        Set<Object> term39291 =  ((Map) term39038).keySet();
        HashSet term39037 = new HashSet((Collection<? extends Object>) term39291);
        ArrayList term39039 = new ArrayList();
        term39000 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term39001 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term39006 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term39023 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39024 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39027 = newInstance(Class.forName("java.lang.Object"));
        Object term39028 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39031 = newInstance(Class.forName("java.lang.Object"));
        Object term39032 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39034 = newInstance(Class.forName("java.lang.Object"));
        setField(term39001, term39001.getClass(), "defaults", null);
        setField(term39001, term39001.getClass(), "file", null);
        setField(term39001, term39001.getClass(), "basePath", null);
        setField(term39001, term39001.getClass(), "fileSeparator", "/");
        setBooleanField(term39001, term39001.getClass(), "isInitialized", false);
        setField(term39001, term39001.getClass(), "includePropertyName", null);
        setField(term39001, term39001.getClass(), "keysAsListed", term39004);
        setField(term39001, term39001.getClass(), "table", term39006);
        setIntField(term39001, term39001.getClass(), "count", 0);
        setIntField(term39001, term39001.getClass(), "threshold", 8);
        setFloatField(term39001, term39001.getClass(), "loadFactor", 0.75F);
        setIntField(term39001, term39001.getClass(), "modCount", 0);
        setField(term39001, term39001.getClass(), "keySet", null);
        setField(term39001, term39001.getClass(), "entrySet", null);
        setField(term39001, term39001.getClass(), "values", null);
        setField(term39000, term39000.getClass(), "defaults", term39001);
        setField(term39000, term39000.getClass(), "file", "BndsHwAFMv");
        setField(term39000, term39000.getClass(), "basePath", "GzFkzHGYFt");
        setField(term39000, term39000.getClass(), "fileSeparator", "/");
        setBooleanField(term39000, term39000.getClass(), "isInitialized", true);
        setField(term39000, term39000.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term39000, term39000.getClass(), "keysAsListed", term39015);
        setIntField(term39024, term39024.getClass(), "hash", 1193615728);
        setField(term39024, term39024.getClass(), "key", "LvtrsXUliU");
        setField(term39024, term39024.getClass(), "value", term39027);
        setField(term39024, term39024.getClass(), "next", null);
        setElement(term39023, 8, term39024);
        setIntField(term39028, term39028.getClass(), "hash", 904088426);
        setField(term39028, term39028.getClass(), "key", "java.lang.Object@34f0840f");
        setField(term39028, term39028.getClass(), "value", term39031);
        setIntField(term39032, term39032.getClass(), "hash", -1605721967);
        setField(term39032, term39032.getClass(), "key", "");
        setField(term39032, term39032.getClass(), "value", term39034);
        setField(term39032, term39032.getClass(), "next", null);
        setField(term39028, term39028.getClass(), "next", term39032);
        setElement(term39023, 10, term39028);
        setField(term39000, term39000.getClass(), "table", term39023);
        setIntField(term39000, term39000.getClass(), "count", -1179120539);
        setIntField(term39000, term39000.getClass(), "threshold", 8);
        setFloatField(term39000, term39000.getClass(), "loadFactor", 0.75F);
        setIntField(term39000, term39000.getClass(), "modCount", -73683642);
        setField(term39000, term39000.getClass(), "keySet", term39035);
        setField(term39000, term39000.getClass(), "entrySet", term39037);
        setField(term39000, term39000.getClass(), "values", term39039);
        term39043 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "LvtrsXUliU";
        args[1] = term6184;
        callMethod(klass, "addPropertyInternal", argTypes, term6004, args);
        assertTrue(recursiveEquals(term6004, term39000));
        assertTrue(recursiveEquals(term6184, term39043));
    }

};


