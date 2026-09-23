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
import java.lang.NullPointerException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_load_1145503075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3948;

    public ExtendedProperties_load_1145503075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3954 = new ArrayList();
        ArrayList term4003 = new ArrayList();
        ((ArrayList) term4003).add("java.lang.Object@7e969c49");
        ((ArrayList) term4003).add("java.lang.Object@6a7ea705");
        ((ArrayList) term4003).add("java.lang.Object@496edf02");
        HashMap term4184 = new HashMap();
        Set<Object> term36345 =  ((Map) term4184).keySet();
        HashSet term4183 = new HashSet((Collection<? extends Object>) term36345);
        HashMap term4190 = new HashMap();
        Set<Object> term36346 =  ((Map) term4190).keySet();
        HashSet term4189 = new HashSet((Collection<? extends Object>) term36346);
        ArrayList term4195 = new ArrayList();
        term3948 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3949 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3958 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4088 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4089 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4118 = newInstance(Class.forName("java.lang.Object"));
        Object term4119 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4148 = newInstance(Class.forName("java.lang.Object"));
        Object term4149 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4178 = newInstance(Class.forName("java.lang.Object"));
        setField(term3949, term3949.getClass(), "defaults", null);
        setField(term3949, term3949.getClass(), "file", null);
        setField(term3949, term3949.getClass(), "basePath", null);
        setField(term3949, term3949.getClass(), "fileSeparator", "/");
        setBooleanField(term3949, term3949.getClass(), "isInitialized", false);
        setField(term3949, term3949.getClass(), "includePropertyName", null);
        setField(term3949, term3949.getClass(), "keysAsListed", term3954);
        setField(term3949, term3949.getClass(), "table", term3958);
        setIntField(term3949, term3949.getClass(), "count", 0);
        setIntField(term3949, term3949.getClass(), "threshold", 8);
        setFloatField(term3949, term3949.getClass(), "loadFactor", 0.75F);
        setIntField(term3949, term3949.getClass(), "modCount", 0);
        setField(term3949, term3949.getClass(), "keySet", null);
        setField(term3949, term3949.getClass(), "entrySet", null);
        setField(term3949, term3949.getClass(), "values", null);
        setField(term3948, term3948.getClass(), "defaults", term3949);
        setField(term3948, term3948.getClass(), "file", "vrQLuWIDJX");
        setField(term3948, term3948.getClass(), "basePath", "flxyYxBRtu");
        setField(term3948, term3948.getClass(), "fileSeparator", "/");
        setBooleanField(term3948, term3948.getClass(), "isInitialized", true);
        setField(term3948, term3948.getClass(), "includePropertyName", "OclPbYPkcH");
        setField(term3948, term3948.getClass(), "keysAsListed", term4003);
        setIntField(term4089, term4089.getClass(), "hash", 1465556037);
        setField(term4089, term4089.getClass(), "key", "java.lang.Object@496edf02");
        setField(term4089, term4089.getClass(), "value", term4118);
        setField(term4089, term4089.getClass(), "next", null);
        setElement(term4088, 0, term4089);
        setIntField(term4119, term4119.getClass(), "hash", 1825112897);
        setField(term4119, term4119.getClass(), "key", "java.lang.Object@6a7ea705");
        setField(term4119, term4119.getClass(), "value", term4148);
        setField(term4119, term4119.getClass(), "next", null);
        setElement(term4088, 3, term4119);
        setIntField(term4149, term4149.getClass(), "hash", -1459293049);
        setField(term4149, term4149.getClass(), "key", "java.lang.Object@7e969c49");
        setField(term4149, term4149.getClass(), "value", term4178);
        setField(term4149, term4149.getClass(), "next", null);
        setElement(term4088, 8, term4149);
        setField(term3948, term3948.getClass(), "table", term4088);
        setIntField(term3948, term3948.getClass(), "count", -1685132339);
        setIntField(term3948, term3948.getClass(), "threshold", 8);
        setFloatField(term3948, term3948.getClass(), "loadFactor", 0.75F);
        setIntField(term3948, term3948.getClass(), "modCount", -1456670394);
        setField(term3948, term3948.getClass(), "keySet", term4183);
        setField(term3948, term3948.getClass(), "entrySet", term4189);
        setField(term3948, term3948.getClass(), "values", term4195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "load", argTypes, term3948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


