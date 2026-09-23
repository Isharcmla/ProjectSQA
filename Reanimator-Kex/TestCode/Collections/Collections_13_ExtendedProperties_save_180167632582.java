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

public class ExtendedProperties_save_180167632582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7083;
     Object term40809;

    public ExtendedProperties_save_180167632582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7089 = new ArrayList();
        ArrayList term7138 = new ArrayList();
        ((ArrayList) term7138).add("java.lang.Object@2c0e9086");
        ((ArrayList) term7138).add("java.lang.Object@378a80df");
        ((ArrayList) term7138).add("java.lang.Object@6a87e141");
        HashMap term7319 = new HashMap();
        Set<Object> term41035 =  ((Map) term7319).keySet();
        HashSet term7318 = new HashSet((Collection<? extends Object>) term41035);
        HashMap term7325 = new HashMap();
        Set<Object> term41036 =  ((Map) term7325).keySet();
        HashSet term7324 = new HashSet((Collection<? extends Object>) term41036);
        ArrayList term7330 = new ArrayList();
        term7083 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7084 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7093 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term7223 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term7224 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7253 = newInstance(Class.forName("java.lang.Object"));
        Object term7254 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7283 = newInstance(Class.forName("java.lang.Object"));
        Object term7284 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7313 = newInstance(Class.forName("java.lang.Object"));
        setField(term7084, term7084.getClass(), "defaults", null);
        setField(term7084, term7084.getClass(), "file", null);
        setField(term7084, term7084.getClass(), "basePath", null);
        setField(term7084, term7084.getClass(), "fileSeparator", "/");
        setBooleanField(term7084, term7084.getClass(), "isInitialized", false);
        setField(term7084, term7084.getClass(), "includePropertyName", null);
        setField(term7084, term7084.getClass(), "keysAsListed", term7089);
        setField(term7084, term7084.getClass(), "table", term7093);
        setIntField(term7084, term7084.getClass(), "count", 0);
        setIntField(term7084, term7084.getClass(), "threshold", 8);
        setFloatField(term7084, term7084.getClass(), "loadFactor", 0.75F);
        setIntField(term7084, term7084.getClass(), "modCount", 0);
        setField(term7084, term7084.getClass(), "keySet", null);
        setField(term7084, term7084.getClass(), "entrySet", null);
        setField(term7084, term7084.getClass(), "values", null);
        setField(term7083, term7083.getClass(), "defaults", term7084);
        setField(term7083, term7083.getClass(), "file", "UoYtihxVaS");
        setField(term7083, term7083.getClass(), "basePath", "JDswTTCZHV");
        setField(term7083, term7083.getClass(), "fileSeparator", "/");
        setBooleanField(term7083, term7083.getClass(), "isInitialized", true);
        setField(term7083, term7083.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term7083, term7083.getClass(), "keysAsListed", term7138);
        setIntField(term7224, term7224.getClass(), "hash", 722244040);
        setField(term7224, term7224.getClass(), "key", "java.lang.Object@2c0e9086");
        setField(term7224, term7224.getClass(), "value", term7253);
        setField(term7224, term7224.getClass(), "next", null);
        setElement(term7223, 1, term7224);
        setIntField(term7254, term7254.getClass(), "hash", 1811373600);
        setField(term7254, term7254.getClass(), "key", "java.lang.Object@6a87e141");
        setField(term7254, term7254.getClass(), "value", term7283);
        setField(term7254, term7254.getClass(), "next", null);
        setElement(term7223, 3, term7254);
        setIntField(term7284, term7284.getClass(), "hash", -2000058476);
        setField(term7284, term7284.getClass(), "key", "java.lang.Object@378a80df");
        setField(term7284, term7284.getClass(), "value", term7313);
        setField(term7284, term7284.getClass(), "next", null);
        setElement(term7223, 4, term7284);
        setField(term7083, term7083.getClass(), "table", term7223);
        setIntField(term7083, term7083.getClass(), "count", -469968301);
        setIntField(term7083, term7083.getClass(), "threshold", 8);
        setFloatField(term7083, term7083.getClass(), "loadFactor", 0.75F);
        setIntField(term7083, term7083.getClass(), "modCount", -1145578963);
        setField(term7083, term7083.getClass(), "keySet", term7318);
        setField(term7083, term7083.getClass(), "entrySet", term7324);
        setField(term7083, term7083.getClass(), "values", term7330);
        ArrayList term40813 = new ArrayList();
        ArrayList term40824 = new ArrayList();
        ((ArrayList) term40824).add("java.lang.Object@2c0e9086");
        ((ArrayList) term40824).add("java.lang.Object@378a80df");
        ((ArrayList) term40824).add("java.lang.Object@6a87e141");
        HashMap term40846 = new HashMap();
        Set<Object> term41229 =  ((Map) term40846).keySet();
        HashSet term40845 = new HashSet((Collection<? extends Object>) term41229);
        HashMap term40848 = new HashMap();
        Set<Object> term41230 =  ((Map) term40848).keySet();
        HashSet term40847 = new HashSet((Collection<? extends Object>) term41230);
        ArrayList term40849 = new ArrayList();
        term40809 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term40810 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term40815 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term40832 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term40833 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40836 = newInstance(Class.forName("java.lang.Object"));
        Object term40837 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40840 = newInstance(Class.forName("java.lang.Object"));
        Object term40841 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term40844 = newInstance(Class.forName("java.lang.Object"));
        setField(term40810, term40810.getClass(), "defaults", null);
        setField(term40810, term40810.getClass(), "file", null);
        setField(term40810, term40810.getClass(), "basePath", null);
        setField(term40810, term40810.getClass(), "fileSeparator", "/");
        setBooleanField(term40810, term40810.getClass(), "isInitialized", false);
        setField(term40810, term40810.getClass(), "includePropertyName", null);
        setField(term40810, term40810.getClass(), "keysAsListed", term40813);
        setField(term40810, term40810.getClass(), "table", term40815);
        setIntField(term40810, term40810.getClass(), "count", 0);
        setIntField(term40810, term40810.getClass(), "threshold", 8);
        setFloatField(term40810, term40810.getClass(), "loadFactor", 0.75F);
        setIntField(term40810, term40810.getClass(), "modCount", 0);
        setField(term40810, term40810.getClass(), "keySet", null);
        setField(term40810, term40810.getClass(), "entrySet", null);
        setField(term40810, term40810.getClass(), "values", null);
        setField(term40809, term40809.getClass(), "defaults", term40810);
        setField(term40809, term40809.getClass(), "file", "UoYtihxVaS");
        setField(term40809, term40809.getClass(), "basePath", "JDswTTCZHV");
        setField(term40809, term40809.getClass(), "fileSeparator", "/");
        setBooleanField(term40809, term40809.getClass(), "isInitialized", true);
        setField(term40809, term40809.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term40809, term40809.getClass(), "keysAsListed", term40824);
        setIntField(term40833, term40833.getClass(), "hash", 722244040);
        setField(term40833, term40833.getClass(), "key", "java.lang.Object@2c0e9086");
        setField(term40833, term40833.getClass(), "value", term40836);
        setField(term40833, term40833.getClass(), "next", null);
        setElement(term40832, 1, term40833);
        setIntField(term40837, term40837.getClass(), "hash", 1811373600);
        setField(term40837, term40837.getClass(), "key", "java.lang.Object@6a87e141");
        setField(term40837, term40837.getClass(), "value", term40840);
        setField(term40837, term40837.getClass(), "next", null);
        setElement(term40832, 3, term40837);
        setIntField(term40841, term40841.getClass(), "hash", -2000058476);
        setField(term40841, term40841.getClass(), "key", "java.lang.Object@378a80df");
        setField(term40841, term40841.getClass(), "value", term40844);
        setField(term40841, term40841.getClass(), "next", null);
        setElement(term40832, 4, term40841);
        setField(term40809, term40809.getClass(), "table", term40832);
        setIntField(term40809, term40809.getClass(), "count", -469968301);
        setIntField(term40809, term40809.getClass(), "threshold", 8);
        setFloatField(term40809, term40809.getClass(), "loadFactor", 0.75F);
        setIntField(term40809, term40809.getClass(), "modCount", -1145578963);
        setField(term40809, term40809.getClass(), "keySet", term40845);
        setField(term40809, term40809.getClass(), "entrySet", term40847);
        setField(term40809, term40809.getClass(), "values", term40849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "YRHGsAkhxb";
        callMethod(klass, "save", argTypes, term7083, args);
        assertTrue(recursiveEquals(term7083, term40809));
    }

};


