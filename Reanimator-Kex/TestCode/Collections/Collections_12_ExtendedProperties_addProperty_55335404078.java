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

public class ExtendedProperties_addProperty_55335404078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5570;
     Object term5662;
     Object term38968;
     Object term39000;

    public ExtendedProperties_addProperty_55335404078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5576 = new ArrayList();
        ArrayList term5625 = new ArrayList();
        HashMap term5635 = new HashMap();
        Set<Object> term39033 =  ((Map) term5635).keySet();
        HashSet term5634 = new HashSet((Collection<? extends Object>) term39033);
        HashMap term5641 = new HashMap();
        Set<Object> term39034 =  ((Map) term5641).keySet();
        HashSet term5640 = new HashSet((Collection<? extends Object>) term39034);
        ArrayList term5646 = new ArrayList();
        term5570 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5571 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5580 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5629 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term5571, term5571.getClass(), "defaults", null);
        setField(term5571, term5571.getClass(), "file", null);
        setField(term5571, term5571.getClass(), "basePath", null);
        setField(term5571, term5571.getClass(), "fileSeparator", "/");
        setBooleanField(term5571, term5571.getClass(), "isInitialized", false);
        setField(term5571, term5571.getClass(), "includePropertyName", null);
        setField(term5571, term5571.getClass(), "keysAsListed", term5576);
        setField(term5571, term5571.getClass(), "table", term5580);
        setIntField(term5571, term5571.getClass(), "count", 0);
        setIntField(term5571, term5571.getClass(), "threshold", 8);
        setFloatField(term5571, term5571.getClass(), "loadFactor", 0.75F);
        setIntField(term5571, term5571.getClass(), "modCount", 0);
        setField(term5571, term5571.getClass(), "keySet", null);
        setField(term5571, term5571.getClass(), "entrySet", null);
        setField(term5571, term5571.getClass(), "values", null);
        setField(term5570, term5570.getClass(), "defaults", term5571);
        setField(term5570, term5570.getClass(), "file", "xrwlQZdwCp");
        setField(term5570, term5570.getClass(), "basePath", "IDCWpPLRkE");
        setField(term5570, term5570.getClass(), "fileSeparator", "/");
        setBooleanField(term5570, term5570.getClass(), "isInitialized", false);
        setField(term5570, term5570.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term5570, term5570.getClass(), "keysAsListed", term5625);
        setField(term5570, term5570.getClass(), "table", term5629);
        setIntField(term5570, term5570.getClass(), "count", 1135664017);
        setIntField(term5570, term5570.getClass(), "threshold", 8);
        setFloatField(term5570, term5570.getClass(), "loadFactor", 0.75F);
        setIntField(term5570, term5570.getClass(), "modCount", 590364439);
        setField(term5570, term5570.getClass(), "keySet", term5634);
        setField(term5570, term5570.getClass(), "entrySet", term5640);
        setField(term5570, term5570.getClass(), "values", term5646);
        term5662 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term38972 = new ArrayList();
        ArrayList term38983 = new ArrayList();
        ((ArrayList) term38983).add("aKnKipADSo");
        HashMap term38993 = new HashMap();
        Set<Object> term39097 =  ((Map) term38993).keySet();
        HashSet term38992 = new HashSet((Collection<? extends Object>) term39097);
        HashMap term38995 = new HashMap();
        Set<Object> term39098 =  ((Map) term38995).keySet();
        HashSet term38994 = new HashSet((Collection<? extends Object>) term39098);
        ArrayList term38996 = new ArrayList();
        term38968 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term38969 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term38974 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term38987 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term38988 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38991 = newInstance(Class.forName("java.lang.Object"));
        setField(term38969, term38969.getClass(), "defaults", null);
        setField(term38969, term38969.getClass(), "file", null);
        setField(term38969, term38969.getClass(), "basePath", null);
        setField(term38969, term38969.getClass(), "fileSeparator", "/");
        setBooleanField(term38969, term38969.getClass(), "isInitialized", false);
        setField(term38969, term38969.getClass(), "includePropertyName", null);
        setField(term38969, term38969.getClass(), "keysAsListed", term38972);
        setField(term38969, term38969.getClass(), "table", term38974);
        setIntField(term38969, term38969.getClass(), "count", 0);
        setIntField(term38969, term38969.getClass(), "threshold", 8);
        setFloatField(term38969, term38969.getClass(), "loadFactor", 0.75F);
        setIntField(term38969, term38969.getClass(), "modCount", 0);
        setField(term38969, term38969.getClass(), "keySet", null);
        setField(term38969, term38969.getClass(), "entrySet", null);
        setField(term38969, term38969.getClass(), "values", null);
        setField(term38968, term38968.getClass(), "defaults", term38969);
        setField(term38968, term38968.getClass(), "file", "xrwlQZdwCp");
        setField(term38968, term38968.getClass(), "basePath", "IDCWpPLRkE");
        setField(term38968, term38968.getClass(), "fileSeparator", "/");
        setBooleanField(term38968, term38968.getClass(), "isInitialized", true);
        setField(term38968, term38968.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term38968, term38968.getClass(), "keysAsListed", term38983);
        setIntField(term38988, term38988.getClass(), "hash", -611664531);
        setField(term38988, term38988.getClass(), "key", "aKnKipADSo");
        setField(term38988, term38988.getClass(), "value", term38991);
        setField(term38988, term38988.getClass(), "next", null);
        setElement(term38987, 5, term38988);
        setField(term38968, term38968.getClass(), "table", term38987);
        setIntField(term38968, term38968.getClass(), "count", 1135664018);
        setIntField(term38968, term38968.getClass(), "threshold", 17);
        setFloatField(term38968, term38968.getClass(), "loadFactor", 0.75F);
        setIntField(term38968, term38968.getClass(), "modCount", 590364441);
        setField(term38968, term38968.getClass(), "keySet", term38992);
        setField(term38968, term38968.getClass(), "entrySet", term38994);
        setField(term38968, term38968.getClass(), "values", term38996);
        term39000 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "aKnKipADSo";
        args[1] = term5662;
        callMethod(klass, "addProperty", argTypes, term5570, args);
        assertTrue(recursiveEquals(term5570, term38968));
        assertTrue(recursiveEquals(term5662, term39000));
    }

};


