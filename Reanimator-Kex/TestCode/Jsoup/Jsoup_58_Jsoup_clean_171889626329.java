package org.jsoup;

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
import java.lang.NoClassDefFoundError;
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Jsoup_clean_171889626329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public Jsoup_clean_171889626329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term911 = new HashMap();
        Set<Object> term8846 =  ((Map) term911).keySet();
        HashSet term910 = new HashSet((Collection<? extends Object>) term8846);
        HashMap term916 = new HashMap();
        HashMap term921 = new HashMap();
        HashMap term926 = new HashMap();
        term909 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term909, term909.getClass(), "tagNames", term910);
        setField(term909, term909.getClass(), "attributes", term916);
        setField(term909, term909.getClass(), "enforcedAttributes", term921);
        setField(term909, term909.getClass(), "protocols", term926);
        setBooleanField(term909, term909.getClass(), "preserveRelativeLinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.safety.Whitelist");
        Object[] args = new Object[2];
        args[0] = "hNxWaHcfhY";
        args[1] = term909;
        try {
            callMethod(klass, "clean", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


