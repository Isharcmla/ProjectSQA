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
     Object term17695;

    public ExtendedProperties_getShort_467552751105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17701 = new ArrayList();
        ArrayList term17750 = new ArrayList();
        ((ArrayList) term17750).add("java.lang.Object@54692be3");
        ((ArrayList) term17750).add("java.lang.Object@47bf4acd");
        ((ArrayList) term17750).add("java.lang.Object@7fdd0bc9");
        ((ArrayList) term17750).add("java.lang.Object@6a85812e");
        ((ArrayList) term17750).add("java.lang.Object@772e99ae");
        HashMap term17993 = new HashMap();
        Set<Object> term60156 =  ((Map) term17993).keySet();
        HashSet term17992 = new HashSet((Collection<? extends Object>) term60156);
        HashMap term17999 = new HashMap();
        Set<Object> term60157 =  ((Map) term17999).keySet();
        HashSet term17998 = new HashSet((Collection<? extends Object>) term60157);
        ArrayList term18004 = new ArrayList();
        term17695 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term17696 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term17705 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term17889 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17890 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17919 = newInstance(Class.forName("java.lang.Object"));
        Object term17920 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17923 = newInstance(Class.forName("java.lang.Object"));
        Object term17924 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17953 = newInstance(Class.forName("java.lang.Object"));
        Object term17954 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17983 = newInstance(Class.forName("java.lang.Object"));
        Object term17984 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17987 = newInstance(Class.forName("java.lang.Object"));
        setField(term17696, term17696.getClass(), "defaults", null);
        setField(term17696, term17696.getClass(), "file", null);
        setField(term17696, term17696.getClass(), "basePath", null);
        setField(term17696, term17696.getClass(), "fileSeparator", "/");
        setBooleanField(term17696, term17696.getClass(), "isInitialized", false);
        setField(term17696, term17696.getClass(), "includePropertyName", null);
        setField(term17696, term17696.getClass(), "keysAsListed", term17701);
        setField(term17696, term17696.getClass(), "table", term17705);
        setIntField(term17696, term17696.getClass(), "count", 0);
        setIntField(term17696, term17696.getClass(), "threshold", 8);
        setFloatField(term17696, term17696.getClass(), "loadFactor", 0.75F);
        setIntField(term17696, term17696.getClass(), "modCount", 0);
        setField(term17696, term17696.getClass(), "keySet", null);
        setField(term17696, term17696.getClass(), "entrySet", null);
        setField(term17696, term17696.getClass(), "values", null);
        setField(term17695, term17695.getClass(), "defaults", term17696);
        setField(term17695, term17695.getClass(), "file", "EeBVbzjcCI");
        setField(term17695, term17695.getClass(), "basePath", "UfQtPRyWRC");
        setField(term17695, term17695.getClass(), "fileSeparator", "/");
        setBooleanField(term17695, term17695.getClass(), "isInitialized", true);
        setField(term17695, term17695.getClass(), "includePropertyName", "FPvxVzzSvD");
        setField(term17695, term17695.getClass(), "keysAsListed", term17750);
        setIntField(term17890, term17890.getClass(), "hash", 1808185953);
        setField(term17890, term17890.getClass(), "key", "java.lang.Object@6a85812e");
        setField(term17890, term17890.getClass(), "value", term17919);
        setIntField(term17920, term17920.getClass(), "hash", 949721698);
        setField(term17920, term17920.getClass(), "key", "");
        setField(term17920, term17920.getClass(), "value", term17923);
        setField(term17920, term17920.getClass(), "next", null);
        setField(term17890, term17890.getClass(), "next", term17920);
        setElement(term17889, 2, term17890);
        setIntField(term17924, term17924.getClass(), "hash", -1271278707);
        setField(term17924, term17924.getClass(), "key", "java.lang.Object@54692be3");
        setField(term17924, term17924.getClass(), "value", term17953);
        setField(term17924, term17924.getClass(), "next", null);
        setElement(term17889, 7, term17924);
        setIntField(term17954, term17954.getClass(), "hash", 508173092);
        setField(term17954, term17954.getClass(), "key", "java.lang.Object@772e99ae");
        setField(term17954, term17954.getClass(), "value", term17983);
        setIntField(term17984, term17984.getClass(), "hash", 701478468);
        setField(term17984, term17984.getClass(), "key", "");
        setField(term17984, term17984.getClass(), "value", term17987);
        setField(term17984, term17984.getClass(), "next", null);
        setField(term17954, term17954.getClass(), "next", term17984);
        setElement(term17889, 9, term17954);
        setField(term17695, term17695.getClass(), "table", term17889);
        setIntField(term17695, term17695.getClass(), "count", -1476117757);
        setIntField(term17695, term17695.getClass(), "threshold", 8);
        setFloatField(term17695, term17695.getClass(), "loadFactor", 0.75F);
        setIntField(term17695, term17695.getClass(), "modCount", -341962975);
        setField(term17695, term17695.getClass(), "keySet", term17992);
        setField(term17695, term17695.getClass(), "entrySet", term17998);
        setField(term17695, term17695.getClass(), "values", term18004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHcwFgsGFC";
        try {
            callMethod(klass, "getShort", argTypes, term17695, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


