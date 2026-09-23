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

public class ExtendedProperties_getString_127156037690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11749;
     Object term49217;

    public ExtendedProperties_getString_127156037690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11755 = new ArrayList();
        ArrayList term11804 = new ArrayList();
        HashMap term11814 = new HashMap();
        Set<Object> term49277 =  ((Map) term11814).keySet();
        HashSet term11813 = new HashSet((Collection<? extends Object>) term49277);
        HashMap term11820 = new HashMap();
        Set<Object> term49278 =  ((Map) term11820).keySet();
        HashSet term11819 = new HashSet((Collection<? extends Object>) term49278);
        ArrayList term11825 = new ArrayList();
        term11749 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term11750 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term11759 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term11808 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term11750, term11750.getClass(), "defaults", null);
        setField(term11750, term11750.getClass(), "file", null);
        setField(term11750, term11750.getClass(), "basePath", null);
        setField(term11750, term11750.getClass(), "fileSeparator", "/");
        setBooleanField(term11750, term11750.getClass(), "isInitialized", false);
        setField(term11750, term11750.getClass(), "includePropertyName", null);
        setField(term11750, term11750.getClass(), "keysAsListed", term11755);
        setField(term11750, term11750.getClass(), "table", term11759);
        setIntField(term11750, term11750.getClass(), "count", 0);
        setIntField(term11750, term11750.getClass(), "threshold", 8);
        setFloatField(term11750, term11750.getClass(), "loadFactor", 0.75F);
        setIntField(term11750, term11750.getClass(), "modCount", 0);
        setField(term11750, term11750.getClass(), "keySet", null);
        setField(term11750, term11750.getClass(), "entrySet", null);
        setField(term11750, term11750.getClass(), "values", null);
        setField(term11749, term11749.getClass(), "defaults", term11750);
        setField(term11749, term11749.getClass(), "file", "cAPeiZHKGJ");
        setField(term11749, term11749.getClass(), "basePath", "LvJFtLBaxj");
        setField(term11749, term11749.getClass(), "fileSeparator", "/");
        setBooleanField(term11749, term11749.getClass(), "isInitialized", true);
        setField(term11749, term11749.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term11749, term11749.getClass(), "keysAsListed", term11804);
        setField(term11749, term11749.getClass(), "table", term11808);
        setIntField(term11749, term11749.getClass(), "count", 1225272962);
        setIntField(term11749, term11749.getClass(), "threshold", 8);
        setFloatField(term11749, term11749.getClass(), "loadFactor", 0.75F);
        setIntField(term11749, term11749.getClass(), "modCount", 1324040357);
        setField(term11749, term11749.getClass(), "keySet", term11813);
        setField(term11749, term11749.getClass(), "entrySet", term11819);
        setField(term11749, term11749.getClass(), "values", term11825);
        ArrayList term49221 = new ArrayList();
        ArrayList term49232 = new ArrayList();
        HashMap term49236 = new HashMap();
        Set<Object> term49331 =  ((Map) term49236).keySet();
        HashSet term49235 = new HashSet((Collection<? extends Object>) term49331);
        HashMap term49238 = new HashMap();
        Set<Object> term49332 =  ((Map) term49238).keySet();
        HashSet term49237 = new HashSet((Collection<? extends Object>) term49332);
        ArrayList term49239 = new ArrayList();
        term49217 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term49218 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term49223 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term49234 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term49218, term49218.getClass(), "defaults", null);
        setField(term49218, term49218.getClass(), "file", null);
        setField(term49218, term49218.getClass(), "basePath", null);
        setField(term49218, term49218.getClass(), "fileSeparator", "/");
        setBooleanField(term49218, term49218.getClass(), "isInitialized", false);
        setField(term49218, term49218.getClass(), "includePropertyName", null);
        setField(term49218, term49218.getClass(), "keysAsListed", term49221);
        setField(term49218, term49218.getClass(), "table", term49223);
        setIntField(term49218, term49218.getClass(), "count", 0);
        setIntField(term49218, term49218.getClass(), "threshold", 8);
        setFloatField(term49218, term49218.getClass(), "loadFactor", 0.75F);
        setIntField(term49218, term49218.getClass(), "modCount", 0);
        setField(term49218, term49218.getClass(), "keySet", null);
        setField(term49218, term49218.getClass(), "entrySet", null);
        setField(term49218, term49218.getClass(), "values", null);
        setField(term49217, term49217.getClass(), "defaults", term49218);
        setField(term49217, term49217.getClass(), "file", "cAPeiZHKGJ");
        setField(term49217, term49217.getClass(), "basePath", "LvJFtLBaxj");
        setField(term49217, term49217.getClass(), "fileSeparator", "/");
        setBooleanField(term49217, term49217.getClass(), "isInitialized", true);
        setField(term49217, term49217.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term49217, term49217.getClass(), "keysAsListed", term49232);
        setField(term49217, term49217.getClass(), "table", term49234);
        setIntField(term49217, term49217.getClass(), "count", 1225272962);
        setIntField(term49217, term49217.getClass(), "threshold", 8);
        setFloatField(term49217, term49217.getClass(), "loadFactor", 0.75F);
        setIntField(term49217, term49217.getClass(), "modCount", 1324040357);
        setField(term49217, term49217.getClass(), "keySet", term49235);
        setField(term49217, term49217.getClass(), "entrySet", term49237);
        setField(term49217, term49217.getClass(), "values", term49239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "TimdotUuNC";
        args[1] = "PkWMRdJcBb";
        Object retValue = callMethod(klass, "getString", argTypes, term11749, args);
        assertTrue(recursiveEquals(term11749, term49217));
        assertTrue(recursiveEquals(retValue, "PkWMRdJcBb"));
    }

};


