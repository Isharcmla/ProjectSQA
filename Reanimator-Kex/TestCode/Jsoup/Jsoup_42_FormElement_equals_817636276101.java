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

public class FormElement_equals_817636276101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45374;
     Object term45488;
     Object term45688;
     Object term45692;

    public FormElement_equals_817636276101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45374 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term45420 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45374, term45374.getClass(), "childNodes", null);
        setField(term45374, term45374.getClass(), "attributes", null);
        setField(term45420, term45420.getClass(), "tagName", "byte[]");
        setField(term45374, term45374.getClass(), "tag", term45420);
        term45488 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term45534 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45488, term45488.getClass(), "childNodes", null);
        setField(term45488, term45488.getClass(), "attributes", null);
        setField(term45534, term45534.getClass(), "tagName", "byte[]");
        setField(term45488, term45488.getClass(), "tag", term45534);
        term45688 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term45689 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45688, term45688.getClass(), "elements", null);
        setField(term45689, term45689.getClass(), "tagName", "byte[]");
        setBooleanField(term45689, term45689.getClass(), "isBlock", false);
        setBooleanField(term45689, term45689.getClass(), "formatAsBlock", false);
        setBooleanField(term45689, term45689.getClass(), "canContainBlock", false);
        setBooleanField(term45689, term45689.getClass(), "canContainInline", false);
        setBooleanField(term45689, term45689.getClass(), "empty", false);
        setBooleanField(term45689, term45689.getClass(), "selfClosing", false);
        setBooleanField(term45689, term45689.getClass(), "preserveWhitespace", false);
        setBooleanField(term45689, term45689.getClass(), "formList", false);
        setBooleanField(term45689, term45689.getClass(), "formSubmit", false);
        setField(term45688, term45688.getClass(), "tag", term45689);
        setField(term45688, term45688.getClass(), "parentNode", null);
        setField(term45688, term45688.getClass(), "childNodes", null);
        setField(term45688, term45688.getClass(), "attributes", null);
        setField(term45688, term45688.getClass(), "baseUri", null);
        setIntField(term45688, term45688.getClass(), "siblingIndex", 0);
        term45692 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term45693 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45692, term45692.getClass(), "elements", null);
        setField(term45693, term45693.getClass(), "tagName", "byte[]");
        setBooleanField(term45693, term45693.getClass(), "isBlock", false);
        setBooleanField(term45693, term45693.getClass(), "formatAsBlock", false);
        setBooleanField(term45693, term45693.getClass(), "canContainBlock", false);
        setBooleanField(term45693, term45693.getClass(), "canContainInline", false);
        setBooleanField(term45693, term45693.getClass(), "empty", false);
        setBooleanField(term45693, term45693.getClass(), "selfClosing", false);
        setBooleanField(term45693, term45693.getClass(), "preserveWhitespace", false);
        setBooleanField(term45693, term45693.getClass(), "formList", false);
        setBooleanField(term45693, term45693.getClass(), "formSubmit", false);
        setField(term45692, term45692.getClass(), "tag", term45693);
        setField(term45692, term45692.getClass(), "parentNode", null);
        setField(term45692, term45692.getClass(), "childNodes", null);
        setField(term45692, term45692.getClass(), "attributes", null);
        setField(term45692, term45692.getClass(), "baseUri", null);
        setIntField(term45692, term45692.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45488;
        callMethod(klass, "equals", argTypes, term45374, args);
        assertTrue(recursiveEquals(term45374, term45688));
        assertTrue(recursiveEquals(term45488, term45692));
    }

};


