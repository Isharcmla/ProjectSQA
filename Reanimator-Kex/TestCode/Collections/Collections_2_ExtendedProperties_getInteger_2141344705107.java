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

public class ExtendedProperties_getInteger_2141344705107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5351;

    public ExtendedProperties_getInteger_2141344705107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5357 = new ArrayList();
        ArrayList term5394 = new ArrayList();
        HashMap term5416 = new HashMap();
        Set<Object> term19018 =  ((Map) term5416).keySet();
        HashSet term5415 = new HashSet((Collection<? extends Object>) term19018);
        HashMap term5422 = new HashMap();
        Set<Object> term19019 =  ((Map) term5422).keySet();
        HashSet term5421 = new HashSet((Collection<? extends Object>) term19019);
        ArrayList term5427 = new ArrayList();
        term5351 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5352 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5361 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5398 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term5399 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5401 = newInstance(Class.forName("java.lang.Object"));
        Object term5402 = newInstance(Class.forName("java.lang.Object"));
        Object term5403 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5405 = newInstance(Class.forName("java.lang.Object"));
        Object term5406 = newInstance(Class.forName("java.lang.Object"));
        Object term5407 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5409 = newInstance(Class.forName("java.lang.Object"));
        Object term5410 = newInstance(Class.forName("java.lang.Object"));
        setField(term5352, term5352.getClass(), "defaults", null);
        setField(term5352, term5352.getClass(), "file", null);
        setField(term5352, term5352.getClass(), "basePath", null);
        setField(term5352, term5352.getClass(), "fileSeparator", "/");
        setBooleanField(term5352, term5352.getClass(), "isInitialized", false);
        setField(term5352, term5352.getClass(), "keysAsListed", term5357);
        setField(term5352, term5352.getClass(), "table", term5361);
        setIntField(term5352, term5352.getClass(), "count", 0);
        setIntField(term5352, term5352.getClass(), "threshold", 8);
        setFloatField(term5352, term5352.getClass(), "loadFactor", 0.75F);
        setIntField(term5352, term5352.getClass(), "modCount", 0);
        setField(term5352, term5352.getClass(), "keySet", null);
        setField(term5352, term5352.getClass(), "entrySet", null);
        setField(term5352, term5352.getClass(), "values", null);
        setField(term5351, term5351.getClass(), "defaults", term5352);
        setField(term5351, term5351.getClass(), "file", "AdxvLJhNLe");
        setField(term5351, term5351.getClass(), "basePath", "lHfTrWKMPk");
        setField(term5351, term5351.getClass(), "fileSeparator", "/");
        setBooleanField(term5351, term5351.getClass(), "isInitialized", true);
        setField(term5351, term5351.getClass(), "keysAsListed", term5394);
        setIntField(term5399, term5399.getClass(), "hash", 1486791612);
        setField(term5399, term5399.getClass(), "key", term5401);
        setField(term5399, term5399.getClass(), "value", term5402);
        setField(term5399, term5399.getClass(), "next", null);
        setElement(term5398, 2, term5399);
        setIntField(term5403, term5403.getClass(), "hash", 1745336919);
        setField(term5403, term5403.getClass(), "key", term5405);
        setField(term5403, term5403.getClass(), "value", term5406);
        setField(term5403, term5403.getClass(), "next", null);
        setElement(term5398, 54, term5403);
        setIntField(term5407, term5407.getClass(), "hash", 185109083);
        setField(term5407, term5407.getClass(), "key", term5409);
        setField(term5407, term5407.getClass(), "value", term5410);
        setField(term5407, term5407.getClass(), "next", null);
        setElement(term5398, 63, term5407);
        setField(term5351, term5351.getClass(), "table", term5398);
        setIntField(term5351, term5351.getClass(), "count", 53410916);
        setIntField(term5351, term5351.getClass(), "threshold", 71);
        setFloatField(term5351, term5351.getClass(), "loadFactor", 0.75F);
        setIntField(term5351, term5351.getClass(), "modCount", -375014952);
        setField(term5351, term5351.getClass(), "keySet", term5415);
        setField(term5351, term5351.getClass(), "entrySet", term5421);
        setField(term5351, term5351.getClass(), "values", term5427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        try {
            callMethod(klass, "getInteger", argTypes, term5351, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


