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

public class DocumentType_has_145612056618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8064;

    public DocumentType_has_145612056618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8064 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term8122 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8064, term8064.getClass(), "attributes", term8122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "has", argTypes, term8064, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


