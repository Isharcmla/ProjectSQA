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

public class ExtendedProperties_save_180167632582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7244;
     Object term41383;

    public ExtendedProperties_save_180167632582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7250 = new ArrayList();
        ArrayList term7299 = new ArrayList();
        ((ArrayList) term7299).add("java.lang.Object@4d954e13");
        ((ArrayList) term7299).add("java.lang.Object@71c503ff");
        ((ArrayList) term7299).add("java.lang.Object@683f0e59");
        HashMap term7480 = new HashMap();
        Set<Object> term41609 =  ((Map) term7480).keySet();
        HashSet term7479 = new HashSet((Collection<? extends Object>) term41609);
        HashMap term7486 = new HashMap();
        Set<Object> term41610 =  ((Map) term7486).keySet();
        HashSet term7485 = new HashSet((Collection<? extends Object>) term41610);
        ArrayList term7491 = new ArrayList();
        term7244 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7245 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7254 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term7384 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term7385 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7414 = newInstance(Class.forName("java.lang.Object"));
        Object term7415 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7444 = newInstance(Class.forName("java.lang.Object"));
        Object term7445 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7474 = newInstance(Class.forName("java.lang.Object"));
        setField(term7245, term7245.getClass(), "defaults", null);
        setField(term7245, term7245.getClass(), "file", null);
        setField(term7245, term7245.getClass(), "basePath", null);
        setField(term7245, term7245.getClass(), "fileSeparator", "/");
        setBooleanField(term7245, term7245.getClass(), "isInitialized", false);
        setField(term7245, term7245.getClass(), "includePropertyName", null);
        setField(term7245, term7245.getClass(), "keysAsListed", term7250);
        setField(term7245, term7245.getClass(), "table", term7254);
        setIntField(term7245, term7245.getClass(), "count", 0);
        setIntField(term7245, term7245.getClass(), "threshold", 8);
        setFloatField(term7245, term7245.getClass(), "loadFactor", 0.75F);
        setIntField(term7245, term7245.getClass(), "modCount", 0);
        setField(term7245, term7245.getClass(), "keySet", null);
        setField(term7245, term7245.getClass(), "entrySet", null);
        setField(term7245, term7245.getClass(), "values", null);
        setField(term7244, term7244.getClass(), "defaults", term7245);
        setField(term7244, term7244.getClass(), "file", "UoYtihxVaS");
        setField(term7244, term7244.getClass(), "basePath", "JDswTTCZHV");
        setField(term7244, term7244.getClass(), "fileSeparator", "/");
        setBooleanField(term7244, term7244.getClass(), "isInitialized", true);
        setField(term7244, term7244.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term7244, term7244.getClass(), "keysAsListed", term7299);
        setIntField(term7385, term7385.getClass(), "hash", 836343964);
        setField(term7385, term7385.getClass(), "key", "java.lang.Object@71c503ff");
        setField(term7385, term7385.getClass(), "value", term7414);
        setField(term7385, term7385.getClass(), "next", null);
        setElement(term7384, 5, term7385);
        setIntField(term7415, term7415.getClass(), "hash", -317808133);
        setField(term7415, term7415.getClass(), "key", "java.lang.Object@683f0e59");
        setField(term7415, term7415.getClass(), "value", term7444);
        setField(term7415, term7415.getClass(), "next", null);
        setElement(term7384, 8, term7415);
        setIntField(term7445, term7445.getClass(), "hash", 1013636204);
        setField(term7445, term7445.getClass(), "key", "java.lang.Object@4d954e13");
        setField(term7445, term7445.getClass(), "value", term7474);
        setField(term7445, term7445.getClass(), "next", null);
        setElement(term7384, 9, term7445);
        setField(term7244, term7244.getClass(), "table", term7384);
        setIntField(term7244, term7244.getClass(), "count", -469968301);
        setIntField(term7244, term7244.getClass(), "threshold", 8);
        setFloatField(term7244, term7244.getClass(), "loadFactor", 0.75F);
        setIntField(term7244, term7244.getClass(), "modCount", -1145578963);
        setField(term7244, term7244.getClass(), "keySet", term7479);
        setField(term7244, term7244.getClass(), "entrySet", term7485);
        setField(term7244, term7244.getClass(), "values", term7491);
        ArrayList term41387 = new ArrayList();
        ArrayList term41398 = new ArrayList();
        ((ArrayList) term41398).add("java.lang.Object@4d954e13");
        ((ArrayList) term41398).add("java.lang.Object@71c503ff");
        ((ArrayList) term41398).add("java.lang.Object@683f0e59");
        HashMap term41420 = new HashMap();
        Set<Object> term41803 =  ((Map) term41420).keySet();
        HashSet term41419 = new HashSet((Collection<? extends Object>) term41803);
        HashMap term41422 = new HashMap();
        Set<Object> term41804 =  ((Map) term41422).keySet();
        HashSet term41421 = new HashSet((Collection<? extends Object>) term41804);
        ArrayList term41423 = new ArrayList();
        term41383 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term41384 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term41389 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term41406 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term41407 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term41410 = newInstance(Class.forName("java.lang.Object"));
        Object term41411 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term41414 = newInstance(Class.forName("java.lang.Object"));
        Object term41415 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term41418 = newInstance(Class.forName("java.lang.Object"));
        setField(term41384, term41384.getClass(), "defaults", null);
        setField(term41384, term41384.getClass(), "file", null);
        setField(term41384, term41384.getClass(), "basePath", null);
        setField(term41384, term41384.getClass(), "fileSeparator", "/");
        setBooleanField(term41384, term41384.getClass(), "isInitialized", false);
        setField(term41384, term41384.getClass(), "includePropertyName", null);
        setField(term41384, term41384.getClass(), "keysAsListed", term41387);
        setField(term41384, term41384.getClass(), "table", term41389);
        setIntField(term41384, term41384.getClass(), "count", 0);
        setIntField(term41384, term41384.getClass(), "threshold", 8);
        setFloatField(term41384, term41384.getClass(), "loadFactor", 0.75F);
        setIntField(term41384, term41384.getClass(), "modCount", 0);
        setField(term41384, term41384.getClass(), "keySet", null);
        setField(term41384, term41384.getClass(), "entrySet", null);
        setField(term41384, term41384.getClass(), "values", null);
        setField(term41383, term41383.getClass(), "defaults", term41384);
        setField(term41383, term41383.getClass(), "file", "UoYtihxVaS");
        setField(term41383, term41383.getClass(), "basePath", "JDswTTCZHV");
        setField(term41383, term41383.getClass(), "fileSeparator", "/");
        setBooleanField(term41383, term41383.getClass(), "isInitialized", true);
        setField(term41383, term41383.getClass(), "includePropertyName", "onpbIeEKoi");
        setField(term41383, term41383.getClass(), "keysAsListed", term41398);
        setIntField(term41407, term41407.getClass(), "hash", 836343964);
        setField(term41407, term41407.getClass(), "key", "java.lang.Object@71c503ff");
        setField(term41407, term41407.getClass(), "value", term41410);
        setField(term41407, term41407.getClass(), "next", null);
        setElement(term41406, 5, term41407);
        setIntField(term41411, term41411.getClass(), "hash", -317808133);
        setField(term41411, term41411.getClass(), "key", "java.lang.Object@683f0e59");
        setField(term41411, term41411.getClass(), "value", term41414);
        setField(term41411, term41411.getClass(), "next", null);
        setElement(term41406, 8, term41411);
        setIntField(term41415, term41415.getClass(), "hash", 1013636204);
        setField(term41415, term41415.getClass(), "key", "java.lang.Object@4d954e13");
        setField(term41415, term41415.getClass(), "value", term41418);
        setField(term41415, term41415.getClass(), "next", null);
        setElement(term41406, 9, term41415);
        setField(term41383, term41383.getClass(), "table", term41406);
        setIntField(term41383, term41383.getClass(), "count", -469968301);
        setIntField(term41383, term41383.getClass(), "threshold", 8);
        setFloatField(term41383, term41383.getClass(), "loadFactor", 0.75F);
        setIntField(term41383, term41383.getClass(), "modCount", -1145578963);
        setField(term41383, term41383.getClass(), "keySet", term41419);
        setField(term41383, term41383.getClass(), "entrySet", term41421);
        setField(term41383, term41383.getClass(), "values", term41423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "YRHGsAkhxb";
        callMethod(klass, "save", argTypes, term7244, args);
        assertTrue(recursiveEquals(term7244, term41383));
    }

};


