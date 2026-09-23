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

public class ExtendedProperties_getDouble_1047284872117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6723;
     Object term6803;
     Object term22214;

    public ExtendedProperties_getDouble_1047284872117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6729 = new ArrayList();
        ArrayList term6766 = new ArrayList();
        HashMap term6776 = new HashMap();
        Set<Object> term22260 =  ((Map) term6776).keySet();
        HashSet term6775 = new HashSet((Collection<? extends Object>) term22260);
        HashMap term6782 = new HashMap();
        Set<Object> term22261 =  ((Map) term6782).keySet();
        HashSet term6781 = new HashSet((Collection<? extends Object>) term22261);
        ArrayList term6787 = new ArrayList();
        term6723 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6724 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6733 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6770 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term6724, term6724.getClass(), "defaults", null);
        setField(term6724, term6724.getClass(), "file", null);
        setField(term6724, term6724.getClass(), "basePath", null);
        setField(term6724, term6724.getClass(), "fileSeparator", "/");
        setBooleanField(term6724, term6724.getClass(), "isInitialized", false);
        setField(term6724, term6724.getClass(), "keysAsListed", term6729);
        setField(term6724, term6724.getClass(), "table", term6733);
        setIntField(term6724, term6724.getClass(), "count", 0);
        setIntField(term6724, term6724.getClass(), "threshold", 8);
        setFloatField(term6724, term6724.getClass(), "loadFactor", 0.75F);
        setIntField(term6724, term6724.getClass(), "modCount", 0);
        setField(term6724, term6724.getClass(), "keySet", null);
        setField(term6724, term6724.getClass(), "entrySet", null);
        setField(term6724, term6724.getClass(), "values", null);
        setField(term6723, term6723.getClass(), "defaults", term6724);
        setField(term6723, term6723.getClass(), "file", "XkIoWJRNwN");
        setField(term6723, term6723.getClass(), "basePath", "aNWLJdrZMq");
        setField(term6723, term6723.getClass(), "fileSeparator", "/");
        setBooleanField(term6723, term6723.getClass(), "isInitialized", true);
        setField(term6723, term6723.getClass(), "keysAsListed", term6766);
        setField(term6723, term6723.getClass(), "table", term6770);
        setIntField(term6723, term6723.getClass(), "count", 1830648570);
        setIntField(term6723, term6723.getClass(), "threshold", 8);
        setFloatField(term6723, term6723.getClass(), "loadFactor", 0.75F);
        setIntField(term6723, term6723.getClass(), "modCount", -227365013);
        setField(term6723, term6723.getClass(), "keySet", term6775);
        setField(term6723, term6723.getClass(), "entrySet", term6781);
        setField(term6723, term6723.getClass(), "values", term6787);
        term6803 = new Double(0.13238746331190498);
        ArrayList term22218 = new ArrayList();
        ArrayList term22227 = new ArrayList();
        HashMap term22231 = new HashMap();
        Set<Object> term22294 =  ((Map) term22231).keySet();
        HashSet term22230 = new HashSet((Collection<? extends Object>) term22294);
        HashMap term22233 = new HashMap();
        Set<Object> term22295 =  ((Map) term22233).keySet();
        HashSet term22232 = new HashSet((Collection<? extends Object>) term22295);
        ArrayList term22234 = new ArrayList();
        term22214 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term22215 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term22220 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term22229 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term22215, term22215.getClass(), "defaults", null);
        setField(term22215, term22215.getClass(), "file", null);
        setField(term22215, term22215.getClass(), "basePath", null);
        setField(term22215, term22215.getClass(), "fileSeparator", "/");
        setBooleanField(term22215, term22215.getClass(), "isInitialized", false);
        setField(term22215, term22215.getClass(), "keysAsListed", term22218);
        setField(term22215, term22215.getClass(), "table", term22220);
        setIntField(term22215, term22215.getClass(), "count", 0);
        setIntField(term22215, term22215.getClass(), "threshold", 8);
        setFloatField(term22215, term22215.getClass(), "loadFactor", 0.75F);
        setIntField(term22215, term22215.getClass(), "modCount", 0);
        setField(term22215, term22215.getClass(), "keySet", null);
        setField(term22215, term22215.getClass(), "entrySet", null);
        setField(term22215, term22215.getClass(), "values", null);
        setField(term22214, term22214.getClass(), "defaults", term22215);
        setField(term22214, term22214.getClass(), "file", "XkIoWJRNwN");
        setField(term22214, term22214.getClass(), "basePath", "aNWLJdrZMq");
        setField(term22214, term22214.getClass(), "fileSeparator", "/");
        setBooleanField(term22214, term22214.getClass(), "isInitialized", true);
        setField(term22214, term22214.getClass(), "keysAsListed", term22227);
        setField(term22214, term22214.getClass(), "table", term22229);
        setIntField(term22214, term22214.getClass(), "count", 1830648570);
        setIntField(term22214, term22214.getClass(), "threshold", 8);
        setFloatField(term22214, term22214.getClass(), "loadFactor", 0.75F);
        setIntField(term22214, term22214.getClass(), "modCount", -227365013);
        setField(term22214, term22214.getClass(), "keySet", term22230);
        setField(term22214, term22214.getClass(), "entrySet", term22232);
        setField(term22214, term22214.getClass(), "values", term22234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = "HHmNoYxIGj";
        args[1] = term6803;
        Object retValue = callMethod(klass, "getDouble", argTypes, term6723, args);
        assertTrue(recursiveEquals(term6723, term22214));
        assertTrue(recursiveEquals(term6803, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, 0.13238746331190498));
    }

};


