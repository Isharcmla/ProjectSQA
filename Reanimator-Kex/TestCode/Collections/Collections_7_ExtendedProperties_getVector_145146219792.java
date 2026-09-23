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

public class ExtendedProperties_getVector_145146219792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3842;
     Object term16513;
     Object term16508;

    public ExtendedProperties_getVector_145146219792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3848 = new ArrayList();
        ArrayList term3897 = new ArrayList();
        HashMap term3911 = new HashMap();
        Set<Object> term16574 =  ((Map) term3911).keySet();
        HashSet term3910 = new HashSet((Collection<? extends Object>) term16574);
        HashMap term3917 = new HashMap();
        Set<Object> term16575 =  ((Map) term3917).keySet();
        HashSet term3916 = new HashSet((Collection<? extends Object>) term16575);
        ArrayList term3922 = new ArrayList();
        term3842 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3843 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3852 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3901 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term3902 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3904 = newInstance(Class.forName("java.lang.Object"));
        Object term3905 = newInstance(Class.forName("java.lang.Object"));
        setField(term3843, term3843.getClass(), "defaults", null);
        setField(term3843, term3843.getClass(), "file", null);
        setField(term3843, term3843.getClass(), "basePath", null);
        setField(term3843, term3843.getClass(), "fileSeparator", "/");
        setBooleanField(term3843, term3843.getClass(), "isInitialized", false);
        setField(term3843, term3843.getClass(), "includePropertyName", null);
        setField(term3843, term3843.getClass(), "keysAsListed", term3848);
        setField(term3843, term3843.getClass(), "table", term3852);
        setIntField(term3843, term3843.getClass(), "count", 0);
        setIntField(term3843, term3843.getClass(), "threshold", 8);
        setFloatField(term3843, term3843.getClass(), "loadFactor", 0.75F);
        setIntField(term3843, term3843.getClass(), "modCount", 0);
        setField(term3843, term3843.getClass(), "keySet", null);
        setField(term3843, term3843.getClass(), "entrySet", null);
        setField(term3843, term3843.getClass(), "values", null);
        setField(term3842, term3842.getClass(), "defaults", term3843);
        setField(term3842, term3842.getClass(), "file", "sEccwbJKYE");
        setField(term3842, term3842.getClass(), "basePath", "AWRooQKkdW");
        setField(term3842, term3842.getClass(), "fileSeparator", "/");
        setBooleanField(term3842, term3842.getClass(), "isInitialized", false);
        setField(term3842, term3842.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term3842, term3842.getClass(), "keysAsListed", term3897);
        setIntField(term3902, term3902.getClass(), "hash", 219447985);
        setField(term3902, term3902.getClass(), "key", term3904);
        setField(term3902, term3902.getClass(), "value", term3905);
        setField(term3902, term3902.getClass(), "next", null);
        setElement(term3901, 9, term3902);
        setField(term3842, term3842.getClass(), "table", term3901);
        setIntField(term3842, term3842.getClass(), "count", -2027534002);
        setIntField(term3842, term3842.getClass(), "threshold", 8);
        setFloatField(term3842, term3842.getClass(), "loadFactor", 0.75F);
        setIntField(term3842, term3842.getClass(), "modCount", 1063420943);
        setField(term3842, term3842.getClass(), "keySet", term3910);
        setField(term3842, term3842.getClass(), "entrySet", term3916);
        setField(term3842, term3842.getClass(), "values", term3922);
        ArrayList term16517 = new ArrayList();
        ArrayList term16528 = new ArrayList();
        HashMap term16535 = new HashMap();
        Set<Object> term16618 =  ((Map) term16535).keySet();
        HashSet term16534 = new HashSet((Collection<? extends Object>) term16618);
        HashMap term16537 = new HashMap();
        Set<Object> term16619 =  ((Map) term16537).keySet();
        HashSet term16536 = new HashSet((Collection<? extends Object>) term16619);
        ArrayList term16538 = new ArrayList();
        term16513 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term16514 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term16519 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term16530 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term16531 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term16532 = newInstance(Class.forName("java.lang.Object"));
        Object term16533 = newInstance(Class.forName("java.lang.Object"));
        setField(term16514, term16514.getClass(), "defaults", null);
        setField(term16514, term16514.getClass(), "file", null);
        setField(term16514, term16514.getClass(), "basePath", null);
        setField(term16514, term16514.getClass(), "fileSeparator", "/");
        setBooleanField(term16514, term16514.getClass(), "isInitialized", false);
        setField(term16514, term16514.getClass(), "includePropertyName", null);
        setField(term16514, term16514.getClass(), "keysAsListed", term16517);
        setField(term16514, term16514.getClass(), "table", term16519);
        setIntField(term16514, term16514.getClass(), "count", 0);
        setIntField(term16514, term16514.getClass(), "threshold", 8);
        setFloatField(term16514, term16514.getClass(), "loadFactor", 0.75F);
        setIntField(term16514, term16514.getClass(), "modCount", 0);
        setField(term16514, term16514.getClass(), "keySet", null);
        setField(term16514, term16514.getClass(), "entrySet", null);
        setField(term16514, term16514.getClass(), "values", null);
        setField(term16513, term16513.getClass(), "defaults", term16514);
        setField(term16513, term16513.getClass(), "file", "sEccwbJKYE");
        setField(term16513, term16513.getClass(), "basePath", "AWRooQKkdW");
        setField(term16513, term16513.getClass(), "fileSeparator", "/");
        setBooleanField(term16513, term16513.getClass(), "isInitialized", false);
        setField(term16513, term16513.getClass(), "includePropertyName", "vjxIhXHxGR");
        setField(term16513, term16513.getClass(), "keysAsListed", term16528);
        setIntField(term16531, term16531.getClass(), "hash", 219447985);
        setField(term16531, term16531.getClass(), "key", term16532);
        setField(term16531, term16531.getClass(), "value", term16533);
        setField(term16531, term16531.getClass(), "next", null);
        setElement(term16530, 9, term16531);
        setField(term16513, term16513.getClass(), "table", term16530);
        setIntField(term16513, term16513.getClass(), "count", -2027534002);
        setIntField(term16513, term16513.getClass(), "threshold", 8);
        setFloatField(term16513, term16513.getClass(), "loadFactor", 0.75F);
        setIntField(term16513, term16513.getClass(), "modCount", 1063420943);
        setField(term16513, term16513.getClass(), "keySet", term16534);
        setField(term16513, term16513.getClass(), "entrySet", term16536);
        setField(term16513, term16513.getClass(), "values", term16538);
        term16508 = newInstance(Class.forName("java.util.Vector"));
        Object[] term16509 = (Object[]) newArray("java.lang.Object", 10);
        setField(term16508, term16508.getClass(), "elementData", term16509);
        setIntField(term16508, term16508.getClass(), "elementCount", 0);
        setIntField(term16508, term16508.getClass(), "capacityIncrement", 0);
        setIntField(term16508, term16508.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QXzGXbEXMu";
        Object retValue = callMethod(klass, "getVector", argTypes, term3842, args);
        assertTrue(recursiveEquals(term3842, term16513));
        assertTrue(recursiveEquals(retValue, term16508));
    }

};


