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

public class ExtendedProperties_getList_212223581994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4124;
     Object term17005;
     Object term17001;

    public ExtendedProperties_getList_212223581994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4130 = new ArrayList();
        ArrayList term4179 = new ArrayList();
        HashMap term4193 = new HashMap();
        Set<Object> term17066 =  ((Map) term4193).keySet();
        HashSet term4192 = new HashSet((Collection<? extends Object>) term17066);
        HashMap term4199 = new HashMap();
        Set<Object> term17067 =  ((Map) term4199).keySet();
        HashSet term4198 = new HashSet((Collection<? extends Object>) term17067);
        ArrayList term4204 = new ArrayList();
        term4124 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4125 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4134 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4183 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4184 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4186 = newInstance(Class.forName("java.lang.Object"));
        Object term4187 = newInstance(Class.forName("java.lang.Object"));
        setField(term4125, term4125.getClass(), "defaults", null);
        setField(term4125, term4125.getClass(), "file", null);
        setField(term4125, term4125.getClass(), "basePath", null);
        setField(term4125, term4125.getClass(), "fileSeparator", "/");
        setBooleanField(term4125, term4125.getClass(), "isInitialized", false);
        setField(term4125, term4125.getClass(), "includePropertyName", null);
        setField(term4125, term4125.getClass(), "keysAsListed", term4130);
        setField(term4125, term4125.getClass(), "table", term4134);
        setIntField(term4125, term4125.getClass(), "count", 0);
        setIntField(term4125, term4125.getClass(), "threshold", 8);
        setFloatField(term4125, term4125.getClass(), "loadFactor", 0.75F);
        setIntField(term4125, term4125.getClass(), "modCount", 0);
        setField(term4125, term4125.getClass(), "keySet", null);
        setField(term4125, term4125.getClass(), "entrySet", null);
        setField(term4125, term4125.getClass(), "values", null);
        setField(term4124, term4124.getClass(), "defaults", term4125);
        setField(term4124, term4124.getClass(), "file", "fztQhjqwdP");
        setField(term4124, term4124.getClass(), "basePath", "eVpkWxjuki");
        setField(term4124, term4124.getClass(), "fileSeparator", "/");
        setBooleanField(term4124, term4124.getClass(), "isInitialized", false);
        setField(term4124, term4124.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term4124, term4124.getClass(), "keysAsListed", term4179);
        setIntField(term4184, term4184.getClass(), "hash", 1386848941);
        setField(term4184, term4184.getClass(), "key", term4186);
        setField(term4184, term4184.getClass(), "value", term4187);
        setField(term4184, term4184.getClass(), "next", null);
        setElement(term4183, 5, term4184);
        setField(term4124, term4124.getClass(), "table", term4183);
        setIntField(term4124, term4124.getClass(), "count", -481533956);
        setIntField(term4124, term4124.getClass(), "threshold", 8);
        setFloatField(term4124, term4124.getClass(), "loadFactor", 0.75F);
        setIntField(term4124, term4124.getClass(), "modCount", 1240914517);
        setField(term4124, term4124.getClass(), "keySet", term4192);
        setField(term4124, term4124.getClass(), "entrySet", term4198);
        setField(term4124, term4124.getClass(), "values", term4204);
        ArrayList term17009 = new ArrayList();
        ArrayList term17020 = new ArrayList();
        HashMap term17027 = new HashMap();
        Set<Object> term17110 =  ((Map) term17027).keySet();
        HashSet term17026 = new HashSet((Collection<? extends Object>) term17110);
        HashMap term17029 = new HashMap();
        Set<Object> term17111 =  ((Map) term17029).keySet();
        HashSet term17028 = new HashSet((Collection<? extends Object>) term17111);
        ArrayList term17030 = new ArrayList();
        term17005 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term17006 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term17011 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term17022 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17023 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term17024 = newInstance(Class.forName("java.lang.Object"));
        Object term17025 = newInstance(Class.forName("java.lang.Object"));
        setField(term17006, term17006.getClass(), "defaults", null);
        setField(term17006, term17006.getClass(), "file", null);
        setField(term17006, term17006.getClass(), "basePath", null);
        setField(term17006, term17006.getClass(), "fileSeparator", "/");
        setBooleanField(term17006, term17006.getClass(), "isInitialized", false);
        setField(term17006, term17006.getClass(), "includePropertyName", null);
        setField(term17006, term17006.getClass(), "keysAsListed", term17009);
        setField(term17006, term17006.getClass(), "table", term17011);
        setIntField(term17006, term17006.getClass(), "count", 0);
        setIntField(term17006, term17006.getClass(), "threshold", 8);
        setFloatField(term17006, term17006.getClass(), "loadFactor", 0.75F);
        setIntField(term17006, term17006.getClass(), "modCount", 0);
        setField(term17006, term17006.getClass(), "keySet", null);
        setField(term17006, term17006.getClass(), "entrySet", null);
        setField(term17006, term17006.getClass(), "values", null);
        setField(term17005, term17005.getClass(), "defaults", term17006);
        setField(term17005, term17005.getClass(), "file", "fztQhjqwdP");
        setField(term17005, term17005.getClass(), "basePath", "eVpkWxjuki");
        setField(term17005, term17005.getClass(), "fileSeparator", "/");
        setBooleanField(term17005, term17005.getClass(), "isInitialized", false);
        setField(term17005, term17005.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term17005, term17005.getClass(), "keysAsListed", term17020);
        setIntField(term17023, term17023.getClass(), "hash", 1386848941);
        setField(term17023, term17023.getClass(), "key", term17024);
        setField(term17023, term17023.getClass(), "value", term17025);
        setField(term17023, term17023.getClass(), "next", null);
        setElement(term17022, 5, term17023);
        setField(term17005, term17005.getClass(), "table", term17022);
        setIntField(term17005, term17005.getClass(), "count", -481533956);
        setIntField(term17005, term17005.getClass(), "threshold", 8);
        setFloatField(term17005, term17005.getClass(), "loadFactor", 0.75F);
        setIntField(term17005, term17005.getClass(), "modCount", 1240914517);
        setField(term17005, term17005.getClass(), "keySet", term17026);
        setField(term17005, term17005.getClass(), "entrySet", term17028);
        setField(term17005, term17005.getClass(), "values", term17030);
        term17001 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        Object retValue = callMethod(klass, "getList", argTypes, term4124, args);
        assertTrue(recursiveEquals(term4124, term17005));
        assertTrue(recursiveEquals(retValue, term17001));
    }

};


