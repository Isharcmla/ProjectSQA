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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Short;

public class ExtendedProperties_getShort_194927783103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4829;
     Object term4913;
     Object term17469;

    public ExtendedProperties_getShort_194927783103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4835 = new ArrayList();
        ArrayList term4872 = new ArrayList();
        HashMap term4886 = new HashMap();
        Set<Object> term17518 =  ((Map) term4886).keySet();
        HashSet term4885 = new HashSet((Collection<? extends Object>) term17518);
        HashMap term4892 = new HashMap();
        Set<Object> term17519 =  ((Map) term4892).keySet();
        HashSet term4891 = new HashSet((Collection<? extends Object>) term17519);
        ArrayList term4897 = new ArrayList();
        term4829 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4830 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4839 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4876 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4877 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4879 = newInstance(Class.forName("java.lang.Object"));
        Object term4880 = newInstance(Class.forName("java.lang.Object"));
        setField(term4830, term4830.getClass(), "defaults", null);
        setField(term4830, term4830.getClass(), "file", null);
        setField(term4830, term4830.getClass(), "basePath", null);
        setField(term4830, term4830.getClass(), "fileSeparator", "/");
        setBooleanField(term4830, term4830.getClass(), "isInitialized", false);
        setField(term4830, term4830.getClass(), "keysAsListed", term4835);
        setField(term4830, term4830.getClass(), "table", term4839);
        setIntField(term4830, term4830.getClass(), "count", 0);
        setIntField(term4830, term4830.getClass(), "threshold", 8);
        setFloatField(term4830, term4830.getClass(), "loadFactor", 0.75F);
        setIntField(term4830, term4830.getClass(), "modCount", 0);
        setField(term4830, term4830.getClass(), "keySet", null);
        setField(term4830, term4830.getClass(), "entrySet", null);
        setField(term4830, term4830.getClass(), "values", null);
        setField(term4829, term4829.getClass(), "defaults", term4830);
        setField(term4829, term4829.getClass(), "file", "OEXDRUKcFl");
        setField(term4829, term4829.getClass(), "basePath", "RYdKCNNMBR");
        setField(term4829, term4829.getClass(), "fileSeparator", "/");
        setBooleanField(term4829, term4829.getClass(), "isInitialized", true);
        setField(term4829, term4829.getClass(), "keysAsListed", term4872);
        setIntField(term4877, term4877.getClass(), "hash", 1011064903);
        setField(term4877, term4877.getClass(), "key", term4879);
        setField(term4877, term4877.getClass(), "value", term4880);
        setField(term4877, term4877.getClass(), "next", null);
        setElement(term4876, 2, term4877);
        setField(term4829, term4829.getClass(), "table", term4876);
        setIntField(term4829, term4829.getClass(), "count", -1801760682);
        setIntField(term4829, term4829.getClass(), "threshold", 8);
        setFloatField(term4829, term4829.getClass(), "loadFactor", 0.75F);
        setIntField(term4829, term4829.getClass(), "modCount", 1141317872);
        setField(term4829, term4829.getClass(), "keySet", term4885);
        setField(term4829, term4829.getClass(), "entrySet", term4891);
        setField(term4829, term4829.getClass(), "values", term4897);
        term4913 = new Short((short) 9519);
        ArrayList term17473 = new ArrayList();
        ArrayList term17482 = new ArrayList();
        HashMap term17489 = new HashMap();
        Set<Object> term17552 =  ((Map) term17489).keySet();
        HashSet term17488 = new HashSet((Collection<? extends Object>) term17552);
        HashMap term17491 = new HashMap();
        Set<Object> term17553 =  ((Map) term17491).keySet();
        HashSet term17490 = new HashSet((Collection<? extends Object>) term17553);
        ArrayList term17492 = new ArrayList();
        term17469 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term17470 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term17475 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term17484 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17485 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17486 = newInstance(Class.forName("java.lang.Object"));
        Object term17487 = newInstance(Class.forName("java.lang.Object"));
        setField(term17470, term17470.getClass(), "defaults", null);
        setField(term17470, term17470.getClass(), "file", null);
        setField(term17470, term17470.getClass(), "basePath", null);
        setField(term17470, term17470.getClass(), "fileSeparator", "/");
        setBooleanField(term17470, term17470.getClass(), "isInitialized", false);
        setField(term17470, term17470.getClass(), "keysAsListed", term17473);
        setField(term17470, term17470.getClass(), "table", term17475);
        setIntField(term17470, term17470.getClass(), "count", 0);
        setIntField(term17470, term17470.getClass(), "threshold", 8);
        setFloatField(term17470, term17470.getClass(), "loadFactor", 0.75F);
        setIntField(term17470, term17470.getClass(), "modCount", 0);
        setField(term17470, term17470.getClass(), "keySet", null);
        setField(term17470, term17470.getClass(), "entrySet", null);
        setField(term17470, term17470.getClass(), "values", null);
        setField(term17469, term17469.getClass(), "defaults", term17470);
        setField(term17469, term17469.getClass(), "file", "OEXDRUKcFl");
        setField(term17469, term17469.getClass(), "basePath", "RYdKCNNMBR");
        setField(term17469, term17469.getClass(), "fileSeparator", "/");
        setBooleanField(term17469, term17469.getClass(), "isInitialized", true);
        setField(term17469, term17469.getClass(), "keysAsListed", term17482);
        setIntField(term17485, term17485.getClass(), "hash", 1011064903);
        setField(term17485, term17485.getClass(), "key", term17486);
        setField(term17485, term17485.getClass(), "value", term17487);
        setField(term17485, term17485.getClass(), "next", null);
        setElement(term17484, 2, term17485);
        setField(term17469, term17469.getClass(), "table", term17484);
        setIntField(term17469, term17469.getClass(), "count", -1801760682);
        setIntField(term17469, term17469.getClass(), "threshold", 8);
        setFloatField(term17469, term17469.getClass(), "loadFactor", 0.75F);
        setIntField(term17469, term17469.getClass(), "modCount", 1141317872);
        setField(term17469, term17469.getClass(), "keySet", term17488);
        setField(term17469, term17469.getClass(), "entrySet", term17490);
        setField(term17469, term17469.getClass(), "values", term17492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = "yGtHPyvYiQ";
        args[1] = term4913;
        Object retValue = callMethod(klass, "getShort", argTypes, term4829, args);
        assertTrue(recursiveEquals(term4829, term17469));
        assertTrue(recursiveEquals(term4913, (short) 9519));
        assertTrue(recursiveEquals(retValue, (short) 9519));
    }

};


