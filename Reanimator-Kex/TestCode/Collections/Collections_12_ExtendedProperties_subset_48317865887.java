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

public class ExtendedProperties_subset_48317865887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9651;
     Object term45676;

    public ExtendedProperties_subset_48317865887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9657 = new ArrayList();
        ArrayList term9706 = new ArrayList();
        HashMap term9716 = new HashMap();
        Set<Object> term45734 =  ((Map) term9716).keySet();
        HashSet term9715 = new HashSet((Collection<? extends Object>) term45734);
        HashMap term9722 = new HashMap();
        Set<Object> term45735 =  ((Map) term9722).keySet();
        HashSet term9721 = new HashSet((Collection<? extends Object>) term45735);
        ArrayList term9727 = new ArrayList();
        term9651 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term9652 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term9661 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term9710 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term9652, term9652.getClass(), "defaults", null);
        setField(term9652, term9652.getClass(), "file", null);
        setField(term9652, term9652.getClass(), "basePath", null);
        setField(term9652, term9652.getClass(), "fileSeparator", "/");
        setBooleanField(term9652, term9652.getClass(), "isInitialized", false);
        setField(term9652, term9652.getClass(), "includePropertyName", null);
        setField(term9652, term9652.getClass(), "keysAsListed", term9657);
        setField(term9652, term9652.getClass(), "table", term9661);
        setIntField(term9652, term9652.getClass(), "count", 0);
        setIntField(term9652, term9652.getClass(), "threshold", 8);
        setFloatField(term9652, term9652.getClass(), "loadFactor", 0.75F);
        setIntField(term9652, term9652.getClass(), "modCount", 0);
        setField(term9652, term9652.getClass(), "keySet", null);
        setField(term9652, term9652.getClass(), "entrySet", null);
        setField(term9652, term9652.getClass(), "values", null);
        setField(term9651, term9651.getClass(), "defaults", term9652);
        setField(term9651, term9651.getClass(), "file", "KoyGrUJeJW");
        setField(term9651, term9651.getClass(), "basePath", "HqBOwkVqjD");
        setField(term9651, term9651.getClass(), "fileSeparator", "/");
        setBooleanField(term9651, term9651.getClass(), "isInitialized", false);
        setField(term9651, term9651.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term9651, term9651.getClass(), "keysAsListed", term9706);
        setField(term9651, term9651.getClass(), "table", term9710);
        setIntField(term9651, term9651.getClass(), "count", 292681826);
        setIntField(term9651, term9651.getClass(), "threshold", 8);
        setFloatField(term9651, term9651.getClass(), "loadFactor", 0.75F);
        setIntField(term9651, term9651.getClass(), "modCount", 458147407);
        setField(term9651, term9651.getClass(), "keySet", term9715);
        setField(term9651, term9651.getClass(), "entrySet", term9721);
        setField(term9651, term9651.getClass(), "values", term9727);
        ArrayList term45680 = new ArrayList();
        ArrayList term45691 = new ArrayList();
        HashMap term45695 = new HashMap();
        Set<Object> term45778 =  ((Map) term45695).keySet();
        HashSet term45694 = new HashSet((Collection<? extends Object>) term45778);
        HashMap term45697 = new HashMap();
        Set<Object> term45779 =  ((Map) term45697).keySet();
        HashSet term45696 = new HashSet((Collection<? extends Object>) term45779);
        ArrayList term45698 = new ArrayList();
        term45676 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term45677 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term45682 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term45693 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term45677, term45677.getClass(), "defaults", null);
        setField(term45677, term45677.getClass(), "file", null);
        setField(term45677, term45677.getClass(), "basePath", null);
        setField(term45677, term45677.getClass(), "fileSeparator", "/");
        setBooleanField(term45677, term45677.getClass(), "isInitialized", false);
        setField(term45677, term45677.getClass(), "includePropertyName", null);
        setField(term45677, term45677.getClass(), "keysAsListed", term45680);
        setField(term45677, term45677.getClass(), "table", term45682);
        setIntField(term45677, term45677.getClass(), "count", 0);
        setIntField(term45677, term45677.getClass(), "threshold", 8);
        setFloatField(term45677, term45677.getClass(), "loadFactor", 0.75F);
        setIntField(term45677, term45677.getClass(), "modCount", 0);
        setField(term45677, term45677.getClass(), "keySet", null);
        setField(term45677, term45677.getClass(), "entrySet", null);
        setField(term45677, term45677.getClass(), "values", null);
        setField(term45676, term45676.getClass(), "defaults", term45677);
        setField(term45676, term45676.getClass(), "file", "KoyGrUJeJW");
        setField(term45676, term45676.getClass(), "basePath", "HqBOwkVqjD");
        setField(term45676, term45676.getClass(), "fileSeparator", "/");
        setBooleanField(term45676, term45676.getClass(), "isInitialized", false);
        setField(term45676, term45676.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term45676, term45676.getClass(), "keysAsListed", term45691);
        setField(term45676, term45676.getClass(), "table", term45693);
        setIntField(term45676, term45676.getClass(), "count", 292681826);
        setIntField(term45676, term45676.getClass(), "threshold", 8);
        setFloatField(term45676, term45676.getClass(), "loadFactor", 0.75F);
        setIntField(term45676, term45676.getClass(), "modCount", 458147407);
        setField(term45676, term45676.getClass(), "keySet", term45694);
        setField(term45676, term45676.getClass(), "entrySet", term45696);
        setField(term45676, term45676.getClass(), "values", term45698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "subset", argTypes, term9651, args);
        assertTrue(recursiveEquals(term9651, term45676));
        assertTrue(recursiveEquals(retValue, null));
    }

};


