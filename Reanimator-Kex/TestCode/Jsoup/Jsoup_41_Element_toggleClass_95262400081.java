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

public class Element_toggleClass_95262400081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6778;

    public Element_toggleClass_95262400081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6801 = new ArrayList();
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        ((ArrayList) term6801).add((Object)null);
        LinkedHashMap term6806 = new LinkedHashMap();
        term6778 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6779 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6805 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6779, term6779.getClass(), "tagName", "JisaWUxcNb");
        setBooleanField(term6779, term6779.getClass(), "isBlock", false);
        setBooleanField(term6779, term6779.getClass(), "formatAsBlock", false);
        setBooleanField(term6779, term6779.getClass(), "canContainBlock", true);
        setBooleanField(term6779, term6779.getClass(), "canContainInline", false);
        setBooleanField(term6779, term6779.getClass(), "empty", false);
        setBooleanField(term6779, term6779.getClass(), "selfClosing", true);
        setBooleanField(term6779, term6779.getClass(), "preserveWhitespace", true);
        setBooleanField(term6779, term6779.getClass(), "formList", false);
        setBooleanField(term6779, term6779.getClass(), "formSubmit", true);
        setField(term6778, term6778.getClass(), "tag", term6779);
        setField(term6778, term6778.getClass(), "parentNode", null);
        setField(term6778, term6778.getClass(), "childNodes", term6801);
        setField(term6805, term6805.getClass(), "attributes", term6806);
        setField(term6778, term6778.getClass(), "attributes", term6805);
        setField(term6778, term6778.getClass(), "baseUri", "nxSTJflLQy");
        setIntField(term6778, term6778.getClass(), "siblingIndex", -523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FlHzxEfFzI";
        callMethod(klass, "toggleClass", argTypes, term6778, args);
    }

};


