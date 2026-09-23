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

public class ExtendedProperties_clearProperty_3423515384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7982;
     Object term42127;

    public ExtendedProperties_clearProperty_3423515384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7988 = new ArrayList();
        ArrayList term8037 = new ArrayList();
        ((ArrayList) term8037).add("java.lang.Object@7412f033");
        ((ArrayList) term8037).add("java.lang.Object@6f227a04");
        HashMap term8161 = new HashMap();
        Set<Object> term42297 =  ((Map) term8161).keySet();
        HashSet term8160 = new HashSet((Collection<? extends Object>) term42297);
        HashMap term8167 = new HashMap();
        Set<Object> term42298 =  ((Map) term8167).keySet();
        HashSet term8166 = new HashSet((Collection<? extends Object>) term42298);
        ArrayList term8172 = new ArrayList();
        term7982 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7983 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7992 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term8095 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8096 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8125 = newInstance(Class.forName("java.lang.Object"));
        Object term8126 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8155 = newInstance(Class.forName("java.lang.Object"));
        setField(term7983, term7983.getClass(), "defaults", null);
        setField(term7983, term7983.getClass(), "file", null);
        setField(term7983, term7983.getClass(), "basePath", null);
        setField(term7983, term7983.getClass(), "fileSeparator", "/");
        setBooleanField(term7983, term7983.getClass(), "isInitialized", false);
        setField(term7983, term7983.getClass(), "includePropertyName", null);
        setField(term7983, term7983.getClass(), "keysAsListed", term7988);
        setField(term7983, term7983.getClass(), "table", term7992);
        setIntField(term7983, term7983.getClass(), "count", 0);
        setIntField(term7983, term7983.getClass(), "threshold", 8);
        setFloatField(term7983, term7983.getClass(), "loadFactor", 0.75F);
        setIntField(term7983, term7983.getClass(), "modCount", 0);
        setField(term7983, term7983.getClass(), "keySet", null);
        setField(term7983, term7983.getClass(), "entrySet", null);
        setField(term7983, term7983.getClass(), "values", null);
        setField(term7982, term7982.getClass(), "defaults", term7983);
        setField(term7982, term7982.getClass(), "file", "hoicvmsovO");
        setField(term7982, term7982.getClass(), "basePath", "eqJfYWRaEL");
        setField(term7982, term7982.getClass(), "fileSeparator", "/");
        setBooleanField(term7982, term7982.getClass(), "isInitialized", true);
        setField(term7982, term7982.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term7982, term7982.getClass(), "keysAsListed", term8037);
        setIntField(term8096, term8096.getClass(), "hash", 1776207819);
        setField(term8096, term8096.getClass(), "key", "java.lang.Object@6f227a04");
        setField(term8096, term8096.getClass(), "value", term8125);
        setField(term8096, term8096.getClass(), "next", null);
        setElement(term8095, 1, term8096);
        setIntField(term8126, term8126.getClass(), "hash", 2066231093);
        setField(term8126, term8126.getClass(), "key", "java.lang.Object@7412f033");
        setField(term8126, term8126.getClass(), "value", term8155);
        setField(term8126, term8126.getClass(), "next", null);
        setElement(term8095, 3, term8126);
        setField(term7982, term7982.getClass(), "table", term8095);
        setIntField(term7982, term7982.getClass(), "count", -1016503457);
        setIntField(term7982, term7982.getClass(), "threshold", 8);
        setFloatField(term7982, term7982.getClass(), "loadFactor", 0.75F);
        setIntField(term7982, term7982.getClass(), "modCount", -1968847289);
        setField(term7982, term7982.getClass(), "keySet", term8160);
        setField(term7982, term7982.getClass(), "entrySet", term8166);
        setField(term7982, term7982.getClass(), "values", term8172);
        ArrayList term42131 = new ArrayList();
        ArrayList term42142 = new ArrayList();
        ((ArrayList) term42142).add("java.lang.Object@7412f033");
        ((ArrayList) term42142).add("java.lang.Object@6f227a04");
        HashMap term42158 = new HashMap();
        Set<Object> term42441 =  ((Map) term42158).keySet();
        HashSet term42157 = new HashSet((Collection<? extends Object>) term42441);
        HashMap term42160 = new HashMap();
        Set<Object> term42442 =  ((Map) term42160).keySet();
        HashSet term42159 = new HashSet((Collection<? extends Object>) term42442);
        ArrayList term42161 = new ArrayList();
        term42127 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term42128 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term42133 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term42148 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term42149 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42152 = newInstance(Class.forName("java.lang.Object"));
        Object term42153 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42156 = newInstance(Class.forName("java.lang.Object"));
        setField(term42128, term42128.getClass(), "defaults", null);
        setField(term42128, term42128.getClass(), "file", null);
        setField(term42128, term42128.getClass(), "basePath", null);
        setField(term42128, term42128.getClass(), "fileSeparator", "/");
        setBooleanField(term42128, term42128.getClass(), "isInitialized", false);
        setField(term42128, term42128.getClass(), "includePropertyName", null);
        setField(term42128, term42128.getClass(), "keysAsListed", term42131);
        setField(term42128, term42128.getClass(), "table", term42133);
        setIntField(term42128, term42128.getClass(), "count", 0);
        setIntField(term42128, term42128.getClass(), "threshold", 8);
        setFloatField(term42128, term42128.getClass(), "loadFactor", 0.75F);
        setIntField(term42128, term42128.getClass(), "modCount", 0);
        setField(term42128, term42128.getClass(), "keySet", null);
        setField(term42128, term42128.getClass(), "entrySet", null);
        setField(term42128, term42128.getClass(), "values", null);
        setField(term42127, term42127.getClass(), "defaults", term42128);
        setField(term42127, term42127.getClass(), "file", "hoicvmsovO");
        setField(term42127, term42127.getClass(), "basePath", "eqJfYWRaEL");
        setField(term42127, term42127.getClass(), "fileSeparator", "/");
        setBooleanField(term42127, term42127.getClass(), "isInitialized", true);
        setField(term42127, term42127.getClass(), "includePropertyName", "fhkbdRViHi");
        setField(term42127, term42127.getClass(), "keysAsListed", term42142);
        setIntField(term42149, term42149.getClass(), "hash", 1776207819);
        setField(term42149, term42149.getClass(), "key", "java.lang.Object@6f227a04");
        setField(term42149, term42149.getClass(), "value", term42152);
        setField(term42149, term42149.getClass(), "next", null);
        setElement(term42148, 1, term42149);
        setIntField(term42153, term42153.getClass(), "hash", 2066231093);
        setField(term42153, term42153.getClass(), "key", "java.lang.Object@7412f033");
        setField(term42153, term42153.getClass(), "value", term42156);
        setField(term42153, term42153.getClass(), "next", null);
        setElement(term42148, 3, term42153);
        setField(term42127, term42127.getClass(), "table", term42148);
        setIntField(term42127, term42127.getClass(), "count", -1016503457);
        setIntField(term42127, term42127.getClass(), "threshold", 8);
        setFloatField(term42127, term42127.getClass(), "loadFactor", 0.75F);
        setIntField(term42127, term42127.getClass(), "modCount", -1968847289);
        setField(term42127, term42127.getClass(), "keySet", term42157);
        setField(term42127, term42127.getClass(), "entrySet", term42159);
        setField(term42127, term42127.getClass(), "values", term42161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "clearProperty", argTypes, term7982, args);
        assertTrue(recursiveEquals(term7982, term42127));
    }

};


