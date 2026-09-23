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

public class DocumentType_has_145612056653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34037;
     Object term34669;

    public DocumentType_has_145612056653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34037 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term34095 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term34095, term34095.getClass(), "attributes", null);
        setField(term34037, term34037.getClass(), "attributes", term34095);
        term34669 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term34670 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term34669, term34669.getClass(), "parentNode", null);
        setField(term34669, term34669.getClass(), "childNodes", null);
        setField(term34670, term34670.getClass(), "attributes", null);
        setField(term34669, term34669.getClass(), "attributes", term34670);
        setField(term34669, term34669.getClass(), "baseUri", null);
        setIntField(term34669, term34669.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "has", argTypes, term34037, args);
        assertTrue(recursiveEquals(term34037, term34669));
        assertTrue(recursiveEquals(retValue, false));
    }

};


