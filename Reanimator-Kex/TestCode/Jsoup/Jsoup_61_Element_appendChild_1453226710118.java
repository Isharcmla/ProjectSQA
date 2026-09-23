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

public class Element_appendChild_1453226710118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570;

    public Element_appendChild_1453226710118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1592 = new ArrayList();
        ((ArrayList) term1592).add((Object)null);
        ((ArrayList) term1592).add((Object)null);
        ((ArrayList) term1592).add((Object)null);
        ((ArrayList) term1592).add((Object)null);
        ((ArrayList) term1592).add((Object)null);
        ((ArrayList) term1592).add((Object)null);
        LinkedHashMap term1597 = new LinkedHashMap();
        term1570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1596 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1571, term1571.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term1571, term1571.getClass(), "isBlock", false);
        setBooleanField(term1571, term1571.getClass(), "formatAsBlock", false);
        setBooleanField(term1571, term1571.getClass(), "canContainInline", true);
        setBooleanField(term1571, term1571.getClass(), "empty", false);
        setBooleanField(term1571, term1571.getClass(), "selfClosing", true);
        setBooleanField(term1571, term1571.getClass(), "preserveWhitespace", false);
        setBooleanField(term1571, term1571.getClass(), "formList", true);
        setBooleanField(term1571, term1571.getClass(), "formSubmit", true);
        setField(term1570, term1570.getClass(), "tag", term1571);
        setField(term1570, term1570.getClass(), "parentNode", null);
        setField(term1570, term1570.getClass(), "childNodes", term1592);
        setField(term1596, term1596.getClass(), "attributes", term1597);
        setField(term1570, term1570.getClass(), "attributes", term1596);
        setField(term1570, term1570.getClass(), "baseUri", "RYdKCNNMBR");
        setIntField(term1570, term1570.getClass(), "siblingIndex", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term1570, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


