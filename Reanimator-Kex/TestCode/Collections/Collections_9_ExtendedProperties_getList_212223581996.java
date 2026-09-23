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

public class ExtendedProperties_getList_212223581996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13507;
     Object term51720;
     Object term51716;

    public ExtendedProperties_getList_212223581996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13513 = new ArrayList();
        ArrayList term13562 = new ArrayList();
        ((ArrayList) term13562).add("java.lang.Object@443ebd04");
        HashMap term13629 = new HashMap();
        Set<Object> term51834 =  ((Map) term13629).keySet();
        HashSet term13628 = new HashSet((Collection<? extends Object>) term51834);
        HashMap term13635 = new HashMap();
        Set<Object> term51835 =  ((Map) term13635).keySet();
        HashSet term13634 = new HashSet((Collection<? extends Object>) term51835);
        ArrayList term13640 = new ArrayList();
        term13507 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13508 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13517 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13593 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term13594 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term13623 = newInstance(Class.forName("java.lang.Object"));
        setField(term13508, term13508.getClass(), "defaults", null);
        setField(term13508, term13508.getClass(), "file", null);
        setField(term13508, term13508.getClass(), "basePath", null);
        setField(term13508, term13508.getClass(), "fileSeparator", "/");
        setBooleanField(term13508, term13508.getClass(), "isInitialized", false);
        setField(term13508, term13508.getClass(), "includePropertyName", null);
        setField(term13508, term13508.getClass(), "keysAsListed", term13513);
        setField(term13508, term13508.getClass(), "table", term13517);
        setIntField(term13508, term13508.getClass(), "count", 0);
        setIntField(term13508, term13508.getClass(), "threshold", 8);
        setFloatField(term13508, term13508.getClass(), "loadFactor", 0.75F);
        setIntField(term13508, term13508.getClass(), "modCount", 0);
        setField(term13508, term13508.getClass(), "keySet", null);
        setField(term13508, term13508.getClass(), "entrySet", null);
        setField(term13508, term13508.getClass(), "values", null);
        setField(term13507, term13507.getClass(), "defaults", term13508);
        setField(term13507, term13507.getClass(), "file", "fztQhjqwdP");
        setField(term13507, term13507.getClass(), "basePath", "eVpkWxjuki");
        setField(term13507, term13507.getClass(), "fileSeparator", "/");
        setBooleanField(term13507, term13507.getClass(), "isInitialized", true);
        setField(term13507, term13507.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term13507, term13507.getClass(), "keysAsListed", term13562);
        setIntField(term13594, term13594.getClass(), "hash", 1237055973);
        setField(term13594, term13594.getClass(), "key", "java.lang.Object@443ebd04");
        setField(term13594, term13594.getClass(), "value", term13623);
        setField(term13594, term13594.getClass(), "next", null);
        setElement(term13593, 10, term13594);
        setField(term13507, term13507.getClass(), "table", term13593);
        setIntField(term13507, term13507.getClass(), "count", -481533956);
        setIntField(term13507, term13507.getClass(), "threshold", 8);
        setFloatField(term13507, term13507.getClass(), "loadFactor", 0.75F);
        setIntField(term13507, term13507.getClass(), "modCount", 1240914517);
        setField(term13507, term13507.getClass(), "keySet", term13628);
        setField(term13507, term13507.getClass(), "entrySet", term13634);
        setField(term13507, term13507.getClass(), "values", term13640);
        ArrayList term51724 = new ArrayList();
        ArrayList term51735 = new ArrayList();
        ((ArrayList) term51735).add("java.lang.Object@443ebd04");
        HashMap term51745 = new HashMap();
        Set<Object> term51928 =  ((Map) term51745).keySet();
        HashSet term51744 = new HashSet((Collection<? extends Object>) term51928);
        HashMap term51747 = new HashMap();
        Set<Object> term51929 =  ((Map) term51747).keySet();
        HashSet term51746 = new HashSet((Collection<? extends Object>) term51929);
        ArrayList term51748 = new ArrayList();
        term51720 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term51721 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term51726 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term51739 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51740 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51743 = newInstance(Class.forName("java.lang.Object"));
        setField(term51721, term51721.getClass(), "defaults", null);
        setField(term51721, term51721.getClass(), "file", null);
        setField(term51721, term51721.getClass(), "basePath", null);
        setField(term51721, term51721.getClass(), "fileSeparator", "/");
        setBooleanField(term51721, term51721.getClass(), "isInitialized", false);
        setField(term51721, term51721.getClass(), "includePropertyName", null);
        setField(term51721, term51721.getClass(), "keysAsListed", term51724);
        setField(term51721, term51721.getClass(), "table", term51726);
        setIntField(term51721, term51721.getClass(), "count", 0);
        setIntField(term51721, term51721.getClass(), "threshold", 8);
        setFloatField(term51721, term51721.getClass(), "loadFactor", 0.75F);
        setIntField(term51721, term51721.getClass(), "modCount", 0);
        setField(term51721, term51721.getClass(), "keySet", null);
        setField(term51721, term51721.getClass(), "entrySet", null);
        setField(term51721, term51721.getClass(), "values", null);
        setField(term51720, term51720.getClass(), "defaults", term51721);
        setField(term51720, term51720.getClass(), "file", "fztQhjqwdP");
        setField(term51720, term51720.getClass(), "basePath", "eVpkWxjuki");
        setField(term51720, term51720.getClass(), "fileSeparator", "/");
        setBooleanField(term51720, term51720.getClass(), "isInitialized", true);
        setField(term51720, term51720.getClass(), "includePropertyName", "SJiQaLvSKv");
        setField(term51720, term51720.getClass(), "keysAsListed", term51735);
        setIntField(term51740, term51740.getClass(), "hash", 1237055973);
        setField(term51740, term51740.getClass(), "key", "java.lang.Object@443ebd04");
        setField(term51740, term51740.getClass(), "value", term51743);
        setField(term51740, term51740.getClass(), "next", null);
        setElement(term51739, 10, term51740);
        setField(term51720, term51720.getClass(), "table", term51739);
        setIntField(term51720, term51720.getClass(), "count", -481533956);
        setIntField(term51720, term51720.getClass(), "threshold", 8);
        setFloatField(term51720, term51720.getClass(), "loadFactor", 0.75F);
        setIntField(term51720, term51720.getClass(), "modCount", 1240914517);
        setField(term51720, term51720.getClass(), "keySet", term51744);
        setField(term51720, term51720.getClass(), "entrySet", term51746);
        setField(term51720, term51720.getClass(), "values", term51748);
        term51716 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        Object retValue = callMethod(klass, "getList", argTypes, term13507, args);
        assertTrue(recursiveEquals(term13507, term51720));
        assertTrue(recursiveEquals(retValue, term51716));
    }

};


