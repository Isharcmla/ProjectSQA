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

public class ExtendedProperties_load_53824547373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932;

    public ExtendedProperties_load_53824547373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term938 = new ArrayList();
        ArrayList term975 = new ArrayList();
        HashMap term993 = new HashMap();
        Set<Object> term9729 =  ((Map) term993).keySet();
        HashSet term992 = new HashSet((Collection<? extends Object>) term9729);
        HashMap term999 = new HashMap();
        Set<Object> term9730 =  ((Map) term999).keySet();
        HashSet term998 = new HashSet((Collection<? extends Object>) term9730);
        ArrayList term1004 = new ArrayList();
        term932 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term933 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term942 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term979 = (Object[]) newArray("java.util.Hashtable$Entry", 47);
        Object term980 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term982 = newInstance(Class.forName("java.lang.Object"));
        Object term983 = newInstance(Class.forName("java.lang.Object"));
        Object term984 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term986 = newInstance(Class.forName("java.lang.Object"));
        Object term987 = newInstance(Class.forName("java.lang.Object"));
        setField(term933, term933.getClass(), "defaults", null);
        setField(term933, term933.getClass(), "file", null);
        setField(term933, term933.getClass(), "basePath", null);
        setField(term933, term933.getClass(), "fileSeparator", "/");
        setBooleanField(term933, term933.getClass(), "isInitialized", false);
        setField(term933, term933.getClass(), "keysAsListed", term938);
        setField(term933, term933.getClass(), "table", term942);
        setIntField(term933, term933.getClass(), "count", 0);
        setIntField(term933, term933.getClass(), "threshold", 8);
        setFloatField(term933, term933.getClass(), "loadFactor", 0.75F);
        setIntField(term933, term933.getClass(), "modCount", 0);
        setField(term933, term933.getClass(), "keySet", null);
        setField(term933, term933.getClass(), "entrySet", null);
        setField(term933, term933.getClass(), "values", null);
        setField(term932, term932.getClass(), "defaults", term933);
        setField(term932, term932.getClass(), "file", "xOEqzGAmDU");
        setField(term932, term932.getClass(), "basePath", "eZFUvlxvGV");
        setField(term932, term932.getClass(), "fileSeparator", "/");
        setBooleanField(term932, term932.getClass(), "isInitialized", true);
        setField(term932, term932.getClass(), "keysAsListed", term975);
        setIntField(term980, term980.getClass(), "hash", 69834160);
        setField(term980, term980.getClass(), "key", term982);
        setField(term980, term980.getClass(), "value", term983);
        setField(term980, term980.getClass(), "next", null);
        setElement(term979, 9, term980);
        setIntField(term984, term984.getClass(), "hash", 1075581736);
        setField(term984, term984.getClass(), "key", term986);
        setField(term984, term984.getClass(), "value", term987);
        setField(term984, term984.getClass(), "next", null);
        setElement(term979, 37, term984);
        setField(term932, term932.getClass(), "table", term979);
        setIntField(term932, term932.getClass(), "count", 1048535129);
        setIntField(term932, term932.getClass(), "threshold", 35);
        setFloatField(term932, term932.getClass(), "loadFactor", 0.75F);
        setIntField(term932, term932.getClass(), "modCount", -655067523);
        setField(term932, term932.getClass(), "keySet", term992);
        setField(term932, term932.getClass(), "entrySet", term998);
        setField(term932, term932.getClass(), "values", term1004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "BYqFIqCKAV";
        try {
            callMethod(klass, "load", argTypes, term932, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


