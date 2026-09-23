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

public class ExtendedProperties_getList_212223581993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3526;
     Object term14335;
     Object term14331;

    public ExtendedProperties_getList_212223581993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3532 = new ArrayList();
        ArrayList term3569 = new ArrayList();
        HashMap term3583 = new HashMap();
        Set<Object> term14384 =  ((Map) term3583).keySet();
        HashSet term3582 = new HashSet((Collection<? extends Object>) term14384);
        HashMap term3589 = new HashMap();
        Set<Object> term14385 =  ((Map) term3589).keySet();
        HashSet term3588 = new HashSet((Collection<? extends Object>) term14385);
        ArrayList term3594 = new ArrayList();
        term3526 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3527 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3536 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3573 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term3574 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3576 = newInstance(Class.forName("java.lang.Object"));
        Object term3577 = newInstance(Class.forName("java.lang.Object"));
        setField(term3527, term3527.getClass(), "defaults", null);
        setField(term3527, term3527.getClass(), "file", null);
        setField(term3527, term3527.getClass(), "basePath", null);
        setField(term3527, term3527.getClass(), "fileSeparator", "/");
        setBooleanField(term3527, term3527.getClass(), "isInitialized", false);
        setField(term3527, term3527.getClass(), "keysAsListed", term3532);
        setField(term3527, term3527.getClass(), "table", term3536);
        setIntField(term3527, term3527.getClass(), "count", 0);
        setIntField(term3527, term3527.getClass(), "threshold", 8);
        setFloatField(term3527, term3527.getClass(), "loadFactor", 0.75F);
        setIntField(term3527, term3527.getClass(), "modCount", 0);
        setField(term3527, term3527.getClass(), "keySet", null);
        setField(term3527, term3527.getClass(), "entrySet", null);
        setField(term3527, term3527.getClass(), "values", null);
        setField(term3526, term3526.getClass(), "defaults", term3527);
        setField(term3526, term3526.getClass(), "file", "jUbSRrkrYZ");
        setField(term3526, term3526.getClass(), "basePath", "bWWfajKbEX");
        setField(term3526, term3526.getClass(), "fileSeparator", "/");
        setBooleanField(term3526, term3526.getClass(), "isInitialized", false);
        setField(term3526, term3526.getClass(), "keysAsListed", term3569);
        setIntField(term3574, term3574.getClass(), "hash", 310248570);
        setField(term3574, term3574.getClass(), "key", term3576);
        setField(term3574, term3574.getClass(), "value", term3577);
        setField(term3574, term3574.getClass(), "next", null);
        setElement(term3573, 5, term3574);
        setField(term3526, term3526.getClass(), "table", term3573);
        setIntField(term3526, term3526.getClass(), "count", -481533956);
        setIntField(term3526, term3526.getClass(), "threshold", 8);
        setFloatField(term3526, term3526.getClass(), "loadFactor", 0.75F);
        setIntField(term3526, term3526.getClass(), "modCount", 1240914517);
        setField(term3526, term3526.getClass(), "keySet", term3582);
        setField(term3526, term3526.getClass(), "entrySet", term3588);
        setField(term3526, term3526.getClass(), "values", term3594);
        ArrayList term14339 = new ArrayList();
        ArrayList term14348 = new ArrayList();
        HashMap term14355 = new HashMap();
        Set<Object> term14418 =  ((Map) term14355).keySet();
        HashSet term14354 = new HashSet((Collection<? extends Object>) term14418);
        HashMap term14357 = new HashMap();
        Set<Object> term14419 =  ((Map) term14357).keySet();
        HashSet term14356 = new HashSet((Collection<? extends Object>) term14419);
        ArrayList term14358 = new ArrayList();
        term14335 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14336 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14341 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14350 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term14351 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term14352 = newInstance(Class.forName("java.lang.Object"));
        Object term14353 = newInstance(Class.forName("java.lang.Object"));
        setField(term14336, term14336.getClass(), "defaults", null);
        setField(term14336, term14336.getClass(), "file", null);
        setField(term14336, term14336.getClass(), "basePath", null);
        setField(term14336, term14336.getClass(), "fileSeparator", "/");
        setBooleanField(term14336, term14336.getClass(), "isInitialized", false);
        setField(term14336, term14336.getClass(), "keysAsListed", term14339);
        setField(term14336, term14336.getClass(), "table", term14341);
        setIntField(term14336, term14336.getClass(), "count", 0);
        setIntField(term14336, term14336.getClass(), "threshold", 8);
        setFloatField(term14336, term14336.getClass(), "loadFactor", 0.75F);
        setIntField(term14336, term14336.getClass(), "modCount", 0);
        setField(term14336, term14336.getClass(), "keySet", null);
        setField(term14336, term14336.getClass(), "entrySet", null);
        setField(term14336, term14336.getClass(), "values", null);
        setField(term14335, term14335.getClass(), "defaults", term14336);
        setField(term14335, term14335.getClass(), "file", "jUbSRrkrYZ");
        setField(term14335, term14335.getClass(), "basePath", "bWWfajKbEX");
        setField(term14335, term14335.getClass(), "fileSeparator", "/");
        setBooleanField(term14335, term14335.getClass(), "isInitialized", false);
        setField(term14335, term14335.getClass(), "keysAsListed", term14348);
        setIntField(term14351, term14351.getClass(), "hash", 310248570);
        setField(term14351, term14351.getClass(), "key", term14352);
        setField(term14351, term14351.getClass(), "value", term14353);
        setField(term14351, term14351.getClass(), "next", null);
        setElement(term14350, 5, term14351);
        setField(term14335, term14335.getClass(), "table", term14350);
        setIntField(term14335, term14335.getClass(), "count", -481533956);
        setIntField(term14335, term14335.getClass(), "threshold", 8);
        setFloatField(term14335, term14335.getClass(), "loadFactor", 0.75F);
        setIntField(term14335, term14335.getClass(), "modCount", 1240914517);
        setField(term14335, term14335.getClass(), "keySet", term14354);
        setField(term14335, term14335.getClass(), "entrySet", term14356);
        setField(term14335, term14335.getClass(), "values", term14358);
        term14331 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cAPeiZHKGJ";
        Object retValue = callMethod(klass, "getList", argTypes, term3526, args);
        assertTrue(recursiveEquals(term3526, term14335));
        assertTrue(recursiveEquals(retValue, term14331));
    }

};


