package org.jsoup.parser;

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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_42085483867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200886;
     Object term201038;

    public XmlTreeBuilder_insert_42085483867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200976 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term200938 = new ArrayList();
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        ((ArrayList) term200938).add(term200976);
        term200886 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term200886, term200886.getClass(), "stack", term200938);
        term201038 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term201038, term201038.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term201038;
        try {
            callMethod(klass, "insert", argTypes, term200886, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


