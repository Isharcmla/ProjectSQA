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

public class Jsoup_isValid_169825486931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;

    public Jsoup_isValid_169825486931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1301 = new HashMap();
        Set<Object> term10018 =  ((Map) term1301).keySet();
        HashSet term1300 = new HashSet((Collection<? extends Object>) term10018);
        HashMap term1306 = new HashMap();
        HashMap term1311 = new HashMap();
        HashMap term1316 = new HashMap();
        term1299 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1299, term1299.getClass(), "tagNames", term1300);
        setField(term1299, term1299.getClass(), "attributes", term1306);
        setField(term1299, term1299.getClass(), "enforcedAttributes", term1311);
        setField(term1299, term1299.getClass(), "protocols", term1316);
        setBooleanField(term1299, term1299.getClass(), "preserveRelativeLinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.safety.Whitelist");
        Object[] args = new Object[2];
        args[0] = "eZFUvlxvGV";
        args[1] = term1299;
        try {
            callMethod(klass, "isValid", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


