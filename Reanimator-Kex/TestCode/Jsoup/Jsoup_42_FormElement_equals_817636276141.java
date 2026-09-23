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

public class FormElement_equals_817636276141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60167;
     Object term60339;
     Object term60528;
     Object term60533;

    public FormElement_equals_817636276141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60167 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60368 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term60271 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term60167, term60167.getClass(), "childNodes", null);
        setField(term60167, term60167.getClass(), "attributes", term60368);
        setField(term60271, term60271.getClass(), "tagName", "");
        setBooleanField(term60271, term60271.getClass(), "canContainBlock", false);
        setField(term60167, term60167.getClass(), "tag", term60271);
        term60339 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60414 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term60339, term60339.getClass(), "childNodes", null);
        setField(term60339, term60339.getClass(), "attributes", term60368);
        setField(term60414, term60414.getClass(), "tagName", "");
        setBooleanField(term60414, term60414.getClass(), "canContainBlock", true);
        setField(term60339, term60339.getClass(), "tag", term60414);
        term60528 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60529 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60532 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term60528, term60528.getClass(), "elements", null);
        setField(term60529, term60529.getClass(), "tagName", "");
        setBooleanField(term60529, term60529.getClass(), "isBlock", false);
        setBooleanField(term60529, term60529.getClass(), "formatAsBlock", false);
        setBooleanField(term60529, term60529.getClass(), "canContainBlock", false);
        setBooleanField(term60529, term60529.getClass(), "canContainInline", false);
        setBooleanField(term60529, term60529.getClass(), "empty", false);
        setBooleanField(term60529, term60529.getClass(), "selfClosing", false);
        setBooleanField(term60529, term60529.getClass(), "preserveWhitespace", false);
        setBooleanField(term60529, term60529.getClass(), "formList", false);
        setBooleanField(term60529, term60529.getClass(), "formSubmit", false);
        setField(term60528, term60528.getClass(), "tag", term60529);
        setField(term60528, term60528.getClass(), "parentNode", null);
        setField(term60528, term60528.getClass(), "childNodes", null);
        setField(term60532, term60532.getClass(), "attributes", null);
        setField(term60528, term60528.getClass(), "attributes", term60532);
        setField(term60528, term60528.getClass(), "baseUri", null);
        setIntField(term60528, term60528.getClass(), "siblingIndex", 0);
        term60533 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term60534 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term60537 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term60533, term60533.getClass(), "elements", null);
        setField(term60534, term60534.getClass(), "tagName", "");
        setBooleanField(term60534, term60534.getClass(), "isBlock", false);
        setBooleanField(term60534, term60534.getClass(), "formatAsBlock", false);
        setBooleanField(term60534, term60534.getClass(), "canContainBlock", true);
        setBooleanField(term60534, term60534.getClass(), "canContainInline", false);
        setBooleanField(term60534, term60534.getClass(), "empty", false);
        setBooleanField(term60534, term60534.getClass(), "selfClosing", false);
        setBooleanField(term60534, term60534.getClass(), "preserveWhitespace", false);
        setBooleanField(term60534, term60534.getClass(), "formList", false);
        setBooleanField(term60534, term60534.getClass(), "formSubmit", false);
        setField(term60533, term60533.getClass(), "tag", term60534);
        setField(term60533, term60533.getClass(), "parentNode", null);
        setField(term60533, term60533.getClass(), "childNodes", null);
        setField(term60537, term60537.getClass(), "attributes", null);
        setField(term60533, term60533.getClass(), "attributes", term60537);
        setField(term60533, term60533.getClass(), "baseUri", null);
        setIntField(term60533, term60533.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60339;
        callMethod(klass, "equals", argTypes, term60167, args);
        assertTrue(recursiveEquals(term60167, term60528));
        assertTrue(recursiveEquals(term60339, term60533));
    }

};


