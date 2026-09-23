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

public class FormElement_equals_81763627667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35383;
     Object term35459;
     Object term35501;
     Object term35503;

    public FormElement_equals_81763627667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35383 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term35429 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35383, term35383.getClass(), "childNodes", null);
        setField(term35383, term35383.getClass(), "attributes", null);
        setField(term35383, term35383.getClass(), "tag", term35429);
        term35459 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term35459, term35459.getClass(), "childNodes", null);
        setField(term35459, term35459.getClass(), "attributes", null);
        setField(term35459, term35459.getClass(), "tag", null);
        term35501 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term35502 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35501, term35501.getClass(), "elements", null);
        setField(term35502, term35502.getClass(), "tagName", null);
        setBooleanField(term35502, term35502.getClass(), "isBlock", false);
        setBooleanField(term35502, term35502.getClass(), "formatAsBlock", false);
        setBooleanField(term35502, term35502.getClass(), "canContainBlock", false);
        setBooleanField(term35502, term35502.getClass(), "canContainInline", false);
        setBooleanField(term35502, term35502.getClass(), "empty", false);
        setBooleanField(term35502, term35502.getClass(), "selfClosing", false);
        setBooleanField(term35502, term35502.getClass(), "preserveWhitespace", false);
        setBooleanField(term35502, term35502.getClass(), "formList", false);
        setBooleanField(term35502, term35502.getClass(), "formSubmit", false);
        setField(term35501, term35501.getClass(), "tag", term35502);
        setField(term35501, term35501.getClass(), "parentNode", null);
        setField(term35501, term35501.getClass(), "childNodes", null);
        setField(term35501, term35501.getClass(), "attributes", null);
        setField(term35501, term35501.getClass(), "baseUri", null);
        setIntField(term35501, term35501.getClass(), "siblingIndex", 0);
        term35503 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term35503, term35503.getClass(), "elements", null);
        setField(term35503, term35503.getClass(), "tag", null);
        setField(term35503, term35503.getClass(), "parentNode", null);
        setField(term35503, term35503.getClass(), "childNodes", null);
        setField(term35503, term35503.getClass(), "attributes", null);
        setField(term35503, term35503.getClass(), "baseUri", null);
        setIntField(term35503, term35503.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35459;
        callMethod(klass, "equals", argTypes, term35383, args);
        assertTrue(recursiveEquals(term35383, term35501));
        assertTrue(recursiveEquals(term35459, term35503));
    }

};


