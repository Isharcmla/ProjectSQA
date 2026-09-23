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

public class ExtendedProperties_getByte_1980504735102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16152;

    public ExtendedProperties_getByte_1980504735102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16158 = new ArrayList();
        ArrayList term16207 = new ArrayList();
        HashMap term16217 = new HashMap();
        Set<Object> term56974 =  ((Map) term16217).keySet();
        HashSet term16216 = new HashSet((Collection<? extends Object>) term56974);
        HashMap term16223 = new HashMap();
        Set<Object> term56975 =  ((Map) term16223).keySet();
        HashSet term16222 = new HashSet((Collection<? extends Object>) term56975);
        ArrayList term16228 = new ArrayList();
        term16152 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term16153 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term16162 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term16211 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term16153, term16153.getClass(), "defaults", null);
        setField(term16153, term16153.getClass(), "file", null);
        setField(term16153, term16153.getClass(), "basePath", null);
        setField(term16153, term16153.getClass(), "fileSeparator", "/");
        setBooleanField(term16153, term16153.getClass(), "isInitialized", false);
        setField(term16153, term16153.getClass(), "includePropertyName", null);
        setField(term16153, term16153.getClass(), "keysAsListed", term16158);
        setField(term16153, term16153.getClass(), "table", term16162);
        setIntField(term16153, term16153.getClass(), "count", 0);
        setIntField(term16153, term16153.getClass(), "threshold", 8);
        setFloatField(term16153, term16153.getClass(), "loadFactor", 0.75F);
        setIntField(term16153, term16153.getClass(), "modCount", 0);
        setField(term16153, term16153.getClass(), "keySet", null);
        setField(term16153, term16153.getClass(), "entrySet", null);
        setField(term16153, term16153.getClass(), "values", null);
        setField(term16152, term16152.getClass(), "defaults", term16153);
        setField(term16152, term16152.getClass(), "file", "EYtfuJaxiM");
        setField(term16152, term16152.getClass(), "basePath", "gCWtLVKVVe");
        setField(term16152, term16152.getClass(), "fileSeparator", "/");
        setBooleanField(term16152, term16152.getClass(), "isInitialized", false);
        setField(term16152, term16152.getClass(), "includePropertyName", "fWKJoSoCwE");
        setField(term16152, term16152.getClass(), "keysAsListed", term16207);
        setField(term16152, term16152.getClass(), "table", term16211);
        setIntField(term16152, term16152.getClass(), "count", -1347665717);
        setIntField(term16152, term16152.getClass(), "threshold", 8);
        setFloatField(term16152, term16152.getClass(), "loadFactor", 0.75F);
        setIntField(term16152, term16152.getClass(), "modCount", -1888585309);
        setField(term16152, term16152.getClass(), "keySet", term16216);
        setField(term16152, term16152.getClass(), "entrySet", term16222);
        setField(term16152, term16152.getClass(), "values", term16228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        try {
            callMethod(klass, "getByte", argTypes, term16152, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


