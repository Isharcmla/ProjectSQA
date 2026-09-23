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
import java.util.LinkedList;

public class ExtendedProperties_getList_212174776594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3644;
     Object term3728;
     Object term14565;
     Object term14592;
     Object term14479;

    public ExtendedProperties_getList_212174776594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3650 = new ArrayList();
        ArrayList term3687 = new ArrayList();
        HashMap term3701 = new HashMap();
        Set<Object> term14626 =  ((Map) term3701).keySet();
        HashSet term3700 = new HashSet((Collection<? extends Object>) term14626);
        HashMap term3707 = new HashMap();
        Set<Object> term14627 =  ((Map) term3707).keySet();
        HashSet term3706 = new HashSet((Collection<? extends Object>) term14627);
        ArrayList term3712 = new ArrayList();
        term3644 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3645 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3654 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3691 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term3692 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term3694 = newInstance(Class.forName("java.lang.Object"));
        Object term3695 = newInstance(Class.forName("java.lang.Object"));
        setField(term3645, term3645.getClass(), "defaults", null);
        setField(term3645, term3645.getClass(), "file", null);
        setField(term3645, term3645.getClass(), "basePath", null);
        setField(term3645, term3645.getClass(), "fileSeparator", "/");
        setBooleanField(term3645, term3645.getClass(), "isInitialized", false);
        setField(term3645, term3645.getClass(), "keysAsListed", term3650);
        setField(term3645, term3645.getClass(), "table", term3654);
        setIntField(term3645, term3645.getClass(), "count", 0);
        setIntField(term3645, term3645.getClass(), "threshold", 8);
        setFloatField(term3645, term3645.getClass(), "loadFactor", 0.75F);
        setIntField(term3645, term3645.getClass(), "modCount", 0);
        setField(term3645, term3645.getClass(), "keySet", null);
        setField(term3645, term3645.getClass(), "entrySet", null);
        setField(term3645, term3645.getClass(), "values", null);
        setField(term3644, term3644.getClass(), "defaults", term3645);
        setField(term3644, term3644.getClass(), "file", "LvJFtLBaxj");
        setField(term3644, term3644.getClass(), "basePath", "PHvxnGHptP");
        setField(term3644, term3644.getClass(), "fileSeparator", "/");
        setBooleanField(term3644, term3644.getClass(), "isInitialized", true);
        setField(term3644, term3644.getClass(), "keysAsListed", term3687);
        setIntField(term3692, term3692.getClass(), "hash", 1584549080);
        setField(term3692, term3692.getClass(), "key", term3694);
        setField(term3692, term3692.getClass(), "value", term3695);
        setField(term3692, term3692.getClass(), "next", null);
        setElement(term3691, 6, term3692);
        setField(term3644, term3644.getClass(), "table", term3691);
        setIntField(term3644, term3644.getClass(), "count", 1090617577);
        setIntField(term3644, term3644.getClass(), "threshold", 17);
        setFloatField(term3644, term3644.getClass(), "loadFactor", 0.75F);
        setIntField(term3644, term3644.getClass(), "modCount", -1547384486);
        setField(term3644, term3644.getClass(), "keySet", term3700);
        setField(term3644, term3644.getClass(), "entrySet", term3706);
        setField(term3644, term3644.getClass(), "values", term3712);
        Object term3731 = newInstance(Class.forName("java.lang.Object"));
        Object term3733 = newInstance(Class.forName("java.lang.Object"));
        Object term3735 = newInstance(Class.forName("java.lang.Object"));
        term3728 = new LinkedList();
        ((LinkedList) term3728).add(term3731);
        ((LinkedList) term3728).add(term3733);
        ((LinkedList) term3728).add(term3735);
        ((LinkedList) term3728).add((Object)null);
        ((LinkedList) term3728).add((Object)null);
        ((LinkedList) term3728).add((Object)null);
        ((LinkedList) term3728).add((Object)null);
        ((LinkedList) term3728).add((Object)null);
        ((LinkedList) term3728).add((Object)null);
        ArrayList term14569 = new ArrayList();
        ArrayList term14578 = new ArrayList();
        HashMap term14585 = new HashMap();
        Set<Object> term14660 =  ((Map) term14585).keySet();
        HashSet term14584 = new HashSet((Collection<? extends Object>) term14660);
        HashMap term14587 = new HashMap();
        Set<Object> term14661 =  ((Map) term14587).keySet();
        HashSet term14586 = new HashSet((Collection<? extends Object>) term14661);
        ArrayList term14588 = new ArrayList();
        term14565 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14566 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14571 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14580 = (Object[]) newArray("java.util.Hashtable$Entry", 23);
        Object term14581 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term14582 = newInstance(Class.forName("java.lang.Object"));
        Object term14583 = newInstance(Class.forName("java.lang.Object"));
        setField(term14566, term14566.getClass(), "defaults", null);
        setField(term14566, term14566.getClass(), "file", null);
        setField(term14566, term14566.getClass(), "basePath", null);
        setField(term14566, term14566.getClass(), "fileSeparator", "/");
        setBooleanField(term14566, term14566.getClass(), "isInitialized", false);
        setField(term14566, term14566.getClass(), "keysAsListed", term14569);
        setField(term14566, term14566.getClass(), "table", term14571);
        setIntField(term14566, term14566.getClass(), "count", 0);
        setIntField(term14566, term14566.getClass(), "threshold", 8);
        setFloatField(term14566, term14566.getClass(), "loadFactor", 0.75F);
        setIntField(term14566, term14566.getClass(), "modCount", 0);
        setField(term14566, term14566.getClass(), "keySet", null);
        setField(term14566, term14566.getClass(), "entrySet", null);
        setField(term14566, term14566.getClass(), "values", null);
        setField(term14565, term14565.getClass(), "defaults", term14566);
        setField(term14565, term14565.getClass(), "file", "LvJFtLBaxj");
        setField(term14565, term14565.getClass(), "basePath", "PHvxnGHptP");
        setField(term14565, term14565.getClass(), "fileSeparator", "/");
        setBooleanField(term14565, term14565.getClass(), "isInitialized", true);
        setField(term14565, term14565.getClass(), "keysAsListed", term14578);
        setIntField(term14581, term14581.getClass(), "hash", 1584549080);
        setField(term14581, term14581.getClass(), "key", term14582);
        setField(term14581, term14581.getClass(), "value", term14583);
        setField(term14581, term14581.getClass(), "next", null);
        setElement(term14580, 6, term14581);
        setField(term14565, term14565.getClass(), "table", term14580);
        setIntField(term14565, term14565.getClass(), "count", 1090617577);
        setIntField(term14565, term14565.getClass(), "threshold", 17);
        setFloatField(term14565, term14565.getClass(), "loadFactor", 0.75F);
        setIntField(term14565, term14565.getClass(), "modCount", -1547384486);
        setField(term14565, term14565.getClass(), "keySet", term14584);
        setField(term14565, term14565.getClass(), "entrySet", term14586);
        setField(term14565, term14565.getClass(), "values", term14588);
        Object term14594 = newInstance(Class.forName("java.lang.Object"));
        Object term14596 = newInstance(Class.forName("java.lang.Object"));
        Object term14598 = newInstance(Class.forName("java.lang.Object"));
        term14592 = new LinkedList();
        ((LinkedList) term14592).add(term14594);
        ((LinkedList) term14592).add(term14596);
        ((LinkedList) term14592).add(term14598);
        ((LinkedList) term14592).add((Object)null);
        ((LinkedList) term14592).add((Object)null);
        ((LinkedList) term14592).add((Object)null);
        ((LinkedList) term14592).add((Object)null);
        ((LinkedList) term14592).add((Object)null);
        ((LinkedList) term14592).add((Object)null);
        Object term14482 = newInstance(Class.forName("java.lang.Object"));
        Object term14484 = newInstance(Class.forName("java.lang.Object"));
        Object term14486 = newInstance(Class.forName("java.lang.Object"));
        term14479 = new LinkedList();
        ((LinkedList) term14479).add(term14482);
        ((LinkedList) term14479).add(term14484);
        ((LinkedList) term14479).add(term14486);
        ((LinkedList) term14479).add((Object)null);
        ((LinkedList) term14479).add((Object)null);
        ((LinkedList) term14479).add((Object)null);
        ((LinkedList) term14479).add((Object)null);
        ((LinkedList) term14479).add((Object)null);
        ((LinkedList) term14479).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "TimdotUuNC";
        args[1] = term3728;
        Object retValue = callMethod(klass, "getList", argTypes, term3644, args);
        assertTrue(recursiveEquals(term3644, term14565));
        assertTrue(recursiveEquals(term3728, term14592));
        assertTrue(recursiveEquals(retValue, term14479));
    }

};


