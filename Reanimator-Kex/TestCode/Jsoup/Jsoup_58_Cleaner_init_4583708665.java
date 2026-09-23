package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Cleaner_init_4583708665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1580;
     Object term1587;

    public Cleaner_init_4583708665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        Set<Object> term1593 =  ((Map) term3).keySet();
        HashSet term2 = new HashSet((Collection<? extends Object>) term1593);
        HashMap term8 = new HashMap();
        HashMap term13 = new HashMap();
        HashMap term18 = new HashMap();
        term1 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1, term1.getClass(), "tagNames", term2);
        setField(term1, term1.getClass(), "attributes", term8);
        setField(term1, term1.getClass(), "enforcedAttributes", term13);
        setField(term1, term1.getClass(), "protocols", term18);
        setBooleanField(term1, term1.getClass(), "preserveRelativeLinks", false);
        HashMap term1583 = new HashMap();
        Set<Object> term1594 =  ((Map) term1583).keySet();
        HashSet term1582 = new HashSet((Collection<? extends Object>) term1594);
        HashMap term1584 = new HashMap();
        HashMap term1585 = new HashMap();
        HashMap term1586 = new HashMap();
        term1580 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term1581 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1581, term1581.getClass(), "tagNames", term1582);
        setField(term1581, term1581.getClass(), "attributes", term1584);
        setField(term1581, term1581.getClass(), "enforcedAttributes", term1585);
        setField(term1581, term1581.getClass(), "protocols", term1586);
        setBooleanField(term1581, term1581.getClass(), "preserveRelativeLinks", false);
        setField(term1580, term1580.getClass(), "whitelist", term1581);
        HashMap term1589 = new HashMap();
        Set<Object> term1595 =  ((Map) term1589).keySet();
        HashSet term1588 = new HashSet((Collection<? extends Object>) term1595);
        HashMap term1590 = new HashMap();
        HashMap term1591 = new HashMap();
        HashMap term1592 = new HashMap();
        term1587 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1587, term1587.getClass(), "tagNames", term1588);
        setField(term1587, term1587.getClass(), "attributes", term1590);
        setField(term1587, term1587.getClass(), "enforcedAttributes", term1591);
        setField(term1587, term1587.getClass(), "protocols", term1592);
        setBooleanField(term1587, term1587.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.safety.Whitelist");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1580));
        assertTrue(recursiveEquals(term1, term1587));
    }

};


