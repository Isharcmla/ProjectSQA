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

public class Whitelist_relaxed_175587735819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11191;
     Object term11043;

    public Whitelist_relaxed_175587735819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11191 = newInstance(Class.forName("org.jsoup.safety.Whitelist$Protocol"));
        setField(term11191, term11191.getClass(), "value", "https");
        HashMap term11045 = new HashMap();
        Set<Object> term11199 =  ((Map) term11045).keySet();
        HashSet term11044 = new HashSet((Collection<? extends Object>) term11199);
        HashMap term11117 = new HashMap();
        HashMap term11159 = new HashMap();
        HashMap term11164 = new HashMap();
        term11043 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term11043, term11043.getClass(), "tagNames", term11044);
        setField(term11043, term11043.getClass(), "attributes", term11117);
        setField(term11043, term11043.getClass(), "enforcedAttributes", term11159);
        setField(term11043, term11043.getClass(), "protocols", term11164);
        setBooleanField(term11043, term11043.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "relaxed", argTypes, null, args);
        assertTrue(recursiveEquals(null, term11191));
        assertTrue(recursiveEquals(retValue, term11043));
    }

};


