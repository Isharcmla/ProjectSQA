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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_42085483887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217203;
     Object term217417;

    public XmlTreeBuilder_insert_42085483887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term217293 = newInstance(Class.forName("java.lang.Object"));
        Object term217347 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term217255 = new ArrayList();
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217293);
        ((ArrayList) term217255).add(term217347);
        term217203 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term217203, term217203.getClass(), "stack", term217255);
        term217417 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term217417, term217417.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term217417;
        try {
            callMethod(klass, "insert", argTypes, term217203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


