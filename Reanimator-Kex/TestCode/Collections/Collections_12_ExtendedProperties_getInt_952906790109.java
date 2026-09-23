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
import java.lang.Integer;

public class ExtendedProperties_getInt_952906790109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19956;
     Object term20219;
     Object term63647;

    public ExtendedProperties_getInt_952906790109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19962 = new ArrayList();
        ArrayList term20011 = new ArrayList();
        ((ArrayList) term20011).add("java.lang.Object@5001caaf");
        ((ArrayList) term20011).add("java.lang.Object@7d647344");
        ((ArrayList) term20011).add("java.lang.Object@4b745253");
        HashMap term20192 = new HashMap();
        Set<Object> term63873 =  ((Map) term20192).keySet();
        HashSet term20191 = new HashSet((Collection<? extends Object>) term63873);
        HashMap term20198 = new HashMap();
        Set<Object> term63874 =  ((Map) term20198).keySet();
        HashSet term20197 = new HashSet((Collection<? extends Object>) term63874);
        ArrayList term20203 = new ArrayList();
        term19956 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term19957 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term19966 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20096 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term20097 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20126 = newInstance(Class.forName("java.lang.Object"));
        Object term20127 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20156 = newInstance(Class.forName("java.lang.Object"));
        Object term20157 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20186 = newInstance(Class.forName("java.lang.Object"));
        setField(term19957, term19957.getClass(), "defaults", null);
        setField(term19957, term19957.getClass(), "file", null);
        setField(term19957, term19957.getClass(), "basePath", null);
        setField(term19957, term19957.getClass(), "fileSeparator", "/");
        setBooleanField(term19957, term19957.getClass(), "isInitialized", false);
        setField(term19957, term19957.getClass(), "includePropertyName", null);
        setField(term19957, term19957.getClass(), "keysAsListed", term19962);
        setField(term19957, term19957.getClass(), "table", term19966);
        setIntField(term19957, term19957.getClass(), "count", 0);
        setIntField(term19957, term19957.getClass(), "threshold", 8);
        setFloatField(term19957, term19957.getClass(), "loadFactor", 0.75F);
        setIntField(term19957, term19957.getClass(), "modCount", 0);
        setField(term19957, term19957.getClass(), "keySet", null);
        setField(term19957, term19957.getClass(), "entrySet", null);
        setField(term19957, term19957.getClass(), "values", null);
        setField(term19956, term19956.getClass(), "defaults", term19957);
        setField(term19956, term19956.getClass(), "file", "aWYOWZFyaX");
        setField(term19956, term19956.getClass(), "basePath", "BRIVNtfUWU");
        setField(term19956, term19956.getClass(), "fileSeparator", "/");
        setBooleanField(term19956, term19956.getClass(), "isInitialized", true);
        setField(term19956, term19956.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term19956, term19956.getClass(), "keysAsListed", term20011);
        setIntField(term20097, term20097.getClass(), "hash", -819572077);
        setField(term20097, term20097.getClass(), "key", "java.lang.Object@4b745253");
        setField(term20097, term20097.getClass(), "value", term20126);
        setField(term20097, term20097.getClass(), "next", null);
        setElement(term20096, 51, term20097);
        setIntField(term20127, term20127.getClass(), "hash", 1860330356);
        setField(term20127, term20127.getClass(), "key", "java.lang.Object@7d647344");
        setField(term20127, term20127.getClass(), "value", term20156);
        setField(term20127, term20127.getClass(), "next", null);
        setElement(term20096, 76, term20127);
        setIntField(term20157, term20157.getClass(), "hash", -704030484);
        setField(term20157, term20157.getClass(), "key", "java.lang.Object@5001caaf");
        setField(term20157, term20157.getClass(), "value", term20186);
        setField(term20157, term20157.getClass(), "next", null);
        setElement(term20096, 79, term20157);
        setField(term19956, term19956.getClass(), "table", term20096);
        setIntField(term19956, term19956.getClass(), "count", 1072005686);
        setIntField(term19956, term19956.getClass(), "threshold", 71);
        setFloatField(term19956, term19956.getClass(), "loadFactor", 0.75F);
        setIntField(term19956, term19956.getClass(), "modCount", 1861318865);
        setField(term19956, term19956.getClass(), "keySet", term20191);
        setField(term19956, term19956.getClass(), "entrySet", term20197);
        setField(term19956, term19956.getClass(), "values", term20203);
        term20219 = new Integer(568954359);
        ArrayList term63651 = new ArrayList();
        ArrayList term63662 = new ArrayList();
        ((ArrayList) term63662).add("java.lang.Object@5001caaf");
        ((ArrayList) term63662).add("java.lang.Object@7d647344");
        ((ArrayList) term63662).add("java.lang.Object@4b745253");
        HashMap term63684 = new HashMap();
        Set<Object> term64067 =  ((Map) term63684).keySet();
        HashSet term63683 = new HashSet((Collection<? extends Object>) term64067);
        HashMap term63686 = new HashMap();
        Set<Object> term64068 =  ((Map) term63686).keySet();
        HashSet term63685 = new HashSet((Collection<? extends Object>) term64068);
        ArrayList term63687 = new ArrayList();
        term63647 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term63648 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term63653 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term63670 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term63671 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63674 = newInstance(Class.forName("java.lang.Object"));
        Object term63675 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63678 = newInstance(Class.forName("java.lang.Object"));
        Object term63679 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63682 = newInstance(Class.forName("java.lang.Object"));
        setField(term63648, term63648.getClass(), "defaults", null);
        setField(term63648, term63648.getClass(), "file", null);
        setField(term63648, term63648.getClass(), "basePath", null);
        setField(term63648, term63648.getClass(), "fileSeparator", "/");
        setBooleanField(term63648, term63648.getClass(), "isInitialized", false);
        setField(term63648, term63648.getClass(), "includePropertyName", null);
        setField(term63648, term63648.getClass(), "keysAsListed", term63651);
        setField(term63648, term63648.getClass(), "table", term63653);
        setIntField(term63648, term63648.getClass(), "count", 0);
        setIntField(term63648, term63648.getClass(), "threshold", 8);
        setFloatField(term63648, term63648.getClass(), "loadFactor", 0.75F);
        setIntField(term63648, term63648.getClass(), "modCount", 0);
        setField(term63648, term63648.getClass(), "keySet", null);
        setField(term63648, term63648.getClass(), "entrySet", null);
        setField(term63648, term63648.getClass(), "values", null);
        setField(term63647, term63647.getClass(), "defaults", term63648);
        setField(term63647, term63647.getClass(), "file", "aWYOWZFyaX");
        setField(term63647, term63647.getClass(), "basePath", "BRIVNtfUWU");
        setField(term63647, term63647.getClass(), "fileSeparator", "/");
        setBooleanField(term63647, term63647.getClass(), "isInitialized", true);
        setField(term63647, term63647.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term63647, term63647.getClass(), "keysAsListed", term63662);
        setIntField(term63671, term63671.getClass(), "hash", -819572077);
        setField(term63671, term63671.getClass(), "key", "java.lang.Object@4b745253");
        setField(term63671, term63671.getClass(), "value", term63674);
        setField(term63671, term63671.getClass(), "next", null);
        setElement(term63670, 51, term63671);
        setIntField(term63675, term63675.getClass(), "hash", 1860330356);
        setField(term63675, term63675.getClass(), "key", "java.lang.Object@7d647344");
        setField(term63675, term63675.getClass(), "value", term63678);
        setField(term63675, term63675.getClass(), "next", null);
        setElement(term63670, 76, term63675);
        setIntField(term63679, term63679.getClass(), "hash", -704030484);
        setField(term63679, term63679.getClass(), "key", "java.lang.Object@5001caaf");
        setField(term63679, term63679.getClass(), "value", term63682);
        setField(term63679, term63679.getClass(), "next", null);
        setElement(term63670, 79, term63679);
        setField(term63647, term63647.getClass(), "table", term63670);
        setIntField(term63647, term63647.getClass(), "count", 1072005686);
        setIntField(term63647, term63647.getClass(), "threshold", 71);
        setFloatField(term63647, term63647.getClass(), "loadFactor", 0.75F);
        setIntField(term63647, term63647.getClass(), "modCount", 1861318865);
        setField(term63647, term63647.getClass(), "keySet", term63683);
        setField(term63647, term63647.getClass(), "entrySet", term63685);
        setField(term63647, term63647.getClass(), "values", term63687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "WzFopsaDuG";
        args[1] = term20219;
        Object retValue = callMethod(klass, "getInt", argTypes, term19956, args);
        assertTrue(recursiveEquals(term19956, term63647));
        assertTrue(recursiveEquals(term20219, 568954359));
        assertTrue(recursiveEquals(retValue, 568954359));
    }

};


