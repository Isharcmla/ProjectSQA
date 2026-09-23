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

public class ExtendedProperties_getFloat_2026443291113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6167;

    public ExtendedProperties_getFloat_2026443291113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6173 = new ArrayList();
        ArrayList term6210 = new ArrayList();
        HashMap term6252 = new HashMap();
        Set<Object> term21053 =  ((Map) term6252).keySet();
        HashSet term6251 = new HashSet((Collection<? extends Object>) term21053);
        HashMap term6258 = new HashMap();
        Set<Object> term21054 =  ((Map) term6258).keySet();
        HashSet term6257 = new HashSet((Collection<? extends Object>) term21054);
        ArrayList term6263 = new ArrayList();
        term6167 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6168 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6177 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6214 = (Object[]) newArray("java.util.Hashtable$Entry", 3071);
        Object term6215 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6217 = newInstance(Class.forName("java.lang.Object"));
        Object term6218 = newInstance(Class.forName("java.lang.Object"));
        Object term6219 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6221 = newInstance(Class.forName("java.lang.Object"));
        Object term6222 = newInstance(Class.forName("java.lang.Object"));
        Object term6223 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6225 = newInstance(Class.forName("java.lang.Object"));
        Object term6226 = newInstance(Class.forName("java.lang.Object"));
        Object term6227 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6229 = newInstance(Class.forName("java.lang.Object"));
        Object term6230 = newInstance(Class.forName("java.lang.Object"));
        Object term6231 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6233 = newInstance(Class.forName("java.lang.Object"));
        Object term6234 = newInstance(Class.forName("java.lang.Object"));
        Object term6235 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6237 = newInstance(Class.forName("java.lang.Object"));
        Object term6238 = newInstance(Class.forName("java.lang.Object"));
        Object term6239 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6241 = newInstance(Class.forName("java.lang.Object"));
        Object term6242 = newInstance(Class.forName("java.lang.Object"));
        Object term6243 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6245 = newInstance(Class.forName("java.lang.Object"));
        Object term6246 = newInstance(Class.forName("java.lang.Object"));
        setField(term6168, term6168.getClass(), "defaults", null);
        setField(term6168, term6168.getClass(), "file", null);
        setField(term6168, term6168.getClass(), "basePath", null);
        setField(term6168, term6168.getClass(), "fileSeparator", "/");
        setBooleanField(term6168, term6168.getClass(), "isInitialized", false);
        setField(term6168, term6168.getClass(), "keysAsListed", term6173);
        setField(term6168, term6168.getClass(), "table", term6177);
        setIntField(term6168, term6168.getClass(), "count", 0);
        setIntField(term6168, term6168.getClass(), "threshold", 8);
        setFloatField(term6168, term6168.getClass(), "loadFactor", 0.75F);
        setIntField(term6168, term6168.getClass(), "modCount", 0);
        setField(term6168, term6168.getClass(), "keySet", null);
        setField(term6168, term6168.getClass(), "entrySet", null);
        setField(term6168, term6168.getClass(), "values", null);
        setField(term6167, term6167.getClass(), "defaults", term6168);
        setField(term6167, term6167.getClass(), "file", "mvrkADEgpp");
        setField(term6167, term6167.getClass(), "basePath", "pXOkjyeIRb");
        setField(term6167, term6167.getClass(), "fileSeparator", "/");
        setBooleanField(term6167, term6167.getClass(), "isInitialized", false);
        setField(term6167, term6167.getClass(), "keysAsListed", term6210);
        setIntField(term6215, term6215.getClass(), "hash", 846201845);
        setField(term6215, term6215.getClass(), "key", term6217);
        setField(term6215, term6215.getClass(), "value", term6218);
        setField(term6215, term6215.getClass(), "next", null);
        setElement(term6214, 79, term6215);
        setIntField(term6219, term6219.getClass(), "hash", 208244829);
        setField(term6219, term6219.getClass(), "key", term6221);
        setField(term6219, term6219.getClass(), "value", term6222);
        setField(term6219, term6219.getClass(), "next", null);
        setElement(term6214, 319, term6219);
        setIntField(term6223, term6223.getClass(), "hash", 738048120);
        setField(term6223, term6223.getClass(), "key", term6225);
        setField(term6223, term6223.getClass(), "value", term6226);
        setField(term6223, term6223.getClass(), "next", null);
        setElement(term6214, 832, term6223);
        setIntField(term6227, term6227.getClass(), "hash", 917570244);
        setField(term6227, term6227.getClass(), "key", term6229);
        setField(term6227, term6227.getClass(), "value", term6230);
        setField(term6227, term6227.getClass(), "next", null);
        setElement(term6214, 1509, term6227);
        setIntField(term6231, term6231.getClass(), "hash", 490378848);
        setField(term6231, term6231.getClass(), "key", term6233);
        setField(term6231, term6231.getClass(), "value", term6234);
        setField(term6231, term6231.getClass(), "next", null);
        setElement(term6214, 1568, term6231);
        setIntField(term6235, term6235.getClass(), "hash", 965297133);
        setField(term6235, term6235.getClass(), "key", term6237);
        setField(term6235, term6235.getClass(), "value", term6238);
        setField(term6235, term6235.getClass(), "next", null);
        setElement(term6214, 1987, term6235);
        setIntField(term6239, term6239.getClass(), "hash", 1883849234);
        setField(term6239, term6239.getClass(), "key", term6241);
        setField(term6239, term6239.getClass(), "value", term6242);
        setField(term6239, term6239.getClass(), "next", null);
        setElement(term6214, 2633, term6239);
        setIntField(term6243, term6243.getClass(), "hash", 2111751564);
        setField(term6243, term6243.getClass(), "key", term6245);
        setField(term6243, term6243.getClass(), "value", term6246);
        setField(term6243, term6243.getClass(), "next", null);
        setElement(term6214, 2982, term6243);
        setField(term6167, term6167.getClass(), "table", term6214);
        setIntField(term6167, term6167.getClass(), "count", 9726687);
        setIntField(term6167, term6167.getClass(), "threshold", 2303);
        setFloatField(term6167, term6167.getClass(), "loadFactor", 0.75F);
        setIntField(term6167, term6167.getClass(), "modCount", -25637960);
        setField(term6167, term6167.getClass(), "keySet", term6251);
        setField(term6167, term6167.getClass(), "entrySet", term6257);
        setField(term6167, term6167.getClass(), "values", term6263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        try {
            callMethod(klass, "getFloat", argTypes, term6167, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


