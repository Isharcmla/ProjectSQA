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

public class ExtendedProperties_getKeys_55893045283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2490;
     Object term14031;
     Object term13935;

    public ExtendedProperties_getKeys_55893045283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2496 = new ArrayList();
        ArrayList term2545 = new ArrayList();
        HashMap term2567 = new HashMap();
        Set<Object> term14096 =  ((Map) term2567).keySet();
        HashSet term2566 = new HashSet((Collection<? extends Object>) term14096);
        HashMap term2573 = new HashMap();
        Set<Object> term14097 =  ((Map) term2573).keySet();
        HashSet term2572 = new HashSet((Collection<? extends Object>) term14097);
        ArrayList term2578 = new ArrayList();
        term2490 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term2491 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term2500 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term2549 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2550 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2552 = newInstance(Class.forName("java.lang.Object"));
        Object term2553 = newInstance(Class.forName("java.lang.Object"));
        Object term2554 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2556 = newInstance(Class.forName("java.lang.Object"));
        Object term2557 = newInstance(Class.forName("java.lang.Object"));
        Object term2558 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2560 = newInstance(Class.forName("java.lang.Object"));
        Object term2561 = newInstance(Class.forName("java.lang.Object"));
        setField(term2491, term2491.getClass(), "defaults", null);
        setField(term2491, term2491.getClass(), "file", null);
        setField(term2491, term2491.getClass(), "basePath", null);
        setField(term2491, term2491.getClass(), "fileSeparator", "/");
        setBooleanField(term2491, term2491.getClass(), "isInitialized", false);
        setField(term2491, term2491.getClass(), "includePropertyName", null);
        setField(term2491, term2491.getClass(), "keysAsListed", term2496);
        setField(term2491, term2491.getClass(), "table", term2500);
        setIntField(term2491, term2491.getClass(), "count", 0);
        setIntField(term2491, term2491.getClass(), "threshold", 8);
        setFloatField(term2491, term2491.getClass(), "loadFactor", 0.75F);
        setIntField(term2491, term2491.getClass(), "modCount", 0);
        setField(term2491, term2491.getClass(), "keySet", null);
        setField(term2491, term2491.getClass(), "entrySet", null);
        setField(term2491, term2491.getClass(), "values", null);
        setField(term2490, term2490.getClass(), "defaults", term2491);
        setField(term2490, term2490.getClass(), "file", "kBdSllIBVz");
        setField(term2490, term2490.getClass(), "basePath", "TJmVBGfTML");
        setField(term2490, term2490.getClass(), "fileSeparator", "/");
        setBooleanField(term2490, term2490.getClass(), "isInitialized", true);
        setField(term2490, term2490.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term2490, term2490.getClass(), "keysAsListed", term2545);
        setIntField(term2550, term2550.getClass(), "hash", 206548761);
        setField(term2550, term2550.getClass(), "key", term2552);
        setField(term2550, term2550.getClass(), "value", term2553);
        setField(term2550, term2550.getClass(), "next", null);
        setElement(term2549, 1, term2550);
        setIntField(term2554, term2554.getClass(), "hash", 1873517531);
        setField(term2554, term2554.getClass(), "key", term2556);
        setField(term2554, term2554.getClass(), "value", term2557);
        setField(term2554, term2554.getClass(), "next", null);
        setElement(term2549, 6, term2554);
        setIntField(term2558, term2558.getClass(), "hash", 1850227290);
        setField(term2558, term2558.getClass(), "key", term2560);
        setField(term2558, term2558.getClass(), "value", term2561);
        setField(term2558, term2558.getClass(), "next", null);
        setElement(term2549, 10, term2558);
        setField(term2490, term2490.getClass(), "table", term2549);
        setIntField(term2490, term2490.getClass(), "count", -14890616);
        setIntField(term2490, term2490.getClass(), "threshold", 8);
        setFloatField(term2490, term2490.getClass(), "loadFactor", 0.75F);
        setIntField(term2490, term2490.getClass(), "modCount", 1632125676);
        setField(term2490, term2490.getClass(), "keySet", term2566);
        setField(term2490, term2490.getClass(), "entrySet", term2572);
        setField(term2490, term2490.getClass(), "values", term2578);
        ArrayList term14035 = new ArrayList();
        ArrayList term14046 = new ArrayList();
        HashMap term14059 = new HashMap();
        Set<Object> term14130 =  ((Map) term14059).keySet();
        HashSet term14058 = new HashSet((Collection<? extends Object>) term14130);
        HashMap term14061 = new HashMap();
        Set<Object> term14131 =  ((Map) term14061).keySet();
        HashSet term14060 = new HashSet((Collection<? extends Object>) term14131);
        ArrayList term14062 = new ArrayList();
        term14031 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14032 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14037 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14048 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term14049 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term14050 = newInstance(Class.forName("java.lang.Object"));
        Object term14051 = newInstance(Class.forName("java.lang.Object"));
        Object term14052 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term14053 = newInstance(Class.forName("java.lang.Object"));
        Object term14054 = newInstance(Class.forName("java.lang.Object"));
        Object term14055 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term14056 = newInstance(Class.forName("java.lang.Object"));
        Object term14057 = newInstance(Class.forName("java.lang.Object"));
        setField(term14032, term14032.getClass(), "defaults", null);
        setField(term14032, term14032.getClass(), "file", null);
        setField(term14032, term14032.getClass(), "basePath", null);
        setField(term14032, term14032.getClass(), "fileSeparator", "/");
        setBooleanField(term14032, term14032.getClass(), "isInitialized", false);
        setField(term14032, term14032.getClass(), "includePropertyName", null);
        setField(term14032, term14032.getClass(), "keysAsListed", term14035);
        setField(term14032, term14032.getClass(), "table", term14037);
        setIntField(term14032, term14032.getClass(), "count", 0);
        setIntField(term14032, term14032.getClass(), "threshold", 8);
        setFloatField(term14032, term14032.getClass(), "loadFactor", 0.75F);
        setIntField(term14032, term14032.getClass(), "modCount", 0);
        setField(term14032, term14032.getClass(), "keySet", null);
        setField(term14032, term14032.getClass(), "entrySet", null);
        setField(term14032, term14032.getClass(), "values", null);
        setField(term14031, term14031.getClass(), "defaults", term14032);
        setField(term14031, term14031.getClass(), "file", "kBdSllIBVz");
        setField(term14031, term14031.getClass(), "basePath", "TJmVBGfTML");
        setField(term14031, term14031.getClass(), "fileSeparator", "/");
        setBooleanField(term14031, term14031.getClass(), "isInitialized", true);
        setField(term14031, term14031.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term14031, term14031.getClass(), "keysAsListed", term14046);
        setIntField(term14049, term14049.getClass(), "hash", 206548761);
        setField(term14049, term14049.getClass(), "key", term14050);
        setField(term14049, term14049.getClass(), "value", term14051);
        setField(term14049, term14049.getClass(), "next", null);
        setElement(term14048, 1, term14049);
        setIntField(term14052, term14052.getClass(), "hash", 1873517531);
        setField(term14052, term14052.getClass(), "key", term14053);
        setField(term14052, term14052.getClass(), "value", term14054);
        setField(term14052, term14052.getClass(), "next", null);
        setElement(term14048, 6, term14052);
        setIntField(term14055, term14055.getClass(), "hash", 1850227290);
        setField(term14055, term14055.getClass(), "key", term14056);
        setField(term14055, term14055.getClass(), "value", term14057);
        setField(term14055, term14055.getClass(), "next", null);
        setElement(term14048, 10, term14055);
        setField(term14031, term14031.getClass(), "table", term14048);
        setIntField(term14031, term14031.getClass(), "count", -14890616);
        setIntField(term14031, term14031.getClass(), "threshold", 8);
        setFloatField(term14031, term14031.getClass(), "loadFactor", 0.75F);
        setIntField(term14031, term14031.getClass(), "modCount", 1632125676);
        setField(term14031, term14031.getClass(), "keySet", term14058);
        setField(term14031, term14031.getClass(), "entrySet", term14060);
        setField(term14031, term14031.getClass(), "values", term14062);
        ArrayList term13939 = new ArrayList();
        term13935 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term13935, term13935.getClass(), "cursor", 0);
        setIntField(term13935, term13935.getClass(), "lastRet", -1);
        setIntField(term13935, term13935.getClass(), "expectedModCount", 0);
        setField(term13935, term13935.getClass(), "this$0", term13939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term2490, args);
        assertTrue(recursiveEquals(term2490, term14031));
        assertTrue(recursiveEquals(retValue, term13935));
    }

};


