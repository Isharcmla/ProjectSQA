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

public class Whitelist_init_143037327820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11223;

    public Whitelist_init_143037327820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11225 = new HashMap();
        Set<Object> term11229 =  ((Map) term11225).keySet();
        HashSet term11224 = new HashSet((Collection<? extends Object>) term11229);
        HashMap term11226 = new HashMap();
        HashMap term11227 = new HashMap();
        HashMap term11228 = new HashMap();
        term11223 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term11223, term11223.getClass(), "tagNames", term11224);
        setField(term11223, term11223.getClass(), "attributes", term11226);
        setField(term11223, term11223.getClass(), "enforcedAttributes", term11227);
        setField(term11223, term11223.getClass(), "protocols", term11228);
        setBooleanField(term11223, term11223.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11223));
    }

};


