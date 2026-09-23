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

public class ExtendedProperties_getVector_86580217093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3982;
     Object term4074;
     Object term16757;
     Object term16783;
     Object term16671;

    public ExtendedProperties_getVector_86580217093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3988 = new ArrayList();
        ArrayList term4037 = new ArrayList();
        HashMap term4047 = new HashMap();
        Set<Object> term16818 =  ((Map) term4047).keySet();
        HashSet term4046 = new HashSet((Collection<? extends Object>) term16818);
        HashMap term4053 = new HashMap();
        Set<Object> term16819 =  ((Map) term4053).keySet();
        HashSet term4052 = new HashSet((Collection<? extends Object>) term16819);
        ArrayList term4058 = new ArrayList();
        term3982 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3983 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3992 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4041 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3983, term3983.getClass(), "defaults", null);
        setField(term3983, term3983.getClass(), "file", null);
        setField(term3983, term3983.getClass(), "basePath", null);
        setField(term3983, term3983.getClass(), "fileSeparator", "/");
        setBooleanField(term3983, term3983.getClass(), "isInitialized", false);
        setField(term3983, term3983.getClass(), "includePropertyName", null);
        setField(term3983, term3983.getClass(), "keysAsListed", term3988);
        setField(term3983, term3983.getClass(), "table", term3992);
        setIntField(term3983, term3983.getClass(), "count", 0);
        setIntField(term3983, term3983.getClass(), "threshold", 8);
        setFloatField(term3983, term3983.getClass(), "loadFactor", 0.75F);
        setIntField(term3983, term3983.getClass(), "modCount", 0);
        setField(term3983, term3983.getClass(), "keySet", null);
        setField(term3983, term3983.getClass(), "entrySet", null);
        setField(term3983, term3983.getClass(), "values", null);
        setField(term3982, term3982.getClass(), "defaults", term3983);
        setField(term3982, term3982.getClass(), "file", "qxSDVejjiY");
        setField(term3982, term3982.getClass(), "basePath", "xBsXSDjXYK");
        setField(term3982, term3982.getClass(), "fileSeparator", "/");
        setBooleanField(term3982, term3982.getClass(), "isInitialized", false);
        setField(term3982, term3982.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term3982, term3982.getClass(), "keysAsListed", term4037);
        setField(term3982, term3982.getClass(), "table", term4041);
        setIntField(term3982, term3982.getClass(), "count", -478195677);
        setIntField(term3982, term3982.getClass(), "threshold", 8);
        setFloatField(term3982, term3982.getClass(), "loadFactor", 0.75F);
        setIntField(term3982, term3982.getClass(), "modCount", 972867650);
        setField(term3982, term3982.getClass(), "keySet", term4046);
        setField(term3982, term3982.getClass(), "entrySet", term4052);
        setField(term3982, term3982.getClass(), "values", term4058);
        term4074 = newInstance(Class.forName("java.util.Stack"));
        Object[] term4075 = (Object[]) newArray("java.lang.Object", 10);
        Object term4076 = newInstance(Class.forName("java.lang.Object"));
        setElement(term4075, 0, term4076);
        setField(term4074, term4074.getClass(), "elementData", term4075);
        setIntField(term4074, term4074.getClass(), "elementCount", 1);
        setIntField(term4074, term4074.getClass(), "capacityIncrement", 0);
        setIntField(term4074, term4074.getClass(), "modCount", 1);
        ArrayList term16761 = new ArrayList();
        ArrayList term16772 = new ArrayList();
        HashMap term16776 = new HashMap();
        Set<Object> term16862 =  ((Map) term16776).keySet();
        HashSet term16775 = new HashSet((Collection<? extends Object>) term16862);
        HashMap term16778 = new HashMap();
        Set<Object> term16863 =  ((Map) term16778).keySet();
        HashSet term16777 = new HashSet((Collection<? extends Object>) term16863);
        ArrayList term16779 = new ArrayList();
        term16757 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term16758 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term16763 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term16774 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term16758, term16758.getClass(), "defaults", null);
        setField(term16758, term16758.getClass(), "file", null);
        setField(term16758, term16758.getClass(), "basePath", null);
        setField(term16758, term16758.getClass(), "fileSeparator", "/");
        setBooleanField(term16758, term16758.getClass(), "isInitialized", false);
        setField(term16758, term16758.getClass(), "includePropertyName", null);
        setField(term16758, term16758.getClass(), "keysAsListed", term16761);
        setField(term16758, term16758.getClass(), "table", term16763);
        setIntField(term16758, term16758.getClass(), "count", 0);
        setIntField(term16758, term16758.getClass(), "threshold", 8);
        setFloatField(term16758, term16758.getClass(), "loadFactor", 0.75F);
        setIntField(term16758, term16758.getClass(), "modCount", 0);
        setField(term16758, term16758.getClass(), "keySet", null);
        setField(term16758, term16758.getClass(), "entrySet", null);
        setField(term16758, term16758.getClass(), "values", null);
        setField(term16757, term16757.getClass(), "defaults", term16758);
        setField(term16757, term16757.getClass(), "file", "qxSDVejjiY");
        setField(term16757, term16757.getClass(), "basePath", "xBsXSDjXYK");
        setField(term16757, term16757.getClass(), "fileSeparator", "/");
        setBooleanField(term16757, term16757.getClass(), "isInitialized", false);
        setField(term16757, term16757.getClass(), "includePropertyName", "sEnIVFtZuQ");
        setField(term16757, term16757.getClass(), "keysAsListed", term16772);
        setField(term16757, term16757.getClass(), "table", term16774);
        setIntField(term16757, term16757.getClass(), "count", -478195677);
        setIntField(term16757, term16757.getClass(), "threshold", 8);
        setFloatField(term16757, term16757.getClass(), "loadFactor", 0.75F);
        setIntField(term16757, term16757.getClass(), "modCount", 972867650);
        setField(term16757, term16757.getClass(), "keySet", term16775);
        setField(term16757, term16757.getClass(), "entrySet", term16777);
        setField(term16757, term16757.getClass(), "values", term16779);
        term16783 = newInstance(Class.forName("java.util.Stack"));
        Object[] term16784 = (Object[]) newArray("java.lang.Object", 10);
        Object term16785 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16784, 0, term16785);
        setField(term16783, term16783.getClass(), "elementData", term16784);
        setIntField(term16783, term16783.getClass(), "elementCount", 1);
        setIntField(term16783, term16783.getClass(), "capacityIncrement", 0);
        setIntField(term16783, term16783.getClass(), "modCount", 1);
        term16671 = newInstance(Class.forName("java.util.Stack"));
        Object[] term16672 = (Object[]) newArray("java.lang.Object", 10);
        Object term16673 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16672, 0, term16673);
        setField(term16671, term16671.getClass(), "elementData", term16672);
        setIntField(term16671, term16671.getClass(), "elementCount", 1);
        setIntField(term16671, term16671.getClass(), "capacityIncrement", 0);
        setIntField(term16671, term16671.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Vector");
        Object[] args = new Object[2];
        args[0] = "ZVecLZMLHF";
        args[1] = term4074;
        Object retValue = callMethod(klass, "getVector", argTypes, term3982, args);
        assertTrue(recursiveEquals(term3982, term16757));
        assertTrue(recursiveEquals(term4074, term16783));
        assertTrue(recursiveEquals(retValue, term16671));
    }

};


