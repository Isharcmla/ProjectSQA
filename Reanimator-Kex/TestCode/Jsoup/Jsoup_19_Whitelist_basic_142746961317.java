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

public class Whitelist_basic_142746961317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2908;
     Object term2807;

    public Whitelist_basic_142746961317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2908 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term2908, term2908.getClass(), "value", "a");
        HashMap term2809 = new HashMap();
        Set<Object> term2912 =  ((Map) term2809).keySet();
        HashSet term2808 = new HashSet((Collection<? extends Object>) term2912);
        HashMap term2847 = new HashMap();
        HashMap term2863 = new HashMap();
        HashMap term2877 = new HashMap();
        term2807 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term2807, term2807.getClass(), "tagNames", term2808);
        setField(term2807, term2807.getClass(), "attributes", term2847);
        setField(term2807, term2807.getClass(), "enforcedAttributes", term2863);
        setField(term2807, term2807.getClass(), "protocols", term2877);
        setBooleanField(term2807, term2807.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "basic", argTypes, null, args);
        assertTrue(recursiveEquals(null, term2908));
        assertTrue(recursiveEquals(retValue, term2807));
    }

};


