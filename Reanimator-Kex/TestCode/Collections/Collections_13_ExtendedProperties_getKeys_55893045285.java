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

public class ExtendedProperties_getKeys_55893045285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8332;
     Object term42682;
     Object term42453;

    public ExtendedProperties_getKeys_55893045285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8338 = new ArrayList();
        ArrayList term8387 = new ArrayList();
        ((ArrayList) term8387).add("java.lang.Object@186a93f4");
        ((ArrayList) term8387).add("java.lang.Object@2fd8b060");
        ((ArrayList) term8387).add("java.lang.Object@230e06fd");
        HashMap term8542 = new HashMap();
        Set<Object> term42880 =  ((Map) term8542).keySet();
        HashSet term8541 = new HashSet((Collection<? extends Object>) term42880);
        HashMap term8548 = new HashMap();
        Set<Object> term42881 =  ((Map) term8548).keySet();
        HashSet term8547 = new HashSet((Collection<? extends Object>) term42881);
        ArrayList term8553 = new ArrayList();
        term8332 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term8333 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term8342 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term8472 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8473 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8502 = newInstance(Class.forName("java.lang.Object"));
        Object term8503 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8532 = newInstance(Class.forName("java.lang.Object"));
        Object term8533 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8536 = newInstance(Class.forName("java.lang.Object"));
        setField(term8333, term8333.getClass(), "defaults", null);
        setField(term8333, term8333.getClass(), "file", null);
        setField(term8333, term8333.getClass(), "basePath", null);
        setField(term8333, term8333.getClass(), "fileSeparator", "/");
        setBooleanField(term8333, term8333.getClass(), "isInitialized", false);
        setField(term8333, term8333.getClass(), "includePropertyName", null);
        setField(term8333, term8333.getClass(), "keysAsListed", term8338);
        setField(term8333, term8333.getClass(), "table", term8342);
        setIntField(term8333, term8333.getClass(), "count", 0);
        setIntField(term8333, term8333.getClass(), "threshold", 8);
        setFloatField(term8333, term8333.getClass(), "loadFactor", 0.75F);
        setIntField(term8333, term8333.getClass(), "modCount", 0);
        setField(term8333, term8333.getClass(), "keySet", null);
        setField(term8333, term8333.getClass(), "entrySet", null);
        setField(term8333, term8333.getClass(), "values", null);
        setField(term8332, term8332.getClass(), "defaults", term8333);
        setField(term8332, term8332.getClass(), "file", "kBdSllIBVz");
        setField(term8332, term8332.getClass(), "basePath", "TJmVBGfTML");
        setField(term8332, term8332.getClass(), "fileSeparator", "/");
        setBooleanField(term8332, term8332.getClass(), "isInitialized", true);
        setField(term8332, term8332.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term8332, term8332.getClass(), "keysAsListed", term8387);
        setIntField(term8473, term8473.getClass(), "hash", 1071479431);
        setField(term8473, term8473.getClass(), "key", "java.lang.Object@230e06fd");
        setField(term8473, term8473.getClass(), "value", term8502);
        setField(term8473, term8473.getClass(), "next", null);
        setElement(term8472, 0, term8473);
        setIntField(term8503, term8503.getClass(), "hash", 538166557);
        setField(term8503, term8503.getClass(), "key", "java.lang.Object@2fd8b060");
        setField(term8503, term8503.getClass(), "value", term8532);
        setIntField(term8533, term8533.getClass(), "hash", -360433785);
        setField(term8533, term8533.getClass(), "key", "");
        setField(term8533, term8533.getClass(), "value", term8536);
        setField(term8533, term8533.getClass(), "next", null);
        setField(term8503, term8503.getClass(), "next", term8533);
        setElement(term8472, 5, term8503);
        setField(term8332, term8332.getClass(), "table", term8472);
        setIntField(term8332, term8332.getClass(), "count", -14890616);
        setIntField(term8332, term8332.getClass(), "threshold", 8);
        setFloatField(term8332, term8332.getClass(), "loadFactor", 0.75F);
        setIntField(term8332, term8332.getClass(), "modCount", 1632125676);
        setField(term8332, term8332.getClass(), "keySet", term8541);
        setField(term8332, term8332.getClass(), "entrySet", term8547);
        setField(term8332, term8332.getClass(), "values", term8553);
        ArrayList term42686 = new ArrayList();
        ArrayList term42697 = new ArrayList();
        ((ArrayList) term42697).add("java.lang.Object@186a93f4");
        ((ArrayList) term42697).add("java.lang.Object@2fd8b060");
        ((ArrayList) term42697).add("java.lang.Object@230e06fd");
        HashMap term42718 = new HashMap();
        Set<Object> term43039 =  ((Map) term42718).keySet();
        HashSet term42717 = new HashSet((Collection<? extends Object>) term43039);
        HashMap term42720 = new HashMap();
        Set<Object> term43040 =  ((Map) term42720).keySet();
        HashSet term42719 = new HashSet((Collection<? extends Object>) term43040);
        ArrayList term42721 = new ArrayList();
        term42682 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term42683 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term42688 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term42705 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term42706 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42709 = newInstance(Class.forName("java.lang.Object"));
        Object term42710 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42713 = newInstance(Class.forName("java.lang.Object"));
        Object term42714 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term42716 = newInstance(Class.forName("java.lang.Object"));
        setField(term42683, term42683.getClass(), "defaults", null);
        setField(term42683, term42683.getClass(), "file", null);
        setField(term42683, term42683.getClass(), "basePath", null);
        setField(term42683, term42683.getClass(), "fileSeparator", "/");
        setBooleanField(term42683, term42683.getClass(), "isInitialized", false);
        setField(term42683, term42683.getClass(), "includePropertyName", null);
        setField(term42683, term42683.getClass(), "keysAsListed", term42686);
        setField(term42683, term42683.getClass(), "table", term42688);
        setIntField(term42683, term42683.getClass(), "count", 0);
        setIntField(term42683, term42683.getClass(), "threshold", 8);
        setFloatField(term42683, term42683.getClass(), "loadFactor", 0.75F);
        setIntField(term42683, term42683.getClass(), "modCount", 0);
        setField(term42683, term42683.getClass(), "keySet", null);
        setField(term42683, term42683.getClass(), "entrySet", null);
        setField(term42683, term42683.getClass(), "values", null);
        setField(term42682, term42682.getClass(), "defaults", term42683);
        setField(term42682, term42682.getClass(), "file", "kBdSllIBVz");
        setField(term42682, term42682.getClass(), "basePath", "TJmVBGfTML");
        setField(term42682, term42682.getClass(), "fileSeparator", "/");
        setBooleanField(term42682, term42682.getClass(), "isInitialized", true);
        setField(term42682, term42682.getClass(), "includePropertyName", "tPlsykYBqO");
        setField(term42682, term42682.getClass(), "keysAsListed", term42697);
        setIntField(term42706, term42706.getClass(), "hash", 1071479431);
        setField(term42706, term42706.getClass(), "key", "java.lang.Object@230e06fd");
        setField(term42706, term42706.getClass(), "value", term42709);
        setField(term42706, term42706.getClass(), "next", null);
        setElement(term42705, 0, term42706);
        setIntField(term42710, term42710.getClass(), "hash", 538166557);
        setField(term42710, term42710.getClass(), "key", "java.lang.Object@2fd8b060");
        setField(term42710, term42710.getClass(), "value", term42713);
        setIntField(term42714, term42714.getClass(), "hash", -360433785);
        setField(term42714, term42714.getClass(), "key", "");
        setField(term42714, term42714.getClass(), "value", term42716);
        setField(term42714, term42714.getClass(), "next", null);
        setField(term42710, term42710.getClass(), "next", term42714);
        setElement(term42705, 5, term42710);
        setField(term42682, term42682.getClass(), "table", term42705);
        setIntField(term42682, term42682.getClass(), "count", -14890616);
        setIntField(term42682, term42682.getClass(), "threshold", 8);
        setFloatField(term42682, term42682.getClass(), "loadFactor", 0.75F);
        setIntField(term42682, term42682.getClass(), "modCount", 1632125676);
        setField(term42682, term42682.getClass(), "keySet", term42717);
        setField(term42682, term42682.getClass(), "entrySet", term42719);
        setField(term42682, term42682.getClass(), "values", term42721);
        ArrayList term42457 = new ArrayList();
        ((ArrayList) term42457).add("java.lang.Object@186a93f4");
        ((ArrayList) term42457).add("java.lang.Object@2fd8b060");
        ((ArrayList) term42457).add("java.lang.Object@230e06fd");
        term42453 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term42453, term42453.getClass(), "cursor", 0);
        setIntField(term42453, term42453.getClass(), "lastRet", -1);
        setIntField(term42453, term42453.getClass(), "expectedModCount", 3);
        setField(term42453, term42453.getClass(), "this$0", term42457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term8332, args);
        assertTrue(recursiveEquals(term8332, term42682));
        assertTrue(recursiveEquals(retValue, term42453));
    }

};


