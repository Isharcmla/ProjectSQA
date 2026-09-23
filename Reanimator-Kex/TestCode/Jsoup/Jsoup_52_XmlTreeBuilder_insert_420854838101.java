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

public class XmlTreeBuilder_insert_420854838101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106383;
     Object term106603;

    public XmlTreeBuilder_insert_420854838101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106473 = newInstance(Class.forName("java.lang.Object"));
        Object term106533 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term106435 = new ArrayList();
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106473);
        ((ArrayList) term106435).add(term106533);
        term106383 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term106383, term106383.getClass(), "baseUri", null);
        setField(term106383, term106383.getClass(), "stack", term106435);
        term106603 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term106603, term106603.getClass(), "data", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term106603;
        try {
            callMethod(klass, "insert", argTypes, term106383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


