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

public class ExtendedProperties_addProperty_55335404078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5409;
     Object term5501;
     Object term37899;
     Object term37931;

    public ExtendedProperties_addProperty_55335404078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5415 = new ArrayList();
        ArrayList term5464 = new ArrayList();
        HashMap term5474 = new HashMap();
        Set<Object> term37964 =  ((Map) term5474).keySet();
        HashSet term5473 = new HashSet((Collection<? extends Object>) term37964);
        HashMap term5480 = new HashMap();
        Set<Object> term37965 =  ((Map) term5480).keySet();
        HashSet term5479 = new HashSet((Collection<? extends Object>) term37965);
        ArrayList term5485 = new ArrayList();
        term5409 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5410 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5419 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5468 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term5410, term5410.getClass(), "defaults", null);
        setField(term5410, term5410.getClass(), "file", null);
        setField(term5410, term5410.getClass(), "basePath", null);
        setField(term5410, term5410.getClass(), "fileSeparator", "/");
        setBooleanField(term5410, term5410.getClass(), "isInitialized", false);
        setField(term5410, term5410.getClass(), "includePropertyName", null);
        setField(term5410, term5410.getClass(), "keysAsListed", term5415);
        setField(term5410, term5410.getClass(), "table", term5419);
        setIntField(term5410, term5410.getClass(), "count", 0);
        setIntField(term5410, term5410.getClass(), "threshold", 8);
        setFloatField(term5410, term5410.getClass(), "loadFactor", 0.75F);
        setIntField(term5410, term5410.getClass(), "modCount", 0);
        setField(term5410, term5410.getClass(), "keySet", null);
        setField(term5410, term5410.getClass(), "entrySet", null);
        setField(term5410, term5410.getClass(), "values", null);
        setField(term5409, term5409.getClass(), "defaults", term5410);
        setField(term5409, term5409.getClass(), "file", "xrwlQZdwCp");
        setField(term5409, term5409.getClass(), "basePath", "IDCWpPLRkE");
        setField(term5409, term5409.getClass(), "fileSeparator", "/");
        setBooleanField(term5409, term5409.getClass(), "isInitialized", false);
        setField(term5409, term5409.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term5409, term5409.getClass(), "keysAsListed", term5464);
        setField(term5409, term5409.getClass(), "table", term5468);
        setIntField(term5409, term5409.getClass(), "count", 1135664017);
        setIntField(term5409, term5409.getClass(), "threshold", 8);
        setFloatField(term5409, term5409.getClass(), "loadFactor", 0.75F);
        setIntField(term5409, term5409.getClass(), "modCount", 590364439);
        setField(term5409, term5409.getClass(), "keySet", term5473);
        setField(term5409, term5409.getClass(), "entrySet", term5479);
        setField(term5409, term5409.getClass(), "values", term5485);
        term5501 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term37903 = new ArrayList();
        ArrayList term37914 = new ArrayList();
        ((ArrayList) term37914).add("aKnKipADSo");
        HashMap term37924 = new HashMap();
        Set<Object> term38028 =  ((Map) term37924).keySet();
        HashSet term37923 = new HashSet((Collection<? extends Object>) term38028);
        HashMap term37926 = new HashMap();
        Set<Object> term38029 =  ((Map) term37926).keySet();
        HashSet term37925 = new HashSet((Collection<? extends Object>) term38029);
        ArrayList term37927 = new ArrayList();
        term37899 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term37900 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term37905 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term37918 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term37919 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term37922 = newInstance(Class.forName("java.lang.Object"));
        setField(term37900, term37900.getClass(), "defaults", null);
        setField(term37900, term37900.getClass(), "file", null);
        setField(term37900, term37900.getClass(), "basePath", null);
        setField(term37900, term37900.getClass(), "fileSeparator", "/");
        setBooleanField(term37900, term37900.getClass(), "isInitialized", false);
        setField(term37900, term37900.getClass(), "includePropertyName", null);
        setField(term37900, term37900.getClass(), "keysAsListed", term37903);
        setField(term37900, term37900.getClass(), "table", term37905);
        setIntField(term37900, term37900.getClass(), "count", 0);
        setIntField(term37900, term37900.getClass(), "threshold", 8);
        setFloatField(term37900, term37900.getClass(), "loadFactor", 0.75F);
        setIntField(term37900, term37900.getClass(), "modCount", 0);
        setField(term37900, term37900.getClass(), "keySet", null);
        setField(term37900, term37900.getClass(), "entrySet", null);
        setField(term37900, term37900.getClass(), "values", null);
        setField(term37899, term37899.getClass(), "defaults", term37900);
        setField(term37899, term37899.getClass(), "file", "xrwlQZdwCp");
        setField(term37899, term37899.getClass(), "basePath", "IDCWpPLRkE");
        setField(term37899, term37899.getClass(), "fileSeparator", "/");
        setBooleanField(term37899, term37899.getClass(), "isInitialized", true);
        setField(term37899, term37899.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term37899, term37899.getClass(), "keysAsListed", term37914);
        setIntField(term37919, term37919.getClass(), "hash", -611664531);
        setField(term37919, term37919.getClass(), "key", "aKnKipADSo");
        setField(term37919, term37919.getClass(), "value", term37922);
        setField(term37919, term37919.getClass(), "next", null);
        setElement(term37918, 5, term37919);
        setField(term37899, term37899.getClass(), "table", term37918);
        setIntField(term37899, term37899.getClass(), "count", 1135664018);
        setIntField(term37899, term37899.getClass(), "threshold", 17);
        setFloatField(term37899, term37899.getClass(), "loadFactor", 0.75F);
        setIntField(term37899, term37899.getClass(), "modCount", 590364441);
        setField(term37899, term37899.getClass(), "keySet", term37923);
        setField(term37899, term37899.getClass(), "entrySet", term37925);
        setField(term37899, term37899.getClass(), "values", term37927);
        term37931 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "aKnKipADSo";
        args[1] = term5501;
        callMethod(klass, "addProperty", argTypes, term5409, args);
        assertTrue(recursiveEquals(term5409, term37899));
        assertTrue(recursiveEquals(term5501, term37931));
    }

};


