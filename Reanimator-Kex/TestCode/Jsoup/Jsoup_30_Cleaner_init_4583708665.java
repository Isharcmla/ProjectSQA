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
     Object term1061;
     Object term1068;

    public Cleaner_init_4583708665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        Set<Object> term1074 =  ((Map) term3).keySet();
        HashSet term2 = new HashSet((Collection<? extends Object>) term1074);
        HashMap term8 = new HashMap();
        HashMap term13 = new HashMap();
        HashMap term18 = new HashMap();
        term1 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1, term1.getClass(), "tagNames", term2);
        setField(term1, term1.getClass(), "attributes", term8);
        setField(term1, term1.getClass(), "enforcedAttributes", term13);
        setField(term1, term1.getClass(), "protocols", term18);
        setBooleanField(term1, term1.getClass(), "preserveRelativeLinks", false);
        HashMap term1064 = new HashMap();
        Set<Object> term1075 =  ((Map) term1064).keySet();
        HashSet term1063 = new HashSet((Collection<? extends Object>) term1075);
        HashMap term1065 = new HashMap();
        HashMap term1066 = new HashMap();
        HashMap term1067 = new HashMap();
        term1061 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term1062 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1062, term1062.getClass(), "tagNames", term1063);
        setField(term1062, term1062.getClass(), "attributes", term1065);
        setField(term1062, term1062.getClass(), "enforcedAttributes", term1066);
        setField(term1062, term1062.getClass(), "protocols", term1067);
        setBooleanField(term1062, term1062.getClass(), "preserveRelativeLinks", false);
        setField(term1061, term1061.getClass(), "whitelist", term1062);
        HashMap term1070 = new HashMap();
        Set<Object> term1076 =  ((Map) term1070).keySet();
        HashSet term1069 = new HashSet((Collection<? extends Object>) term1076);
        HashMap term1071 = new HashMap();
        HashMap term1072 = new HashMap();
        HashMap term1073 = new HashMap();
        term1068 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1068, term1068.getClass(), "tagNames", term1069);
        setField(term1068, term1068.getClass(), "attributes", term1071);
        setField(term1068, term1068.getClass(), "enforcedAttributes", term1072);
        setField(term1068, term1068.getClass(), "protocols", term1073);
        setBooleanField(term1068, term1068.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.safety.Whitelist");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1061));
        assertTrue(recursiveEquals(term1, term1068));
    }

};


