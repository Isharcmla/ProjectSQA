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
import java.lang.Short;

public class ExtendedProperties_getShort_194927783105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5645;
     Object term5741;
     Object term20766;

    public ExtendedProperties_getShort_194927783105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5651 = new ArrayList();
        ArrayList term5700 = new ArrayList();
        HashMap term5714 = new HashMap();
        Set<Object> term20827 =  ((Map) term5714).keySet();
        HashSet term5713 = new HashSet((Collection<? extends Object>) term20827);
        HashMap term5720 = new HashMap();
        Set<Object> term20828 =  ((Map) term5720).keySet();
        HashSet term5719 = new HashSet((Collection<? extends Object>) term20828);
        ArrayList term5725 = new ArrayList();
        term5645 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5646 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5655 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5704 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5705 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5707 = newInstance(Class.forName("java.lang.Object"));
        Object term5708 = newInstance(Class.forName("java.lang.Object"));
        setField(term5646, term5646.getClass(), "defaults", null);
        setField(term5646, term5646.getClass(), "file", null);
        setField(term5646, term5646.getClass(), "basePath", null);
        setField(term5646, term5646.getClass(), "fileSeparator", "/");
        setBooleanField(term5646, term5646.getClass(), "isInitialized", false);
        setField(term5646, term5646.getClass(), "includePropertyName", null);
        setField(term5646, term5646.getClass(), "keysAsListed", term5651);
        setField(term5646, term5646.getClass(), "table", term5655);
        setIntField(term5646, term5646.getClass(), "count", 0);
        setIntField(term5646, term5646.getClass(), "threshold", 8);
        setFloatField(term5646, term5646.getClass(), "loadFactor", 0.75F);
        setIntField(term5646, term5646.getClass(), "modCount", 0);
        setField(term5646, term5646.getClass(), "keySet", null);
        setField(term5646, term5646.getClass(), "entrySet", null);
        setField(term5646, term5646.getClass(), "values", null);
        setField(term5645, term5645.getClass(), "defaults", term5646);
        setField(term5645, term5645.getClass(), "file", "HzqpegHiRq");
        setField(term5645, term5645.getClass(), "basePath", "jwsfVjMoJT");
        setField(term5645, term5645.getClass(), "fileSeparator", "/");
        setBooleanField(term5645, term5645.getClass(), "isInitialized", true);
        setField(term5645, term5645.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term5645, term5645.getClass(), "keysAsListed", term5700);
        setIntField(term5705, term5705.getClass(), "hash", 118241845);
        setField(term5705, term5705.getClass(), "key", term5707);
        setField(term5705, term5705.getClass(), "value", term5708);
        setField(term5705, term5705.getClass(), "next", null);
        setElement(term5704, 7, term5705);
        setField(term5645, term5645.getClass(), "table", term5704);
        setIntField(term5645, term5645.getClass(), "count", -1801760682);
        setIntField(term5645, term5645.getClass(), "threshold", 8);
        setFloatField(term5645, term5645.getClass(), "loadFactor", 0.75F);
        setIntField(term5645, term5645.getClass(), "modCount", 1141317872);
        setField(term5645, term5645.getClass(), "keySet", term5713);
        setField(term5645, term5645.getClass(), "entrySet", term5719);
        setField(term5645, term5645.getClass(), "values", term5725);
        term5741 = new Short((short) 9519);
        ArrayList term20770 = new ArrayList();
        ArrayList term20781 = new ArrayList();
        HashMap term20788 = new HashMap();
        Set<Object> term20871 =  ((Map) term20788).keySet();
        HashSet term20787 = new HashSet((Collection<? extends Object>) term20871);
        HashMap term20790 = new HashMap();
        Set<Object> term20872 =  ((Map) term20790).keySet();
        HashSet term20789 = new HashSet((Collection<? extends Object>) term20872);
        ArrayList term20791 = new ArrayList();
        term20766 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term20767 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term20772 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20783 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term20784 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20785 = newInstance(Class.forName("java.lang.Object"));
        Object term20786 = newInstance(Class.forName("java.lang.Object"));
        setField(term20767, term20767.getClass(), "defaults", null);
        setField(term20767, term20767.getClass(), "file", null);
        setField(term20767, term20767.getClass(), "basePath", null);
        setField(term20767, term20767.getClass(), "fileSeparator", "/");
        setBooleanField(term20767, term20767.getClass(), "isInitialized", false);
        setField(term20767, term20767.getClass(), "includePropertyName", null);
        setField(term20767, term20767.getClass(), "keysAsListed", term20770);
        setField(term20767, term20767.getClass(), "table", term20772);
        setIntField(term20767, term20767.getClass(), "count", 0);
        setIntField(term20767, term20767.getClass(), "threshold", 8);
        setFloatField(term20767, term20767.getClass(), "loadFactor", 0.75F);
        setIntField(term20767, term20767.getClass(), "modCount", 0);
        setField(term20767, term20767.getClass(), "keySet", null);
        setField(term20767, term20767.getClass(), "entrySet", null);
        setField(term20767, term20767.getClass(), "values", null);
        setField(term20766, term20766.getClass(), "defaults", term20767);
        setField(term20766, term20766.getClass(), "file", "HzqpegHiRq");
        setField(term20766, term20766.getClass(), "basePath", "jwsfVjMoJT");
        setField(term20766, term20766.getClass(), "fileSeparator", "/");
        setBooleanField(term20766, term20766.getClass(), "isInitialized", true);
        setField(term20766, term20766.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term20766, term20766.getClass(), "keysAsListed", term20781);
        setIntField(term20784, term20784.getClass(), "hash", 118241845);
        setField(term20784, term20784.getClass(), "key", term20785);
        setField(term20784, term20784.getClass(), "value", term20786);
        setField(term20784, term20784.getClass(), "next", null);
        setElement(term20783, 7, term20784);
        setField(term20766, term20766.getClass(), "table", term20783);
        setIntField(term20766, term20766.getClass(), "count", -1801760682);
        setIntField(term20766, term20766.getClass(), "threshold", 8);
        setFloatField(term20766, term20766.getClass(), "loadFactor", 0.75F);
        setIntField(term20766, term20766.getClass(), "modCount", 1141317872);
        setField(term20766, term20766.getClass(), "keySet", term20787);
        setField(term20766, term20766.getClass(), "entrySet", term20789);
        setField(term20766, term20766.getClass(), "values", term20791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = "MwwjNtdOFT";
        args[1] = term5741;
        Object retValue = callMethod(klass, "getShort", argTypes, term5645, args);
        assertTrue(recursiveEquals(term5645, term20766));
        assertTrue(recursiveEquals(term5741, (short) 9519));
        assertTrue(recursiveEquals(retValue, (short) 9519));
    }

};


