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
     Object term48721;

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
        Set<Object> term48781 =  ((Map) term11814).keySet();
        HashSet term11813 = new HashSet((Collection<? extends Object>) term48781);
        HashMap term11820 = new HashMap();
        Set<Object> term48782 =  ((Map) term11820).keySet();
        HashSet term11819 = new HashSet((Collection<? extends Object>) term48782);
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
        ArrayList term48725 = new ArrayList();
        ArrayList term48736 = new ArrayList();
        HashMap term48740 = new HashMap();
        Set<Object> term48835 =  ((Map) term48740).keySet();
        HashSet term48739 = new HashSet((Collection<? extends Object>) term48835);
        HashMap term48742 = new HashMap();
        Set<Object> term48836 =  ((Map) term48742).keySet();
        HashSet term48741 = new HashSet((Collection<? extends Object>) term48836);
        ArrayList term48743 = new ArrayList();
        term48721 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term48722 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term48727 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term48738 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term48722, term48722.getClass(), "defaults", null);
        setField(term48722, term48722.getClass(), "file", null);
        setField(term48722, term48722.getClass(), "basePath", null);
        setField(term48722, term48722.getClass(), "fileSeparator", "/");
        setBooleanField(term48722, term48722.getClass(), "isInitialized", false);
        setField(term48722, term48722.getClass(), "includePropertyName", null);
        setField(term48722, term48722.getClass(), "keysAsListed", term48725);
        setField(term48722, term48722.getClass(), "table", term48727);
        setIntField(term48722, term48722.getClass(), "count", 0);
        setIntField(term48722, term48722.getClass(), "threshold", 8);
        setFloatField(term48722, term48722.getClass(), "loadFactor", 0.75F);
        setIntField(term48722, term48722.getClass(), "modCount", 0);
        setField(term48722, term48722.getClass(), "keySet", null);
        setField(term48722, term48722.getClass(), "entrySet", null);
        setField(term48722, term48722.getClass(), "values", null);
        setField(term48721, term48721.getClass(), "defaults", term48722);
        setField(term48721, term48721.getClass(), "file", "cAPeiZHKGJ");
        setField(term48721, term48721.getClass(), "basePath", "LvJFtLBaxj");
        setField(term48721, term48721.getClass(), "fileSeparator", "/");
        setBooleanField(term48721, term48721.getClass(), "isInitialized", true);
        setField(term48721, term48721.getClass(), "includePropertyName", "PHvxnGHptP");
        setField(term48721, term48721.getClass(), "keysAsListed", term48736);
        setField(term48721, term48721.getClass(), "table", term48738);
        setIntField(term48721, term48721.getClass(), "count", 1225272962);
        setIntField(term48721, term48721.getClass(), "threshold", 8);
        setFloatField(term48721, term48721.getClass(), "loadFactor", 0.75F);
        setIntField(term48721, term48721.getClass(), "modCount", 1324040357);
        setField(term48721, term48721.getClass(), "keySet", term48739);
        setField(term48721, term48721.getClass(), "entrySet", term48741);
        setField(term48721, term48721.getClass(), "values", term48743);
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
        assertTrue(recursiveEquals(term11749, term48721));
        assertTrue(recursiveEquals(retValue, "PkWMRdJcBb"));
    }

};


