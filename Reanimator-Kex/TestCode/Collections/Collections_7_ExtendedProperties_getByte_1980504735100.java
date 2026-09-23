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

public class ExtendedProperties_getByte_1980504735100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5031;

    public ExtendedProperties_getByte_1980504735100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5037 = new ArrayList();
        ArrayList term5086 = new ArrayList();
        HashMap term5096 = new HashMap();
        Set<Object> term19182 =  ((Map) term5096).keySet();
        HashSet term5095 = new HashSet((Collection<? extends Object>) term19182);
        HashMap term5102 = new HashMap();
        Set<Object> term19183 =  ((Map) term5102).keySet();
        HashSet term5101 = new HashSet((Collection<? extends Object>) term19183);
        ArrayList term5107 = new ArrayList();
        term5031 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5032 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5041 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5090 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term5032, term5032.getClass(), "defaults", null);
        setField(term5032, term5032.getClass(), "file", null);
        setField(term5032, term5032.getClass(), "basePath", null);
        setField(term5032, term5032.getClass(), "fileSeparator", "/");
        setBooleanField(term5032, term5032.getClass(), "isInitialized", false);
        setField(term5032, term5032.getClass(), "includePropertyName", null);
        setField(term5032, term5032.getClass(), "keysAsListed", term5037);
        setField(term5032, term5032.getClass(), "table", term5041);
        setIntField(term5032, term5032.getClass(), "count", 0);
        setIntField(term5032, term5032.getClass(), "threshold", 8);
        setFloatField(term5032, term5032.getClass(), "loadFactor", 0.75F);
        setIntField(term5032, term5032.getClass(), "modCount", 0);
        setField(term5032, term5032.getClass(), "keySet", null);
        setField(term5032, term5032.getClass(), "entrySet", null);
        setField(term5032, term5032.getClass(), "values", null);
        setField(term5031, term5031.getClass(), "defaults", term5032);
        setField(term5031, term5031.getClass(), "file", "EYtfuJaxiM");
        setField(term5031, term5031.getClass(), "basePath", "gCWtLVKVVe");
        setField(term5031, term5031.getClass(), "fileSeparator", "/");
        setBooleanField(term5031, term5031.getClass(), "isInitialized", false);
        setField(term5031, term5031.getClass(), "includePropertyName", "fWKJoSoCwE");
        setField(term5031, term5031.getClass(), "keysAsListed", term5086);
        setField(term5031, term5031.getClass(), "table", term5090);
        setIntField(term5031, term5031.getClass(), "count", -1347665717);
        setIntField(term5031, term5031.getClass(), "threshold", 8);
        setFloatField(term5031, term5031.getClass(), "loadFactor", 0.75F);
        setIntField(term5031, term5031.getClass(), "modCount", -1888585309);
        setField(term5031, term5031.getClass(), "keySet", term5095);
        setField(term5031, term5031.getClass(), "entrySet", term5101);
        setField(term5031, term5031.getClass(), "values", term5107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        try {
            callMethod(klass, "getByte", argTypes, term5031, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


