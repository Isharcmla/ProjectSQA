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

public class ExtendedProperties_load_1145503075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4121;

    public ExtendedProperties_load_1145503075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4127 = new ArrayList();
        ArrayList term4176 = new ArrayList();
        ((ArrayList) term4176).add("java.lang.Object@7b28c6d5");
        ((ArrayList) term4176).add("java.lang.Object@d467ab5");
        ((ArrayList) term4176).add("java.lang.Object@3808b0c");
        HashMap term4353 = new HashMap();
        Set<Object> term36925 =  ((Map) term4353).keySet();
        HashSet term4352 = new HashSet((Collection<? extends Object>) term36925);
        HashMap term4359 = new HashMap();
        Set<Object> term36926 =  ((Map) term4359).keySet();
        HashSet term4358 = new HashSet((Collection<? extends Object>) term36926);
        ArrayList term4364 = new ArrayList();
        term4121 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4122 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4131 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4259 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4260 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4288 = newInstance(Class.forName("java.lang.Object"));
        Object term4289 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4317 = newInstance(Class.forName("java.lang.Object"));
        Object term4318 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4347 = newInstance(Class.forName("java.lang.Object"));
        setField(term4122, term4122.getClass(), "defaults", null);
        setField(term4122, term4122.getClass(), "file", null);
        setField(term4122, term4122.getClass(), "basePath", null);
        setField(term4122, term4122.getClass(), "fileSeparator", "/");
        setBooleanField(term4122, term4122.getClass(), "isInitialized", false);
        setField(term4122, term4122.getClass(), "includePropertyName", null);
        setField(term4122, term4122.getClass(), "keysAsListed", term4127);
        setField(term4122, term4122.getClass(), "table", term4131);
        setIntField(term4122, term4122.getClass(), "count", 0);
        setIntField(term4122, term4122.getClass(), "threshold", 8);
        setFloatField(term4122, term4122.getClass(), "loadFactor", 0.75F);
        setIntField(term4122, term4122.getClass(), "modCount", 0);
        setField(term4122, term4122.getClass(), "keySet", null);
        setField(term4122, term4122.getClass(), "entrySet", null);
        setField(term4122, term4122.getClass(), "values", null);
        setField(term4121, term4121.getClass(), "defaults", term4122);
        setField(term4121, term4121.getClass(), "file", "vrQLuWIDJX");
        setField(term4121, term4121.getClass(), "basePath", "flxyYxBRtu");
        setField(term4121, term4121.getClass(), "fileSeparator", "/");
        setBooleanField(term4121, term4121.getClass(), "isInitialized", true);
        setField(term4121, term4121.getClass(), "includePropertyName", "OclPbYPkcH");
        setField(term4121, term4121.getClass(), "keysAsListed", term4176);
        setIntField(term4260, term4260.getClass(), "hash", 1077281238);
        setField(term4260, term4260.getClass(), "key", "java.lang.Object@d467ab5");
        setField(term4260, term4260.getClass(), "value", term4288);
        setField(term4260, term4260.getClass(), "next", null);
        setElement(term4259, 0, term4260);
        setIntField(term4289, term4289.getClass(), "hash", 648278555);
        setField(term4289, term4289.getClass(), "key", "java.lang.Object@3808b0c");
        setField(term4289, term4289.getClass(), "value", term4317);
        setField(term4289, term4289.getClass(), "next", null);
        setElement(term4259, 1, term4289);
        setIntField(term4318, term4318.getClass(), "hash", -24184350);
        setField(term4318, term4318.getClass(), "key", "java.lang.Object@7b28c6d5");
        setField(term4318, term4318.getClass(), "value", term4347);
        setField(term4318, term4318.getClass(), "next", null);
        setElement(term4259, 10, term4318);
        setField(term4121, term4121.getClass(), "table", term4259);
        setIntField(term4121, term4121.getClass(), "count", -1685132339);
        setIntField(term4121, term4121.getClass(), "threshold", 8);
        setFloatField(term4121, term4121.getClass(), "loadFactor", 0.75F);
        setIntField(term4121, term4121.getClass(), "modCount", -1456670394);
        setField(term4121, term4121.getClass(), "keySet", term4352);
        setField(term4121, term4121.getClass(), "entrySet", term4358);
        setField(term4121, term4121.getClass(), "values", term4364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "load", argTypes, term4121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


