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

public class Whitelist_none_72009055115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;

    public Whitelist_none_72009055115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term975 = new HashMap();
        Set<Object> term996 =  ((Map) term975).keySet();
        HashSet term974 = new HashSet((Collection<? extends Object>) term996);
        HashMap term980 = new HashMap();
        HashMap term985 = new HashMap();
        HashMap term990 = new HashMap();
        term973 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term973, term973.getClass(), "tagNames", term974);
        setField(term973, term973.getClass(), "attributes", term980);
        setField(term973, term973.getClass(), "enforcedAttributes", term985);
        setField(term973, term973.getClass(), "protocols", term990);
        setBooleanField(term973, term973.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "none", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term973));
    }

};


