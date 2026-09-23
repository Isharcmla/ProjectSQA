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
     Object term38473;
     Object term38505;

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
        Set<Object> term38538 =  ((Map) term5635).keySet();
        HashSet term5634 = new HashSet((Collection<? extends Object>) term38538);
        HashMap term5641 = new HashMap();
        Set<Object> term38539 =  ((Map) term5641).keySet();
        HashSet term5640 = new HashSet((Collection<? extends Object>) term38539);
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
        ArrayList term38477 = new ArrayList();
        ArrayList term38488 = new ArrayList();
        ((ArrayList) term38488).add("aKnKipADSo");
        HashMap term38498 = new HashMap();
        Set<Object> term38602 =  ((Map) term38498).keySet();
        HashSet term38497 = new HashSet((Collection<? extends Object>) term38602);
        HashMap term38500 = new HashMap();
        Set<Object> term38603 =  ((Map) term38500).keySet();
        HashSet term38499 = new HashSet((Collection<? extends Object>) term38603);
        ArrayList term38501 = new ArrayList();
        term38473 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term38474 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term38479 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term38492 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term38493 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term38496 = newInstance(Class.forName("java.lang.Object"));
        setField(term38474, term38474.getClass(), "defaults", null);
        setField(term38474, term38474.getClass(), "file", null);
        setField(term38474, term38474.getClass(), "basePath", null);
        setField(term38474, term38474.getClass(), "fileSeparator", "/");
        setBooleanField(term38474, term38474.getClass(), "isInitialized", false);
        setField(term38474, term38474.getClass(), "includePropertyName", null);
        setField(term38474, term38474.getClass(), "keysAsListed", term38477);
        setField(term38474, term38474.getClass(), "table", term38479);
        setIntField(term38474, term38474.getClass(), "count", 0);
        setIntField(term38474, term38474.getClass(), "threshold", 8);
        setFloatField(term38474, term38474.getClass(), "loadFactor", 0.75F);
        setIntField(term38474, term38474.getClass(), "modCount", 0);
        setField(term38474, term38474.getClass(), "keySet", null);
        setField(term38474, term38474.getClass(), "entrySet", null);
        setField(term38474, term38474.getClass(), "values", null);
        setField(term38473, term38473.getClass(), "defaults", term38474);
        setField(term38473, term38473.getClass(), "file", "xrwlQZdwCp");
        setField(term38473, term38473.getClass(), "basePath", "IDCWpPLRkE");
        setField(term38473, term38473.getClass(), "fileSeparator", "/");
        setBooleanField(term38473, term38473.getClass(), "isInitialized", true);
        setField(term38473, term38473.getClass(), "includePropertyName", "nyiiPDVjAc");
        setField(term38473, term38473.getClass(), "keysAsListed", term38488);
        setIntField(term38493, term38493.getClass(), "hash", -611664531);
        setField(term38493, term38493.getClass(), "key", "aKnKipADSo");
        setField(term38493, term38493.getClass(), "value", term38496);
        setField(term38493, term38493.getClass(), "next", null);
        setElement(term38492, 5, term38493);
        setField(term38473, term38473.getClass(), "table", term38492);
        setIntField(term38473, term38473.getClass(), "count", 1135664018);
        setIntField(term38473, term38473.getClass(), "threshold", 17);
        setFloatField(term38473, term38473.getClass(), "loadFactor", 0.75F);
        setIntField(term38473, term38473.getClass(), "modCount", 590364441);
        setField(term38473, term38473.getClass(), "keySet", term38497);
        setField(term38473, term38473.getClass(), "entrySet", term38499);
        setField(term38473, term38473.getClass(), "values", term38501);
        term38505 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(term5570, term38473));
        assertTrue(recursiveEquals(term5662, term38505));
    }

};


