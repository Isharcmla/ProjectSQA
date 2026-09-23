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
     Object term13161;
     Object term13253;
     Object term50780;
     Object term50806;
     Object term50694;

    public ExtendedProperties_getVector_86580217095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13167 = new ArrayList();
        ArrayList term13216 = new ArrayList();
        HashMap term13226 = new HashMap();
        Set<Object> term50841 =  ((Map) term13226).keySet();
        HashSet term13225 = new HashSet((Collection<? extends Object>) term50841);
        HashMap term13232 = new HashMap();
        Set<Object> term50842 =  ((Map) term13232).keySet();
        HashSet term13231 = new HashSet((Collection<? extends Object>) term50842);
        ArrayList term13237 = new ArrayList();
        term13161 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13162 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13171 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13220 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term13162, term13162.getClass(), "defaults", null);
        setField(term13162, term13162.getClass(), "file", null);
        setField(term13162, term13162.getClass(), "basePath", null);
        setField(term13162, term13162.getClass(), "fileSeparator", "/");
        setBooleanField(term13162, term13162.getClass(), "isInitialized", false);
        setField(term13162, term13162.getClass(), "includePropertyName", null);
        setField(term13162, term13162.getClass(), "keysAsListed", term13167);
        setField(term13162, term13162.getClass(), "table", term13171);
        setIntField(term13162, term13162.getClass(), "count", 0);
        setIntField(term13162, term13162.getClass(), "threshold", 8);
        setFloatField(term13162, term13162.getClass(), "loadFactor", 0.75F);
        setIntField(term13162, term13162.getClass(), "modCount", 0);
        setField(term13162, term13162.getClass(), "keySet", null);
        setField(term13162, term13162.getClass(), "entrySet", null);
        setField(term13162, term13162.getClass(), "values", null);
        setField(term13161, term13161.getClass(), "defaults", term13162);
        setField(term13161, term13161.getClass(), "file", "qxSDVejjiY");
        setField(term13161, term13161.getClass(), "basePath", "xBsXSDjXYK");
        setField(term13161, term13161.getClass(), "fileSeparator", "/");
        setBooleanField(term13161, term13161.getClass(), "isInitialized", false);
        setField(term13161, term13161.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term13161, term13161.getClass(), "keysAsListed", term13216);
        setField(term13161, term13161.getClass(), "table", term13220);
        setIntField(term13161, term13161.getClass(), "count", -478195677);
        setIntField(term13161, term13161.getClass(), "threshold", 8);
        setFloatField(term13161, term13161.getClass(), "loadFactor", 0.75F);
        setIntField(term13161, term13161.getClass(), "modCount", 972867650);
        setField(term13161, term13161.getClass(), "keySet", term13225);
        setField(term13161, term13161.getClass(), "entrySet", term13231);
        setField(term13161, term13161.getClass(), "values", term13237);
        term13253 = newInstance(Class.forName("java.util.Stack"));
        Object[] term13254 = (Object[]) newArray("java.lang.Object", 10);
        Object term13255 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13254, 0, term13255);
        setField(term13253, term13253.getClass(), "elementData", term13254);
        setIntField(term13253, term13253.getClass(), "elementCount", 1);
        setIntField(term13253, term13253.getClass(), "capacityIncrement", 0);
        setIntField(term13253, term13253.getClass(), "modCount", 1);
        ArrayList term50784 = new ArrayList();
        ArrayList term50795 = new ArrayList();
        HashMap term50799 = new HashMap();
        Set<Object> term50885 =  ((Map) term50799).keySet();
        HashSet term50798 = new HashSet((Collection<? extends Object>) term50885);
        HashMap term50801 = new HashMap();
        Set<Object> term50886 =  ((Map) term50801).keySet();
        HashSet term50800 = new HashSet((Collection<? extends Object>) term50886);
        ArrayList term50802 = new ArrayList();
        term50780 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term50781 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term50786 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term50797 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term50781, term50781.getClass(), "defaults", null);
        setField(term50781, term50781.getClass(), "file", null);
        setField(term50781, term50781.getClass(), "basePath", null);
        setField(term50781, term50781.getClass(), "fileSeparator", "/");
        setBooleanField(term50781, term50781.getClass(), "isInitialized", false);
        setField(term50781, term50781.getClass(), "includePropertyName", null);
        setField(term50781, term50781.getClass(), "keysAsListed", term50784);
        setField(term50781, term50781.getClass(), "table", term50786);
        setIntField(term50781, term50781.getClass(), "count", 0);
        setIntField(term50781, term50781.getClass(), "threshold", 8);
        setFloatField(term50781, term50781.getClass(), "loadFactor", 0.75F);
        setIntField(term50781, term50781.getClass(), "modCount", 0);
        setField(term50781, term50781.getClass(), "keySet", null);
        setField(term50781, term50781.getClass(), "entrySet", null);
        setField(term50781, term50781.getClass(), "values", null);
        setField(term50780, term50780.getClass(), "defaults", term50781);
        setField(term50780, term50780.getClass(), "file", "qxSDVejjiY");
        setField(term50780, term50780.getClass(), "basePath", "xBsXSDjXYK");
        setField(term50780, term50780.getClass(), "fileSeparator", "/");
        setBooleanField(term50780, term50780.getClass(), "isInitialized", false);
        setField(term50780, term50780.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term50780, term50780.getClass(), "keysAsListed", term50795);
        setField(term50780, term50780.getClass(), "table", term50797);
        setIntField(term50780, term50780.getClass(), "count", -478195677);
        setIntField(term50780, term50780.getClass(), "threshold", 8);
        setFloatField(term50780, term50780.getClass(), "loadFactor", 0.75F);
        setIntField(term50780, term50780.getClass(), "modCount", 972867650);
        setField(term50780, term50780.getClass(), "keySet", term50798);
        setField(term50780, term50780.getClass(), "entrySet", term50800);
        setField(term50780, term50780.getClass(), "values", term50802);
        term50806 = newInstance(Class.forName("java.util.Stack"));
        Object[] term50807 = (Object[]) newArray("java.lang.Object", 10);
        Object term50808 = newInstance(Class.forName("java.lang.Object"));
        setElement(term50807, 0, term50808);
        setField(term50806, term50806.getClass(), "elementData", term50807);
        setIntField(term50806, term50806.getClass(), "elementCount", 1);
        setIntField(term50806, term50806.getClass(), "capacityIncrement", 0);
        setIntField(term50806, term50806.getClass(), "modCount", 1);
        term50694 = newInstance(Class.forName("java.util.Stack"));
        Object[] term50695 = (Object[]) newArray("java.lang.Object", 10);
        Object term50696 = newInstance(Class.forName("java.lang.Object"));
        setElement(term50695, 0, term50696);
        setField(term50694, term50694.getClass(), "elementData", term50695);
        setIntField(term50694, term50694.getClass(), "elementCount", 1);
        setIntField(term50694, term50694.getClass(), "capacityIncrement", 0);
        setIntField(term50694, term50694.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Vector");
        Object[] args = new Object[2];
        args[0] = "ZVecLZMLHF";
        args[1] = term13253;
        Object retValue = callMethod(klass, "getVector", argTypes, term13161, args);
        assertTrue(recursiveEquals(term13161, term50780));
        assertTrue(recursiveEquals(term13253, term50806));
        assertTrue(recursiveEquals(retValue, term50694));
    }

};


