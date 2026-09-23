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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getProperties_107553450692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12204;
     Object term12296;

    public ExtendedProperties_getProperties_107553450692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12210 = new ArrayList();
        ArrayList term12259 = new ArrayList();
        HashMap term12269 = new HashMap();
        Set<Object> term49358 =  ((Map) term12269).keySet();
        HashSet term12268 = new HashSet((Collection<? extends Object>) term49358);
        HashMap term12275 = new HashMap();
        Set<Object> term49359 =  ((Map) term12275).keySet();
        HashSet term12274 = new HashSet((Collection<? extends Object>) term49359);
        ArrayList term12280 = new ArrayList();
        term12204 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12205 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12214 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12263 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term12205, term12205.getClass(), "defaults", null);
        setField(term12205, term12205.getClass(), "file", null);
        setField(term12205, term12205.getClass(), "basePath", null);
        setField(term12205, term12205.getClass(), "fileSeparator", "/");
        setBooleanField(term12205, term12205.getClass(), "isInitialized", false);
        setField(term12205, term12205.getClass(), "includePropertyName", null);
        setField(term12205, term12205.getClass(), "keysAsListed", term12210);
        setField(term12205, term12205.getClass(), "table", term12214);
        setIntField(term12205, term12205.getClass(), "count", 0);
        setIntField(term12205, term12205.getClass(), "threshold", 8);
        setFloatField(term12205, term12205.getClass(), "loadFactor", 0.75F);
        setIntField(term12205, term12205.getClass(), "modCount", 0);
        setField(term12205, term12205.getClass(), "keySet", null);
        setField(term12205, term12205.getClass(), "entrySet", null);
        setField(term12205, term12205.getClass(), "values", null);
        setField(term12204, term12204.getClass(), "defaults", term12205);
        setField(term12204, term12204.getClass(), "file", "JqXGgAhZPl");
        setField(term12204, term12204.getClass(), "basePath", "jiKYgYHqIS");
        setField(term12204, term12204.getClass(), "fileSeparator", "/");
        setBooleanField(term12204, term12204.getClass(), "isInitialized", true);
        setField(term12204, term12204.getClass(), "includePropertyName", "DfISiziTgG");
        setField(term12204, term12204.getClass(), "keysAsListed", term12259);
        setField(term12204, term12204.getClass(), "table", term12263);
        setIntField(term12204, term12204.getClass(), "count", 287287233);
        setIntField(term12204, term12204.getClass(), "threshold", 8);
        setFloatField(term12204, term12204.getClass(), "loadFactor", 0.75F);
        setIntField(term12204, term12204.getClass(), "modCount", 962840079);
        setField(term12204, term12204.getClass(), "keySet", term12268);
        setField(term12204, term12204.getClass(), "entrySet", term12274);
        setField(term12204, term12204.getClass(), "values", term12280);
        term12296 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = "XqgfKFvPSD";
        args[1] = term12296;
        try {
            callMethod(klass, "getProperties", argTypes, term12204, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


