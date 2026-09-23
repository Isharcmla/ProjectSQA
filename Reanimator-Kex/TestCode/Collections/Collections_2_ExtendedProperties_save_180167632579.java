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

public class ExtendedProperties_save_180167632579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1694;
     Object term11040;

    public ExtendedProperties_save_180167632579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1700 = new ArrayList();
        ArrayList term1737 = new ArrayList();
        HashMap term1759 = new HashMap();
        Set<Object> term11095 =  ((Map) term1759).keySet();
        HashSet term1758 = new HashSet((Collection<? extends Object>) term11095);
        HashMap term1765 = new HashMap();
        Set<Object> term11096 =  ((Map) term1765).keySet();
        HashSet term1764 = new HashSet((Collection<? extends Object>) term11096);
        ArrayList term1770 = new ArrayList();
        term1694 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1695 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1704 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1741 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1742 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1744 = newInstance(Class.forName("java.lang.Object"));
        Object term1745 = newInstance(Class.forName("java.lang.Object"));
        Object term1746 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1748 = newInstance(Class.forName("java.lang.Object"));
        Object term1749 = newInstance(Class.forName("java.lang.Object"));
        Object term1750 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1752 = newInstance(Class.forName("java.lang.Object"));
        Object term1753 = newInstance(Class.forName("java.lang.Object"));
        setField(term1695, term1695.getClass(), "defaults", null);
        setField(term1695, term1695.getClass(), "file", null);
        setField(term1695, term1695.getClass(), "basePath", null);
        setField(term1695, term1695.getClass(), "fileSeparator", "/");
        setBooleanField(term1695, term1695.getClass(), "isInitialized", false);
        setField(term1695, term1695.getClass(), "keysAsListed", term1700);
        setField(term1695, term1695.getClass(), "table", term1704);
        setIntField(term1695, term1695.getClass(), "count", 0);
        setIntField(term1695, term1695.getClass(), "threshold", 8);
        setFloatField(term1695, term1695.getClass(), "loadFactor", 0.75F);
        setIntField(term1695, term1695.getClass(), "modCount", 0);
        setField(term1695, term1695.getClass(), "keySet", null);
        setField(term1695, term1695.getClass(), "entrySet", null);
        setField(term1695, term1695.getClass(), "values", null);
        setField(term1694, term1694.getClass(), "defaults", term1695);
        setField(term1694, term1694.getClass(), "file", "wSQxaModmm");
        setField(term1694, term1694.getClass(), "basePath", "UlajhuVLaP");
        setField(term1694, term1694.getClass(), "fileSeparator", "/");
        setBooleanField(term1694, term1694.getClass(), "isInitialized", false);
        setField(term1694, term1694.getClass(), "keysAsListed", term1737);
        setIntField(term1742, term1742.getClass(), "hash", 95566824);
        setField(term1742, term1742.getClass(), "key", term1744);
        setField(term1742, term1742.getClass(), "value", term1745);
        setIntField(term1746, term1746.getClass(), "hash", 414150089);
        setField(term1746, term1746.getClass(), "key", term1748);
        setField(term1746, term1746.getClass(), "value", term1749);
        setField(term1746, term1746.getClass(), "next", null);
        setField(term1742, term1742.getClass(), "next", term1746);
        setElement(term1741, 1, term1742);
        setIntField(term1750, term1750.getClass(), "hash", 815968171);
        setField(term1750, term1750.getClass(), "key", term1752);
        setField(term1750, term1750.getClass(), "value", term1753);
        setField(term1750, term1750.getClass(), "next", null);
        setElement(term1741, 7, term1750);
        setField(term1694, term1694.getClass(), "table", term1741);
        setIntField(term1694, term1694.getClass(), "count", -469968301);
        setIntField(term1694, term1694.getClass(), "threshold", 8);
        setFloatField(term1694, term1694.getClass(), "loadFactor", 0.75F);
        setIntField(term1694, term1694.getClass(), "modCount", -1145578963);
        setField(term1694, term1694.getClass(), "keySet", term1758);
        setField(term1694, term1694.getClass(), "entrySet", term1764);
        setField(term1694, term1694.getClass(), "values", term1770);
        ArrayList term11044 = new ArrayList();
        ArrayList term11053 = new ArrayList();
        HashMap term11066 = new HashMap();
        Set<Object> term11129 =  ((Map) term11066).keySet();
        HashSet term11065 = new HashSet((Collection<? extends Object>) term11129);
        HashMap term11068 = new HashMap();
        Set<Object> term11130 =  ((Map) term11068).keySet();
        HashSet term11067 = new HashSet((Collection<? extends Object>) term11130);
        ArrayList term11069 = new ArrayList();
        term11040 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term11041 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term11046 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term11055 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term11056 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11057 = newInstance(Class.forName("java.lang.Object"));
        Object term11058 = newInstance(Class.forName("java.lang.Object"));
        Object term11059 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11060 = newInstance(Class.forName("java.lang.Object"));
        Object term11061 = newInstance(Class.forName("java.lang.Object"));
        Object term11062 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term11063 = newInstance(Class.forName("java.lang.Object"));
        Object term11064 = newInstance(Class.forName("java.lang.Object"));
        setField(term11041, term11041.getClass(), "defaults", null);
        setField(term11041, term11041.getClass(), "file", null);
        setField(term11041, term11041.getClass(), "basePath", null);
        setField(term11041, term11041.getClass(), "fileSeparator", "/");
        setBooleanField(term11041, term11041.getClass(), "isInitialized", false);
        setField(term11041, term11041.getClass(), "keysAsListed", term11044);
        setField(term11041, term11041.getClass(), "table", term11046);
        setIntField(term11041, term11041.getClass(), "count", 0);
        setIntField(term11041, term11041.getClass(), "threshold", 8);
        setFloatField(term11041, term11041.getClass(), "loadFactor", 0.75F);
        setIntField(term11041, term11041.getClass(), "modCount", 0);
        setField(term11041, term11041.getClass(), "keySet", null);
        setField(term11041, term11041.getClass(), "entrySet", null);
        setField(term11041, term11041.getClass(), "values", null);
        setField(term11040, term11040.getClass(), "defaults", term11041);
        setField(term11040, term11040.getClass(), "file", "wSQxaModmm");
        setField(term11040, term11040.getClass(), "basePath", "UlajhuVLaP");
        setField(term11040, term11040.getClass(), "fileSeparator", "/");
        setBooleanField(term11040, term11040.getClass(), "isInitialized", false);
        setField(term11040, term11040.getClass(), "keysAsListed", term11053);
        setIntField(term11056, term11056.getClass(), "hash", 95566824);
        setField(term11056, term11056.getClass(), "key", term11057);
        setField(term11056, term11056.getClass(), "value", term11058);
        setIntField(term11059, term11059.getClass(), "hash", 414150089);
        setField(term11059, term11059.getClass(), "key", term11060);
        setField(term11059, term11059.getClass(), "value", term11061);
        setField(term11059, term11059.getClass(), "next", null);
        setField(term11056, term11056.getClass(), "next", term11059);
        setElement(term11055, 1, term11056);
        setIntField(term11062, term11062.getClass(), "hash", 815968171);
        setField(term11062, term11062.getClass(), "key", term11063);
        setField(term11062, term11062.getClass(), "value", term11064);
        setField(term11062, term11062.getClass(), "next", null);
        setElement(term11055, 7, term11062);
        setField(term11040, term11040.getClass(), "table", term11055);
        setIntField(term11040, term11040.getClass(), "count", -469968301);
        setIntField(term11040, term11040.getClass(), "threshold", 8);
        setFloatField(term11040, term11040.getClass(), "loadFactor", 0.75F);
        setIntField(term11040, term11040.getClass(), "modCount", -1145578963);
        setField(term11040, term11040.getClass(), "keySet", term11065);
        setField(term11040, term11040.getClass(), "entrySet", term11067);
        setField(term11040, term11040.getClass(), "values", term11069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "gGSMzuGICf";
        callMethod(klass, "save", argTypes, term1694, args);
        assertTrue(recursiveEquals(term1694, term11040));
    }

};


