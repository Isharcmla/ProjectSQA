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

public class ExtendedProperties_addPropertyInternal_138228817177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1432;
     Object term1520;
     Object term10549;
     Object term10585;

    public ExtendedProperties_addPropertyInternal_138228817177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1438 = new ArrayList();
        ArrayList term1475 = new ArrayList();
        HashMap term1493 = new HashMap();
        Set<Object> term10608 =  ((Map) term1493).keySet();
        HashSet term1492 = new HashSet((Collection<? extends Object>) term10608);
        HashMap term1499 = new HashMap();
        Set<Object> term10609 =  ((Map) term1499).keySet();
        HashSet term1498 = new HashSet((Collection<? extends Object>) term10609);
        ArrayList term1504 = new ArrayList();
        term1432 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1433 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1442 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1479 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1480 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1482 = newInstance(Class.forName("java.lang.Object"));
        Object term1483 = newInstance(Class.forName("java.lang.Object"));
        Object term1484 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1486 = newInstance(Class.forName("java.lang.Object"));
        Object term1487 = newInstance(Class.forName("java.lang.Object"));
        setField(term1433, term1433.getClass(), "defaults", null);
        setField(term1433, term1433.getClass(), "file", null);
        setField(term1433, term1433.getClass(), "basePath", null);
        setField(term1433, term1433.getClass(), "fileSeparator", "/");
        setBooleanField(term1433, term1433.getClass(), "isInitialized", false);
        setField(term1433, term1433.getClass(), "keysAsListed", term1438);
        setField(term1433, term1433.getClass(), "table", term1442);
        setIntField(term1433, term1433.getClass(), "count", 0);
        setIntField(term1433, term1433.getClass(), "threshold", 8);
        setFloatField(term1433, term1433.getClass(), "loadFactor", 0.75F);
        setIntField(term1433, term1433.getClass(), "modCount", 0);
        setField(term1433, term1433.getClass(), "keySet", null);
        setField(term1433, term1433.getClass(), "entrySet", null);
        setField(term1433, term1433.getClass(), "values", null);
        setField(term1432, term1432.getClass(), "defaults", term1433);
        setField(term1432, term1432.getClass(), "file", "kuTXqwMtDB");
        setField(term1432, term1432.getClass(), "basePath", "Ghbwtircqb");
        setField(term1432, term1432.getClass(), "fileSeparator", "/");
        setBooleanField(term1432, term1432.getClass(), "isInitialized", false);
        setField(term1432, term1432.getClass(), "keysAsListed", term1475);
        setIntField(term1480, term1480.getClass(), "hash", 1911063693);
        setField(term1480, term1480.getClass(), "key", term1482);
        setField(term1480, term1480.getClass(), "value", term1483);
        setField(term1480, term1480.getClass(), "next", null);
        setElement(term1479, 0, term1480);
        setIntField(term1484, term1484.getClass(), "hash", 1296313994);
        setField(term1484, term1484.getClass(), "key", term1486);
        setField(term1484, term1484.getClass(), "value", term1487);
        setField(term1484, term1484.getClass(), "next", null);
        setElement(term1479, 8, term1484);
        setField(term1432, term1432.getClass(), "table", term1479);
        setIntField(term1432, term1432.getClass(), "count", -1179120540);
        setIntField(term1432, term1432.getClass(), "threshold", 8);
        setFloatField(term1432, term1432.getClass(), "loadFactor", 0.75F);
        setIntField(term1432, term1432.getClass(), "modCount", -73683643);
        setField(term1432, term1432.getClass(), "keySet", term1492);
        setField(term1432, term1432.getClass(), "entrySet", term1498);
        setField(term1432, term1432.getClass(), "values", term1504);
        term1520 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10553 = new ArrayList();
        ArrayList term10562 = new ArrayList();
        ((ArrayList) term10562).add("xrwlQZdwCp");
        HashMap term10578 = new HashMap();
        Set<Object> term10662 =  ((Map) term10578).keySet();
        HashSet term10577 = new HashSet((Collection<? extends Object>) term10662);
        HashMap term10580 = new HashMap();
        Set<Object> term10663 =  ((Map) term10580).keySet();
        HashSet term10579 = new HashSet((Collection<? extends Object>) term10663);
        ArrayList term10581 = new ArrayList();
        term10549 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term10550 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term10555 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term10566 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term10567 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10568 = newInstance(Class.forName("java.lang.Object"));
        Object term10569 = newInstance(Class.forName("java.lang.Object"));
        Object term10570 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10573 = newInstance(Class.forName("java.lang.Object"));
        Object term10574 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10575 = newInstance(Class.forName("java.lang.Object"));
        Object term10576 = newInstance(Class.forName("java.lang.Object"));
        setField(term10550, term10550.getClass(), "defaults", null);
        setField(term10550, term10550.getClass(), "file", null);
        setField(term10550, term10550.getClass(), "basePath", null);
        setField(term10550, term10550.getClass(), "fileSeparator", "/");
        setBooleanField(term10550, term10550.getClass(), "isInitialized", false);
        setField(term10550, term10550.getClass(), "keysAsListed", term10553);
        setField(term10550, term10550.getClass(), "table", term10555);
        setIntField(term10550, term10550.getClass(), "count", 0);
        setIntField(term10550, term10550.getClass(), "threshold", 8);
        setFloatField(term10550, term10550.getClass(), "loadFactor", 0.75F);
        setIntField(term10550, term10550.getClass(), "modCount", 0);
        setField(term10550, term10550.getClass(), "keySet", null);
        setField(term10550, term10550.getClass(), "entrySet", null);
        setField(term10550, term10550.getClass(), "values", null);
        setField(term10549, term10549.getClass(), "defaults", term10550);
        setField(term10549, term10549.getClass(), "file", "kuTXqwMtDB");
        setField(term10549, term10549.getClass(), "basePath", "Ghbwtircqb");
        setField(term10549, term10549.getClass(), "fileSeparator", "/");
        setBooleanField(term10549, term10549.getClass(), "isInitialized", false);
        setField(term10549, term10549.getClass(), "keysAsListed", term10562);
        setIntField(term10567, term10567.getClass(), "hash", 1911063693);
        setField(term10567, term10567.getClass(), "key", term10568);
        setField(term10567, term10567.getClass(), "value", term10569);
        setField(term10567, term10567.getClass(), "next", null);
        setElement(term10566, 0, term10567);
        setIntField(term10570, term10570.getClass(), "hash", -1290839528);
        setField(term10570, term10570.getClass(), "key", "xrwlQZdwCp");
        setField(term10570, term10570.getClass(), "value", term10573);
        setField(term10570, term10570.getClass(), "next", null);
        setElement(term10566, 2, term10570);
        setIntField(term10574, term10574.getClass(), "hash", 1296313994);
        setField(term10574, term10574.getClass(), "key", term10575);
        setField(term10574, term10574.getClass(), "value", term10576);
        setField(term10574, term10574.getClass(), "next", null);
        setElement(term10566, 8, term10574);
        setField(term10549, term10549.getClass(), "table", term10566);
        setIntField(term10549, term10549.getClass(), "count", -1179120539);
        setIntField(term10549, term10549.getClass(), "threshold", 8);
        setFloatField(term10549, term10549.getClass(), "loadFactor", 0.75F);
        setIntField(term10549, term10549.getClass(), "modCount", -73683642);
        setField(term10549, term10549.getClass(), "keySet", term10577);
        setField(term10549, term10549.getClass(), "entrySet", term10579);
        setField(term10549, term10549.getClass(), "values", term10581);
        term10585 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "xrwlQZdwCp";
        args[1] = term1520;
        callMethod(klass, "addPropertyInternal", argTypes, term1432, args);
        assertTrue(recursiveEquals(term1432, term10549));
        assertTrue(recursiveEquals(term1520, term10585));
    }

};


