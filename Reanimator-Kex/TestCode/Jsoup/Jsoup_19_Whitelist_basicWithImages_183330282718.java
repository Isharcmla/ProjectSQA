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

public class Whitelist_basicWithImages_183330282718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5288;
     Object term5183;

    public Whitelist_basicWithImages_183330282718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5288 = newInstance(Class.forName("org.jsoup.safety.Whitelist$Protocol"));
        setField(term5288, term5288.getClass(), "value", "https");
        HashMap term5185 = new HashMap();
        Set<Object> term5296 =  ((Map) term5185).keySet();
        HashSet term5184 = new HashSet((Collection<? extends Object>) term5296);
        HashMap term5223 = new HashMap();
        HashMap term5241 = new HashMap();
        HashMap term5255 = new HashMap();
        term5183 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term5183, term5183.getClass(), "tagNames", term5184);
        setField(term5183, term5183.getClass(), "attributes", term5223);
        setField(term5183, term5183.getClass(), "enforcedAttributes", term5241);
        setField(term5183, term5183.getClass(), "protocols", term5255);
        setBooleanField(term5183, term5183.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "basicWithImages", argTypes, null, args);
        assertTrue(recursiveEquals(null, term5288));
        assertTrue(recursiveEquals(retValue, term5183));
    }

};


