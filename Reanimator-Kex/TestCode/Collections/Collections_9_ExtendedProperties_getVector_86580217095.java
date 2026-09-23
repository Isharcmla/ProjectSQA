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

public class ExtendedProperties_getVector_86580217095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13365;
     Object term13457;
     Object term51419;
     Object term51445;
     Object term51333;

    public ExtendedProperties_getVector_86580217095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13371 = new ArrayList();
        ArrayList term13420 = new ArrayList();
        HashMap term13430 = new HashMap();
        Set<Object> term51480 =  ((Map) term13430).keySet();
        HashSet term13429 = new HashSet((Collection<? extends Object>) term51480);
        HashMap term13436 = new HashMap();
        Set<Object> term51481 =  ((Map) term13436).keySet();
        HashSet term13435 = new HashSet((Collection<? extends Object>) term51481);
        ArrayList term13441 = new ArrayList();
        term13365 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13366 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13375 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13424 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term13366, term13366.getClass(), "defaults", null);
        setField(term13366, term13366.getClass(), "file", null);
        setField(term13366, term13366.getClass(), "basePath", null);
        setField(term13366, term13366.getClass(), "fileSeparator", "/");
        setBooleanField(term13366, term13366.getClass(), "isInitialized", false);
        setField(term13366, term13366.getClass(), "includePropertyName", null);
        setField(term13366, term13366.getClass(), "keysAsListed", term13371);
        setField(term13366, term13366.getClass(), "table", term13375);
        setIntField(term13366, term13366.getClass(), "count", 0);
        setIntField(term13366, term13366.getClass(), "threshold", 8);
        setFloatField(term13366, term13366.getClass(), "loadFactor", 0.75F);
        setIntField(term13366, term13366.getClass(), "modCount", 0);
        setField(term13366, term13366.getClass(), "keySet", null);
        setField(term13366, term13366.getClass(), "entrySet", null);
        setField(term13366, term13366.getClass(), "values", null);
        setField(term13365, term13365.getClass(), "defaults", term13366);
        setField(term13365, term13365.getClass(), "file", "qxSDVejjiY");
        setField(term13365, term13365.getClass(), "basePath", "xBsXSDjXYK");
        setField(term13365, term13365.getClass(), "fileSeparator", "/");
        setBooleanField(term13365, term13365.getClass(), "isInitialized", false);
        setField(term13365, term13365.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term13365, term13365.getClass(), "keysAsListed", term13420);
        setField(term13365, term13365.getClass(), "table", term13424);
        setIntField(term13365, term13365.getClass(), "count", -478195677);
        setIntField(term13365, term13365.getClass(), "threshold", 8);
        setFloatField(term13365, term13365.getClass(), "loadFactor", 0.75F);
        setIntField(term13365, term13365.getClass(), "modCount", 972867650);
        setField(term13365, term13365.getClass(), "keySet", term13429);
        setField(term13365, term13365.getClass(), "entrySet", term13435);
        setField(term13365, term13365.getClass(), "values", term13441);
        term13457 = newInstance(Class.forName("java.util.Stack"));
        Object[] term13458 = (Object[]) newArray("java.lang.Object", 10);
        Object term13459 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13458, 0, term13459);
        setField(term13457, term13457.getClass(), "elementData", term13458);
        setIntField(term13457, term13457.getClass(), "elementCount", 1);
        setIntField(term13457, term13457.getClass(), "capacityIncrement", 0);
        setIntField(term13457, term13457.getClass(), "modCount", 1);
        ArrayList term51423 = new ArrayList();
        ArrayList term51434 = new ArrayList();
        HashMap term51438 = new HashMap();
        Set<Object> term51524 =  ((Map) term51438).keySet();
        HashSet term51437 = new HashSet((Collection<? extends Object>) term51524);
        HashMap term51440 = new HashMap();
        Set<Object> term51525 =  ((Map) term51440).keySet();
        HashSet term51439 = new HashSet((Collection<? extends Object>) term51525);
        ArrayList term51441 = new ArrayList();
        term51419 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51420 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51425 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51436 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term51420, term51420.getClass(), "defaults", null);
        setField(term51420, term51420.getClass(), "file", null);
        setField(term51420, term51420.getClass(), "basePath", null);
        setField(term51420, term51420.getClass(), "fileSeparator", "/");
        setBooleanField(term51420, term51420.getClass(), "isInitialized", false);
        setField(term51420, term51420.getClass(), "includePropertyName", null);
        setField(term51420, term51420.getClass(), "keysAsListed", term51423);
        setField(term51420, term51420.getClass(), "table", term51425);
        setIntField(term51420, term51420.getClass(), "count", 0);
        setIntField(term51420, term51420.getClass(), "threshold", 8);
        setFloatField(term51420, term51420.getClass(), "loadFactor", 0.75F);
        setIntField(term51420, term51420.getClass(), "modCount", 0);
        setField(term51420, term51420.getClass(), "keySet", null);
        setField(term51420, term51420.getClass(), "entrySet", null);
        setField(term51420, term51420.getClass(), "values", null);
        setField(term51419, term51419.getClass(), "defaults", term51420);
        setField(term51419, term51419.getClass(), "file", "qxSDVejjiY");
        setField(term51419, term51419.getClass(), "basePath", "xBsXSDjXYK");
        setField(term51419, term51419.getClass(), "fileSeparator", "/");
        setBooleanField(term51419, term51419.getClass(), "isInitialized", false);
        setField(term51419, term51419.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term51419, term51419.getClass(), "keysAsListed", term51434);
        setField(term51419, term51419.getClass(), "table", term51436);
        setIntField(term51419, term51419.getClass(), "count", -478195677);
        setIntField(term51419, term51419.getClass(), "threshold", 8);
        setFloatField(term51419, term51419.getClass(), "loadFactor", 0.75F);
        setIntField(term51419, term51419.getClass(), "modCount", 972867650);
        setField(term51419, term51419.getClass(), "keySet", term51437);
        setField(term51419, term51419.getClass(), "entrySet", term51439);
        setField(term51419, term51419.getClass(), "values", term51441);
        term51445 = newInstance(Class.forName("java.util.Stack"));
        Object[] term51446 = (Object[]) newArray("java.lang.Object", 10);
        Object term51447 = newInstance(Class.forName("java.lang.Object"));
        setElement(term51446, 0, term51447);
        setField(term51445, term51445.getClass(), "elementData", term51446);
        setIntField(term51445, term51445.getClass(), "elementCount", 1);
        setIntField(term51445, term51445.getClass(), "capacityIncrement", 0);
        setIntField(term51445, term51445.getClass(), "modCount", 1);
        term51333 = newInstance(Class.forName("java.util.Stack"));
        Object[] term51334 = (Object[]) newArray("java.lang.Object", 10);
        Object term51335 = newInstance(Class.forName("java.lang.Object"));
        setElement(term51334, 0, term51335);
        setField(term51333, term51333.getClass(), "elementData", term51334);
        setIntField(term51333, term51333.getClass(), "elementCount", 1);
        setIntField(term51333, term51333.getClass(), "capacityIncrement", 0);
        setIntField(term51333, term51333.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Vector");
        Object[] args = new Object[2];
        args[0] = "ZVecLZMLHF";
        args[1] = term13457;
        Object retValue = callMethod(klass, "getVector", argTypes, term13365, args);
        assertTrue(recursiveEquals(term13365, term51419));
        assertTrue(recursiveEquals(term13457, term51445));
        assertTrue(recursiveEquals(retValue, term51333));
    }

};


