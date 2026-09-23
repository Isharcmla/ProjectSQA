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

public class ExtendedProperties_addPropertyDirect_200092761576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305;
     Object term1397;
     Object term10303;
     Object term10342;

    public ExtendedProperties_addPropertyDirect_200092761576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1311 = new ArrayList();
        ArrayList term1348 = new ArrayList();
        HashMap term1370 = new HashMap();
        Set<Object> term10365 =  ((Map) term1370).keySet();
        HashSet term1369 = new HashSet((Collection<? extends Object>) term10365);
        HashMap term1376 = new HashMap();
        Set<Object> term10366 =  ((Map) term1376).keySet();
        HashSet term1375 = new HashSet((Collection<? extends Object>) term10366);
        ArrayList term1381 = new ArrayList();
        term1305 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1306 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1315 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1352 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1353 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1355 = newInstance(Class.forName("java.lang.Object"));
        Object term1356 = newInstance(Class.forName("java.lang.Object"));
        Object term1357 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1359 = newInstance(Class.forName("java.lang.Object"));
        Object term1360 = newInstance(Class.forName("java.lang.Object"));
        Object term1361 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1363 = newInstance(Class.forName("java.lang.Object"));
        Object term1364 = newInstance(Class.forName("java.lang.Object"));
        setField(term1306, term1306.getClass(), "defaults", null);
        setField(term1306, term1306.getClass(), "file", null);
        setField(term1306, term1306.getClass(), "basePath", null);
        setField(term1306, term1306.getClass(), "fileSeparator", "/");
        setBooleanField(term1306, term1306.getClass(), "isInitialized", false);
        setField(term1306, term1306.getClass(), "keysAsListed", term1311);
        setField(term1306, term1306.getClass(), "table", term1315);
        setIntField(term1306, term1306.getClass(), "count", 0);
        setIntField(term1306, term1306.getClass(), "threshold", 8);
        setFloatField(term1306, term1306.getClass(), "loadFactor", 0.75F);
        setIntField(term1306, term1306.getClass(), "modCount", 0);
        setField(term1306, term1306.getClass(), "keySet", null);
        setField(term1306, term1306.getClass(), "entrySet", null);
        setField(term1306, term1306.getClass(), "values", null);
        setField(term1305, term1305.getClass(), "defaults", term1306);
        setField(term1305, term1305.getClass(), "file", "dWRymuLBtr");
        setField(term1305, term1305.getClass(), "basePath", "AijpHYOFuy");
        setField(term1305, term1305.getClass(), "fileSeparator", "/");
        setBooleanField(term1305, term1305.getClass(), "isInitialized", true);
        setField(term1305, term1305.getClass(), "keysAsListed", term1348);
        setIntField(term1353, term1353.getClass(), "hash", 1983293646);
        setField(term1353, term1353.getClass(), "key", term1355);
        setField(term1353, term1353.getClass(), "value", term1356);
        setField(term1353, term1353.getClass(), "next", null);
        setElement(term1352, 4, term1353);
        setIntField(term1357, term1357.getClass(), "hash", 1327711599);
        setField(term1357, term1357.getClass(), "key", term1359);
        setField(term1357, term1357.getClass(), "value", term1360);
        setField(term1357, term1357.getClass(), "next", null);
        setElement(term1352, 5, term1357);
        setIntField(term1361, term1361.getClass(), "hash", 627123713);
        setField(term1361, term1361.getClass(), "key", term1363);
        setField(term1361, term1361.getClass(), "value", term1364);
        setField(term1361, term1361.getClass(), "next", null);
        setElement(term1352, 7, term1361);
        setField(term1305, term1305.getClass(), "table", term1352);
        setIntField(term1305, term1305.getClass(), "count", -1275173081);
        setIntField(term1305, term1305.getClass(), "threshold", 8);
        setFloatField(term1305, term1305.getClass(), "loadFactor", 0.75F);
        setIntField(term1305, term1305.getClass(), "modCount", -244121223);
        setField(term1305, term1305.getClass(), "keySet", term1369);
        setField(term1305, term1305.getClass(), "entrySet", term1375);
        setField(term1305, term1305.getClass(), "values", term1381);
        term1397 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10307 = new ArrayList();
        ArrayList term10316 = new ArrayList();
        ((ArrayList) term10316).add("SbAoxhfrkn");
        HashMap term10335 = new HashMap();
        Set<Object> term10419 =  ((Map) term10335).keySet();
        HashSet term10334 = new HashSet((Collection<? extends Object>) term10419);
        HashMap term10337 = new HashMap();
        Set<Object> term10420 =  ((Map) term10337).keySet();
        HashSet term10336 = new HashSet((Collection<? extends Object>) term10420);
        ArrayList term10338 = new ArrayList();
        term10303 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term10304 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term10309 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term10320 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term10321 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10324 = newInstance(Class.forName("java.lang.Object"));
        Object term10325 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10326 = newInstance(Class.forName("java.lang.Object"));
        Object term10327 = newInstance(Class.forName("java.lang.Object"));
        Object term10328 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10329 = newInstance(Class.forName("java.lang.Object"));
        Object term10330 = newInstance(Class.forName("java.lang.Object"));
        Object term10331 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10332 = newInstance(Class.forName("java.lang.Object"));
        Object term10333 = newInstance(Class.forName("java.lang.Object"));
        setField(term10304, term10304.getClass(), "defaults", null);
        setField(term10304, term10304.getClass(), "file", null);
        setField(term10304, term10304.getClass(), "basePath", null);
        setField(term10304, term10304.getClass(), "fileSeparator", "/");
        setBooleanField(term10304, term10304.getClass(), "isInitialized", false);
        setField(term10304, term10304.getClass(), "keysAsListed", term10307);
        setField(term10304, term10304.getClass(), "table", term10309);
        setIntField(term10304, term10304.getClass(), "count", 0);
        setIntField(term10304, term10304.getClass(), "threshold", 8);
        setFloatField(term10304, term10304.getClass(), "loadFactor", 0.75F);
        setIntField(term10304, term10304.getClass(), "modCount", 0);
        setField(term10304, term10304.getClass(), "keySet", null);
        setField(term10304, term10304.getClass(), "entrySet", null);
        setField(term10304, term10304.getClass(), "values", null);
        setField(term10303, term10303.getClass(), "defaults", term10304);
        setField(term10303, term10303.getClass(), "file", "dWRymuLBtr");
        setField(term10303, term10303.getClass(), "basePath", "AijpHYOFuy");
        setField(term10303, term10303.getClass(), "fileSeparator", "/");
        setBooleanField(term10303, term10303.getClass(), "isInitialized", true);
        setField(term10303, term10303.getClass(), "keysAsListed", term10316);
        setIntField(term10321, term10321.getClass(), "hash", 414281564);
        setField(term10321, term10321.getClass(), "key", "SbAoxhfrkn");
        setField(term10321, term10321.getClass(), "value", term10324);
        setIntField(term10325, term10325.getClass(), "hash", 1983293646);
        setField(term10325, term10325.getClass(), "key", term10326);
        setField(term10325, term10325.getClass(), "value", term10327);
        setField(term10325, term10325.getClass(), "next", null);
        setField(term10321, term10321.getClass(), "next", term10325);
        setElement(term10320, 4, term10321);
        setIntField(term10328, term10328.getClass(), "hash", 1327711599);
        setField(term10328, term10328.getClass(), "key", term10329);
        setField(term10328, term10328.getClass(), "value", term10330);
        setField(term10328, term10328.getClass(), "next", null);
        setElement(term10320, 5, term10328);
        setIntField(term10331, term10331.getClass(), "hash", 627123713);
        setField(term10331, term10331.getClass(), "key", term10332);
        setField(term10331, term10331.getClass(), "value", term10333);
        setField(term10331, term10331.getClass(), "next", null);
        setElement(term10320, 7, term10331);
        setField(term10303, term10303.getClass(), "table", term10320);
        setIntField(term10303, term10303.getClass(), "count", -1275173080);
        setIntField(term10303, term10303.getClass(), "threshold", 8);
        setFloatField(term10303, term10303.getClass(), "loadFactor", 0.75F);
        setIntField(term10303, term10303.getClass(), "modCount", -244121222);
        setField(term10303, term10303.getClass(), "keySet", term10334);
        setField(term10303, term10303.getClass(), "entrySet", term10336);
        setField(term10303, term10303.getClass(), "values", term10338);
        term10342 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "SbAoxhfrkn";
        args[1] = term1397;
        callMethod(klass, "addPropertyDirect", argTypes, term1305, args);
        assertTrue(recursiveEquals(term1305, term10303));
        assertTrue(recursiveEquals(term1397, term10342));
    }

};


