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

public class FormElement_equals_817636276115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50771;
     Object term50885;
     Object term51041;
     Object term51045;

    public FormElement_equals_817636276115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50771 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term50817 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50771, term50771.getClass(), "childNodes", null);
        setField(term50771, term50771.getClass(), "attributes", null);
        setField(term50817, term50817.getClass(), "tagName", "");
        setBooleanField(term50817, term50817.getClass(), "canContainBlock", true);
        setField(term50771, term50771.getClass(), "tag", term50817);
        term50885 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term50931 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50885, term50885.getClass(), "childNodes", null);
        setField(term50885, term50885.getClass(), "attributes", null);
        setField(term50931, term50931.getClass(), "tagName", "");
        setBooleanField(term50931, term50931.getClass(), "canContainBlock", false);
        setField(term50885, term50885.getClass(), "tag", term50931);
        term51041 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51042 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51041, term51041.getClass(), "elements", null);
        setField(term51042, term51042.getClass(), "tagName", "");
        setBooleanField(term51042, term51042.getClass(), "isBlock", false);
        setBooleanField(term51042, term51042.getClass(), "formatAsBlock", false);
        setBooleanField(term51042, term51042.getClass(), "canContainBlock", true);
        setBooleanField(term51042, term51042.getClass(), "canContainInline", false);
        setBooleanField(term51042, term51042.getClass(), "empty", false);
        setBooleanField(term51042, term51042.getClass(), "selfClosing", false);
        setBooleanField(term51042, term51042.getClass(), "preserveWhitespace", false);
        setBooleanField(term51042, term51042.getClass(), "formList", false);
        setBooleanField(term51042, term51042.getClass(), "formSubmit", false);
        setField(term51041, term51041.getClass(), "tag", term51042);
        setField(term51041, term51041.getClass(), "parentNode", null);
        setField(term51041, term51041.getClass(), "childNodes", null);
        setField(term51041, term51041.getClass(), "attributes", null);
        setField(term51041, term51041.getClass(), "baseUri", null);
        setIntField(term51041, term51041.getClass(), "siblingIndex", 0);
        term51045 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51046 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51045, term51045.getClass(), "elements", null);
        setField(term51046, term51046.getClass(), "tagName", "");
        setBooleanField(term51046, term51046.getClass(), "isBlock", false);
        setBooleanField(term51046, term51046.getClass(), "formatAsBlock", false);
        setBooleanField(term51046, term51046.getClass(), "canContainBlock", false);
        setBooleanField(term51046, term51046.getClass(), "canContainInline", false);
        setBooleanField(term51046, term51046.getClass(), "empty", false);
        setBooleanField(term51046, term51046.getClass(), "selfClosing", false);
        setBooleanField(term51046, term51046.getClass(), "preserveWhitespace", false);
        setBooleanField(term51046, term51046.getClass(), "formList", false);
        setBooleanField(term51046, term51046.getClass(), "formSubmit", false);
        setField(term51045, term51045.getClass(), "tag", term51046);
        setField(term51045, term51045.getClass(), "parentNode", null);
        setField(term51045, term51045.getClass(), "childNodes", null);
        setField(term51045, term51045.getClass(), "attributes", null);
        setField(term51045, term51045.getClass(), "baseUri", null);
        setIntField(term51045, term51045.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50885;
        callMethod(klass, "equals", argTypes, term50771, args);
        assertTrue(recursiveEquals(term50771, term51041));
        assertTrue(recursiveEquals(term50885, term51045));
    }

};


