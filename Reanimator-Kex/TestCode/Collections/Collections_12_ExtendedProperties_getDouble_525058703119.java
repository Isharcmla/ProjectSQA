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
     Object term27025;

    public ExtendedProperties_getDouble_525058703119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27031 = new ArrayList();
        ArrayList term27080 = new ArrayList();
        ((ArrayList) term27080).add("java.lang.Object@6e294ae4");
        ((ArrayList) term27080).add("java.lang.Object@e2ece75");
        ((ArrayList) term27080).add("java.lang.Object@354e185a");
        ((ArrayList) term27080).add("java.lang.Object@fd3f8b1");
        ((ArrayList) term27080).add("java.lang.Object@2b89fdc5");
        HashMap term27320 = new HashMap();
        Set<Object> term76181 =  ((Map) term27320).keySet();
        HashSet term27319 = new HashSet((Collection<? extends Object>) term76181);
        HashMap term27326 = new HashMap();
        Set<Object> term76182 =  ((Map) term27326).keySet();
        HashSet term27325 = new HashSet((Collection<? extends Object>) term76182);
        ArrayList term27331 = new ArrayList();
        term27025 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term27026 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term27035 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term27217 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term27218 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27246 = newInstance(Class.forName("java.lang.Object"));
        Object term27247 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27250 = newInstance(Class.forName("java.lang.Object"));
        Object term27251 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27280 = newInstance(Class.forName("java.lang.Object"));
        Object term27281 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27284 = newInstance(Class.forName("java.lang.Object"));
        Object term27285 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term27314 = newInstance(Class.forName("java.lang.Object"));
        setField(term27026, term27026.getClass(), "defaults", null);
        setField(term27026, term27026.getClass(), "file", null);
        setField(term27026, term27026.getClass(), "basePath", null);
        setField(term27026, term27026.getClass(), "fileSeparator", "/");
        setBooleanField(term27026, term27026.getClass(), "isInitialized", false);
        setField(term27026, term27026.getClass(), "includePropertyName", null);
        setField(term27026, term27026.getClass(), "keysAsListed", term27031);
        setField(term27026, term27026.getClass(), "table", term27035);
        setIntField(term27026, term27026.getClass(), "count", 0);
        setIntField(term27026, term27026.getClass(), "threshold", 8);
        setFloatField(term27026, term27026.getClass(), "loadFactor", 0.75F);
        setIntField(term27026, term27026.getClass(), "modCount", 0);
        setField(term27026, term27026.getClass(), "keySet", null);
        setField(term27026, term27026.getClass(), "entrySet", null);
        setField(term27026, term27026.getClass(), "values", null);
        setField(term27025, term27025.getClass(), "defaults", term27026);
        setField(term27025, term27025.getClass(), "file", "nhoHrZfnIN");
        setField(term27025, term27025.getClass(), "basePath", "ZkMALXpEAZ");
        setField(term27025, term27025.getClass(), "fileSeparator", "/");
        setBooleanField(term27025, term27025.getClass(), "isInitialized", true);
        setField(term27025, term27025.getClass(), "includePropertyName", "tXfQjSqDzN");
        setField(term27025, term27025.getClass(), "keysAsListed", term27080);
        setIntField(term27218, term27218.getClass(), "hash", -69889239);
        setField(term27218, term27218.getClass(), "key", "java.lang.Object@fd3f8b1");
        setField(term27218, term27218.getClass(), "value", term27246);
        setIntField(term27247, term27247.getClass(), "hash", 895081055);
        setField(term27247, term27247.getClass(), "key", "");
        setField(term27247, term27247.getClass(), "value", term27250);
        setField(term27247, term27247.getClass(), "next", null);
        setField(term27218, term27218.getClass(), "next", term27247);
        setElement(term27217, 0, term27218);
        setIntField(term27251, term27251.getClass(), "hash", 24530542);
        setField(term27251, term27251.getClass(), "key", "java.lang.Object@2b89fdc5");
        setField(term27251, term27251.getClass(), "value", term27280);
        setIntField(term27281, term27281.getClass(), "hash", 1952245419);
        setField(term27281, term27281.getClass(), "key", "");
        setField(term27281, term27281.getClass(), "value", term27284);
        setField(term27281, term27281.getClass(), "next", null);
        setField(term27251, term27251.getClass(), "next", term27281);
        setElement(term27217, 3, term27251);
        setIntField(term27285, term27285.getClass(), "hash", 408876627);
        setField(term27285, term27285.getClass(), "key", "java.lang.Object@354e185a");
        setField(term27285, term27285.getClass(), "value", term27314);
        setField(term27285, term27285.getClass(), "next", null);
        setElement(term27217, 5, term27285);
        setField(term27025, term27025.getClass(), "table", term27217);
        setIntField(term27025, term27025.getClass(), "count", -1498296047);
        setIntField(term27025, term27025.getClass(), "threshold", 8);
        setFloatField(term27025, term27025.getClass(), "loadFactor", 0.75F);
        setIntField(term27025, term27025.getClass(), "modCount", 2098647994);
        setField(term27025, term27025.getClass(), "keySet", term27319);
        setField(term27025, term27025.getClass(), "entrySet", term27325);
        setField(term27025, term27025.getClass(), "values", term27331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjugTaMcxJ";
        try {
            callMethod(klass, "getDouble", argTypes, term27025, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


