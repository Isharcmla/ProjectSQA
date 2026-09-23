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

public class ExtendedProperties_addProperty_55335404076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1370;
     Object term1462;
     Object term12116;
     Object term12148;

    public ExtendedProperties_addProperty_55335404076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1376 = new ArrayList();
        ArrayList term1425 = new ArrayList();
        HashMap term1435 = new HashMap();
        Set<Object> term12181 =  ((Map) term1435).keySet();
        HashSet term1434 = new HashSet((Collection<? extends Object>) term12181);
        HashMap term1441 = new HashMap();
        Set<Object> term12182 =  ((Map) term1441).keySet();
        HashSet term1440 = new HashSet((Collection<? extends Object>) term12182);
        ArrayList term1446 = new ArrayList();
        term1370 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1371 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1380 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1429 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term1371, term1371.getClass(), "defaults", null);
        setField(term1371, term1371.getClass(), "file", null);
        setField(term1371, term1371.getClass(), "basePath", null);
        setField(term1371, term1371.getClass(), "fileSeparator", "/");
        setBooleanField(term1371, term1371.getClass(), "isInitialized", false);
        setField(term1371, term1371.getClass(), "includePropertyName", null);
        setField(term1371, term1371.getClass(), "keysAsListed", term1376);
        setField(term1371, term1371.getClass(), "table", term1380);
        setIntField(term1371, term1371.getClass(), "count", 0);
        setIntField(term1371, term1371.getClass(), "threshold", 8);
        setFloatField(term1371, term1371.getClass(), "loadFactor", 0.75F);
        setIntField(term1371, term1371.getClass(), "modCount", 0);
        setField(term1371, term1371.getClass(), "keySet", null);
        setField(term1371, term1371.getClass(), "entrySet", null);
        setField(term1371, term1371.getClass(), "values", null);
        setField(term1370, term1370.getClass(), "defaults", term1371);
        setField(term1370, term1370.getClass(), "file", "xrwlQZdwCp");
        setField(term1370, term1370.getClass(), "basePath", "IDCWpPLRkE");
        setField(term1370, term1370.getClass(), "fileSeparator", "/");
        setBooleanField(term1370, term1370.getClass(), "isInitialized", false);
        setField(term1370, term1370.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term1370, term1370.getClass(), "keysAsListed", term1425);
        setField(term1370, term1370.getClass(), "table", term1429);
        setIntField(term1370, term1370.getClass(), "count", 1135664017);
        setIntField(term1370, term1370.getClass(), "threshold", 8);
        setFloatField(term1370, term1370.getClass(), "loadFactor", 0.75F);
        setIntField(term1370, term1370.getClass(), "modCount", 590364439);
        setField(term1370, term1370.getClass(), "keySet", term1434);
        setField(term1370, term1370.getClass(), "entrySet", term1440);
        setField(term1370, term1370.getClass(), "values", term1446);
        term1462 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term12120 = new ArrayList();
        ArrayList term12131 = new ArrayList();
        ((ArrayList) term12131).add("aKnKipADSo");
        HashMap term12141 = new HashMap();
        Set<Object> term12245 =  ((Map) term12141).keySet();
        HashSet term12140 = new HashSet((Collection<? extends Object>) term12245);
        HashMap term12143 = new HashMap();
        Set<Object> term12246 =  ((Map) term12143).keySet();
        HashSet term12142 = new HashSet((Collection<? extends Object>) term12246);
        ArrayList term12144 = new ArrayList();
        term12116 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12117 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12122 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12135 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term12136 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12139 = newInstance(Class.forName("java.lang.Object"));
        setField(term12117, term12117.getClass(), "defaults", null);
        setField(term12117, term12117.getClass(), "file", null);
        setField(term12117, term12117.getClass(), "basePath", null);
        setField(term12117, term12117.getClass(), "fileSeparator", "/");
        setBooleanField(term12117, term12117.getClass(), "isInitialized", false);
        setField(term12117, term12117.getClass(), "includePropertyName", null);
        setField(term12117, term12117.getClass(), "keysAsListed", term12120);
        setField(term12117, term12117.getClass(), "table", term12122);
        setIntField(term12117, term12117.getClass(), "count", 0);
        setIntField(term12117, term12117.getClass(), "threshold", 8);
        setFloatField(term12117, term12117.getClass(), "loadFactor", 0.75F);
        setIntField(term12117, term12117.getClass(), "modCount", 0);
        setField(term12117, term12117.getClass(), "keySet", null);
        setField(term12117, term12117.getClass(), "entrySet", null);
        setField(term12117, term12117.getClass(), "values", null);
        setField(term12116, term12116.getClass(), "defaults", term12117);
        setField(term12116, term12116.getClass(), "file", "xrwlQZdwCp");
        setField(term12116, term12116.getClass(), "basePath", "IDCWpPLRkE");
        setField(term12116, term12116.getClass(), "fileSeparator", "/");
        setBooleanField(term12116, term12116.getClass(), "isInitialized", true);
        setField(term12116, term12116.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term12116, term12116.getClass(), "keysAsListed", term12131);
        setIntField(term12136, term12136.getClass(), "hash", -611664531);
        setField(term12136, term12136.getClass(), "key", "aKnKipADSo");
        setField(term12136, term12136.getClass(), "value", term12139);
        setField(term12136, term12136.getClass(), "next", null);
        setElement(term12135, 5, term12136);
        setField(term12116, term12116.getClass(), "table", term12135);
        setIntField(term12116, term12116.getClass(), "count", 1135664018);
        setIntField(term12116, term12116.getClass(), "threshold", 17);
        setFloatField(term12116, term12116.getClass(), "loadFactor", 0.75F);
        setIntField(term12116, term12116.getClass(), "modCount", 590364441);
        setField(term12116, term12116.getClass(), "keySet", term12140);
        setField(term12116, term12116.getClass(), "entrySet", term12142);
        setField(term12116, term12116.getClass(), "values", term12144);
        term12148 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "aKnKipADSo";
        args[1] = term1462;
        callMethod(klass, "addProperty", argTypes, term1370, args);
        assertTrue(recursiveEquals(term1370, term12116));
        assertTrue(recursiveEquals(term1462, term12148));
    }

};


