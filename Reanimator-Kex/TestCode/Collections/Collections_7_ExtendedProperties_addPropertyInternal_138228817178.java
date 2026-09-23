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

public class ExtendedProperties_addPropertyInternal_138228817178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;
     Object term1756;
     Object term12665;
     Object term12703;

    public ExtendedProperties_addPropertyInternal_138228817178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1662 = new ArrayList();
        ArrayList term1711 = new ArrayList();
        HashMap term1729 = new HashMap();
        Set<Object> term12736 =  ((Map) term1729).keySet();
        HashSet term1728 = new HashSet((Collection<? extends Object>) term12736);
        HashMap term1735 = new HashMap();
        Set<Object> term12737 =  ((Map) term1735).keySet();
        HashSet term1734 = new HashSet((Collection<? extends Object>) term12737);
        ArrayList term1740 = new ArrayList();
        term1656 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1657 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1666 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1715 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1716 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1718 = newInstance(Class.forName("java.lang.Object"));
        Object term1719 = newInstance(Class.forName("java.lang.Object"));
        Object term1720 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1722 = newInstance(Class.forName("java.lang.Object"));
        Object term1723 = newInstance(Class.forName("java.lang.Object"));
        setField(term1657, term1657.getClass(), "defaults", null);
        setField(term1657, term1657.getClass(), "file", null);
        setField(term1657, term1657.getClass(), "basePath", null);
        setField(term1657, term1657.getClass(), "fileSeparator", "/");
        setBooleanField(term1657, term1657.getClass(), "isInitialized", false);
        setField(term1657, term1657.getClass(), "includePropertyName", null);
        setField(term1657, term1657.getClass(), "keysAsListed", term1662);
        setField(term1657, term1657.getClass(), "table", term1666);
        setIntField(term1657, term1657.getClass(), "count", 0);
        setIntField(term1657, term1657.getClass(), "threshold", 8);
        setFloatField(term1657, term1657.getClass(), "loadFactor", 0.75F);
        setIntField(term1657, term1657.getClass(), "modCount", 0);
        setField(term1657, term1657.getClass(), "keySet", null);
        setField(term1657, term1657.getClass(), "entrySet", null);
        setField(term1657, term1657.getClass(), "values", null);
        setField(term1656, term1656.getClass(), "defaults", term1657);
        setField(term1656, term1656.getClass(), "file", "BndsHwAFMv");
        setField(term1656, term1656.getClass(), "basePath", "GzFkzHGYFt");
        setField(term1656, term1656.getClass(), "fileSeparator", "/");
        setBooleanField(term1656, term1656.getClass(), "isInitialized", false);
        setField(term1656, term1656.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term1656, term1656.getClass(), "keysAsListed", term1711);
        setIntField(term1716, term1716.getClass(), "hash", 660357065);
        setField(term1716, term1716.getClass(), "key", term1718);
        setField(term1716, term1716.getClass(), "value", term1719);
        setField(term1716, term1716.getClass(), "next", null);
        setElement(term1715, 5, term1716);
        setIntField(term1720, term1720.getClass(), "hash", 267925426);
        setField(term1720, term1720.getClass(), "key", term1722);
        setField(term1720, term1720.getClass(), "value", term1723);
        setField(term1720, term1720.getClass(), "next", null);
        setElement(term1715, 10, term1720);
        setField(term1656, term1656.getClass(), "table", term1715);
        setIntField(term1656, term1656.getClass(), "count", -1179120540);
        setIntField(term1656, term1656.getClass(), "threshold", 8);
        setFloatField(term1656, term1656.getClass(), "loadFactor", 0.75F);
        setIntField(term1656, term1656.getClass(), "modCount", -73683643);
        setField(term1656, term1656.getClass(), "keySet", term1728);
        setField(term1656, term1656.getClass(), "entrySet", term1734);
        setField(term1656, term1656.getClass(), "values", term1740);
        term1756 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term12669 = new ArrayList();
        ArrayList term12680 = new ArrayList();
        ((ArrayList) term12680).add("LvtrsXUliU");
        HashMap term12696 = new HashMap();
        Set<Object> term12800 =  ((Map) term12696).keySet();
        HashSet term12695 = new HashSet((Collection<? extends Object>) term12800);
        HashMap term12698 = new HashMap();
        Set<Object> term12801 =  ((Map) term12698).keySet();
        HashSet term12697 = new HashSet((Collection<? extends Object>) term12801);
        ArrayList term12699 = new ArrayList();
        term12665 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12666 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12671 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12684 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term12685 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12686 = newInstance(Class.forName("java.lang.Object"));
        Object term12687 = newInstance(Class.forName("java.lang.Object"));
        Object term12688 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12691 = newInstance(Class.forName("java.lang.Object"));
        Object term12692 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term12693 = newInstance(Class.forName("java.lang.Object"));
        Object term12694 = newInstance(Class.forName("java.lang.Object"));
        setField(term12666, term12666.getClass(), "defaults", null);
        setField(term12666, term12666.getClass(), "file", null);
        setField(term12666, term12666.getClass(), "basePath", null);
        setField(term12666, term12666.getClass(), "fileSeparator", "/");
        setBooleanField(term12666, term12666.getClass(), "isInitialized", false);
        setField(term12666, term12666.getClass(), "includePropertyName", null);
        setField(term12666, term12666.getClass(), "keysAsListed", term12669);
        setField(term12666, term12666.getClass(), "table", term12671);
        setIntField(term12666, term12666.getClass(), "count", 0);
        setIntField(term12666, term12666.getClass(), "threshold", 8);
        setFloatField(term12666, term12666.getClass(), "loadFactor", 0.75F);
        setIntField(term12666, term12666.getClass(), "modCount", 0);
        setField(term12666, term12666.getClass(), "keySet", null);
        setField(term12666, term12666.getClass(), "entrySet", null);
        setField(term12666, term12666.getClass(), "values", null);
        setField(term12665, term12665.getClass(), "defaults", term12666);
        setField(term12665, term12665.getClass(), "file", "BndsHwAFMv");
        setField(term12665, term12665.getClass(), "basePath", "GzFkzHGYFt");
        setField(term12665, term12665.getClass(), "fileSeparator", "/");
        setBooleanField(term12665, term12665.getClass(), "isInitialized", false);
        setField(term12665, term12665.getClass(), "includePropertyName", "tShwQLRGNe");
        setField(term12665, term12665.getClass(), "keysAsListed", term12680);
        setIntField(term12685, term12685.getClass(), "hash", 660357065);
        setField(term12685, term12685.getClass(), "key", term12686);
        setField(term12685, term12685.getClass(), "value", term12687);
        setField(term12685, term12685.getClass(), "next", null);
        setElement(term12684, 5, term12685);
        setIntField(term12688, term12688.getClass(), "hash", 1193615728);
        setField(term12688, term12688.getClass(), "key", "LvtrsXUliU");
        setField(term12688, term12688.getClass(), "value", term12691);
        setField(term12688, term12688.getClass(), "next", null);
        setElement(term12684, 8, term12688);
        setIntField(term12692, term12692.getClass(), "hash", 267925426);
        setField(term12692, term12692.getClass(), "key", term12693);
        setField(term12692, term12692.getClass(), "value", term12694);
        setField(term12692, term12692.getClass(), "next", null);
        setElement(term12684, 10, term12692);
        setField(term12665, term12665.getClass(), "table", term12684);
        setIntField(term12665, term12665.getClass(), "count", -1179120539);
        setIntField(term12665, term12665.getClass(), "threshold", 8);
        setFloatField(term12665, term12665.getClass(), "loadFactor", 0.75F);
        setIntField(term12665, term12665.getClass(), "modCount", -73683642);
        setField(term12665, term12665.getClass(), "keySet", term12695);
        setField(term12665, term12665.getClass(), "entrySet", term12697);
        setField(term12665, term12665.getClass(), "values", term12699);
        term12703 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "LvtrsXUliU";
        args[1] = term1756;
        callMethod(klass, "addPropertyInternal", argTypes, term1656, args);
        assertTrue(recursiveEquals(term1656, term12665));
        assertTrue(recursiveEquals(term1756, term12703));
    }

};


