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

public class ExtendedProperties_getInt_952906790107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6105;
     Object term6209;
     Object term21559;

    public ExtendedProperties_getInt_952906790107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6111 = new ArrayList();
        ArrayList term6160 = new ArrayList();
        HashMap term6182 = new HashMap();
        Set<Object> term21626 =  ((Map) term6182).keySet();
        HashSet term6181 = new HashSet((Collection<? extends Object>) term21626);
        HashMap term6188 = new HashMap();
        Set<Object> term21627 =  ((Map) term6188).keySet();
        HashSet term6187 = new HashSet((Collection<? extends Object>) term21627);
        ArrayList term6193 = new ArrayList();
        term6105 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term6106 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term6115 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term6164 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term6165 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6167 = newInstance(Class.forName("java.lang.Object"));
        Object term6168 = newInstance(Class.forName("java.lang.Object"));
        Object term6169 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6171 = newInstance(Class.forName("java.lang.Object"));
        Object term6172 = newInstance(Class.forName("java.lang.Object"));
        Object term6173 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6175 = newInstance(Class.forName("java.lang.Object"));
        Object term6176 = newInstance(Class.forName("java.lang.Object"));
        setField(term6106, term6106.getClass(), "defaults", null);
        setField(term6106, term6106.getClass(), "file", null);
        setField(term6106, term6106.getClass(), "basePath", null);
        setField(term6106, term6106.getClass(), "fileSeparator", "/");
        setBooleanField(term6106, term6106.getClass(), "isInitialized", false);
        setField(term6106, term6106.getClass(), "includePropertyName", null);
        setField(term6106, term6106.getClass(), "keysAsListed", term6111);
        setField(term6106, term6106.getClass(), "table", term6115);
        setIntField(term6106, term6106.getClass(), "count", 0);
        setIntField(term6106, term6106.getClass(), "threshold", 8);
        setFloatField(term6106, term6106.getClass(), "loadFactor", 0.75F);
        setIntField(term6106, term6106.getClass(), "modCount", 0);
        setField(term6106, term6106.getClass(), "keySet", null);
        setField(term6106, term6106.getClass(), "entrySet", null);
        setField(term6106, term6106.getClass(), "values", null);
        setField(term6105, term6105.getClass(), "defaults", term6106);
        setField(term6105, term6105.getClass(), "file", "aWYOWZFyaX");
        setField(term6105, term6105.getClass(), "basePath", "BRIVNtfUWU");
        setField(term6105, term6105.getClass(), "fileSeparator", "/");
        setBooleanField(term6105, term6105.getClass(), "isInitialized", false);
        setField(term6105, term6105.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term6105, term6105.getClass(), "keysAsListed", term6160);
        setIntField(term6165, term6165.getClass(), "hash", 598726916);
        setField(term6165, term6165.getClass(), "key", term6167);
        setField(term6165, term6165.getClass(), "value", term6168);
        setField(term6165, term6165.getClass(), "next", null);
        setElement(term6164, 56, term6165);
        setIntField(term6169, term6169.getClass(), "hash", 1250642977);
        setField(term6169, term6169.getClass(), "key", term6171);
        setField(term6169, term6169.getClass(), "value", term6172);
        setField(term6169, term6169.getClass(), "next", null);
        setElement(term6164, 87, term6169);
        setIntField(term6173, term6173.getClass(), "hash", 933123818);
        setField(term6173, term6173.getClass(), "key", term6175);
        setField(term6173, term6173.getClass(), "value", term6176);
        setField(term6173, term6173.getClass(), "next", null);
        setElement(term6164, 93, term6173);
        setField(term6105, term6105.getClass(), "table", term6164);
        setIntField(term6105, term6105.getClass(), "count", 1072005686);
        setIntField(term6105, term6105.getClass(), "threshold", 71);
        setFloatField(term6105, term6105.getClass(), "loadFactor", 0.75F);
        setIntField(term6105, term6105.getClass(), "modCount", 1861318865);
        setField(term6105, term6105.getClass(), "keySet", term6181);
        setField(term6105, term6105.getClass(), "entrySet", term6187);
        setField(term6105, term6105.getClass(), "values", term6193);
        term6209 = new Integer(568954359);
        ArrayList term21563 = new ArrayList();
        ArrayList term21574 = new ArrayList();
        HashMap term21587 = new HashMap();
        Set<Object> term21670 =  ((Map) term21587).keySet();
        HashSet term21586 = new HashSet((Collection<? extends Object>) term21670);
        HashMap term21589 = new HashMap();
        Set<Object> term21671 =  ((Map) term21589).keySet();
        HashSet term21588 = new HashSet((Collection<? extends Object>) term21671);
        ArrayList term21590 = new ArrayList();
        term21559 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term21560 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term21565 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term21576 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term21577 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term21578 = newInstance(Class.forName("java.lang.Object"));
        Object term21579 = newInstance(Class.forName("java.lang.Object"));
        Object term21580 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term21581 = newInstance(Class.forName("java.lang.Object"));
        Object term21582 = newInstance(Class.forName("java.lang.Object"));
        Object term21583 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term21584 = newInstance(Class.forName("java.lang.Object"));
        Object term21585 = newInstance(Class.forName("java.lang.Object"));
        setField(term21560, term21560.getClass(), "defaults", null);
        setField(term21560, term21560.getClass(), "file", null);
        setField(term21560, term21560.getClass(), "basePath", null);
        setField(term21560, term21560.getClass(), "fileSeparator", "/");
        setBooleanField(term21560, term21560.getClass(), "isInitialized", false);
        setField(term21560, term21560.getClass(), "includePropertyName", null);
        setField(term21560, term21560.getClass(), "keysAsListed", term21563);
        setField(term21560, term21560.getClass(), "table", term21565);
        setIntField(term21560, term21560.getClass(), "count", 0);
        setIntField(term21560, term21560.getClass(), "threshold", 8);
        setFloatField(term21560, term21560.getClass(), "loadFactor", 0.75F);
        setIntField(term21560, term21560.getClass(), "modCount", 0);
        setField(term21560, term21560.getClass(), "keySet", null);
        setField(term21560, term21560.getClass(), "entrySet", null);
        setField(term21560, term21560.getClass(), "values", null);
        setField(term21559, term21559.getClass(), "defaults", term21560);
        setField(term21559, term21559.getClass(), "file", "aWYOWZFyaX");
        setField(term21559, term21559.getClass(), "basePath", "BRIVNtfUWU");
        setField(term21559, term21559.getClass(), "fileSeparator", "/");
        setBooleanField(term21559, term21559.getClass(), "isInitialized", false);
        setField(term21559, term21559.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term21559, term21559.getClass(), "keysAsListed", term21574);
        setIntField(term21577, term21577.getClass(), "hash", 598726916);
        setField(term21577, term21577.getClass(), "key", term21578);
        setField(term21577, term21577.getClass(), "value", term21579);
        setField(term21577, term21577.getClass(), "next", null);
        setElement(term21576, 56, term21577);
        setIntField(term21580, term21580.getClass(), "hash", 1250642977);
        setField(term21580, term21580.getClass(), "key", term21581);
        setField(term21580, term21580.getClass(), "value", term21582);
        setField(term21580, term21580.getClass(), "next", null);
        setElement(term21576, 87, term21580);
        setIntField(term21583, term21583.getClass(), "hash", 933123818);
        setField(term21583, term21583.getClass(), "key", term21584);
        setField(term21583, term21583.getClass(), "value", term21585);
        setField(term21583, term21583.getClass(), "next", null);
        setElement(term21576, 93, term21583);
        setField(term21559, term21559.getClass(), "table", term21576);
        setIntField(term21559, term21559.getClass(), "count", 1072005686);
        setIntField(term21559, term21559.getClass(), "threshold", 71);
        setFloatField(term21559, term21559.getClass(), "loadFactor", 0.75F);
        setIntField(term21559, term21559.getClass(), "modCount", 1861318865);
        setField(term21559, term21559.getClass(), "keySet", term21586);
        setField(term21559, term21559.getClass(), "entrySet", term21588);
        setField(term21559, term21559.getClass(), "values", term21590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "WzFopsaDuG";
        args[1] = term6209;
        Object retValue = callMethod(klass, "getInt", argTypes, term6105, args);
        assertTrue(recursiveEquals(term6105, term21559));
        assertTrue(recursiveEquals(term6209, 568954359));
        assertTrue(recursiveEquals(retValue, 568954359));
    }

};


