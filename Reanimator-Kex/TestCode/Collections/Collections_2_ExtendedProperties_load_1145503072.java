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

public class ExtendedProperties_load_1145503072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828;

    public ExtendedProperties_load_1145503072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term834 = new ArrayList();
        ArrayList term871 = new ArrayList();
        HashMap term893 = new HashMap();
        Set<Object> term9452 =  ((Map) term893).keySet();
        HashSet term892 = new HashSet((Collection<? extends Object>) term9452);
        HashMap term899 = new HashMap();
        Set<Object> term9453 =  ((Map) term899).keySet();
        HashSet term898 = new HashSet((Collection<? extends Object>) term9453);
        ArrayList term904 = new ArrayList();
        term828 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term829 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term838 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term875 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term876 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term878 = newInstance(Class.forName("java.lang.Object"));
        Object term879 = newInstance(Class.forName("java.lang.Object"));
        Object term880 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term882 = newInstance(Class.forName("java.lang.Object"));
        Object term883 = newInstance(Class.forName("java.lang.Object"));
        Object term884 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term886 = newInstance(Class.forName("java.lang.Object"));
        Object term887 = newInstance(Class.forName("java.lang.Object"));
        setField(term829, term829.getClass(), "defaults", null);
        setField(term829, term829.getClass(), "file", null);
        setField(term829, term829.getClass(), "basePath", null);
        setField(term829, term829.getClass(), "fileSeparator", "/");
        setBooleanField(term829, term829.getClass(), "isInitialized", false);
        setField(term829, term829.getClass(), "keysAsListed", term834);
        setField(term829, term829.getClass(), "table", term838);
        setIntField(term829, term829.getClass(), "count", 0);
        setIntField(term829, term829.getClass(), "threshold", 8);
        setFloatField(term829, term829.getClass(), "loadFactor", 0.75F);
        setIntField(term829, term829.getClass(), "modCount", 0);
        setField(term829, term829.getClass(), "keySet", null);
        setField(term829, term829.getClass(), "entrySet", null);
        setField(term829, term829.getClass(), "values", null);
        setField(term828, term828.getClass(), "defaults", term829);
        setField(term828, term828.getClass(), "file", "hNxWaHcfhY");
        setField(term828, term828.getClass(), "basePath", "RkybSrpybU");
        setField(term828, term828.getClass(), "fileSeparator", "/");
        setBooleanField(term828, term828.getClass(), "isInitialized", true);
        setField(term828, term828.getClass(), "keysAsListed", term871);
        setIntField(term876, term876.getClass(), "hash", 1421115139);
        setField(term876, term876.getClass(), "key", term878);
        setField(term876, term876.getClass(), "value", term879);
        setField(term876, term876.getClass(), "next", null);
        setElement(term875, 4, term876);
        setIntField(term880, term880.getClass(), "hash", 1573085653);
        setField(term880, term880.getClass(), "key", term882);
        setField(term880, term880.getClass(), "value", term883);
        setField(term880, term880.getClass(), "next", null);
        setElement(term875, 7, term880);
        setIntField(term884, term884.getClass(), "hash", 380198541);
        setField(term884, term884.getClass(), "key", term886);
        setField(term884, term884.getClass(), "value", term887);
        setField(term884, term884.getClass(), "next", null);
        setElement(term875, 8, term884);
        setField(term828, term828.getClass(), "table", term875);
        setIntField(term828, term828.getClass(), "count", -1685132339);
        setIntField(term828, term828.getClass(), "threshold", 8);
        setFloatField(term828, term828.getClass(), "loadFactor", 0.75F);
        setIntField(term828, term828.getClass(), "modCount", -1456670394);
        setField(term828, term828.getClass(), "keySet", term892);
        setField(term828, term828.getClass(), "entrySet", term898);
        setField(term828, term828.getClass(), "values", term904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "load", argTypes, term828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


