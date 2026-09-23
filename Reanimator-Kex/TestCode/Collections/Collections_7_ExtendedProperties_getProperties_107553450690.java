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

public class ExtendedProperties_getProperties_107553450690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3536;
     Object term3628;

    public ExtendedProperties_getProperties_107553450690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3542 = new ArrayList();
        ArrayList term3591 = new ArrayList();
        HashMap term3601 = new HashMap();
        Set<Object> term16109 =  ((Map) term3601).keySet();
        HashSet term3600 = new HashSet((Collection<? extends Object>) term16109);
        HashMap term3607 = new HashMap();
        Set<Object> term16110 =  ((Map) term3607).keySet();
        HashSet term3606 = new HashSet((Collection<? extends Object>) term16110);
        ArrayList term3612 = new ArrayList();
        term3536 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3537 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3546 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3595 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3537, term3537.getClass(), "defaults", null);
        setField(term3537, term3537.getClass(), "file", null);
        setField(term3537, term3537.getClass(), "basePath", null);
        setField(term3537, term3537.getClass(), "fileSeparator", "/");
        setBooleanField(term3537, term3537.getClass(), "isInitialized", false);
        setField(term3537, term3537.getClass(), "includePropertyName", null);
        setField(term3537, term3537.getClass(), "keysAsListed", term3542);
        setField(term3537, term3537.getClass(), "table", term3546);
        setIntField(term3537, term3537.getClass(), "count", 0);
        setIntField(term3537, term3537.getClass(), "threshold", 8);
        setFloatField(term3537, term3537.getClass(), "loadFactor", 0.75F);
        setIntField(term3537, term3537.getClass(), "modCount", 0);
        setField(term3537, term3537.getClass(), "keySet", null);
        setField(term3537, term3537.getClass(), "entrySet", null);
        setField(term3537, term3537.getClass(), "values", null);
        setField(term3536, term3536.getClass(), "defaults", term3537);
        setField(term3536, term3536.getClass(), "file", "JqXGgAhZPl");
        setField(term3536, term3536.getClass(), "basePath", "jiKYgYHqIS");
        setField(term3536, term3536.getClass(), "fileSeparator", "/");
        setBooleanField(term3536, term3536.getClass(), "isInitialized", true);
        setField(term3536, term3536.getClass(), "includePropertyName", "DfISiziTgG");
        setField(term3536, term3536.getClass(), "keysAsListed", term3591);
        setField(term3536, term3536.getClass(), "table", term3595);
        setIntField(term3536, term3536.getClass(), "count", 287287233);
        setIntField(term3536, term3536.getClass(), "threshold", 8);
        setFloatField(term3536, term3536.getClass(), "loadFactor", 0.75F);
        setIntField(term3536, term3536.getClass(), "modCount", 962840079);
        setField(term3536, term3536.getClass(), "keySet", term3600);
        setField(term3536, term3536.getClass(), "entrySet", term3606);
        setField(term3536, term3536.getClass(), "values", term3612);
        term3628 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = "XqgfKFvPSD";
        args[1] = term3628;
        try {
            callMethod(klass, "getProperties", argTypes, term3536, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


