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

public class ExtendedProperties_addProperty_55335404075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term1270;
     Object term10064;
     Object term10094;

    public ExtendedProperties_addProperty_55335404075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1196 = new ArrayList();
        ArrayList term1233 = new ArrayList();
        HashMap term1243 = new HashMap();
        Set<Object> term10117 =  ((Map) term1243).keySet();
        HashSet term1242 = new HashSet((Collection<? extends Object>) term10117);
        HashMap term1249 = new HashMap();
        Set<Object> term10118 =  ((Map) term1249).keySet();
        HashSet term1248 = new HashSet((Collection<? extends Object>) term10118);
        ArrayList term1254 = new ArrayList();
        term1190 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term1191 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term1200 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term1237 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term1191, term1191.getClass(), "defaults", null);
        setField(term1191, term1191.getClass(), "file", null);
        setField(term1191, term1191.getClass(), "basePath", null);
        setField(term1191, term1191.getClass(), "fileSeparator", "/");
        setBooleanField(term1191, term1191.getClass(), "isInitialized", false);
        setField(term1191, term1191.getClass(), "keysAsListed", term1196);
        setField(term1191, term1191.getClass(), "table", term1200);
        setIntField(term1191, term1191.getClass(), "count", 0);
        setIntField(term1191, term1191.getClass(), "threshold", 8);
        setFloatField(term1191, term1191.getClass(), "loadFactor", 0.75F);
        setIntField(term1191, term1191.getClass(), "modCount", 0);
        setField(term1191, term1191.getClass(), "keySet", null);
        setField(term1191, term1191.getClass(), "entrySet", null);
        setField(term1191, term1191.getClass(), "values", null);
        setField(term1190, term1190.getClass(), "defaults", term1191);
        setField(term1190, term1190.getClass(), "file", "IoAlmYsBwc");
        setField(term1190, term1190.getClass(), "basePath", "TEParAifyi");
        setField(term1190, term1190.getClass(), "fileSeparator", "/");
        setBooleanField(term1190, term1190.getClass(), "isInitialized", false);
        setField(term1190, term1190.getClass(), "keysAsListed", term1233);
        setField(term1190, term1190.getClass(), "table", term1237);
        setIntField(term1190, term1190.getClass(), "count", 1135664017);
        setIntField(term1190, term1190.getClass(), "threshold", 8);
        setFloatField(term1190, term1190.getClass(), "loadFactor", 0.75F);
        setIntField(term1190, term1190.getClass(), "modCount", 590364439);
        setField(term1190, term1190.getClass(), "keySet", term1242);
        setField(term1190, term1190.getClass(), "entrySet", term1248);
        setField(term1190, term1190.getClass(), "values", term1254);
        term1270 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10068 = new ArrayList();
        ArrayList term10077 = new ArrayList();
        ((ArrayList) term10077).add("OWDIEULEFu");
        HashMap term10087 = new HashMap();
        Set<Object> term10171 =  ((Map) term10087).keySet();
        HashSet term10086 = new HashSet((Collection<? extends Object>) term10171);
        HashMap term10089 = new HashMap();
        Set<Object> term10172 =  ((Map) term10089).keySet();
        HashSet term10088 = new HashSet((Collection<? extends Object>) term10172);
        ArrayList term10090 = new ArrayList();
        term10064 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term10065 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term10070 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term10081 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term10082 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10085 = newInstance(Class.forName("java.lang.Object"));
        setField(term10065, term10065.getClass(), "defaults", null);
        setField(term10065, term10065.getClass(), "file", null);
        setField(term10065, term10065.getClass(), "basePath", null);
        setField(term10065, term10065.getClass(), "fileSeparator", "/");
        setBooleanField(term10065, term10065.getClass(), "isInitialized", false);
        setField(term10065, term10065.getClass(), "keysAsListed", term10068);
        setField(term10065, term10065.getClass(), "table", term10070);
        setIntField(term10065, term10065.getClass(), "count", 0);
        setIntField(term10065, term10065.getClass(), "threshold", 8);
        setFloatField(term10065, term10065.getClass(), "loadFactor", 0.75F);
        setIntField(term10065, term10065.getClass(), "modCount", 0);
        setField(term10065, term10065.getClass(), "keySet", null);
        setField(term10065, term10065.getClass(), "entrySet", null);
        setField(term10065, term10065.getClass(), "values", null);
        setField(term10064, term10064.getClass(), "defaults", term10065);
        setField(term10064, term10064.getClass(), "file", "IoAlmYsBwc");
        setField(term10064, term10064.getClass(), "basePath", "TEParAifyi");
        setField(term10064, term10064.getClass(), "fileSeparator", "/");
        setBooleanField(term10064, term10064.getClass(), "isInitialized", true);
        setField(term10064, term10064.getClass(), "keysAsListed", term10077);
        setIntField(term10082, term10082.getClass(), "hash", -302892155);
        setField(term10082, term10082.getClass(), "key", "OWDIEULEFu");
        setField(term10082, term10082.getClass(), "value", term10085);
        setField(term10082, term10082.getClass(), "next", null);
        setElement(term10081, 3, term10082);
        setField(term10064, term10064.getClass(), "table", term10081);
        setIntField(term10064, term10064.getClass(), "count", 1135664018);
        setIntField(term10064, term10064.getClass(), "threshold", 17);
        setFloatField(term10064, term10064.getClass(), "loadFactor", 0.75F);
        setIntField(term10064, term10064.getClass(), "modCount", 590364441);
        setField(term10064, term10064.getClass(), "keySet", term10086);
        setField(term10064, term10064.getClass(), "entrySet", term10088);
        setField(term10064, term10064.getClass(), "values", term10090);
        term10094 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "OWDIEULEFu";
        args[1] = term1270;
        callMethod(klass, "addProperty", argTypes, term1190, args);
        assertTrue(recursiveEquals(term1190, term10064));
        assertTrue(recursiveEquals(term1270, term10094));
    }

};


