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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependElement_2140080630115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1548;

    public Element_prependElement_2140080630115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1571 = new ArrayList();
        ((ArrayList) term1571).add((Object)null);
        ((ArrayList) term1571).add((Object)null);
        LinkedHashMap term1576 = new LinkedHashMap();
        term1548 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1549 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1575 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1549, term1549.getClass(), "tagName", "OEXDRUKcFl");
        setBooleanField(term1549, term1549.getClass(), "isBlock", false);
        setBooleanField(term1549, term1549.getClass(), "formatAsBlock", true);
        setBooleanField(term1549, term1549.getClass(), "canContainBlock", true);
        setBooleanField(term1549, term1549.getClass(), "canContainInline", false);
        setBooleanField(term1549, term1549.getClass(), "empty", true);
        setBooleanField(term1549, term1549.getClass(), "selfClosing", true);
        setBooleanField(term1549, term1549.getClass(), "preserveWhitespace", true);
        setBooleanField(term1549, term1549.getClass(), "formList", true);
        setBooleanField(term1549, term1549.getClass(), "formSubmit", true);
        setField(term1548, term1548.getClass(), "tag", term1549);
        setField(term1548, term1548.getClass(), "parentNode", null);
        setField(term1548, term1548.getClass(), "childNodes", term1571);
        setField(term1575, term1575.getClass(), "attributes", term1576);
        setField(term1548, term1548.getClass(), "attributes", term1575);
        setField(term1548, term1548.getClass(), "baseUri", "iNwOJRBEjp");
        setIntField(term1548, term1548.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XylxrMBraH";
        try {
            callMethod(klass, "prependElement", argTypes, term1548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


