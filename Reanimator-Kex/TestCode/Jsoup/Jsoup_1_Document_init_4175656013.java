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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_init_4175656013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1502;

    public Document_init_4175656013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1508 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1508, term1508.getClass(), "tagName", null);
        setBooleanField(term1508, term1508.getClass(), "isBlock", true);
        setBooleanField(term1508, term1508.getClass(), "canContainBlock", true);
        setBooleanField(term1508, term1508.getClass(), "canContainInline", true);
        setBooleanField(term1508, term1508.getClass(), "optionalClosing", false);
        setBooleanField(term1508, term1508.getClass(), "empty", false);
        setBooleanField(term1508, term1508.getClass(), "preserveWhitespace", false);
        setField(term1508, term1508.getClass(), "ancestors", null);
        ArrayList term1506 = new ArrayList();
        ((ArrayList) term1506).add(term1508);
        ArrayList term1509 = new ArrayList();
        LinkedHashMap term1512 = new LinkedHashMap();
        term1502 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1503 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1511 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1503, term1503.getClass(), "tagName", "#root");
        setBooleanField(term1503, term1503.getClass(), "isBlock", false);
        setBooleanField(term1503, term1503.getClass(), "canContainBlock", true);
        setBooleanField(term1503, term1503.getClass(), "canContainInline", true);
        setBooleanField(term1503, term1503.getClass(), "optionalClosing", false);
        setBooleanField(term1503, term1503.getClass(), "empty", false);
        setBooleanField(term1503, term1503.getClass(), "preserveWhitespace", false);
        setField(term1503, term1503.getClass(), "ancestors", term1506);
        setField(term1502, term1502.getClass(), "tag", term1503);
        setField(term1502, term1502.getClass(), "classNames", null);
        setField(term1502, term1502.getClass(), "parentNode", null);
        setField(term1502, term1502.getClass(), "childNodes", term1509);
        setField(term1511, term1511.getClass(), "attributes", term1512);
        setField(term1502, term1502.getClass(), "attributes", term1511);
        setField(term1502, term1502.getClass(), "baseUri", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1502));
    }

};
