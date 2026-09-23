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
import java.lang.Object;
import java.util.LinkedHashMap;

public class DocumentType_has_145612056637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20121;
     Object term20932;

    public DocumentType_has_145612056637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term20239 = new LinkedHashMap();
        term20121 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term20179 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20179, term20179.getClass(), "attributes", term20239);
        setField(term20121, term20121.getClass(), "attributes", term20179);
        LinkedHashMap term20934 = new LinkedHashMap();
        term20932 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term20933 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20932, term20932.getClass(), "parentNode", null);
        setField(term20932, term20932.getClass(), "childNodes", null);
        setField(term20933, term20933.getClass(), "attributes", term20934);
        setField(term20932, term20932.getClass(), "attributes", term20933);
        setField(term20932, term20932.getClass(), "baseUri", null);
        setIntField(term20932, term20932.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Object retValue = callMethod(klass, "has", argTypes, term20121, args);
        assertTrue(recursiveEquals(term20121, term20932));
        assertTrue(recursiveEquals(retValue, false));
    }

};


