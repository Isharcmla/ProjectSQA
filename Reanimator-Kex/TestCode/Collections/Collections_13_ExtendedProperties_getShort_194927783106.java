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
import java.lang.Short;

public class ExtendedProperties_getShort_194927783106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18044;
     Object term18193;
     Object term59430;

    public ExtendedProperties_getShort_194927783106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18050 = new ArrayList();
        ArrayList term18099 = new ArrayList();
        ((ArrayList) term18099).add("java.lang.Object@13094c4d");
        HashMap term18166 = new HashMap();
        Set<Object> term59544 =  ((Map) term18166).keySet();
        HashSet term18165 = new HashSet((Collection<? extends Object>) term59544);
        HashMap term18172 = new HashMap();
        Set<Object> term59545 =  ((Map) term18172).keySet();
        HashSet term18171 = new HashSet((Collection<? extends Object>) term59545);
        ArrayList term18177 = new ArrayList();
        term18044 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term18045 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term18054 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term18130 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term18131 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18160 = newInstance(Class.forName("java.lang.Object"));
        setField(term18045, term18045.getClass(), "defaults", null);
        setField(term18045, term18045.getClass(), "file", null);
        setField(term18045, term18045.getClass(), "basePath", null);
        setField(term18045, term18045.getClass(), "fileSeparator", "/");
        setBooleanField(term18045, term18045.getClass(), "isInitialized", false);
        setField(term18045, term18045.getClass(), "includePropertyName", null);
        setField(term18045, term18045.getClass(), "keysAsListed", term18050);
        setField(term18045, term18045.getClass(), "table", term18054);
        setIntField(term18045, term18045.getClass(), "count", 0);
        setIntField(term18045, term18045.getClass(), "threshold", 8);
        setFloatField(term18045, term18045.getClass(), "loadFactor", 0.75F);
        setIntField(term18045, term18045.getClass(), "modCount", 0);
        setField(term18045, term18045.getClass(), "keySet", null);
        setField(term18045, term18045.getClass(), "entrySet", null);
        setField(term18045, term18045.getClass(), "values", null);
        setField(term18044, term18044.getClass(), "defaults", term18045);
        setField(term18044, term18044.getClass(), "file", "HzqpegHiRq");
        setField(term18044, term18044.getClass(), "basePath", "jwsfVjMoJT");
        setField(term18044, term18044.getClass(), "fileSeparator", "/");
        setBooleanField(term18044, term18044.getClass(), "isInitialized", true);
        setField(term18044, term18044.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term18044, term18044.getClass(), "keysAsListed", term18099);
        setIntField(term18131, term18131.getClass(), "hash", -711804969);
        setField(term18131, term18131.getClass(), "key", "java.lang.Object@13094c4d");
        setField(term18131, term18131.getClass(), "value", term18160);
        setField(term18131, term18131.getClass(), "next", null);
        setElement(term18130, 6, term18131);
        setField(term18044, term18044.getClass(), "table", term18130);
        setIntField(term18044, term18044.getClass(), "count", -1801760682);
        setIntField(term18044, term18044.getClass(), "threshold", 8);
        setFloatField(term18044, term18044.getClass(), "loadFactor", 0.75F);
        setIntField(term18044, term18044.getClass(), "modCount", 1141317872);
        setField(term18044, term18044.getClass(), "keySet", term18165);
        setField(term18044, term18044.getClass(), "entrySet", term18171);
        setField(term18044, term18044.getClass(), "values", term18177);
        term18193 = new Short((short) 9519);
        ArrayList term59434 = new ArrayList();
        ArrayList term59445 = new ArrayList();
        ((ArrayList) term59445).add("java.lang.Object@13094c4d");
        HashMap term59455 = new HashMap();
        Set<Object> term59638 =  ((Map) term59455).keySet();
        HashSet term59454 = new HashSet((Collection<? extends Object>) term59638);
        HashMap term59457 = new HashMap();
        Set<Object> term59639 =  ((Map) term59457).keySet();
        HashSet term59456 = new HashSet((Collection<? extends Object>) term59639);
        ArrayList term59458 = new ArrayList();
        term59430 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term59431 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term59436 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term59449 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term59450 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term59453 = newInstance(Class.forName("java.lang.Object"));
        setField(term59431, term59431.getClass(), "defaults", null);
        setField(term59431, term59431.getClass(), "file", null);
        setField(term59431, term59431.getClass(), "basePath", null);
        setField(term59431, term59431.getClass(), "fileSeparator", "/");
        setBooleanField(term59431, term59431.getClass(), "isInitialized", false);
        setField(term59431, term59431.getClass(), "includePropertyName", null);
        setField(term59431, term59431.getClass(), "keysAsListed", term59434);
        setField(term59431, term59431.getClass(), "table", term59436);
        setIntField(term59431, term59431.getClass(), "count", 0);
        setIntField(term59431, term59431.getClass(), "threshold", 8);
        setFloatField(term59431, term59431.getClass(), "loadFactor", 0.75F);
        setIntField(term59431, term59431.getClass(), "modCount", 0);
        setField(term59431, term59431.getClass(), "keySet", null);
        setField(term59431, term59431.getClass(), "entrySet", null);
        setField(term59431, term59431.getClass(), "values", null);
        setField(term59430, term59430.getClass(), "defaults", term59431);
        setField(term59430, term59430.getClass(), "file", "HzqpegHiRq");
        setField(term59430, term59430.getClass(), "basePath", "jwsfVjMoJT");
        setField(term59430, term59430.getClass(), "fileSeparator", "/");
        setBooleanField(term59430, term59430.getClass(), "isInitialized", true);
        setField(term59430, term59430.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term59430, term59430.getClass(), "keysAsListed", term59445);
        setIntField(term59450, term59450.getClass(), "hash", -711804969);
        setField(term59450, term59450.getClass(), "key", "java.lang.Object@13094c4d");
        setField(term59450, term59450.getClass(), "value", term59453);
        setField(term59450, term59450.getClass(), "next", null);
        setElement(term59449, 6, term59450);
        setField(term59430, term59430.getClass(), "table", term59449);
        setIntField(term59430, term59430.getClass(), "count", -1801760682);
        setIntField(term59430, term59430.getClass(), "threshold", 8);
        setFloatField(term59430, term59430.getClass(), "loadFactor", 0.75F);
        setIntField(term59430, term59430.getClass(), "modCount", 1141317872);
        setField(term59430, term59430.getClass(), "keySet", term59454);
        setField(term59430, term59430.getClass(), "entrySet", term59456);
        setField(term59430, term59430.getClass(), "values", term59458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = "MwwjNtdOFT";
        args[1] = term18193;
        Object retValue = callMethod(klass, "getShort", argTypes, term18044, args);
        assertTrue(recursiveEquals(term18044, term59430));
        assertTrue(recursiveEquals(term18193, (short) 9519));
        assertTrue(recursiveEquals(retValue, (short) 9519));
    }

};


