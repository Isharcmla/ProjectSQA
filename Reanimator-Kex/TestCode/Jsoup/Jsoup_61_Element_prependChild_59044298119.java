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

public class Element_prependChild_59044298119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1641;

    public Element_prependChild_59044298119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1663 = new ArrayList();
        ((ArrayList) term1663).add((Object)null);
        ((ArrayList) term1663).add((Object)null);
        LinkedHashMap term1668 = new LinkedHashMap();
        term1641 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1642 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1667 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1642, term1642.getClass(), "tagName", "yGtHPyvYiQ");
        setBooleanField(term1642, term1642.getClass(), "isBlock", true);
        setBooleanField(term1642, term1642.getClass(), "formatAsBlock", false);
        setBooleanField(term1642, term1642.getClass(), "canContainInline", true);
        setBooleanField(term1642, term1642.getClass(), "empty", false);
        setBooleanField(term1642, term1642.getClass(), "selfClosing", true);
        setBooleanField(term1642, term1642.getClass(), "preserveWhitespace", false);
        setBooleanField(term1642, term1642.getClass(), "formList", false);
        setBooleanField(term1642, term1642.getClass(), "formSubmit", true);
        setField(term1641, term1641.getClass(), "tag", term1642);
        setField(term1641, term1641.getClass(), "parentNode", null);
        setField(term1641, term1641.getClass(), "childNodes", term1663);
        setField(term1667, term1667.getClass(), "attributes", term1668);
        setField(term1641, term1641.getClass(), "attributes", term1667);
        setField(term1641, term1641.getClass(), "baseUri", "pORebkoRdD");
        setIntField(term1641, term1641.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term1641, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


