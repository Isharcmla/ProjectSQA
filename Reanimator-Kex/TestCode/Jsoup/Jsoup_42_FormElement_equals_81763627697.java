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

public class FormElement_equals_81763627697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44125;
     Object term44239;
     Object term44352;
     Object term44356;

    public FormElement_equals_81763627697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44125 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44171 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44125, term44125.getClass(), "childNodes", null);
        setField(term44125, term44125.getClass(), "attributes", null);
        setField(term44171, term44171.getClass(), "tagName", "");
        setField(term44125, term44125.getClass(), "tag", term44171);
        term44239 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44285 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44239, term44239.getClass(), "childNodes", null);
        setField(term44239, term44239.getClass(), "attributes", null);
        setField(term44285, term44285.getClass(), "tagName", null);
        setField(term44239, term44239.getClass(), "tag", term44285);
        term44352 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44353 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44352, term44352.getClass(), "elements", null);
        setField(term44353, term44353.getClass(), "tagName", "");
        setBooleanField(term44353, term44353.getClass(), "isBlock", false);
        setBooleanField(term44353, term44353.getClass(), "formatAsBlock", false);
        setBooleanField(term44353, term44353.getClass(), "canContainBlock", false);
        setBooleanField(term44353, term44353.getClass(), "canContainInline", false);
        setBooleanField(term44353, term44353.getClass(), "empty", false);
        setBooleanField(term44353, term44353.getClass(), "selfClosing", false);
        setBooleanField(term44353, term44353.getClass(), "preserveWhitespace", false);
        setBooleanField(term44353, term44353.getClass(), "formList", false);
        setBooleanField(term44353, term44353.getClass(), "formSubmit", false);
        setField(term44352, term44352.getClass(), "tag", term44353);
        setField(term44352, term44352.getClass(), "parentNode", null);
        setField(term44352, term44352.getClass(), "childNodes", null);
        setField(term44352, term44352.getClass(), "attributes", null);
        setField(term44352, term44352.getClass(), "baseUri", null);
        setIntField(term44352, term44352.getClass(), "siblingIndex", 0);
        term44356 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44357 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44356, term44356.getClass(), "elements", null);
        setField(term44357, term44357.getClass(), "tagName", null);
        setBooleanField(term44357, term44357.getClass(), "isBlock", false);
        setBooleanField(term44357, term44357.getClass(), "formatAsBlock", false);
        setBooleanField(term44357, term44357.getClass(), "canContainBlock", false);
        setBooleanField(term44357, term44357.getClass(), "canContainInline", false);
        setBooleanField(term44357, term44357.getClass(), "empty", false);
        setBooleanField(term44357, term44357.getClass(), "selfClosing", false);
        setBooleanField(term44357, term44357.getClass(), "preserveWhitespace", false);
        setBooleanField(term44357, term44357.getClass(), "formList", false);
        setBooleanField(term44357, term44357.getClass(), "formSubmit", false);
        setField(term44356, term44356.getClass(), "tag", term44357);
        setField(term44356, term44356.getClass(), "parentNode", null);
        setField(term44356, term44356.getClass(), "childNodes", null);
        setField(term44356, term44356.getClass(), "attributes", null);
        setField(term44356, term44356.getClass(), "baseUri", null);
        setIntField(term44356, term44356.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44239;
        callMethod(klass, "equals", argTypes, term44125, args);
        assertTrue(recursiveEquals(term44125, term44352));
        assertTrue(recursiveEquals(term44239, term44356));
    }

};


