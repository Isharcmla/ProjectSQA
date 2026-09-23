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

public class ExtendedProperties_getVector_145146219794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13122;
     Object term51072;
     Object term51067;

    public ExtendedProperties_getVector_145146219794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13128 = new ArrayList();
        ArrayList term13177 = new ArrayList();
        ((ArrayList) term13177).add("java.lang.Object@4b05732d");
        HashMap term13244 = new HashMap();
        Set<Object> term51186 =  ((Map) term13244).keySet();
        HashSet term13243 = new HashSet((Collection<? extends Object>) term51186);
        HashMap term13250 = new HashMap();
        Set<Object> term51187 =  ((Map) term13250).keySet();
        HashSet term13249 = new HashSet((Collection<? extends Object>) term51187);
        ArrayList term13255 = new ArrayList();
        term13122 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13123 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13132 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13208 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13209 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13238 = newInstance(Class.forName("java.lang.Object"));
        setField(term13123, term13123.getClass(), "defaults", null);
        setField(term13123, term13123.getClass(), "file", null);
        setField(term13123, term13123.getClass(), "basePath", null);
        setField(term13123, term13123.getClass(), "fileSeparator", "/");
        setBooleanField(term13123, term13123.getClass(), "isInitialized", false);
        setField(term13123, term13123.getClass(), "includePropertyName", null);
        setField(term13123, term13123.getClass(), "keysAsListed", term13128);
        setField(term13123, term13123.getClass(), "table", term13132);
        setIntField(term13123, term13123.getClass(), "count", 0);
        setIntField(term13123, term13123.getClass(), "threshold", 8);
        setFloatField(term13123, term13123.getClass(), "loadFactor", 0.75F);
        setIntField(term13123, term13123.getClass(), "modCount", 0);
        setField(term13123, term13123.getClass(), "keySet", null);
        setField(term13123, term13123.getClass(), "entrySet", null);
        setField(term13123, term13123.getClass(), "values", null);
        setField(term13122, term13122.getClass(), "defaults", term13123);
        setField(term13122, term13122.getClass(), "file", "sEccwbJKYE");
        setField(term13122, term13122.getClass(), "basePath", "AWRooQKkdW");
        setField(term13122, term13122.getClass(), "fileSeparator", "/");
        setBooleanField(term13122, term13122.getClass(), "isInitialized", true);
        setField(term13122, term13122.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term13122, term13122.getClass(), "keysAsListed", term13177);
        setIntField(term13209, term13209.getClass(), "hash", -1018992114);
        setField(term13209, term13209.getClass(), "key", "java.lang.Object@4b05732d");
        setField(term13209, term13209.getClass(), "value", term13238);
        setField(term13209, term13209.getClass(), "next", null);
        setElement(term13208, 5, term13209);
        setField(term13122, term13122.getClass(), "table", term13208);
        setIntField(term13122, term13122.getClass(), "count", -2027534002);
        setIntField(term13122, term13122.getClass(), "threshold", 8);
        setFloatField(term13122, term13122.getClass(), "loadFactor", 0.75F);
        setIntField(term13122, term13122.getClass(), "modCount", 1063420943);
        setField(term13122, term13122.getClass(), "keySet", term13243);
        setField(term13122, term13122.getClass(), "entrySet", term13249);
        setField(term13122, term13122.getClass(), "values", term13255);
        ArrayList term51076 = new ArrayList();
        ArrayList term51087 = new ArrayList();
        ((ArrayList) term51087).add("java.lang.Object@4b05732d");
        HashMap term51097 = new HashMap();
        Set<Object> term51280 =  ((Map) term51097).keySet();
        HashSet term51096 = new HashSet((Collection<? extends Object>) term51280);
        HashMap term51099 = new HashMap();
        Set<Object> term51281 =  ((Map) term51099).keySet();
        HashSet term51098 = new HashSet((Collection<? extends Object>) term51281);
        ArrayList term51100 = new ArrayList();
        term51072 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51073 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51078 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51091 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51092 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51095 = newInstance(Class.forName("java.lang.Object"));
        setField(term51073, term51073.getClass(), "defaults", null);
        setField(term51073, term51073.getClass(), "file", null);
        setField(term51073, term51073.getClass(), "basePath", null);
        setField(term51073, term51073.getClass(), "fileSeparator", "/");
        setBooleanField(term51073, term51073.getClass(), "isInitialized", false);
        setField(term51073, term51073.getClass(), "includePropertyName", null);
        setField(term51073, term51073.getClass(), "keysAsListed", term51076);
        setField(term51073, term51073.getClass(), "table", term51078);
        setIntField(term51073, term51073.getClass(), "count", 0);
        setIntField(term51073, term51073.getClass(), "threshold", 8);
        setFloatField(term51073, term51073.getClass(), "loadFactor", 0.75F);
        setIntField(term51073, term51073.getClass(), "modCount", 0);
        setField(term51073, term51073.getClass(), "keySet", null);
        setField(term51073, term51073.getClass(), "entrySet", null);
        setField(term51073, term51073.getClass(), "values", null);
        setField(term51072, term51072.getClass(), "defaults", term51073);
        setField(term51072, term51072.getClass(), "file", "sEccwbJKYE");
        setField(term51072, term51072.getClass(), "basePath", "AWRooQKkdW");
        setField(term51072, term51072.getClass(), "fileSeparator", "/");
        setBooleanField(term51072, term51072.getClass(), "isInitialized", true);
        setField(term51072, term51072.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term51072, term51072.getClass(), "keysAsListed", term51087);
        setIntField(term51092, term51092.getClass(), "hash", -1018992114);
        setField(term51092, term51092.getClass(), "key", "java.lang.Object@4b05732d");
        setField(term51092, term51092.getClass(), "value", term51095);
        setField(term51092, term51092.getClass(), "next", null);
        setElement(term51091, 5, term51092);
        setField(term51072, term51072.getClass(), "table", term51091);
        setIntField(term51072, term51072.getClass(), "count", -2027534002);
        setIntField(term51072, term51072.getClass(), "threshold", 8);
        setFloatField(term51072, term51072.getClass(), "loadFactor", 0.75F);
        setIntField(term51072, term51072.getClass(), "modCount", 1063420943);
        setField(term51072, term51072.getClass(), "keySet", term51096);
        setField(term51072, term51072.getClass(), "entrySet", term51098);
        setField(term51072, term51072.getClass(), "values", term51100);
        term51067 = newInstance(Class.forName("java.util.Vector"));
        Object[] term51068 = (Object[]) newArray("java.lang.Object", 10);
        setField(term51067, term51067.getClass(), "elementData", term51068);
        setIntField(term51067, term51067.getClass(), "elementCount", 0);
        setIntField(term51067, term51067.getClass(), "capacityIncrement", 0);
        setIntField(term51067, term51067.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QXzGXbEXMu";
        Object retValue = callMethod(klass, "getVector", argTypes, term13122, args);
        assertTrue(recursiveEquals(term13122, term51072));
        assertTrue(recursiveEquals(retValue, term51067));
    }

};


