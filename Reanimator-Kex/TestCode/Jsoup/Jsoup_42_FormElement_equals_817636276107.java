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

public class FormElement_equals_817636276107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47694;
     Object term47808;
     Object term47946;
     Object term47950;

    public FormElement_equals_817636276107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47694 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47740 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47694, term47694.getClass(), "childNodes", null);
        setField(term47694, term47694.getClass(), "attributes", null);
        setField(term47740, term47740.getClass(), "tagName", "");
        setBooleanField(term47740, term47740.getClass(), "canContainBlock", true);
        setBooleanField(term47740, term47740.getClass(), "canContainInline", false);
        setField(term47694, term47694.getClass(), "tag", term47740);
        term47808 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47854 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47808, term47808.getClass(), "childNodes", null);
        setField(term47808, term47808.getClass(), "attributes", null);
        setField(term47854, term47854.getClass(), "tagName", "");
        setBooleanField(term47854, term47854.getClass(), "canContainBlock", true);
        setBooleanField(term47854, term47854.getClass(), "canContainInline", true);
        setField(term47808, term47808.getClass(), "tag", term47854);
        term47946 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47946, term47946.getClass(), "elements", null);
        setField(term47947, term47947.getClass(), "tagName", "");
        setBooleanField(term47947, term47947.getClass(), "isBlock", false);
        setBooleanField(term47947, term47947.getClass(), "formatAsBlock", false);
        setBooleanField(term47947, term47947.getClass(), "canContainBlock", true);
        setBooleanField(term47947, term47947.getClass(), "canContainInline", false);
        setBooleanField(term47947, term47947.getClass(), "empty", false);
        setBooleanField(term47947, term47947.getClass(), "selfClosing", false);
        setBooleanField(term47947, term47947.getClass(), "preserveWhitespace", false);
        setBooleanField(term47947, term47947.getClass(), "formList", false);
        setBooleanField(term47947, term47947.getClass(), "formSubmit", false);
        setField(term47946, term47946.getClass(), "tag", term47947);
        setField(term47946, term47946.getClass(), "parentNode", null);
        setField(term47946, term47946.getClass(), "childNodes", null);
        setField(term47946, term47946.getClass(), "attributes", null);
        setField(term47946, term47946.getClass(), "baseUri", null);
        setIntField(term47946, term47946.getClass(), "siblingIndex", 0);
        term47950 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47951 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47950, term47950.getClass(), "elements", null);
        setField(term47951, term47951.getClass(), "tagName", "");
        setBooleanField(term47951, term47951.getClass(), "isBlock", false);
        setBooleanField(term47951, term47951.getClass(), "formatAsBlock", false);
        setBooleanField(term47951, term47951.getClass(), "canContainBlock", true);
        setBooleanField(term47951, term47951.getClass(), "canContainInline", true);
        setBooleanField(term47951, term47951.getClass(), "empty", false);
        setBooleanField(term47951, term47951.getClass(), "selfClosing", false);
        setBooleanField(term47951, term47951.getClass(), "preserveWhitespace", false);
        setBooleanField(term47951, term47951.getClass(), "formList", false);
        setBooleanField(term47951, term47951.getClass(), "formSubmit", false);
        setField(term47950, term47950.getClass(), "tag", term47951);
        setField(term47950, term47950.getClass(), "parentNode", null);
        setField(term47950, term47950.getClass(), "childNodes", null);
        setField(term47950, term47950.getClass(), "attributes", null);
        setField(term47950, term47950.getClass(), "baseUri", null);
        setIntField(term47950, term47950.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47808;
        callMethod(klass, "equals", argTypes, term47694, args);
        assertTrue(recursiveEquals(term47694, term47946));
        assertTrue(recursiveEquals(term47808, term47950));
    }

};


