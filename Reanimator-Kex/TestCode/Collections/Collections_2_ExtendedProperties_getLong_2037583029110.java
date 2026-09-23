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

public class ExtendedProperties_getLong_2037583029110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5781;

    public ExtendedProperties_getLong_2037583029110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5787 = new ArrayList();
        ArrayList term5824 = new ArrayList();
        HashMap term5838 = new HashMap();
        Set<Object> term20040 =  ((Map) term5838).keySet();
        HashSet term5837 = new HashSet((Collection<? extends Object>) term20040);
        HashMap term5844 = new HashMap();
        Set<Object> term20041 =  ((Map) term5844).keySet();
        HashSet term5843 = new HashSet((Collection<? extends Object>) term20041);
        ArrayList term5849 = new ArrayList();
        term5781 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5782 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5791 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5828 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5829 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5831 = newInstance(Class.forName("java.lang.Object"));
        Object term5832 = newInstance(Class.forName("java.lang.Object"));
        setField(term5782, term5782.getClass(), "defaults", null);
        setField(term5782, term5782.getClass(), "file", null);
        setField(term5782, term5782.getClass(), "basePath", null);
        setField(term5782, term5782.getClass(), "fileSeparator", "/");
        setBooleanField(term5782, term5782.getClass(), "isInitialized", false);
        setField(term5782, term5782.getClass(), "keysAsListed", term5787);
        setField(term5782, term5782.getClass(), "table", term5791);
        setIntField(term5782, term5782.getClass(), "count", 0);
        setIntField(term5782, term5782.getClass(), "threshold", 8);
        setFloatField(term5782, term5782.getClass(), "loadFactor", 0.75F);
        setIntField(term5782, term5782.getClass(), "modCount", 0);
        setField(term5782, term5782.getClass(), "keySet", null);
        setField(term5782, term5782.getClass(), "entrySet", null);
        setField(term5782, term5782.getClass(), "values", null);
        setField(term5781, term5781.getClass(), "defaults", term5782);
        setField(term5781, term5781.getClass(), "file", "EYtfuJaxiM");
        setField(term5781, term5781.getClass(), "basePath", "gCWtLVKVVe");
        setField(term5781, term5781.getClass(), "fileSeparator", "/");
        setBooleanField(term5781, term5781.getClass(), "isInitialized", true);
        setField(term5781, term5781.getClass(), "keysAsListed", term5824);
        setIntField(term5829, term5829.getClass(), "hash", 874338375);
        setField(term5829, term5829.getClass(), "key", term5831);
        setField(term5829, term5829.getClass(), "value", term5832);
        setField(term5829, term5829.getClass(), "next", null);
        setElement(term5828, 9, term5829);
        setField(term5781, term5781.getClass(), "table", term5828);
        setIntField(term5781, term5781.getClass(), "count", -1963464808);
        setIntField(term5781, term5781.getClass(), "threshold", 8);
        setFloatField(term5781, term5781.getClass(), "loadFactor", 0.75F);
        setIntField(term5781, term5781.getClass(), "modCount", 71190298);
        setField(term5781, term5781.getClass(), "keySet", term5837);
        setField(term5781, term5781.getClass(), "entrySet", term5843);
        setField(term5781, term5781.getClass(), "values", term5849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        try {
            callMethod(klass, "getLong", argTypes, term5781, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


