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

public class FormElement_equals_817636276119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52199;
     Object term52313;
     Object term52472;
     Object term52476;

    public FormElement_equals_817636276119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52199 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52245 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52199, term52199.getClass(), "childNodes", null);
        setField(term52199, term52199.getClass(), "attributes", null);
        setField(term52245, term52245.getClass(), "tagName", "");
        setBooleanField(term52245, term52245.getClass(), "canContainBlock", false);
        setBooleanField(term52245, term52245.getClass(), "canContainInline", false);
        setBooleanField(term52245, term52245.getClass(), "empty", true);
        setBooleanField(term52245, term52245.getClass(), "formatAsBlock", true);
        setField(term52199, term52199.getClass(), "tag", term52245);
        term52313 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52313, term52313.getClass(), "childNodes", null);
        setField(term52313, term52313.getClass(), "attributes", null);
        setField(term52359, term52359.getClass(), "tagName", "");
        setBooleanField(term52359, term52359.getClass(), "canContainBlock", false);
        setBooleanField(term52359, term52359.getClass(), "canContainInline", false);
        setBooleanField(term52359, term52359.getClass(), "empty", true);
        setBooleanField(term52359, term52359.getClass(), "formatAsBlock", false);
        setField(term52313, term52313.getClass(), "tag", term52359);
        term52472 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52473 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52472, term52472.getClass(), "elements", null);
        setField(term52473, term52473.getClass(), "tagName", "");
        setBooleanField(term52473, term52473.getClass(), "isBlock", false);
        setBooleanField(term52473, term52473.getClass(), "formatAsBlock", true);
        setBooleanField(term52473, term52473.getClass(), "canContainBlock", false);
        setBooleanField(term52473, term52473.getClass(), "canContainInline", false);
        setBooleanField(term52473, term52473.getClass(), "empty", true);
        setBooleanField(term52473, term52473.getClass(), "selfClosing", false);
        setBooleanField(term52473, term52473.getClass(), "preserveWhitespace", false);
        setBooleanField(term52473, term52473.getClass(), "formList", false);
        setBooleanField(term52473, term52473.getClass(), "formSubmit", false);
        setField(term52472, term52472.getClass(), "tag", term52473);
        setField(term52472, term52472.getClass(), "parentNode", null);
        setField(term52472, term52472.getClass(), "childNodes", null);
        setField(term52472, term52472.getClass(), "attributes", null);
        setField(term52472, term52472.getClass(), "baseUri", null);
        setIntField(term52472, term52472.getClass(), "siblingIndex", 0);
        term52476 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term52477 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52476, term52476.getClass(), "elements", null);
        setField(term52477, term52477.getClass(), "tagName", "");
        setBooleanField(term52477, term52477.getClass(), "isBlock", false);
        setBooleanField(term52477, term52477.getClass(), "formatAsBlock", false);
        setBooleanField(term52477, term52477.getClass(), "canContainBlock", false);
        setBooleanField(term52477, term52477.getClass(), "canContainInline", false);
        setBooleanField(term52477, term52477.getClass(), "empty", true);
        setBooleanField(term52477, term52477.getClass(), "selfClosing", false);
        setBooleanField(term52477, term52477.getClass(), "preserveWhitespace", false);
        setBooleanField(term52477, term52477.getClass(), "formList", false);
        setBooleanField(term52477, term52477.getClass(), "formSubmit", false);
        setField(term52476, term52476.getClass(), "tag", term52477);
        setField(term52476, term52476.getClass(), "parentNode", null);
        setField(term52476, term52476.getClass(), "childNodes", null);
        setField(term52476, term52476.getClass(), "attributes", null);
        setField(term52476, term52476.getClass(), "baseUri", null);
        setIntField(term52476, term52476.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52313;
        callMethod(klass, "equals", argTypes, term52199, args);
        assertTrue(recursiveEquals(term52199, term52472));
        assertTrue(recursiveEquals(term52313, term52476));
    }

};


