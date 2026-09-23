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

public class ExtendedProperties_getStringArray_211111083290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3158;
     Object term13685;
     Object term13600;

    public ExtendedProperties_getStringArray_211111083290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3164 = new ArrayList();
        ArrayList term3201 = new ArrayList();
        HashMap term3227 = new HashMap();
        Set<Object> term13743 =  ((Map) term3227).keySet();
        HashSet term3226 = new HashSet((Collection<? extends Object>) term13743);
        HashMap term3233 = new HashMap();
        Set<Object> term13744 =  ((Map) term3233).keySet();
        HashSet term3232 = new HashSet((Collection<? extends Object>) term13744);
        ArrayList term3238 = new ArrayList();
        term3158 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3159 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3168 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3205 = (Object[]) newArray("java.util.Hashtable$Entry", 191);
        Object term3206 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3208 = newInstance(Class.forName("java.lang.Object"));
        Object term3209 = newInstance(Class.forName("java.lang.Object"));
        Object term3210 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3212 = newInstance(Class.forName("java.lang.Object"));
        Object term3213 = newInstance(Class.forName("java.lang.Object"));
        Object term3214 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3216 = newInstance(Class.forName("java.lang.Object"));
        Object term3217 = newInstance(Class.forName("java.lang.Object"));
        Object term3218 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3220 = newInstance(Class.forName("java.lang.Object"));
        Object term3221 = newInstance(Class.forName("java.lang.Object"));
        setField(term3159, term3159.getClass(), "defaults", null);
        setField(term3159, term3159.getClass(), "file", null);
        setField(term3159, term3159.getClass(), "basePath", null);
        setField(term3159, term3159.getClass(), "fileSeparator", "/");
        setBooleanField(term3159, term3159.getClass(), "isInitialized", false);
        setField(term3159, term3159.getClass(), "keysAsListed", term3164);
        setField(term3159, term3159.getClass(), "table", term3168);
        setIntField(term3159, term3159.getClass(), "count", 0);
        setIntField(term3159, term3159.getClass(), "threshold", 8);
        setFloatField(term3159, term3159.getClass(), "loadFactor", 0.75F);
        setIntField(term3159, term3159.getClass(), "modCount", 0);
        setField(term3159, term3159.getClass(), "keySet", null);
        setField(term3159, term3159.getClass(), "entrySet", null);
        setField(term3159, term3159.getClass(), "values", null);
        setField(term3158, term3158.getClass(), "defaults", term3159);
        setField(term3158, term3158.getClass(), "file", "KoyGrUJeJW");
        setField(term3158, term3158.getClass(), "basePath", "HqBOwkVqjD");
        setField(term3158, term3158.getClass(), "fileSeparator", "/");
        setBooleanField(term3158, term3158.getClass(), "isInitialized", true);
        setField(term3158, term3158.getClass(), "keysAsListed", term3201);
        setIntField(term3206, term3206.getClass(), "hash", 1622173911);
        setField(term3206, term3206.getClass(), "key", term3208);
        setField(term3206, term3206.getClass(), "value", term3209);
        setField(term3206, term3206.getClass(), "next", null);
        setElement(term3205, 24, term3206);
        setIntField(term3210, term3210.getClass(), "hash", 592941388);
        setField(term3210, term3210.getClass(), "key", term3212);
        setField(term3210, term3210.getClass(), "value", term3213);
        setField(term3210, term3210.getClass(), "next", null);
        setElement(term3205, 33, term3210);
        setIntField(term3214, term3214.getClass(), "hash", 1250761143);
        setField(term3214, term3214.getClass(), "key", term3216);
        setField(term3214, term3214.getClass(), "value", term3217);
        setField(term3214, term3214.getClass(), "next", null);
        setElement(term3205, 126, term3214);
        setIntField(term3218, term3218.getClass(), "hash", 867113393);
        setField(term3218, term3218.getClass(), "key", term3220);
        setField(term3218, term3218.getClass(), "value", term3221);
        setField(term3218, term3218.getClass(), "next", null);
        setElement(term3205, 133, term3218);
        setField(term3158, term3158.getClass(), "table", term3205);
        setIntField(term3158, term3158.getClass(), "count", 1265463005);
        setIntField(term3158, term3158.getClass(), "threshold", 143);
        setFloatField(term3158, term3158.getClass(), "loadFactor", 0.75F);
        setIntField(term3158, term3158.getClass(), "modCount", 335112692);
        setField(term3158, term3158.getClass(), "keySet", term3226);
        setField(term3158, term3158.getClass(), "entrySet", term3232);
        setField(term3158, term3158.getClass(), "values", term3238);
        ArrayList term13689 = new ArrayList();
        ArrayList term13698 = new ArrayList();
        HashMap term13714 = new HashMap();
        Set<Object> term13777 =  ((Map) term13714).keySet();
        HashSet term13713 = new HashSet((Collection<? extends Object>) term13777);
        HashMap term13716 = new HashMap();
        Set<Object> term13778 =  ((Map) term13716).keySet();
        HashSet term13715 = new HashSet((Collection<? extends Object>) term13778);
        ArrayList term13717 = new ArrayList();
        term13685 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13686 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13691 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13700 = (Object[]) newArray("java.util.Hashtable$Entry", 191);
        Object term13701 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13702 = newInstance(Class.forName("java.lang.Object"));
        Object term13703 = newInstance(Class.forName("java.lang.Object"));
        Object term13704 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13705 = newInstance(Class.forName("java.lang.Object"));
        Object term13706 = newInstance(Class.forName("java.lang.Object"));
        Object term13707 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13708 = newInstance(Class.forName("java.lang.Object"));
        Object term13709 = newInstance(Class.forName("java.lang.Object"));
        Object term13710 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13711 = newInstance(Class.forName("java.lang.Object"));
        Object term13712 = newInstance(Class.forName("java.lang.Object"));
        setField(term13686, term13686.getClass(), "defaults", null);
        setField(term13686, term13686.getClass(), "file", null);
        setField(term13686, term13686.getClass(), "basePath", null);
        setField(term13686, term13686.getClass(), "fileSeparator", "/");
        setBooleanField(term13686, term13686.getClass(), "isInitialized", false);
        setField(term13686, term13686.getClass(), "keysAsListed", term13689);
        setField(term13686, term13686.getClass(), "table", term13691);
        setIntField(term13686, term13686.getClass(), "count", 0);
        setIntField(term13686, term13686.getClass(), "threshold", 8);
        setFloatField(term13686, term13686.getClass(), "loadFactor", 0.75F);
        setIntField(term13686, term13686.getClass(), "modCount", 0);
        setField(term13686, term13686.getClass(), "keySet", null);
        setField(term13686, term13686.getClass(), "entrySet", null);
        setField(term13686, term13686.getClass(), "values", null);
        setField(term13685, term13685.getClass(), "defaults", term13686);
        setField(term13685, term13685.getClass(), "file", "KoyGrUJeJW");
        setField(term13685, term13685.getClass(), "basePath", "HqBOwkVqjD");
        setField(term13685, term13685.getClass(), "fileSeparator", "/");
        setBooleanField(term13685, term13685.getClass(), "isInitialized", true);
        setField(term13685, term13685.getClass(), "keysAsListed", term13698);
        setIntField(term13701, term13701.getClass(), "hash", 1622173911);
        setField(term13701, term13701.getClass(), "key", term13702);
        setField(term13701, term13701.getClass(), "value", term13703);
        setField(term13701, term13701.getClass(), "next", null);
        setElement(term13700, 24, term13701);
        setIntField(term13704, term13704.getClass(), "hash", 592941388);
        setField(term13704, term13704.getClass(), "key", term13705);
        setField(term13704, term13704.getClass(), "value", term13706);
        setField(term13704, term13704.getClass(), "next", null);
        setElement(term13700, 33, term13704);
        setIntField(term13707, term13707.getClass(), "hash", 1250761143);
        setField(term13707, term13707.getClass(), "key", term13708);
        setField(term13707, term13707.getClass(), "value", term13709);
        setField(term13707, term13707.getClass(), "next", null);
        setElement(term13700, 126, term13707);
        setIntField(term13710, term13710.getClass(), "hash", 867113393);
        setField(term13710, term13710.getClass(), "key", term13711);
        setField(term13710, term13710.getClass(), "value", term13712);
        setField(term13710, term13710.getClass(), "next", null);
        setElement(term13700, 133, term13710);
        setField(term13685, term13685.getClass(), "table", term13700);
        setIntField(term13685, term13685.getClass(), "count", 1265463005);
        setIntField(term13685, term13685.getClass(), "threshold", 143);
        setFloatField(term13685, term13685.getClass(), "loadFactor", 0.75F);
        setIntField(term13685, term13685.getClass(), "modCount", 335112692);
        setField(term13685, term13685.getClass(), "keySet", term13713);
        setField(term13685, term13685.getClass(), "entrySet", term13715);
        setField(term13685, term13685.getClass(), "values", term13717);
        term13600 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        Object retValue = callMethod(klass, "getStringArray", argTypes, term3158, args);
        assertTrue(recursiveEquals(term3158, term13685));
        assertTrue(recursiveEquals(retValue, term13600));
    }

};


