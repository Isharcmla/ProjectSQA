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

public class ExtendedProperties_getDouble_1047284872118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7851;
     Object term7943;
     Object term25704;

    public ExtendedProperties_getDouble_1047284872118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7857 = new ArrayList();
        ArrayList term7906 = new ArrayList();
        HashMap term7916 = new HashMap();
        Set<Object> term25762 =  ((Map) term7916).keySet();
        HashSet term7915 = new HashSet((Collection<? extends Object>) term25762);
        HashMap term7922 = new HashMap();
        Set<Object> term25763 =  ((Map) term7922).keySet();
        HashSet term7921 = new HashSet((Collection<? extends Object>) term25763);
        ArrayList term7927 = new ArrayList();
        term7851 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7852 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7861 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term7910 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term7852, term7852.getClass(), "defaults", null);
        setField(term7852, term7852.getClass(), "file", null);
        setField(term7852, term7852.getClass(), "basePath", null);
        setField(term7852, term7852.getClass(), "fileSeparator", "/");
        setBooleanField(term7852, term7852.getClass(), "isInitialized", false);
        setField(term7852, term7852.getClass(), "includePropertyName", null);
        setField(term7852, term7852.getClass(), "keysAsListed", term7857);
        setField(term7852, term7852.getClass(), "table", term7861);
        setIntField(term7852, term7852.getClass(), "count", 0);
        setIntField(term7852, term7852.getClass(), "threshold", 8);
        setFloatField(term7852, term7852.getClass(), "loadFactor", 0.75F);
        setIntField(term7852, term7852.getClass(), "modCount", 0);
        setField(term7852, term7852.getClass(), "keySet", null);
        setField(term7852, term7852.getClass(), "entrySet", null);
        setField(term7852, term7852.getClass(), "values", null);
        setField(term7851, term7851.getClass(), "defaults", term7852);
        setField(term7851, term7851.getClass(), "file", "vGiuZVPJNH");
        setField(term7851, term7851.getClass(), "basePath", "tlzpzIjMib");
        setField(term7851, term7851.getClass(), "fileSeparator", "/");
        setBooleanField(term7851, term7851.getClass(), "isInitialized", true);
        setField(term7851, term7851.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term7851, term7851.getClass(), "keysAsListed", term7906);
        setField(term7851, term7851.getClass(), "table", term7910);
        setIntField(term7851, term7851.getClass(), "count", 1830648570);
        setIntField(term7851, term7851.getClass(), "threshold", 8);
        setFloatField(term7851, term7851.getClass(), "loadFactor", 0.75F);
        setIntField(term7851, term7851.getClass(), "modCount", -227365013);
        setField(term7851, term7851.getClass(), "keySet", term7915);
        setField(term7851, term7851.getClass(), "entrySet", term7921);
        setField(term7851, term7851.getClass(), "values", term7927);
        term7943 = new Double(0.13238746331190498);
        ArrayList term25708 = new ArrayList();
        ArrayList term25719 = new ArrayList();
        HashMap term25723 = new HashMap();
        Set<Object> term25806 =  ((Map) term25723).keySet();
        HashSet term25722 = new HashSet((Collection<? extends Object>) term25806);
        HashMap term25725 = new HashMap();
        Set<Object> term25807 =  ((Map) term25725).keySet();
        HashSet term25724 = new HashSet((Collection<? extends Object>) term25807);
        ArrayList term25726 = new ArrayList();
        term25704 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term25705 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term25710 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term25721 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term25705, term25705.getClass(), "defaults", null);
        setField(term25705, term25705.getClass(), "file", null);
        setField(term25705, term25705.getClass(), "basePath", null);
        setField(term25705, term25705.getClass(), "fileSeparator", "/");
        setBooleanField(term25705, term25705.getClass(), "isInitialized", false);
        setField(term25705, term25705.getClass(), "includePropertyName", null);
        setField(term25705, term25705.getClass(), "keysAsListed", term25708);
        setField(term25705, term25705.getClass(), "table", term25710);
        setIntField(term25705, term25705.getClass(), "count", 0);
        setIntField(term25705, term25705.getClass(), "threshold", 8);
        setFloatField(term25705, term25705.getClass(), "loadFactor", 0.75F);
        setIntField(term25705, term25705.getClass(), "modCount", 0);
        setField(term25705, term25705.getClass(), "keySet", null);
        setField(term25705, term25705.getClass(), "entrySet", null);
        setField(term25705, term25705.getClass(), "values", null);
        setField(term25704, term25704.getClass(), "defaults", term25705);
        setField(term25704, term25704.getClass(), "file", "vGiuZVPJNH");
        setField(term25704, term25704.getClass(), "basePath", "tlzpzIjMib");
        setField(term25704, term25704.getClass(), "fileSeparator", "/");
        setBooleanField(term25704, term25704.getClass(), "isInitialized", true);
        setField(term25704, term25704.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term25704, term25704.getClass(), "keysAsListed", term25719);
        setField(term25704, term25704.getClass(), "table", term25721);
        setIntField(term25704, term25704.getClass(), "count", 1830648570);
        setIntField(term25704, term25704.getClass(), "threshold", 8);
        setFloatField(term25704, term25704.getClass(), "loadFactor", 0.75F);
        setIntField(term25704, term25704.getClass(), "modCount", -227365013);
        setField(term25704, term25704.getClass(), "keySet", term25722);
        setField(term25704, term25704.getClass(), "entrySet", term25724);
        setField(term25704, term25704.getClass(), "values", term25726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = "RMsXuyzKJV";
        args[1] = term7943;
        Object retValue = callMethod(klass, "getDouble", argTypes, term7851, args);
        assertTrue(recursiveEquals(term7851, term25704));
        assertTrue(recursiveEquals(term7943, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, 0.13238746331190498));
    }

};


