package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;

public class Attributes_clone_115616870042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;
     Object term3246;
     Object term3239;

    public Attributes_clone_115616870042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1024 = new LinkedHashMap();
        term1023 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1023, term1023.getClass(), "attributes", term1024);
        LinkedHashMap term3247 = new LinkedHashMap();
        term3246 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3246, term3246.getClass(), "attributes", term3247);
        LinkedHashMap term3240 = new LinkedHashMap();
        term3239 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3239, term3239.getClass(), "attributes", term3240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term1023, args);
        assertTrue(recursiveEquals(term1023, term3246));
        assertTrue(recursiveEquals(retValue, term3239));
    }

};


