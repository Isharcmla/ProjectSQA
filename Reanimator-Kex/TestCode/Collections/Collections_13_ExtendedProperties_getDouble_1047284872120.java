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
import java.lang.Double;

public class ExtendedProperties_getDouble_1047284872120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27368;
     Object term27460;
     Object term75387;

    public ExtendedProperties_getDouble_1047284872120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27374 = new ArrayList();
        ArrayList term27423 = new ArrayList();
        HashMap term27433 = new HashMap();
        Set<Object> term75445 =  ((Map) term27433).keySet();
        HashSet term27432 = new HashSet((Collection<? extends Object>) term75445);
        HashMap term27439 = new HashMap();
        Set<Object> term75446 =  ((Map) term27439).keySet();
        HashSet term27438 = new HashSet((Collection<? extends Object>) term75446);
        ArrayList term27444 = new ArrayList();
        term27368 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term27369 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term27378 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term27427 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term27369, term27369.getClass(), "defaults", null);
        setField(term27369, term27369.getClass(), "file", null);
        setField(term27369, term27369.getClass(), "basePath", null);
        setField(term27369, term27369.getClass(), "fileSeparator", "/");
        setBooleanField(term27369, term27369.getClass(), "isInitialized", false);
        setField(term27369, term27369.getClass(), "includePropertyName", null);
        setField(term27369, term27369.getClass(), "keysAsListed", term27374);
        setField(term27369, term27369.getClass(), "table", term27378);
        setIntField(term27369, term27369.getClass(), "count", 0);
        setIntField(term27369, term27369.getClass(), "threshold", 8);
        setFloatField(term27369, term27369.getClass(), "loadFactor", 0.75F);
        setIntField(term27369, term27369.getClass(), "modCount", 0);
        setField(term27369, term27369.getClass(), "keySet", null);
        setField(term27369, term27369.getClass(), "entrySet", null);
        setField(term27369, term27369.getClass(), "values", null);
        setField(term27368, term27368.getClass(), "defaults", term27369);
        setField(term27368, term27368.getClass(), "file", "vGiuZVPJNH");
        setField(term27368, term27368.getClass(), "basePath", "tlzpzIjMib");
        setField(term27368, term27368.getClass(), "fileSeparator", "/");
        setBooleanField(term27368, term27368.getClass(), "isInitialized", true);
        setField(term27368, term27368.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term27368, term27368.getClass(), "keysAsListed", term27423);
        setField(term27368, term27368.getClass(), "table", term27427);
        setIntField(term27368, term27368.getClass(), "count", 1830648570);
        setIntField(term27368, term27368.getClass(), "threshold", 8);
        setFloatField(term27368, term27368.getClass(), "loadFactor", 0.75F);
        setIntField(term27368, term27368.getClass(), "modCount", -227365013);
        setField(term27368, term27368.getClass(), "keySet", term27432);
        setField(term27368, term27368.getClass(), "entrySet", term27438);
        setField(term27368, term27368.getClass(), "values", term27444);
        term27460 = new Double(0.13238746331190498);
        ArrayList term75391 = new ArrayList();
        ArrayList term75402 = new ArrayList();
        HashMap term75406 = new HashMap();
        Set<Object> term75489 =  ((Map) term75406).keySet();
        HashSet term75405 = new HashSet((Collection<? extends Object>) term75489);
        HashMap term75408 = new HashMap();
        Set<Object> term75490 =  ((Map) term75408).keySet();
        HashSet term75407 = new HashSet((Collection<? extends Object>) term75490);
        ArrayList term75409 = new ArrayList();
        term75387 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term75388 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term75393 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term75404 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term75388, term75388.getClass(), "defaults", null);
        setField(term75388, term75388.getClass(), "file", null);
        setField(term75388, term75388.getClass(), "basePath", null);
        setField(term75388, term75388.getClass(), "fileSeparator", "/");
        setBooleanField(term75388, term75388.getClass(), "isInitialized", false);
        setField(term75388, term75388.getClass(), "includePropertyName", null);
        setField(term75388, term75388.getClass(), "keysAsListed", term75391);
        setField(term75388, term75388.getClass(), "table", term75393);
        setIntField(term75388, term75388.getClass(), "count", 0);
        setIntField(term75388, term75388.getClass(), "threshold", 8);
        setFloatField(term75388, term75388.getClass(), "loadFactor", 0.75F);
        setIntField(term75388, term75388.getClass(), "modCount", 0);
        setField(term75388, term75388.getClass(), "keySet", null);
        setField(term75388, term75388.getClass(), "entrySet", null);
        setField(term75388, term75388.getClass(), "values", null);
        setField(term75387, term75387.getClass(), "defaults", term75388);
        setField(term75387, term75387.getClass(), "file", "vGiuZVPJNH");
        setField(term75387, term75387.getClass(), "basePath", "tlzpzIjMib");
        setField(term75387, term75387.getClass(), "fileSeparator", "/");
        setBooleanField(term75387, term75387.getClass(), "isInitialized", true);
        setField(term75387, term75387.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term75387, term75387.getClass(), "keysAsListed", term75402);
        setField(term75387, term75387.getClass(), "table", term75404);
        setIntField(term75387, term75387.getClass(), "count", 1830648570);
        setIntField(term75387, term75387.getClass(), "threshold", 8);
        setFloatField(term75387, term75387.getClass(), "loadFactor", 0.75F);
        setIntField(term75387, term75387.getClass(), "modCount", -227365013);
        setField(term75387, term75387.getClass(), "keySet", term75405);
        setField(term75387, term75387.getClass(), "entrySet", term75407);
        setField(term75387, term75387.getClass(), "values", term75409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = "RMsXuyzKJV";
        args[1] = term27460;
        Object retValue = callMethod(klass, "getDouble", argTypes, term27368, args);
        assertTrue(recursiveEquals(term27368, term75387));
        assertTrue(recursiveEquals(term27460, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, 0.13238746331190498));
    }

};


