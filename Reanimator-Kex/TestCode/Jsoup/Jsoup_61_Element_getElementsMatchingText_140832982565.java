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

public class Element_getElementsMatchingText_140832982565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5316;

    public Element_getElementsMatchingText_140832982565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5338 = new ArrayList();
        ((ArrayList) term5338).add((Object)null);
        ((ArrayList) term5338).add((Object)null);
        LinkedHashMap term5343 = new LinkedHashMap();
        term5316 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5317 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5342 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5317, term5317.getClass(), "tagName", "dAldIGYAXV");
        setBooleanField(term5317, term5317.getClass(), "isBlock", false);
        setBooleanField(term5317, term5317.getClass(), "formatAsBlock", false);
        setBooleanField(term5317, term5317.getClass(), "canContainInline", true);
        setBooleanField(term5317, term5317.getClass(), "empty", true);
        setBooleanField(term5317, term5317.getClass(), "selfClosing", true);
        setBooleanField(term5317, term5317.getClass(), "preserveWhitespace", false);
        setBooleanField(term5317, term5317.getClass(), "formList", true);
        setBooleanField(term5317, term5317.getClass(), "formSubmit", true);
        setField(term5316, term5316.getClass(), "tag", term5317);
        setField(term5316, term5316.getClass(), "parentNode", null);
        setField(term5316, term5316.getClass(), "childNodes", term5338);
        setField(term5342, term5342.getClass(), "attributes", term5343);
        setField(term5316, term5316.getClass(), "attributes", term5342);
        setField(term5316, term5316.getClass(), "baseUri", "lgQkrXANyI");
        setIntField(term5316, term5316.getClass(), "siblingIndex", 53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MeTmRZXErV";
        callMethod(klass, "getElementsMatchingText", argTypes, term5316, args);
    }

};


