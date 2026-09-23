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

public class Whitelist_getEnforcedAttributes_133513981829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;
     Object term13390;
     Object term13325;

    public Whitelist_getEnforcedAttributes_133513981829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term929 = new HashMap();
        Set<Object> term13395 =  ((Map) term929).keySet();
        HashSet term928 = new HashSet((Collection<? extends Object>) term13395);
        HashMap term934 = new HashMap();
        HashMap term939 = new HashMap();
        HashMap term944 = new HashMap();
        term927 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term927, term927.getClass(), "tagNames", term928);
        setField(term927, term927.getClass(), "attributes", term934);
        setField(term927, term927.getClass(), "enforcedAttributes", term939);
        setField(term927, term927.getClass(), "protocols", term944);
        setBooleanField(term927, term927.getClass(), "preserveRelativeLinks", true);
        term13390 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term13390, term13390.getClass(), "value", "jDtqGUpnZN");
        term13325 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13325, term13325.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        Object retValue = callMethod(klass, "getEnforcedAttributes", argTypes, term927, args);
        assertTrue(recursiveEquals(term927, term13390));
        assertTrue(recursiveEquals(retValue, term13325));
    }

};


