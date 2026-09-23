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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendText_83357295723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1642;

    public Element_appendText_83357295723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1665 = new ArrayList();
        ((ArrayList) term1665).add((Object)null);
        LinkedHashMap term1670 = new LinkedHashMap();
        term1642 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1643 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1669 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1643, term1643.getClass(), "tagName", "pORebkoRdD");
        setBooleanField(term1643, term1643.getClass(), "isBlock", true);
        setBooleanField(term1643, term1643.getClass(), "formatAsBlock", false);
        setBooleanField(term1643, term1643.getClass(), "canContainBlock", true);
        setBooleanField(term1643, term1643.getClass(), "canContainInline", true);
        setBooleanField(term1643, term1643.getClass(), "empty", false);
        setBooleanField(term1643, term1643.getClass(), "selfClosing", false);
        setBooleanField(term1643, term1643.getClass(), "preserveWhitespace", true);
        setBooleanField(term1643, term1643.getClass(), "formList", false);
        setBooleanField(term1643, term1643.getClass(), "formSubmit", false);
        setField(term1642, term1642.getClass(), "tag", term1643);
        setField(term1642, term1642.getClass(), "parentNode", null);
        setField(term1642, term1642.getClass(), "childNodes", term1665);
        setField(term1669, term1669.getClass(), "attributes", term1670);
        setField(term1642, term1642.getClass(), "attributes", term1669);
        setField(term1642, term1642.getClass(), "baseUri", "WzMEhMXkKx");
        setIntField(term1642, term1642.getClass(), "siblingIndex", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "appendText", argTypes, term1642, args);
    }

};


