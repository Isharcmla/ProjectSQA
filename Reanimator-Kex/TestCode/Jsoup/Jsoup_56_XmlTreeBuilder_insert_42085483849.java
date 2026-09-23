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

public class XmlTreeBuilder_insert_42085483849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82133;
     Object term82347;

    public XmlTreeBuilder_insert_42085483849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82277 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term82277, term82277.getClass(), "childNodes", null);
        ArrayList term82223 = new ArrayList();
        ((ArrayList) term82223).add((Object)null);
        ((ArrayList) term82223).add((Object)null);
        ((ArrayList) term82223).add((Object)null);
        ((ArrayList) term82223).add(term82277);
        term82133 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term82133, term82133.getClass(), "baseUri", "");
        setField(term82133, term82133.getClass(), "stack", term82223);
        term82347 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term82347, term82347.getClass(), "data", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term82347;
        try {
            callMethod(klass, "insert", argTypes, term82133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


