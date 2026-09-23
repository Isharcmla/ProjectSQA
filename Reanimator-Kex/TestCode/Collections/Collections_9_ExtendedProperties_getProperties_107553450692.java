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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getProperties_107553450692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12412;
     Object term12504;

    public ExtendedProperties_getProperties_107553450692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12418 = new ArrayList();
        ArrayList term12467 = new ArrayList();
        HashMap term12477 = new HashMap();
        Set<Object> term50003 =  ((Map) term12477).keySet();
        HashSet term12476 = new HashSet((Collection<? extends Object>) term50003);
        HashMap term12483 = new HashMap();
        Set<Object> term50004 =  ((Map) term12483).keySet();
        HashSet term12482 = new HashSet((Collection<? extends Object>) term50004);
        ArrayList term12488 = new ArrayList();
        term12412 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term12413 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term12422 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term12471 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term12413, term12413.getClass(), "defaults", null);
        setField(term12413, term12413.getClass(), "file", null);
        setField(term12413, term12413.getClass(), "basePath", null);
        setField(term12413, term12413.getClass(), "fileSeparator", "/");
        setBooleanField(term12413, term12413.getClass(), "isInitialized", false);
        setField(term12413, term12413.getClass(), "includePropertyName", null);
        setField(term12413, term12413.getClass(), "keysAsListed", term12418);
        setField(term12413, term12413.getClass(), "table", term12422);
        setIntField(term12413, term12413.getClass(), "count", 0);
        setIntField(term12413, term12413.getClass(), "threshold", 8);
        setFloatField(term12413, term12413.getClass(), "loadFactor", 0.75F);
        setIntField(term12413, term12413.getClass(), "modCount", 0);
        setField(term12413, term12413.getClass(), "keySet", null);
        setField(term12413, term12413.getClass(), "entrySet", null);
        setField(term12413, term12413.getClass(), "values", null);
        setField(term12412, term12412.getClass(), "defaults", term12413);
        setField(term12412, term12412.getClass(), "file", "JqXGgAhZPl");
        setField(term12412, term12412.getClass(), "basePath", "jiKYgYHqIS");
        setField(term12412, term12412.getClass(), "fileSeparator", "/");
        setBooleanField(term12412, term12412.getClass(), "isInitialized", true);
        setField(term12412, term12412.getClass(), "includePropertyName", "DfISiziTgG");
        setField(term12412, term12412.getClass(), "keysAsListed", term12467);
        setField(term12412, term12412.getClass(), "table", term12471);
        setIntField(term12412, term12412.getClass(), "count", 287287233);
        setIntField(term12412, term12412.getClass(), "threshold", 8);
        setFloatField(term12412, term12412.getClass(), "loadFactor", 0.75F);
        setIntField(term12412, term12412.getClass(), "modCount", 962840079);
        setField(term12412, term12412.getClass(), "keySet", term12476);
        setField(term12412, term12412.getClass(), "entrySet", term12482);
        setField(term12412, term12412.getClass(), "values", term12488);
        term12504 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = "XqgfKFvPSD";
        args[1] = term12504;
        try {
            callMethod(klass, "getProperties", argTypes, term12412, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


