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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_prependChild_5904429882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1494;

    public Element_prependChild_5904429882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1516 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1516, term1516.getClass(), "tagName", null);
        setBooleanField(term1516, term1516.getClass(), "isBlock", true);
        setBooleanField(term1516, term1516.getClass(), "canContainBlock", false);
        setBooleanField(term1516, term1516.getClass(), "canContainInline", true);
        setBooleanField(term1516, term1516.getClass(), "optionalClosing", true);
        setBooleanField(term1516, term1516.getClass(), "empty", false);
        setBooleanField(term1516, term1516.getClass(), "preserveWhitespace", true);
        setField(term1516, term1516.getClass(), "ancestors", null);
        Object term1523 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1523, term1523.getClass(), "tagName", null);
        setBooleanField(term1523, term1523.getClass(), "isBlock", false);
        setBooleanField(term1523, term1523.getClass(), "canContainBlock", false);
        setBooleanField(term1523, term1523.getClass(), "canContainInline", true);
        setBooleanField(term1523, term1523.getClass(), "optionalClosing", true);
        setBooleanField(term1523, term1523.getClass(), "empty", false);
        setBooleanField(term1523, term1523.getClass(), "preserveWhitespace", true);
        setField(term1523, term1523.getClass(), "ancestors", null);
        ArrayList term1514 = new ArrayList();
        ((ArrayList) term1514).add(term1516);
        ((ArrayList) term1514).add(term1523);
        ((ArrayList) term1514).add(term1523);
        HashMap term1533 = new HashMap();
        Set<Object> term11726 =  ((Map) term1533).keySet();
        HashSet term1532 = new HashSet((Collection<? extends Object>) term11726);
        ArrayList term1545 = new ArrayList();
        ((ArrayList) term1545).add((Object)null);
        ((ArrayList) term1545).add((Object)null);
        ((ArrayList) term1545).add((Object)null);
        ((ArrayList) term1545).add((Object)null);
        LinkedHashMap term1550 = new LinkedHashMap();
        term1494 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1495 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1549 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1495, term1495.getClass(), "tagName", "izPpKDErnQ");
        setBooleanField(term1495, term1495.getClass(), "isBlock", false);
        setBooleanField(term1495, term1495.getClass(), "canContainBlock", false);
        setBooleanField(term1495, term1495.getClass(), "canContainInline", true);
        setBooleanField(term1495, term1495.getClass(), "optionalClosing", false);
        setBooleanField(term1495, term1495.getClass(), "empty", false);
        setBooleanField(term1495, term1495.getClass(), "preserveWhitespace", true);
        setField(term1495, term1495.getClass(), "ancestors", term1514);
        setField(term1494, term1494.getClass(), "tag", term1495);
        setField(term1494, term1494.getClass(), "classNames", term1532);
        setField(term1494, term1494.getClass(), "parentNode", null);
        setField(term1494, term1494.getClass(), "childNodes", term1545);
        setField(term1549, term1549.getClass(), "attributes", term1550);
        setField(term1494, term1494.getClass(), "attributes", term1549);
        setField(term1494, term1494.getClass(), "baseUri", "AHbZyFOmlo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prependChild", argTypes, term1494, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


