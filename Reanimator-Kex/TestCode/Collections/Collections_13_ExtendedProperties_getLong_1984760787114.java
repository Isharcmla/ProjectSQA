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
import java.lang.Long;

public class ExtendedProperties_getLong_1984760787114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23077;
     Object term23283;
     Object term68226;

    public ExtendedProperties_getLong_1984760787114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23083 = new ArrayList();
        ArrayList term23132 = new ArrayList();
        ((ArrayList) term23132).add("java.lang.Object@54ecedc2");
        ((ArrayList) term23132).add("java.lang.Object@623be6da");
        HashMap term23256 = new HashMap();
        Set<Object> term68396 =  ((Map) term23256).keySet();
        HashSet term23255 = new HashSet((Collection<? extends Object>) term68396);
        HashMap term23262 = new HashMap();
        Set<Object> term68397 =  ((Map) term23262).keySet();
        HashSet term23261 = new HashSet((Collection<? extends Object>) term68397);
        ArrayList term23267 = new ArrayList();
        term23077 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term23078 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term23087 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term23190 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term23191 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23220 = newInstance(Class.forName("java.lang.Object"));
        Object term23221 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23250 = newInstance(Class.forName("java.lang.Object"));
        setField(term23078, term23078.getClass(), "defaults", null);
        setField(term23078, term23078.getClass(), "file", null);
        setField(term23078, term23078.getClass(), "basePath", null);
        setField(term23078, term23078.getClass(), "fileSeparator", "/");
        setBooleanField(term23078, term23078.getClass(), "isInitialized", false);
        setField(term23078, term23078.getClass(), "includePropertyName", null);
        setField(term23078, term23078.getClass(), "keysAsListed", term23083);
        setField(term23078, term23078.getClass(), "table", term23087);
        setIntField(term23078, term23078.getClass(), "count", 0);
        setIntField(term23078, term23078.getClass(), "threshold", 8);
        setFloatField(term23078, term23078.getClass(), "loadFactor", 0.75F);
        setIntField(term23078, term23078.getClass(), "modCount", 0);
        setField(term23078, term23078.getClass(), "keySet", null);
        setField(term23078, term23078.getClass(), "entrySet", null);
        setField(term23078, term23078.getClass(), "values", null);
        setField(term23077, term23077.getClass(), "defaults", term23078);
        setField(term23077, term23077.getClass(), "file", "VGizxZnyHX");
        setField(term23077, term23077.getClass(), "basePath", "kVEZMHmRtR");
        setField(term23077, term23077.getClass(), "fileSeparator", "/");
        setBooleanField(term23077, term23077.getClass(), "isInitialized", true);
        setField(term23077, term23077.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term23077, term23077.getClass(), "keysAsListed", term23132);
        setIntField(term23191, term23191.getClass(), "hash", 114600472);
        setField(term23191, term23191.getClass(), "key", "java.lang.Object@54ecedc2");
        setField(term23191, term23191.getClass(), "value", term23220);
        setField(term23191, term23191.getClass(), "next", null);
        setElement(term23190, 8, term23191);
        setIntField(term23221, term23221.getClass(), "hash", -1350021754);
        setField(term23221, term23221.getClass(), "key", "java.lang.Object@623be6da");
        setField(term23221, term23221.getClass(), "value", term23250);
        setField(term23221, term23221.getClass(), "next", null);
        setElement(term23190, 9, term23221);
        setField(term23077, term23077.getClass(), "table", term23190);
        setIntField(term23077, term23077.getClass(), "count", -2015048151);
        setIntField(term23077, term23077.getClass(), "threshold", 8);
        setFloatField(term23077, term23077.getClass(), "loadFactor", 0.75F);
        setIntField(term23077, term23077.getClass(), "modCount", -2063457667);
        setField(term23077, term23077.getClass(), "keySet", term23255);
        setField(term23077, term23077.getClass(), "entrySet", term23261);
        setField(term23077, term23077.getClass(), "values", term23267);
        term23283 = new Long(2442117782898005296L);
        ArrayList term68230 = new ArrayList();
        ArrayList term68241 = new ArrayList();
        ((ArrayList) term68241).add("java.lang.Object@54ecedc2");
        ((ArrayList) term68241).add("java.lang.Object@623be6da");
        HashMap term68257 = new HashMap();
        Set<Object> term68540 =  ((Map) term68257).keySet();
        HashSet term68256 = new HashSet((Collection<? extends Object>) term68540);
        HashMap term68259 = new HashMap();
        Set<Object> term68541 =  ((Map) term68259).keySet();
        HashSet term68258 = new HashSet((Collection<? extends Object>) term68541);
        ArrayList term68260 = new ArrayList();
        term68226 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term68227 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term68232 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term68247 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term68248 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term68251 = newInstance(Class.forName("java.lang.Object"));
        Object term68252 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term68255 = newInstance(Class.forName("java.lang.Object"));
        setField(term68227, term68227.getClass(), "defaults", null);
        setField(term68227, term68227.getClass(), "file", null);
        setField(term68227, term68227.getClass(), "basePath", null);
        setField(term68227, term68227.getClass(), "fileSeparator", "/");
        setBooleanField(term68227, term68227.getClass(), "isInitialized", false);
        setField(term68227, term68227.getClass(), "includePropertyName", null);
        setField(term68227, term68227.getClass(), "keysAsListed", term68230);
        setField(term68227, term68227.getClass(), "table", term68232);
        setIntField(term68227, term68227.getClass(), "count", 0);
        setIntField(term68227, term68227.getClass(), "threshold", 8);
        setFloatField(term68227, term68227.getClass(), "loadFactor", 0.75F);
        setIntField(term68227, term68227.getClass(), "modCount", 0);
        setField(term68227, term68227.getClass(), "keySet", null);
        setField(term68227, term68227.getClass(), "entrySet", null);
        setField(term68227, term68227.getClass(), "values", null);
        setField(term68226, term68226.getClass(), "defaults", term68227);
        setField(term68226, term68226.getClass(), "file", "VGizxZnyHX");
        setField(term68226, term68226.getClass(), "basePath", "kVEZMHmRtR");
        setField(term68226, term68226.getClass(), "fileSeparator", "/");
        setBooleanField(term68226, term68226.getClass(), "isInitialized", true);
        setField(term68226, term68226.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term68226, term68226.getClass(), "keysAsListed", term68241);
        setIntField(term68248, term68248.getClass(), "hash", 114600472);
        setField(term68248, term68248.getClass(), "key", "java.lang.Object@54ecedc2");
        setField(term68248, term68248.getClass(), "value", term68251);
        setField(term68248, term68248.getClass(), "next", null);
        setElement(term68247, 8, term68248);
        setIntField(term68252, term68252.getClass(), "hash", -1350021754);
        setField(term68252, term68252.getClass(), "key", "java.lang.Object@623be6da");
        setField(term68252, term68252.getClass(), "value", term68255);
        setField(term68252, term68252.getClass(), "next", null);
        setElement(term68247, 9, term68252);
        setField(term68226, term68226.getClass(), "table", term68247);
        setIntField(term68226, term68226.getClass(), "count", -2015048151);
        setIntField(term68226, term68226.getClass(), "threshold", 8);
        setFloatField(term68226, term68226.getClass(), "loadFactor", 0.75F);
        setIntField(term68226, term68226.getClass(), "modCount", -2063457667);
        setField(term68226, term68226.getClass(), "keySet", term68256);
        setField(term68226, term68226.getClass(), "entrySet", term68258);
        setField(term68226, term68226.getClass(), "values", term68260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = "RbVQXSpxXy";
        args[1] = term23283;
        Object retValue = callMethod(klass, "getLong", argTypes, term23077, args);
        assertTrue(recursiveEquals(term23077, term68226));
        assertTrue(recursiveEquals(term23283, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, 2442117782898005296L));
    }

};


