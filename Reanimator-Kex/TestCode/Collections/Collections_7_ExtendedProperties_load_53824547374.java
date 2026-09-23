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
import java.lang.NullPointerException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_load_53824547374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;

    public ExtendedProperties_load_53824547374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1072 = new ArrayList();
        ArrayList term1121 = new ArrayList();
        HashMap term1139 = new HashMap();
        Set<Object> term11731 =  ((Map) term1139).keySet();
        HashSet term1138 = new HashSet((Collection<? extends Object>) term11731);
        HashMap term1145 = new HashMap();
        Set<Object> term11732 =  ((Map) term1145).keySet();
        HashSet term1144 = new HashSet((Collection<? extends Object>) term11732);
        ArrayList term1150 = new ArrayList();
        term1066 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1067 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1076 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1125 = (Object[]) newArray("java.util.Hashtable$Entry", 47);
        Object term1126 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1128 = newInstance(Class.forName("java.lang.Object"));
        Object term1129 = newInstance(Class.forName("java.lang.Object"));
        Object term1130 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1132 = newInstance(Class.forName("java.lang.Object"));
        Object term1133 = newInstance(Class.forName("java.lang.Object"));
        setField(term1067, term1067.getClass(), "defaults", null);
        setField(term1067, term1067.getClass(), "file", null);
        setField(term1067, term1067.getClass(), "basePath", null);
        setField(term1067, term1067.getClass(), "fileSeparator", "/");
        setBooleanField(term1067, term1067.getClass(), "isInitialized", false);
        setField(term1067, term1067.getClass(), "includePropertyName", null);
        setField(term1067, term1067.getClass(), "keysAsListed", term1072);
        setField(term1067, term1067.getClass(), "table", term1076);
        setIntField(term1067, term1067.getClass(), "count", 0);
        setIntField(term1067, term1067.getClass(), "threshold", 8);
        setFloatField(term1067, term1067.getClass(), "loadFactor", 0.75F);
        setIntField(term1067, term1067.getClass(), "modCount", 0);
        setField(term1067, term1067.getClass(), "keySet", null);
        setField(term1067, term1067.getClass(), "entrySet", null);
        setField(term1067, term1067.getClass(), "values", null);
        setField(term1066, term1066.getClass(), "defaults", term1067);
        setField(term1066, term1066.getClass(), "file", "IoAlmYsBwc");
        setField(term1066, term1066.getClass(), "basePath", "TEParAifyi");
        setField(term1066, term1066.getClass(), "fileSeparator", "/");
        setBooleanField(term1066, term1066.getClass(), "isInitialized", true);
        setField(term1066, term1066.getClass(), "includePropertyName", "OWDIEULEFu");
        setField(term1066, term1066.getClass(), "keysAsListed", term1121);
        setIntField(term1126, term1126.getClass(), "hash", 1237996218);
        setField(term1126, term1126.getClass(), "key", term1128);
        setField(term1126, term1126.getClass(), "value", term1129);
        setField(term1126, term1126.getClass(), "next", null);
        setElement(term1125, 3, term1126);
        setIntField(term1130, term1130.getClass(), "hash", 406879073);
        setField(term1130, term1130.getClass(), "key", term1132);
        setField(term1130, term1130.getClass(), "value", term1133);
        setField(term1130, term1130.getClass(), "next", null);
        setElement(term1125, 26, term1130);
        setField(term1066, term1066.getClass(), "table", term1125);
        setIntField(term1066, term1066.getClass(), "count", 1048535129);
        setIntField(term1066, term1066.getClass(), "threshold", 35);
        setFloatField(term1066, term1066.getClass(), "loadFactor", 0.75F);
        setIntField(term1066, term1066.getClass(), "modCount", -655067523);
        setField(term1066, term1066.getClass(), "keySet", term1138);
        setField(term1066, term1066.getClass(), "entrySet", term1144);
        setField(term1066, term1066.getClass(), "values", term1150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "dWRymuLBtr";
        try {
            callMethod(klass, "load", argTypes, term1066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


