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
     Object term24532;

    public ExtendedProperties_getFloat_2026443291116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24538 = new ArrayList();
        ArrayList term24587 = new ArrayList();
        ((ArrayList) term24587).add("java.lang.Object@78b0080b");
        ((ArrayList) term24587).add("java.lang.Object@1426e088");
        ((ArrayList) term24587).add("java.lang.Object@477b6e18");
        ((ArrayList) term24587).add("java.lang.Object@253c5f2b");
        ((ArrayList) term24587).add("java.lang.Object@5db4fbd7");
        ((ArrayList) term24587).add("java.lang.Object@7eb57249");
        ((ArrayList) term24587).add("java.lang.Object@6222d829");
        ((ArrayList) term24587).add("java.lang.Object@25200641");
        HashMap term25053 = new HashMap();
        Set<Object> term72456 =  ((Map) term25053).keySet();
        HashSet term25052 = new HashSet((Collection<? extends Object>) term72456);
        HashMap term25059 = new HashMap();
        Set<Object> term72457 =  ((Map) term25059).keySet();
        HashSet term25058 = new HashSet((Collection<? extends Object>) term72457);
        ArrayList term25064 = new ArrayList();
        term24532 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term24533 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term24542 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term24807 = (Object[]) newArray("java.util.Hashtable$Entry", 3071);
        Object term24808 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24837 = newInstance(Class.forName("java.lang.Object"));
        Object term24838 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24867 = newInstance(Class.forName("java.lang.Object"));
        Object term24868 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24897 = newInstance(Class.forName("java.lang.Object"));
        Object term24898 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24927 = newInstance(Class.forName("java.lang.Object"));
        Object term24928 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24957 = newInstance(Class.forName("java.lang.Object"));
        Object term24958 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term24987 = newInstance(Class.forName("java.lang.Object"));
        Object term24988 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term25017 = newInstance(Class.forName("java.lang.Object"));
        Object term25018 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term25047 = newInstance(Class.forName("java.lang.Object"));
        setField(term24533, term24533.getClass(), "defaults", null);
        setField(term24533, term24533.getClass(), "file", null);
        setField(term24533, term24533.getClass(), "basePath", null);
        setField(term24533, term24533.getClass(), "fileSeparator", "/");
        setBooleanField(term24533, term24533.getClass(), "isInitialized", false);
        setField(term24533, term24533.getClass(), "includePropertyName", null);
        setField(term24533, term24533.getClass(), "keysAsListed", term24538);
        setField(term24533, term24533.getClass(), "table", term24542);
        setIntField(term24533, term24533.getClass(), "count", 0);
        setIntField(term24533, term24533.getClass(), "threshold", 8);
        setFloatField(term24533, term24533.getClass(), "loadFactor", 0.75F);
        setIntField(term24533, term24533.getClass(), "modCount", 0);
        setField(term24533, term24533.getClass(), "keySet", null);
        setField(term24533, term24533.getClass(), "entrySet", null);
        setField(term24533, term24533.getClass(), "values", null);
        setField(term24532, term24532.getClass(), "defaults", term24533);
        setField(term24532, term24532.getClass(), "file", "vKQukfbJUd");
        setField(term24532, term24532.getClass(), "basePath", "lFRJFUMVbx");
        setField(term24532, term24532.getClass(), "fileSeparator", "/");
        setBooleanField(term24532, term24532.getClass(), "isInitialized", true);
        setField(term24532, term24532.getClass(), "includePropertyName", "sZdUNdggUW");
        setField(term24532, term24532.getClass(), "keysAsListed", term24587);
        setIntField(term24808, term24808.getClass(), "hash", -286528050);
        setField(term24808, term24808.getClass(), "key", "java.lang.Object@7eb57249");
        setField(term24808, term24808.getClass(), "value", term24837);
        setField(term24808, term24808.getClass(), "next", null);
        setElement(term24807, 231, term24808);
        setIntField(term24838, term24838.getClass(), "hash", -1440170415);
        setField(term24838, term24838.getClass(), "key", "java.lang.Object@25200641");
        setField(term24838, term24838.getClass(), "value", term24867);
        setField(term24838, term24838.getClass(), "next", null);
        setElement(term24807, 513, term24838);
        setIntField(term24868, term24868.getClass(), "hash", -1574308490);
        setField(term24868, term24868.getClass(), "key", "java.lang.Object@78b0080b");
        setField(term24868, term24868.getClass(), "value", term24897);
        setField(term24868, term24868.getClass(), "next", null);
        setElement(term24807, 647, term24868);
        setIntField(term24898, term24898.getClass(), "hash", -1423009372);
        setField(term24898, term24898.getClass(), "key", "java.lang.Object@6222d829");
        setField(term24898, term24898.getClass(), "value", term24927);
        setField(term24898, term24898.getClass(), "next", null);
        setElement(term24807, 808, term24898);
        setIntField(term24928, term24928.getClass(), "hash", 231597279);
        setField(term24928, term24928.getClass(), "key", "java.lang.Object@1426e088");
        setField(term24928, term24928.getClass(), "value", term24957);
        setField(term24928, term24928.getClass(), "next", null);
        setElement(term24807, 885, term24928);
        setIntField(term24958, term24958.getClass(), "hash", -284964047);
        setField(term24958, term24958.getClass(), "key", "java.lang.Object@477b6e18");
        setField(term24958, term24958.getClass(), "value", term24987);
        setField(term24958, term24958.getClass(), "next", null);
        setElement(term24807, 1095, term24958);
        setIntField(term24988, term24988.getClass(), "hash", -364160835);
        setField(term24988, term24988.getClass(), "key", "java.lang.Object@5db4fbd7");
        setField(term24988, term24988.getClass(), "value", term25017);
        setField(term24988, term24988.getClass(), "next", null);
        setElement(term24807, 2326, term24988);
        setIntField(term25018, term25018.getClass(), "hash", -1364246623);
        setField(term25018, term25018.getClass(), "key", "java.lang.Object@253c5f2b");
        setField(term25018, term25018.getClass(), "value", term25047);
        setField(term25018, term25018.getClass(), "next", null);
        setElement(term24807, 3043, term25018);
        setField(term24532, term24532.getClass(), "table", term24807);
        setIntField(term24532, term24532.getClass(), "count", 9726687);
        setIntField(term24532, term24532.getClass(), "threshold", 2303);
        setFloatField(term24532, term24532.getClass(), "loadFactor", 0.75F);
        setIntField(term24532, term24532.getClass(), "modCount", -25637960);
        setField(term24532, term24532.getClass(), "keySet", term25052);
        setField(term24532, term24532.getClass(), "entrySet", term25058);
        setField(term24532, term24532.getClass(), "values", term25064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        try {
            callMethod(klass, "getFloat", argTypes, term24532, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


