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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DocumentType_has_145612056635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18359;

    public DocumentType_has_145612056635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18567 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term18477 = new LinkedHashMap();
        ((LinkedHashMap) term18477).put((Object)null, (Object)null);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18567, term18567);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        ((LinkedHashMap) term18477).put(term18359, term18359);
        term18359 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term18417 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18417, term18417.getClass(), "attributes", term18477);
        setField(term18359, term18359.getClass(), "attributes", term18417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "has", argTypes, term18359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


