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
import java.lang.Long;

public class ExtendedProperties_getLong_1984760787111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5899;
     Object term5987;
     Object term20204;

    public ExtendedProperties_getLong_1984760787111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5905 = new ArrayList();
        ArrayList term5942 = new ArrayList();
        HashMap term5960 = new HashMap();
        Set<Object> term20256 =  ((Map) term5960).keySet();
        HashSet term5959 = new HashSet((Collection<? extends Object>) term20256);
        HashMap term5966 = new HashMap();
        Set<Object> term20257 =  ((Map) term5966).keySet();
        HashSet term5965 = new HashSet((Collection<? extends Object>) term20257);
        ArrayList term5971 = new ArrayList();
        term5899 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5900 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5909 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5946 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5947 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5949 = newInstance(Class.forName("java.lang.Object"));
        Object term5950 = newInstance(Class.forName("java.lang.Object"));
        Object term5951 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5953 = newInstance(Class.forName("java.lang.Object"));
        Object term5954 = newInstance(Class.forName("java.lang.Object"));
        setField(term5900, term5900.getClass(), "defaults", null);
        setField(term5900, term5900.getClass(), "file", null);
        setField(term5900, term5900.getClass(), "basePath", null);
        setField(term5900, term5900.getClass(), "fileSeparator", "/");
        setBooleanField(term5900, term5900.getClass(), "isInitialized", false);
        setField(term5900, term5900.getClass(), "keysAsListed", term5905);
        setField(term5900, term5900.getClass(), "table", term5909);
        setIntField(term5900, term5900.getClass(), "count", 0);
        setIntField(term5900, term5900.getClass(), "threshold", 8);
        setFloatField(term5900, term5900.getClass(), "loadFactor", 0.75F);
        setIntField(term5900, term5900.getClass(), "modCount", 0);
        setField(term5900, term5900.getClass(), "keySet", null);
        setField(term5900, term5900.getClass(), "entrySet", null);
        setField(term5900, term5900.getClass(), "values", null);
        setField(term5899, term5899.getClass(), "defaults", term5900);
        setField(term5899, term5899.getClass(), "file", "wfaXBpWAUH");
        setField(term5899, term5899.getClass(), "basePath", "VMeAzAHwZj");
        setField(term5899, term5899.getClass(), "fileSeparator", "/");
        setBooleanField(term5899, term5899.getClass(), "isInitialized", true);
        setField(term5899, term5899.getClass(), "keysAsListed", term5942);
        setIntField(term5947, term5947.getClass(), "hash", 470929873);
        setField(term5947, term5947.getClass(), "key", term5949);
        setField(term5947, term5947.getClass(), "value", term5950);
        setIntField(term5951, term5951.getClass(), "hash", 1333463545);
        setField(term5951, term5951.getClass(), "key", term5953);
        setField(term5951, term5951.getClass(), "value", term5954);
        setField(term5951, term5951.getClass(), "next", null);
        setField(term5947, term5947.getClass(), "next", term5951);
        setElement(term5946, 7, term5947);
        setField(term5899, term5899.getClass(), "table", term5946);
        setIntField(term5899, term5899.getClass(), "count", -2015048151);
        setIntField(term5899, term5899.getClass(), "threshold", 8);
        setFloatField(term5899, term5899.getClass(), "loadFactor", 0.75F);
        setIntField(term5899, term5899.getClass(), "modCount", -2063457667);
        setField(term5899, term5899.getClass(), "keySet", term5959);
        setField(term5899, term5899.getClass(), "entrySet", term5965);
        setField(term5899, term5899.getClass(), "values", term5971);
        term5987 = new Long(2442117782898005296L);
        ArrayList term20208 = new ArrayList();
        ArrayList term20217 = new ArrayList();
        HashMap term20227 = new HashMap();
        Set<Object> term20290 =  ((Map) term20227).keySet();
        HashSet term20226 = new HashSet((Collection<? extends Object>) term20290);
        HashMap term20229 = new HashMap();
        Set<Object> term20291 =  ((Map) term20229).keySet();
        HashSet term20228 = new HashSet((Collection<? extends Object>) term20291);
        ArrayList term20230 = new ArrayList();
        term20204 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term20205 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term20210 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20219 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term20220 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20221 = newInstance(Class.forName("java.lang.Object"));
        Object term20222 = newInstance(Class.forName("java.lang.Object"));
        Object term20223 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20224 = newInstance(Class.forName("java.lang.Object"));
        Object term20225 = newInstance(Class.forName("java.lang.Object"));
        setField(term20205, term20205.getClass(), "defaults", null);
        setField(term20205, term20205.getClass(), "file", null);
        setField(term20205, term20205.getClass(), "basePath", null);
        setField(term20205, term20205.getClass(), "fileSeparator", "/");
        setBooleanField(term20205, term20205.getClass(), "isInitialized", false);
        setField(term20205, term20205.getClass(), "keysAsListed", term20208);
        setField(term20205, term20205.getClass(), "table", term20210);
        setIntField(term20205, term20205.getClass(), "count", 0);
        setIntField(term20205, term20205.getClass(), "threshold", 8);
        setFloatField(term20205, term20205.getClass(), "loadFactor", 0.75F);
        setIntField(term20205, term20205.getClass(), "modCount", 0);
        setField(term20205, term20205.getClass(), "keySet", null);
        setField(term20205, term20205.getClass(), "entrySet", null);
        setField(term20205, term20205.getClass(), "values", null);
        setField(term20204, term20204.getClass(), "defaults", term20205);
        setField(term20204, term20204.getClass(), "file", "wfaXBpWAUH");
        setField(term20204, term20204.getClass(), "basePath", "VMeAzAHwZj");
        setField(term20204, term20204.getClass(), "fileSeparator", "/");
        setBooleanField(term20204, term20204.getClass(), "isInitialized", true);
        setField(term20204, term20204.getClass(), "keysAsListed", term20217);
        setIntField(term20220, term20220.getClass(), "hash", 470929873);
        setField(term20220, term20220.getClass(), "key", term20221);
        setField(term20220, term20220.getClass(), "value", term20222);
        setIntField(term20223, term20223.getClass(), "hash", 1333463545);
        setField(term20223, term20223.getClass(), "key", term20224);
        setField(term20223, term20223.getClass(), "value", term20225);
        setField(term20223, term20223.getClass(), "next", null);
        setField(term20220, term20220.getClass(), "next", term20223);
        setElement(term20219, 7, term20220);
        setField(term20204, term20204.getClass(), "table", term20219);
        setIntField(term20204, term20204.getClass(), "count", -2015048151);
        setIntField(term20204, term20204.getClass(), "threshold", 8);
        setFloatField(term20204, term20204.getClass(), "loadFactor", 0.75F);
        setIntField(term20204, term20204.getClass(), "modCount", -2063457667);
        setField(term20204, term20204.getClass(), "keySet", term20226);
        setField(term20204, term20204.getClass(), "entrySet", term20228);
        setField(term20204, term20204.getClass(), "values", term20230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = "PznxWXsZME";
        args[1] = term5987;
        Object retValue = callMethod(klass, "getLong", argTypes, term5899, args);
        assertTrue(recursiveEquals(term5899, term20204));
        assertTrue(recursiveEquals(term5987, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, 2442117782898005296L));
    }

};


