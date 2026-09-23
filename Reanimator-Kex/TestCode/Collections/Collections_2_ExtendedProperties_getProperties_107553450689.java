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

public class ExtendedProperties_getProperties_107553450689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;
     Object term3106;

    public ExtendedProperties_getProperties_107553450689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3032 = new ArrayList();
        ArrayList term3069 = new ArrayList();
        HashMap term3079 = new HashMap();
        Set<Object> term13553 =  ((Map) term3079).keySet();
        HashSet term3078 = new HashSet((Collection<? extends Object>) term13553);
        HashMap term3085 = new HashMap();
        Set<Object> term13554 =  ((Map) term3085).keySet();
        HashSet term3084 = new HashSet((Collection<? extends Object>) term13554);
        ArrayList term3090 = new ArrayList();
        term3026 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3027 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3036 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3073 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3027, term3027.getClass(), "defaults", null);
        setField(term3027, term3027.getClass(), "file", null);
        setField(term3027, term3027.getClass(), "basePath", null);
        setField(term3027, term3027.getClass(), "fileSeparator", "/");
        setBooleanField(term3027, term3027.getClass(), "isInitialized", false);
        setField(term3027, term3027.getClass(), "keysAsListed", term3032);
        setField(term3027, term3027.getClass(), "table", term3036);
        setIntField(term3027, term3027.getClass(), "count", 0);
        setIntField(term3027, term3027.getClass(), "threshold", 8);
        setFloatField(term3027, term3027.getClass(), "loadFactor", 0.75F);
        setIntField(term3027, term3027.getClass(), "modCount", 0);
        setField(term3027, term3027.getClass(), "keySet", null);
        setField(term3027, term3027.getClass(), "entrySet", null);
        setField(term3027, term3027.getClass(), "values", null);
        setField(term3026, term3026.getClass(), "defaults", term3027);
        setField(term3026, term3026.getClass(), "file", "whBvTVIIlC");
        setField(term3026, term3026.getClass(), "basePath", "IgRJUzaCwW");
        setField(term3026, term3026.getClass(), "fileSeparator", "/");
        setBooleanField(term3026, term3026.getClass(), "isInitialized", true);
        setField(term3026, term3026.getClass(), "keysAsListed", term3069);
        setField(term3026, term3026.getClass(), "table", term3073);
        setIntField(term3026, term3026.getClass(), "count", 287287233);
        setIntField(term3026, term3026.getClass(), "threshold", 8);
        setFloatField(term3026, term3026.getClass(), "loadFactor", 0.75F);
        setIntField(term3026, term3026.getClass(), "modCount", 962840079);
        setField(term3026, term3026.getClass(), "keySet", term3078);
        setField(term3026, term3026.getClass(), "entrySet", term3084);
        setField(term3026, term3026.getClass(), "values", term3090);
        term3106 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = "JUmudUmaaV";
        args[1] = term3106;
        try {
            callMethod(klass, "getProperties", argTypes, term3026, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


