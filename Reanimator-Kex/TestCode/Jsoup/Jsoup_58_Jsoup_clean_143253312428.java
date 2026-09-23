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

public class Jsoup_clean_143253312428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853;

    public Jsoup_clean_143253312428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term855 = new HashMap();
        Set<Object> term8411 =  ((Map) term855).keySet();
        HashSet term854 = new HashSet((Collection<? extends Object>) term8411);
        HashMap term860 = new HashMap();
        HashMap term865 = new HashMap();
        HashMap term870 = new HashMap();
        term853 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term853, term853.getClass(), "tagNames", term854);
        setField(term853, term853.getClass(), "attributes", term860);
        setField(term853, term853.getClass(), "enforcedAttributes", term865);
        setField(term853, term853.getClass(), "protocols", term870);
        setBooleanField(term853, term853.getClass(), "preserveRelativeLinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.safety.Whitelist");
        Object[] args = new Object[3];
        args[0] = "HyxfbSQYBe";
        args[1] = "pCTimMblYc";
        args[2] = term853;
        try {
            callMethod(klass, "clean", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


