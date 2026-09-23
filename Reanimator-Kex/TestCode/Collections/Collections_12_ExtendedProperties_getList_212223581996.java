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

public class ExtendedProperties_getList_212223581996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13507;
     Object term52216;
     Object term52212;

    public ExtendedProperties_getList_212223581996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13513 = new ArrayList();
        ArrayList term13562 = new ArrayList();
        ((ArrayList) term13562).add("java.lang.Object@443ebd04");
        HashMap term13629 = new HashMap();
        Set<Object> term52330 =  ((Map) term13629).keySet();
        HashSet term13628 = new HashSet((Collection<? extends Object>) term52330);
        HashMap term13635 = new HashMap();
        Set<Object> term52331 =  ((Map) term13635).keySet();
        HashSet term13634 = new HashSet((Collection<? extends Object>) term52331);
        ArrayList term13640 = new ArrayList();
        term13507 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13508 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13517 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13593 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13594 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13623 = newInstance(Class.forName("java.lang.Object"));
        setField(term13508, term13508.getClass(), "defaults", null);
        setField(term13508, term13508.getClass(), "file", null);
        setField(term13508, term13508.getClass(), "basePath", null);
        setField(term13508, term13508.getClass(), "fileSeparator", "/");
        setBooleanField(term13508, term13508.getClass(), "isInitialized", false);
        setField(term13508, term13508.getClass(), "includePropertyName", null);
        setField(term13508, term13508.getClass(), "keysAsListed", term13513);
        setField(term13508, term13508.getClass(), "table", term13517);
        setIntField(term13508, term13508.getClass(), "count", 0);
        setIntField(term13508, term13508.getClass(), "threshold", 8);
        setFloatField(term13508, term13508.getClass(), "loadFactor", 0.75F);
        setIntField(term13508, term13508.getClass(), "modCount", 0);
        setField(term13508, term13508.getClass(), "keySet", null);
        setField(term13508, term13508.getClass(), "entrySet", null);
        setField(term13508, term13508.getClass(), "values", null);
        setField(term13507, term13507.getClass(), "defaults", term13508);
        setField(term13507, term13507.getClass(), "file", "fztQhjqwdP");
        setField(term13507, term13507.getClass(), "basePath", "eVpkWxjuki");
        setField(term13507, term13507.getClass(), "fileSeparator", "/");
        setBooleanField(term13507, term13507.getClass(), "isInitialized", true);
        setField(term13507, term13507.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term13507, term13507.getClass(), "keysAsListed", term13562);
        setIntField(term13594, term13594.getClass(), "hash", 1237055973);
        setField(term13594, term13594.getClass(), "key", "java.lang.Object@443ebd04");
        setField(term13594, term13594.getClass(), "value", term13623);
        setField(term13594, term13594.getClass(), "next", null);
        setElement(term13593, 10, term13594);
        setField(term13507, term13507.getClass(), "table", term13593);
        setIntField(term13507, term13507.getClass(), "count", -481533956);
        setIntField(term13507, term13507.getClass(), "threshold", 8);
        setFloatField(term13507, term13507.getClass(), "loadFactor", 0.75F);
        setIntField(term13507, term13507.getClass(), "modCount", 1240914517);
        setField(term13507, term13507.getClass(), "keySet", term13628);
        setField(term13507, term13507.getClass(), "entrySet", term13634);
        setField(term13507, term13507.getClass(), "values", term13640);
        ArrayList term52220 = new ArrayList();
        ArrayList term52231 = new ArrayList();
        ((ArrayList) term52231).add("java.lang.Object@443ebd04");
        HashMap term52241 = new HashMap();
        Set<Object> term52424 =  ((Map) term52241).keySet();
        HashSet term52240 = new HashSet((Collection<? extends Object>) term52424);
        HashMap term52243 = new HashMap();
        Set<Object> term52425 =  ((Map) term52243).keySet();
        HashSet term52242 = new HashSet((Collection<? extends Object>) term52425);
        ArrayList term52244 = new ArrayList();
        term52216 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term52217 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term52222 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term52235 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term52236 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term52239 = newInstance(Class.forName("java.lang.Object"));
        setField(term52217, term52217.getClass(), "defaults", null);
        setField(term52217, term52217.getClass(), "file", null);
        setField(term52217, term52217.getClass(), "basePath", null);
        setField(term52217, term52217.getClass(), "fileSeparator", "/");
        setBooleanField(term52217, term52217.getClass(), "isInitialized", false);
        setField(term52217, term52217.getClass(), "includePropertyName", null);
        setField(term52217, term52217.getClass(), "keysAsListed", term52220);
        setField(term52217, term52217.getClass(), "table", term52222);
        setIntField(term52217, term52217.getClass(), "count", 0);
        setIntField(term52217, term52217.getClass(), "threshold", 8);
        setFloatField(term52217, term52217.getClass(), "loadFactor", 0.75F);
        setIntField(term52217, term52217.getClass(), "modCount", 0);
        setField(term52217, term52217.getClass(), "keySet", null);
        setField(term52217, term52217.getClass(), "entrySet", null);
        setField(term52217, term52217.getClass(), "values", null);
        setField(term52216, term52216.getClass(), "defaults", term52217);
        setField(term52216, term52216.getClass(), "file", "fztQhjqwdP");
        setField(term52216, term52216.getClass(), "basePath", "eVpkWxjuki");
        setField(term52216, term52216.getClass(), "fileSeparator", "/");
        setBooleanField(term52216, term52216.getClass(), "isInitialized", true);
        setField(term52216, term52216.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term52216, term52216.getClass(), "keysAsListed", term52231);
        setIntField(term52236, term52236.getClass(), "hash", 1237055973);
        setField(term52236, term52236.getClass(), "key", "java.lang.Object@443ebd04");
        setField(term52236, term52236.getClass(), "value", term52239);
        setField(term52236, term52236.getClass(), "next", null);
        setElement(term52235, 10, term52236);
        setField(term52216, term52216.getClass(), "table", term52235);
        setIntField(term52216, term52216.getClass(), "count", -481533956);
        setIntField(term52216, term52216.getClass(), "threshold", 8);
        setFloatField(term52216, term52216.getClass(), "loadFactor", 0.75F);
        setIntField(term52216, term52216.getClass(), "modCount", 1240914517);
        setField(term52216, term52216.getClass(), "keySet", term52240);
        setField(term52216, term52216.getClass(), "entrySet", term52242);
        setField(term52216, term52216.getClass(), "values", term52244);
        term52212 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        Object retValue = callMethod(klass, "getList", argTypes, term13507, args);
        assertTrue(recursiveEquals(term13507, term52216));
        assertTrue(recursiveEquals(retValue, term52212));
    }

};


