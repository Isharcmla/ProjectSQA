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

public class ExtendedProperties_getDouble_525058703119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26752;

    public ExtendedProperties_getDouble_525058703119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26758 = new ArrayList();
        ArrayList term26807 = new ArrayList();
        ((ArrayList) term26807).add("java.lang.Object@da6f0ab");
        ((ArrayList) term26807).add("java.lang.Object@665b5612");
        ((ArrayList) term26807).add("java.lang.Object@7cacbde7");
        ((ArrayList) term26807).add("java.lang.Object@75ab2154");
        ((ArrayList) term26807).add("java.lang.Object@4f32a4e2");
        HashMap term27074 = new HashMap();
        Set<Object> term74986 =  ((Map) term27074).keySet();
        HashSet term27073 = new HashSet((Collection<? extends Object>) term74986);
        HashMap term27080 = new HashMap();
        Set<Object> term74987 =  ((Map) term27080).keySet();
        HashSet term27079 = new HashSet((Collection<? extends Object>) term74987);
        ArrayList term27085 = new ArrayList();
        term26752 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term26753 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term26762 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term26945 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term26946 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term26974 = newInstance(Class.forName("java.lang.Object"));
        Object term26975 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27004 = newInstance(Class.forName("java.lang.Object"));
        Object term27005 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27034 = newInstance(Class.forName("java.lang.Object"));
        Object term27035 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27064 = newInstance(Class.forName("java.lang.Object"));
        Object term27065 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27068 = newInstance(Class.forName("java.lang.Object"));
        setField(term26753, term26753.getClass(), "defaults", null);
        setField(term26753, term26753.getClass(), "file", null);
        setField(term26753, term26753.getClass(), "basePath", null);
        setField(term26753, term26753.getClass(), "fileSeparator", "/");
        setBooleanField(term26753, term26753.getClass(), "isInitialized", false);
        setField(term26753, term26753.getClass(), "includePropertyName", null);
        setField(term26753, term26753.getClass(), "keysAsListed", term26758);
        setField(term26753, term26753.getClass(), "table", term26762);
        setIntField(term26753, term26753.getClass(), "count", 0);
        setIntField(term26753, term26753.getClass(), "threshold", 8);
        setFloatField(term26753, term26753.getClass(), "loadFactor", 0.75F);
        setIntField(term26753, term26753.getClass(), "modCount", 0);
        setField(term26753, term26753.getClass(), "keySet", null);
        setField(term26753, term26753.getClass(), "entrySet", null);
        setField(term26753, term26753.getClass(), "values", null);
        setField(term26752, term26752.getClass(), "defaults", term26753);
        setField(term26752, term26752.getClass(), "file", "nhoHrZfnIN");
        setField(term26752, term26752.getClass(), "basePath", "ZkMALXpEAZ");
        setField(term26752, term26752.getClass(), "fileSeparator", "/");
        setBooleanField(term26752, term26752.getClass(), "isInitialized", true);
        setField(term26752, term26752.getClass(), "includePropertyName", "tXfQjSqDzN");
        setField(term26752, term26752.getClass(), "keysAsListed", term26807);
        setIntField(term26946, term26946.getClass(), "hash", -1928021161);
        setField(term26946, term26946.getClass(), "key", "java.lang.Object@da6f0ab");
        setField(term26946, term26946.getClass(), "value", term26974);
        setField(term26946, term26946.getClass(), "next", null);
        setElement(term26945, 2, term26946);
        setIntField(term26975, term26975.getClass(), "hash", -1679574082);
        setField(term26975, term26975.getClass(), "key", "java.lang.Object@4f32a4e2");
        setField(term26975, term26975.getClass(), "value", term27004);
        setField(term26975, term26975.getClass(), "next", null);
        setElement(term26945, 3, term26975);
        setIntField(term27005, term27005.getClass(), "hash", -2046352017);
        setField(term27005, term27005.getClass(), "key", "java.lang.Object@7cacbde7");
        setField(term27005, term27005.getClass(), "value", term27034);
        setField(term27005, term27005.getClass(), "next", null);
        setElement(term26945, 7, term27005);
        setIntField(term27035, term27035.getClass(), "hash", 75747626);
        setField(term27035, term27035.getClass(), "key", "java.lang.Object@75ab2154");
        setField(term27035, term27035.getClass(), "value", term27064);
        setIntField(term27065, term27065.getClass(), "hash", -2039147620);
        setField(term27065, term27065.getClass(), "key", "");
        setField(term27065, term27065.getClass(), "value", term27068);
        setField(term27065, term27065.getClass(), "next", null);
        setField(term27035, term27035.getClass(), "next", term27065);
        setElement(term26945, 9, term27035);
        setField(term26752, term26752.getClass(), "table", term26945);
        setIntField(term26752, term26752.getClass(), "count", -1498296047);
        setIntField(term26752, term26752.getClass(), "threshold", 8);
        setFloatField(term26752, term26752.getClass(), "loadFactor", 0.75F);
        setIntField(term26752, term26752.getClass(), "modCount", 2098647994);
        setField(term26752, term26752.getClass(), "keySet", term27073);
        setField(term26752, term26752.getClass(), "entrySet", term27079);
        setField(term26752, term26752.getClass(), "values", term27085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjugTaMcxJ";
        try {
            callMethod(klass, "getDouble", argTypes, term26752, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


