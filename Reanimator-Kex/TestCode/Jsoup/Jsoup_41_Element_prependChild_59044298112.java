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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependChild_59044298112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378;

    public Element_prependChild_59044298112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1401 = new ArrayList();
        ((ArrayList) term1401).add((Object)null);
        ((ArrayList) term1401).add((Object)null);
        LinkedHashMap term1406 = new LinkedHashMap();
        term1378 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1379 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1405 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1379, term1379.getClass(), "tagName", "XqgfKFvPSD");
        setBooleanField(term1379, term1379.getClass(), "isBlock", true);
        setBooleanField(term1379, term1379.getClass(), "formatAsBlock", false);
        setBooleanField(term1379, term1379.getClass(), "canContainBlock", true);
        setBooleanField(term1379, term1379.getClass(), "canContainInline", false);
        setBooleanField(term1379, term1379.getClass(), "empty", true);
        setBooleanField(term1379, term1379.getClass(), "selfClosing", true);
        setBooleanField(term1379, term1379.getClass(), "preserveWhitespace", true);
        setBooleanField(term1379, term1379.getClass(), "formList", false);
        setBooleanField(term1379, term1379.getClass(), "formSubmit", true);
        setField(term1378, term1378.getClass(), "tag", term1379);
        setField(term1378, term1378.getClass(), "parentNode", null);
        setField(term1378, term1378.getClass(), "childNodes", term1401);
        setField(term1405, term1405.getClass(), "attributes", term1406);
        setField(term1378, term1378.getClass(), "attributes", term1405);
        setField(term1378, term1378.getClass(), "baseUri", "SPpkrGcPRr");
        setIntField(term1378, term1378.getClass(), "siblingIndex", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term1378, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


