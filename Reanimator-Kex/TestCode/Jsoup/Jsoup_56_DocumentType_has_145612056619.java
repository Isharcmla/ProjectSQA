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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DocumentType_has_145612056619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8326;

    public DocumentType_has_145612056619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8444 = new LinkedHashMap();
        term8326 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term8384 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8384, term8384.getClass(), "attributes", term8444);
        setField(term8326, term8326.getClass(), "attributes", term8384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "abs:";
        try {
            callMethod(klass, "has", argTypes, term8326, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


