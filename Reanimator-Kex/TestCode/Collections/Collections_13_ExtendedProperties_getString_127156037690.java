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

public class ExtendedProperties_getString_127156037690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11486;
     Object term47993;

    public ExtendedProperties_getString_127156037690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11492 = new ArrayList();
        ArrayList term11541 = new ArrayList();
        HashMap term11551 = new HashMap();
        Set<Object> term48053 =  ((Map) term11551).keySet();
        HashSet term11550 = new HashSet((Collection<? extends Object>) term48053);
        HashMap term11557 = new HashMap();
        Set<Object> term48054 =  ((Map) term11557).keySet();
        HashSet term11556 = new HashSet((Collection<? extends Object>) term48054);
        ArrayList term11562 = new ArrayList();
        term11486 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term11487 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term11496 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term11545 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term11487, term11487.getClass(), "defaults", null);
        setField(term11487, term11487.getClass(), "file", null);
        setField(term11487, term11487.getClass(), "basePath", null);
        setField(term11487, term11487.getClass(), "fileSeparator", "/");
        setBooleanField(term11487, term11487.getClass(), "isInitialized", false);
        setField(term11487, term11487.getClass(), "includePropertyName", null);
        setField(term11487, term11487.getClass(), "keysAsListed", term11492);
        setField(term11487, term11487.getClass(), "table", term11496);
        setIntField(term11487, term11487.getClass(), "count", 0);
        setIntField(term11487, term11487.getClass(), "threshold", 8);
        setFloatField(term11487, term11487.getClass(), "loadFactor", 0.75F);
        setIntField(term11487, term11487.getClass(), "modCount", 0);
        setField(term11487, term11487.getClass(), "keySet", null);
        setField(term11487, term11487.getClass(), "entrySet", null);
        setField(term11487, term11487.getClass(), "values", null);
        setField(term11486, term11486.getClass(), "defaults", term11487);
        setField(term11486, term11486.getClass(), "file", "cAPeiZHKGJ");
        setField(term11486, term11486.getClass(), "basePath", "LvJFtLBaxj");
        setField(term11486, term11486.getClass(), "fileSeparator", "/");
        setBooleanField(term11486, term11486.getClass(), "isInitialized", true);
        setField(term11486, term11486.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term11486, term11486.getClass(), "keysAsListed", term11541);
        setField(term11486, term11486.getClass(), "table", term11545);
        setIntField(term11486, term11486.getClass(), "count", 1225272962);
        setIntField(term11486, term11486.getClass(), "threshold", 8);
        setFloatField(term11486, term11486.getClass(), "loadFactor", 0.75F);
        setIntField(term11486, term11486.getClass(), "modCount", 1324040357);
        setField(term11486, term11486.getClass(), "keySet", term11550);
        setField(term11486, term11486.getClass(), "entrySet", term11556);
        setField(term11486, term11486.getClass(), "values", term11562);
        ArrayList term47997 = new ArrayList();
        ArrayList term48008 = new ArrayList();
        HashMap term48012 = new HashMap();
        Set<Object> term48107 =  ((Map) term48012).keySet();
        HashSet term48011 = new HashSet((Collection<? extends Object>) term48107);
        HashMap term48014 = new HashMap();
        Set<Object> term48108 =  ((Map) term48014).keySet();
        HashSet term48013 = new HashSet((Collection<? extends Object>) term48108);
        ArrayList term48015 = new ArrayList();
        term47993 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term47994 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term47999 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term48010 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term47994, term47994.getClass(), "defaults", null);
        setField(term47994, term47994.getClass(), "file", null);
        setField(term47994, term47994.getClass(), "basePath", null);
        setField(term47994, term47994.getClass(), "fileSeparator", "/");
        setBooleanField(term47994, term47994.getClass(), "isInitialized", false);
        setField(term47994, term47994.getClass(), "includePropertyName", null);
        setField(term47994, term47994.getClass(), "keysAsListed", term47997);
        setField(term47994, term47994.getClass(), "table", term47999);
        setIntField(term47994, term47994.getClass(), "count", 0);
        setIntField(term47994, term47994.getClass(), "threshold", 8);
        setFloatField(term47994, term47994.getClass(), "loadFactor", 0.75F);
        setIntField(term47994, term47994.getClass(), "modCount", 0);
        setField(term47994, term47994.getClass(), "keySet", null);
        setField(term47994, term47994.getClass(), "entrySet", null);
        setField(term47994, term47994.getClass(), "values", null);
        setField(term47993, term47993.getClass(), "defaults", term47994);
        setField(term47993, term47993.getClass(), "file", "cAPeiZHKGJ");
        setField(term47993, term47993.getClass(), "basePath", "LvJFtLBaxj");
        setField(term47993, term47993.getClass(), "fileSeparator", "/");
        setBooleanField(term47993, term47993.getClass(), "isInitialized", true);
        setField(term47993, term47993.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term47993, term47993.getClass(), "keysAsListed", term48008);
        setField(term47993, term47993.getClass(), "table", term48010);
        setIntField(term47993, term47993.getClass(), "count", 1225272962);
        setIntField(term47993, term47993.getClass(), "threshold", 8);
        setFloatField(term47993, term47993.getClass(), "loadFactor", 0.75F);
        setIntField(term47993, term47993.getClass(), "modCount", 1324040357);
        setField(term47993, term47993.getClass(), "keySet", term48011);
        setField(term47993, term47993.getClass(), "entrySet", term48013);
        setField(term47993, term47993.getClass(), "values", term48015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "TimdotUuNC";
        args[1] = "PkWMRdJcBb";
        Object retValue = callMethod(klass, "getString", argTypes, term11486, args);
        assertTrue(recursiveEquals(term11486, term47993));
        assertTrue(recursiveEquals(retValue, "PkWMRdJcBb"));
    }

};


