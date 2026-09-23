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
import java.util.NoSuchElementException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getFloat_2026443291116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24316;

    public ExtendedProperties_getFloat_2026443291116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24322 = new ArrayList();
        ArrayList term24371 = new ArrayList();
        ((ArrayList) term24371).add("java.lang.Object@25e8dc8");
        ((ArrayList) term24371).add("java.lang.Object@1f475df1");
        ((ArrayList) term24371).add("java.lang.Object@36337837");
        ((ArrayList) term24371).add("java.lang.Object@499f3d3c");
        ((ArrayList) term24371).add("java.lang.Object@3fd9d90a");
        ((ArrayList) term24371).add("java.lang.Object@1a54b3d5");
        ((ArrayList) term24371).add("java.lang.Object@370b9268");
        ((ArrayList) term24371).add("java.lang.Object@74d3f68");
        HashMap term24833 = new HashMap();
        Set<Object> term71293 =  ((Map) term24833).keySet();
        HashSet term24832 = new HashSet((Collection<? extends Object>) term71293);
        HashMap term24839 = new HashMap();
        Set<Object> term71294 =  ((Map) term24839).keySet();
        HashSet term24838 = new HashSet((Collection<? extends Object>) term71294);
        ArrayList term24844 = new ArrayList();
        term24316 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term24317 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term24326 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term24589 = (Object[]) newArray("java.util.Hashtable$Entry", 3071);
        Object term24590 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24619 = newInstance(Class.forName("java.lang.Object"));
        Object term24620 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24648 = newInstance(Class.forName("java.lang.Object"));
        Object term24649 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24677 = newInstance(Class.forName("java.lang.Object"));
        Object term24678 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24707 = newInstance(Class.forName("java.lang.Object"));
        Object term24708 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24737 = newInstance(Class.forName("java.lang.Object"));
        Object term24738 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24767 = newInstance(Class.forName("java.lang.Object"));
        Object term24768 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24797 = newInstance(Class.forName("java.lang.Object"));
        Object term24798 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24827 = newInstance(Class.forName("java.lang.Object"));
        setField(term24317, term24317.getClass(), "defaults", null);
        setField(term24317, term24317.getClass(), "file", null);
        setField(term24317, term24317.getClass(), "basePath", null);
        setField(term24317, term24317.getClass(), "fileSeparator", "/");
        setBooleanField(term24317, term24317.getClass(), "isInitialized", false);
        setField(term24317, term24317.getClass(), "includePropertyName", null);
        setField(term24317, term24317.getClass(), "keysAsListed", term24322);
        setField(term24317, term24317.getClass(), "table", term24326);
        setIntField(term24317, term24317.getClass(), "count", 0);
        setIntField(term24317, term24317.getClass(), "threshold", 8);
        setFloatField(term24317, term24317.getClass(), "loadFactor", 0.75F);
        setIntField(term24317, term24317.getClass(), "modCount", 0);
        setField(term24317, term24317.getClass(), "keySet", null);
        setField(term24317, term24317.getClass(), "entrySet", null);
        setField(term24317, term24317.getClass(), "values", null);
        setField(term24316, term24316.getClass(), "defaults", term24317);
        setField(term24316, term24316.getClass(), "file", "vKQukfbJUd");
        setField(term24316, term24316.getClass(), "basePath", "lFRJFUMVbx");
        setField(term24316, term24316.getClass(), "fileSeparator", "/");
        setBooleanField(term24316, term24316.getClass(), "isInitialized", true);
        setField(term24316, term24316.getClass(), "includePropertyName", "sZdUNdggUW");
        setField(term24316, term24316.getClass(), "keysAsListed", term24371);
        setIntField(term24590, term24590.getClass(), "hash", 2066829374);
        setField(term24590, term24590.getClass(), "key", "java.lang.Object@370b9268");
        setField(term24590, term24590.getClass(), "value", term24619);
        setField(term24590, term24590.getClass(), "next", null);
        setElement(term24589, 309, term24590);
        setIntField(term24620, term24620.getClass(), "hash", -163312497);
        setField(term24620, term24620.getClass(), "key", "java.lang.Object@74d3f68");
        setField(term24620, term24620.getClass(), "value", term24648);
        setField(term24620, term24620.getClass(), "next", null);
        setElement(term24589, 1122, term24620);
        setIntField(term24649, term24649.getClass(), "hash", -276162506);
        setField(term24649, term24649.getClass(), "key", "java.lang.Object@25e8dc8");
        setField(term24649, term24649.getClass(), "value", term24677);
        setField(term24649, term24649.getClass(), "next", null);
        setElement(term24589, 1150, term24649);
        setIntField(term24678, term24678.getClass(), "hash", 1550905472);
        setField(term24678, term24678.getClass(), "key", "java.lang.Object@499f3d3c");
        setField(term24678, term24678.getClass(), "value", term24707);
        setField(term24678, term24678.getClass(), "next", null);
        setElement(term24589, 1336, term24678);
        setIntField(term24708, term24708.getClass(), "hash", 1598512542);
        setField(term24708, term24708.getClass(), "key", "java.lang.Object@1a54b3d5");
        setField(term24708, term24708.getClass(), "value", term24737);
        setField(term24708, term24708.getClass(), "next", null);
        setElement(term24589, 1764, term24708);
        setIntField(term24738, term24738.getClass(), "hash", 1713911615);
        setField(term24738, term24738.getClass(), "key", "java.lang.Object@1f475df1");
        setField(term24738, term24738.getClass(), "value", term24767);
        setField(term24738, term24738.getClass(), "next", null);
        setElement(term24589, 1870, term24738);
        setIntField(term24768, term24768.getClass(), "hash", 1221753749);
        setField(term24768, term24768.getClass(), "key", "java.lang.Object@36337837");
        setField(term24768, term24768.getClass(), "value", term24797);
        setField(term24768, term24768.getClass(), "next", null);
        setElement(term24589, 2464, term24768);
        setIntField(term24798, term24798.getClass(), "hash", -2012998789);
        setField(term24798, term24798.getClass(), "key", "java.lang.Object@3fd9d90a");
        setField(term24798, term24798.getClass(), "value", term24827);
        setField(term24798, term24798.getClass(), "next", null);
        setElement(term24589, 2698, term24798);
        setField(term24316, term24316.getClass(), "table", term24589);
        setIntField(term24316, term24316.getClass(), "count", 9726687);
        setIntField(term24316, term24316.getClass(), "threshold", 2303);
        setFloatField(term24316, term24316.getClass(), "loadFactor", 0.75F);
        setIntField(term24316, term24316.getClass(), "modCount", -25637960);
        setField(term24316, term24316.getClass(), "keySet", term24832);
        setField(term24316, term24316.getClass(), "entrySet", term24838);
        setField(term24316, term24316.getClass(), "values", term24844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        try {
            callMethod(klass, "getFloat", argTypes, term24316, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


