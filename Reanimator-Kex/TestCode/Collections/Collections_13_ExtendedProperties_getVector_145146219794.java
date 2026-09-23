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

public class ExtendedProperties_getVector_145146219794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12922;
     Object term50437;
     Object term50432;

    public ExtendedProperties_getVector_145146219794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12928 = new ArrayList();
        ArrayList term12977 = new ArrayList();
        ((ArrayList) term12977).add("java.lang.Object@bd927ca");
        HashMap term13042 = new HashMap();
        Set<Object> term50549 =  ((Map) term13042).keySet();
        HashSet term13041 = new HashSet((Collection<? extends Object>) term50549);
        HashMap term13048 = new HashMap();
        Set<Object> term50550 =  ((Map) term13048).keySet();
        HashSet term13047 = new HashSet((Collection<? extends Object>) term50550);
        ArrayList term13053 = new ArrayList();
        term12922 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12923 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12932 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13007 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13008 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13036 = newInstance(Class.forName("java.lang.Object"));
        setField(term12923, term12923.getClass(), "defaults", null);
        setField(term12923, term12923.getClass(), "file", null);
        setField(term12923, term12923.getClass(), "basePath", null);
        setField(term12923, term12923.getClass(), "fileSeparator", "/");
        setBooleanField(term12923, term12923.getClass(), "isInitialized", false);
        setField(term12923, term12923.getClass(), "includePropertyName", null);
        setField(term12923, term12923.getClass(), "keysAsListed", term12928);
        setField(term12923, term12923.getClass(), "table", term12932);
        setIntField(term12923, term12923.getClass(), "count", 0);
        setIntField(term12923, term12923.getClass(), "threshold", 8);
        setFloatField(term12923, term12923.getClass(), "loadFactor", 0.75F);
        setIntField(term12923, term12923.getClass(), "modCount", 0);
        setField(term12923, term12923.getClass(), "keySet", null);
        setField(term12923, term12923.getClass(), "entrySet", null);
        setField(term12923, term12923.getClass(), "values", null);
        setField(term12922, term12922.getClass(), "defaults", term12923);
        setField(term12922, term12922.getClass(), "file", "sEccwbJKYE");
        setField(term12922, term12922.getClass(), "basePath", "AWRooQKkdW");
        setField(term12922, term12922.getClass(), "fileSeparator", "/");
        setBooleanField(term12922, term12922.getClass(), "isInitialized", true);
        setField(term12922, term12922.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term12922, term12922.getClass(), "keysAsListed", term12977);
        setIntField(term13008, term13008.getClass(), "hash", 679054445);
        setField(term13008, term13008.getClass(), "key", "java.lang.Object@bd927ca");
        setField(term13008, term13008.getClass(), "value", term13036);
        setField(term13008, term13008.getClass(), "next", null);
        setElement(term13007, 3, term13008);
        setField(term12922, term12922.getClass(), "table", term13007);
        setIntField(term12922, term12922.getClass(), "count", -2027534002);
        setIntField(term12922, term12922.getClass(), "threshold", 8);
        setFloatField(term12922, term12922.getClass(), "loadFactor", 0.75F);
        setIntField(term12922, term12922.getClass(), "modCount", 1063420943);
        setField(term12922, term12922.getClass(), "keySet", term13041);
        setField(term12922, term12922.getClass(), "entrySet", term13047);
        setField(term12922, term12922.getClass(), "values", term13053);
        ArrayList term50441 = new ArrayList();
        ArrayList term50452 = new ArrayList();
        ((ArrayList) term50452).add("java.lang.Object@bd927ca");
        HashMap term50462 = new HashMap();
        Set<Object> term50641 =  ((Map) term50462).keySet();
        HashSet term50461 = new HashSet((Collection<? extends Object>) term50641);
        HashMap term50464 = new HashMap();
        Set<Object> term50642 =  ((Map) term50464).keySet();
        HashSet term50463 = new HashSet((Collection<? extends Object>) term50642);
        ArrayList term50465 = new ArrayList();
        term50437 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term50438 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term50443 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term50456 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term50457 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term50460 = newInstance(Class.forName("java.lang.Object"));
        setField(term50438, term50438.getClass(), "defaults", null);
        setField(term50438, term50438.getClass(), "file", null);
        setField(term50438, term50438.getClass(), "basePath", null);
        setField(term50438, term50438.getClass(), "fileSeparator", "/");
        setBooleanField(term50438, term50438.getClass(), "isInitialized", false);
        setField(term50438, term50438.getClass(), "includePropertyName", null);
        setField(term50438, term50438.getClass(), "keysAsListed", term50441);
        setField(term50438, term50438.getClass(), "table", term50443);
        setIntField(term50438, term50438.getClass(), "count", 0);
        setIntField(term50438, term50438.getClass(), "threshold", 8);
        setFloatField(term50438, term50438.getClass(), "loadFactor", 0.75F);
        setIntField(term50438, term50438.getClass(), "modCount", 0);
        setField(term50438, term50438.getClass(), "keySet", null);
        setField(term50438, term50438.getClass(), "entrySet", null);
        setField(term50438, term50438.getClass(), "values", null);
        setField(term50437, term50437.getClass(), "defaults", term50438);
        setField(term50437, term50437.getClass(), "file", "sEccwbJKYE");
        setField(term50437, term50437.getClass(), "basePath", "AWRooQKkdW");
        setField(term50437, term50437.getClass(), "fileSeparator", "/");
        setBooleanField(term50437, term50437.getClass(), "isInitialized", true);
        setField(term50437, term50437.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term50437, term50437.getClass(), "keysAsListed", term50452);
        setIntField(term50457, term50457.getClass(), "hash", 679054445);
        setField(term50457, term50457.getClass(), "key", "java.lang.Object@bd927ca");
        setField(term50457, term50457.getClass(), "value", term50460);
        setField(term50457, term50457.getClass(), "next", null);
        setElement(term50456, 3, term50457);
        setField(term50437, term50437.getClass(), "table", term50456);
        setIntField(term50437, term50437.getClass(), "count", -2027534002);
        setIntField(term50437, term50437.getClass(), "threshold", 8);
        setFloatField(term50437, term50437.getClass(), "loadFactor", 0.75F);
        setIntField(term50437, term50437.getClass(), "modCount", 1063420943);
        setField(term50437, term50437.getClass(), "keySet", term50461);
        setField(term50437, term50437.getClass(), "entrySet", term50463);
        setField(term50437, term50437.getClass(), "values", term50465);
        term50432 = newInstance(Class.forName("java.util.Vector"));
        Object[] term50433 = (Object[]) newArray("java.lang.Object", 10);
        setField(term50432, term50432.getClass(), "elementData", term50433);
        setIntField(term50432, term50432.getClass(), "elementCount", 0);
        setIntField(term50432, term50432.getClass(), "capacityIncrement", 0);
        setIntField(term50432, term50432.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QXzGXbEXMu";
        Object retValue = callMethod(klass, "getVector", argTypes, term12922, args);
        assertTrue(recursiveEquals(term12922, term50437));
        assertTrue(recursiveEquals(retValue, term50432));
    }

};


