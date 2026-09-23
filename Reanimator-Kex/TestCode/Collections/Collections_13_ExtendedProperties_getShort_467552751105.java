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

public class ExtendedProperties_getShort_467552751105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17428;

    public ExtendedProperties_getShort_467552751105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17434 = new ArrayList();
        ArrayList term17483 = new ArrayList();
        ((ArrayList) term17483).add("java.lang.Object@b340cc3");
        ((ArrayList) term17483).add("java.lang.Object@2e846300");
        ((ArrayList) term17483).add("java.lang.Object@7cb59608");
        ((ArrayList) term17483).add("java.lang.Object@3cda7b28");
        ((ArrayList) term17483).add("java.lang.Object@17232a64");
        HashMap term17750 = new HashMap();
        Set<Object> term58972 =  ((Map) term17750).keySet();
        HashSet term17749 = new HashSet((Collection<? extends Object>) term58972);
        HashMap term17756 = new HashMap();
        Set<Object> term58973 =  ((Map) term17756).keySet();
        HashSet term17755 = new HashSet((Collection<? extends Object>) term58973);
        ArrayList term17761 = new ArrayList();
        term17428 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term17429 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term17438 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term17621 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17622 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17650 = newInstance(Class.forName("java.lang.Object"));
        Object term17651 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17680 = newInstance(Class.forName("java.lang.Object"));
        Object term17681 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17710 = newInstance(Class.forName("java.lang.Object"));
        Object term17711 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17740 = newInstance(Class.forName("java.lang.Object"));
        Object term17741 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17744 = newInstance(Class.forName("java.lang.Object"));
        setField(term17429, term17429.getClass(), "defaults", null);
        setField(term17429, term17429.getClass(), "file", null);
        setField(term17429, term17429.getClass(), "basePath", null);
        setField(term17429, term17429.getClass(), "fileSeparator", "/");
        setBooleanField(term17429, term17429.getClass(), "isInitialized", false);
        setField(term17429, term17429.getClass(), "includePropertyName", null);
        setField(term17429, term17429.getClass(), "keysAsListed", term17434);
        setField(term17429, term17429.getClass(), "table", term17438);
        setIntField(term17429, term17429.getClass(), "count", 0);
        setIntField(term17429, term17429.getClass(), "threshold", 8);
        setFloatField(term17429, term17429.getClass(), "loadFactor", 0.75F);
        setIntField(term17429, term17429.getClass(), "modCount", 0);
        setField(term17429, term17429.getClass(), "keySet", null);
        setField(term17429, term17429.getClass(), "entrySet", null);
        setField(term17429, term17429.getClass(), "values", null);
        setField(term17428, term17428.getClass(), "defaults", term17429);
        setField(term17428, term17428.getClass(), "file", "EeBVbzjcCI");
        setField(term17428, term17428.getClass(), "basePath", "UfQtPRyWRC");
        setField(term17428, term17428.getClass(), "fileSeparator", "/");
        setBooleanField(term17428, term17428.getClass(), "isInitialized", true);
        setField(term17428, term17428.getClass(), "includePropertyName", "FPvxVzzSvD");
        setField(term17428, term17428.getClass(), "keysAsListed", term17483);
        setIntField(term17622, term17622.getClass(), "hash", -728408903);
        setField(term17622, term17622.getClass(), "key", "java.lang.Object@b340cc3");
        setField(term17622, term17622.getClass(), "value", term17650);
        setField(term17622, term17622.getClass(), "next", null);
        setElement(term17621, 0, term17622);
        setIntField(term17651, term17651.getClass(), "hash", -1614021959);
        setField(term17651, term17651.getClass(), "key", "java.lang.Object@2e846300");
        setField(term17651, term17651.getClass(), "value", term17680);
        setField(term17651, term17651.getClass(), "next", null);
        setElement(term17621, 2, term17651);
        setIntField(term17681, term17681.getClass(), "hash", -2061472111);
        setField(term17681, term17681.getClass(), "key", "java.lang.Object@7cb59608");
        setField(term17681, term17681.getClass(), "value", term17710);
        setField(term17681, term17681.getClass(), "next", null);
        setElement(term17621, 7, term17681);
        setIntField(term17711, term17711.getClass(), "hash", -1405101855);
        setField(term17711, term17711.getClass(), "key", "java.lang.Object@17232a64");
        setField(term17711, term17711.getClass(), "value", term17740);
        setIntField(term17741, term17741.getClass(), "hash", -344902869);
        setField(term17741, term17741.getClass(), "key", "");
        setField(term17741, term17741.getClass(), "value", term17744);
        setField(term17741, term17741.getClass(), "next", null);
        setField(term17711, term17711.getClass(), "next", term17741);
        setElement(term17621, 10, term17711);
        setField(term17428, term17428.getClass(), "table", term17621);
        setIntField(term17428, term17428.getClass(), "count", -1476117757);
        setIntField(term17428, term17428.getClass(), "threshold", 8);
        setFloatField(term17428, term17428.getClass(), "loadFactor", 0.75F);
        setIntField(term17428, term17428.getClass(), "modCount", -341962975);
        setField(term17428, term17428.getClass(), "keySet", term17749);
        setField(term17428, term17428.getClass(), "entrySet", term17755);
        setField(term17428, term17428.getClass(), "values", term17761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHcwFgsGFC";
        try {
            callMethod(klass, "getShort", argTypes, term17428, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


