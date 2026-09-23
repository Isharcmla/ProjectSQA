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

public class ExtendedProperties_load_53824547376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4383;

    public ExtendedProperties_load_53824547376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4389 = new ArrayList();
        ArrayList term4438 = new ArrayList();
        ((ArrayList) term4438).add("java.lang.Object@1de30949");
        ((ArrayList) term4438).add("java.lang.Object@705b7c38");
        HashMap term4562 = new HashMap();
        Set<Object> term36732 =  ((Map) term4562).keySet();
        HashSet term4561 = new HashSet((Collection<? extends Object>) term36732);
        HashMap term4568 = new HashMap();
        Set<Object> term36733 =  ((Map) term4568).keySet();
        HashSet term4567 = new HashSet((Collection<? extends Object>) term36733);
        ArrayList term4573 = new ArrayList();
        term4383 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4384 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4393 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4496 = (Object[]) newArray("java.util.Hashtable$Entry", 47);
        Object term4497 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4526 = newInstance(Class.forName("java.lang.Object"));
        Object term4527 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4556 = newInstance(Class.forName("java.lang.Object"));
        setField(term4384, term4384.getClass(), "defaults", null);
        setField(term4384, term4384.getClass(), "file", null);
        setField(term4384, term4384.getClass(), "basePath", null);
        setField(term4384, term4384.getClass(), "fileSeparator", "/");
        setBooleanField(term4384, term4384.getClass(), "isInitialized", false);
        setField(term4384, term4384.getClass(), "includePropertyName", null);
        setField(term4384, term4384.getClass(), "keysAsListed", term4389);
        setField(term4384, term4384.getClass(), "table", term4393);
        setIntField(term4384, term4384.getClass(), "count", 0);
        setIntField(term4384, term4384.getClass(), "threshold", 8);
        setFloatField(term4384, term4384.getClass(), "loadFactor", 0.75F);
        setIntField(term4384, term4384.getClass(), "modCount", 0);
        setField(term4384, term4384.getClass(), "keySet", null);
        setField(term4384, term4384.getClass(), "entrySet", null);
        setField(term4384, term4384.getClass(), "values", null);
        setField(term4383, term4383.getClass(), "defaults", term4384);
        setField(term4383, term4383.getClass(), "file", "IoAlmYsBwc");
        setField(term4383, term4383.getClass(), "basePath", "TEParAifyi");
        setField(term4383, term4383.getClass(), "fileSeparator", "/");
        setBooleanField(term4383, term4383.getClass(), "isInitialized", true);
        setField(term4383, term4383.getClass(), "includePropertyName", "OWDIEULEFu");
        setField(term4383, term4383.getClass(), "keysAsListed", term4438);
        setIntField(term4497, term4497.getClass(), "hash", 1337846748);
        setField(term4497, term4497.getClass(), "key", "java.lang.Object@1de30949");
        setField(term4497, term4497.getClass(), "value", term4526);
        setField(term4497, term4497.getClass(), "next", null);
        setElement(term4496, 20, term4497);
        setIntField(term4527, term4527.getClass(), "hash", -1326289180);
        setField(term4527, term4527.getClass(), "key", "java.lang.Object@705b7c38");
        setField(term4527, term4527.getClass(), "value", term4556);
        setField(term4527, term4527.getClass(), "next", null);
        setElement(term4496, 34, term4527);
        setField(term4383, term4383.getClass(), "table", term4496);
        setIntField(term4383, term4383.getClass(), "count", 1048535129);
        setIntField(term4383, term4383.getClass(), "threshold", 35);
        setFloatField(term4383, term4383.getClass(), "loadFactor", 0.75F);
        setIntField(term4383, term4383.getClass(), "modCount", -655067523);
        setField(term4383, term4383.getClass(), "keySet", term4561);
        setField(term4383, term4383.getClass(), "entrySet", term4567);
        setField(term4383, term4383.getClass(), "values", term4573);
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
            callMethod(klass, "load", argTypes, term4383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


