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

public class ExtendedProperties_save_180167632580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962;
     Object term13224;

    public ExtendedProperties_save_180167632580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1968 = new ArrayList();
        ArrayList term2017 = new ArrayList();
        HashMap term2039 = new HashMap();
        Set<Object> term13291 =  ((Map) term2039).keySet();
        HashSet term2038 = new HashSet((Collection<? extends Object>) term13291);
        HashMap term2045 = new HashMap();
        Set<Object> term13292 =  ((Map) term2045).keySet();
        HashSet term2044 = new HashSet((Collection<? extends Object>) term13292);
        ArrayList term2050 = new ArrayList();
        term1962 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1963 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1972 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2021 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2022 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2024 = newInstance(Class.forName("java.lang.Object"));
        Object term2025 = newInstance(Class.forName("java.lang.Object"));
        Object term2026 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2028 = newInstance(Class.forName("java.lang.Object"));
        Object term2029 = newInstance(Class.forName("java.lang.Object"));
        Object term2030 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2032 = newInstance(Class.forName("java.lang.Object"));
        Object term2033 = newInstance(Class.forName("java.lang.Object"));
        setField(term1963, term1963.getClass(), "defaults", null);
        setField(term1963, term1963.getClass(), "file", null);
        setField(term1963, term1963.getClass(), "basePath", null);
        setField(term1963, term1963.getClass(), "fileSeparator", "/");
        setBooleanField(term1963, term1963.getClass(), "isInitialized", false);
        setField(term1963, term1963.getClass(), "includePropertyName", null);
        setField(term1963, term1963.getClass(), "keysAsListed", term1968);
        setField(term1963, term1963.getClass(), "table", term1972);
        setIntField(term1963, term1963.getClass(), "count", 0);
        setIntField(term1963, term1963.getClass(), "threshold", 8);
        setFloatField(term1963, term1963.getClass(), "loadFactor", 0.75F);
        setIntField(term1963, term1963.getClass(), "modCount", 0);
        setField(term1963, term1963.getClass(), "keySet", null);
        setField(term1963, term1963.getClass(), "entrySet", null);
        setField(term1963, term1963.getClass(), "values", null);
        setField(term1962, term1962.getClass(), "defaults", term1963);
        setField(term1962, term1962.getClass(), "file", "UoYtihxVaS");
        setField(term1962, term1962.getClass(), "basePath", "JDswTTCZHV");
        setField(term1962, term1962.getClass(), "fileSeparator", "/");
        setBooleanField(term1962, term1962.getClass(), "isInitialized", false);
        setField(term1962, term1962.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term1962, term1962.getClass(), "keysAsListed", term2017);
        setIntField(term2022, term2022.getClass(), "hash", 535379087);
        setField(term2022, term2022.getClass(), "key", term2024);
        setField(term2022, term2022.getClass(), "value", term2025);
        setField(term2022, term2022.getClass(), "next", null);
        setElement(term2021, 1, term2022);
        setIntField(term2026, term2026.getClass(), "hash", 1445891823);
        setField(term2026, term2026.getClass(), "key", term2028);
        setField(term2026, term2026.getClass(), "value", term2029);
        setField(term2026, term2026.getClass(), "next", null);
        setElement(term2021, 2, term2026);
        setIntField(term2030, term2030.getClass(), "hash", 586645640);
        setField(term2030, term2030.getClass(), "key", term2032);
        setField(term2030, term2030.getClass(), "value", term2033);
        setField(term2030, term2030.getClass(), "next", null);
        setElement(term2021, 9, term2030);
        setField(term1962, term1962.getClass(), "table", term2021);
        setIntField(term1962, term1962.getClass(), "count", -469968301);
        setIntField(term1962, term1962.getClass(), "threshold", 8);
        setFloatField(term1962, term1962.getClass(), "loadFactor", 0.75F);
        setIntField(term1962, term1962.getClass(), "modCount", -1145578963);
        setField(term1962, term1962.getClass(), "keySet", term2038);
        setField(term1962, term1962.getClass(), "entrySet", term2044);
        setField(term1962, term1962.getClass(), "values", term2050);
        ArrayList term13228 = new ArrayList();
        ArrayList term13239 = new ArrayList();
        HashMap term13252 = new HashMap();
        Set<Object> term13335 =  ((Map) term13252).keySet();
        HashSet term13251 = new HashSet((Collection<? extends Object>) term13335);
        HashMap term13254 = new HashMap();
        Set<Object> term13336 =  ((Map) term13254).keySet();
        HashSet term13253 = new HashSet((Collection<? extends Object>) term13336);
        ArrayList term13255 = new ArrayList();
        term13224 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13225 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13230 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13241 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13242 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13243 = newInstance(Class.forName("java.lang.Object"));
        Object term13244 = newInstance(Class.forName("java.lang.Object"));
        Object term13245 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13246 = newInstance(Class.forName("java.lang.Object"));
        Object term13247 = newInstance(Class.forName("java.lang.Object"));
        Object term13248 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13249 = newInstance(Class.forName("java.lang.Object"));
        Object term13250 = newInstance(Class.forName("java.lang.Object"));
        setField(term13225, term13225.getClass(), "defaults", null);
        setField(term13225, term13225.getClass(), "file", null);
        setField(term13225, term13225.getClass(), "basePath", null);
        setField(term13225, term13225.getClass(), "fileSeparator", "/");
        setBooleanField(term13225, term13225.getClass(), "isInitialized", false);
        setField(term13225, term13225.getClass(), "includePropertyName", null);
        setField(term13225, term13225.getClass(), "keysAsListed", term13228);
        setField(term13225, term13225.getClass(), "table", term13230);
        setIntField(term13225, term13225.getClass(), "count", 0);
        setIntField(term13225, term13225.getClass(), "threshold", 8);
        setFloatField(term13225, term13225.getClass(), "loadFactor", 0.75F);
        setIntField(term13225, term13225.getClass(), "modCount", 0);
        setField(term13225, term13225.getClass(), "keySet", null);
        setField(term13225, term13225.getClass(), "entrySet", null);
        setField(term13225, term13225.getClass(), "values", null);
        setField(term13224, term13224.getClass(), "defaults", term13225);
        setField(term13224, term13224.getClass(), "file", "UoYtihxVaS");
        setField(term13224, term13224.getClass(), "basePath", "JDswTTCZHV");
        setField(term13224, term13224.getClass(), "fileSeparator", "/");
        setBooleanField(term13224, term13224.getClass(), "isInitialized", false);
        setField(term13224, term13224.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term13224, term13224.getClass(), "keysAsListed", term13239);
        setIntField(term13242, term13242.getClass(), "hash", 535379087);
        setField(term13242, term13242.getClass(), "key", term13243);
        setField(term13242, term13242.getClass(), "value", term13244);
        setField(term13242, term13242.getClass(), "next", null);
        setElement(term13241, 1, term13242);
        setIntField(term13245, term13245.getClass(), "hash", 1445891823);
        setField(term13245, term13245.getClass(), "key", term13246);
        setField(term13245, term13245.getClass(), "value", term13247);
        setField(term13245, term13245.getClass(), "next", null);
        setElement(term13241, 2, term13245);
        setIntField(term13248, term13248.getClass(), "hash", 586645640);
        setField(term13248, term13248.getClass(), "key", term13249);
        setField(term13248, term13248.getClass(), "value", term13250);
        setField(term13248, term13248.getClass(), "next", null);
        setElement(term13241, 9, term13248);
        setField(term13224, term13224.getClass(), "table", term13241);
        setIntField(term13224, term13224.getClass(), "count", -469968301);
        setIntField(term13224, term13224.getClass(), "threshold", 8);
        setFloatField(term13224, term13224.getClass(), "loadFactor", 0.75F);
        setIntField(term13224, term13224.getClass(), "modCount", -1145578963);
        setField(term13224, term13224.getClass(), "keySet", term13251);
        setField(term13224, term13224.getClass(), "entrySet", term13253);
        setField(term13224, term13224.getClass(), "values", term13255);
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
        callMethod(klass, "save", argTypes, term1962, args);
        assertTrue(recursiveEquals(term1962, term13224));
    }

};


