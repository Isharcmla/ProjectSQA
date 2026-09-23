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

public class Whitelist_addAttributes_205250996122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term171;
     Object term11855;
     Object term11860;
     Object term11827;

    public Whitelist_addAttributes_205250996122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term138 = new HashMap();
        Set<Object> term11869 =  ((Map) term138).keySet();
        HashSet term137 = new HashSet((Collection<? extends Object>) term11869);
        HashMap term143 = new HashMap();
        HashMap term148 = new HashMap();
        HashMap term153 = new HashMap();
        term136 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term136, term136.getClass(), "tagNames", term137);
        setField(term136, term136.getClass(), "attributes", term143);
        setField(term136, term136.getClass(), "enforcedAttributes", term148);
        setField(term136, term136.getClass(), "protocols", term153);
        setBooleanField(term136, term136.getClass(), "preserveRelativeLinks", false);
        term171 = (Object[]) newArray("java.lang.String", 4);
        setElement(term171, 0, "SzjVpOQTyS");
        setElement(term171, 1, "MjGYSRKTNF");
        setElement(term171, 2, "hRNSzYYIrc");
        setElement(term171, 3, "RMFIsYGgne");
        term11855 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term11855, term11855.getClass(), "value", "EGtDIRbSSb");
        term11860 = (Object[]) newArray("java.lang.String", 4);
        setElement(term11860, 0, "SzjVpOQTyS");
        setElement(term11860, 1, "MjGYSRKTNF");
        setElement(term11860, 2, "hRNSzYYIrc");
        setElement(term11860, 3, "RMFIsYGgne");
        HashMap term11829 = new HashMap();
        Set<Object> term11980 =  ((Map) term11829).keySet();
        HashSet term11828 = new HashSet((Collection<? extends Object>) term11980);
        HashMap term11834 = new HashMap();
        HashMap term11844 = new HashMap();
        HashMap term11849 = new HashMap();
        term11827 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term11827, term11827.getClass(), "tagNames", term11828);
        setField(term11827, term11827.getClass(), "attributes", term11834);
        setField(term11827, term11827.getClass(), "enforcedAttributes", term11844);
        setField(term11827, term11827.getClass(), "protocols", term11849);
        setBooleanField(term11827, term11827.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term171;
        Object retValue = callMethod(klass, "addAttributes", argTypes, term136, args);
        assertTrue(recursiveEquals(term136, term11855));
        assertTrue(recursiveEquals(term171, term11860));
        assertTrue(recursiveEquals(retValue, term11827));
    }

};


