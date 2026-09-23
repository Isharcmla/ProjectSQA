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

public class FormElement_equals_817636276111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49239;
     Object term49373;
     Object term49448;
     Object term49451;

    public FormElement_equals_817636276111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49239 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term49402 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term49343 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49239, term49239.getClass(), "childNodes", null);
        setField(term49239, term49239.getClass(), "attributes", term49402);
        setField(term49239, term49239.getClass(), "tag", term49343);
        term49373 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term49373, term49373.getClass(), "childNodes", null);
        setField(term49373, term49373.getClass(), "attributes", term49402);
        setField(term49373, term49373.getClass(), "tag", null);
        term49448 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term49449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term49450 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49448, term49448.getClass(), "elements", null);
        setField(term49449, term49449.getClass(), "tagName", null);
        setBooleanField(term49449, term49449.getClass(), "isBlock", false);
        setBooleanField(term49449, term49449.getClass(), "formatAsBlock", false);
        setBooleanField(term49449, term49449.getClass(), "canContainBlock", false);
        setBooleanField(term49449, term49449.getClass(), "canContainInline", false);
        setBooleanField(term49449, term49449.getClass(), "empty", false);
        setBooleanField(term49449, term49449.getClass(), "selfClosing", false);
        setBooleanField(term49449, term49449.getClass(), "preserveWhitespace", false);
        setBooleanField(term49449, term49449.getClass(), "formList", false);
        setBooleanField(term49449, term49449.getClass(), "formSubmit", false);
        setField(term49448, term49448.getClass(), "tag", term49449);
        setField(term49448, term49448.getClass(), "parentNode", null);
        setField(term49448, term49448.getClass(), "childNodes", null);
        setField(term49450, term49450.getClass(), "attributes", null);
        setField(term49448, term49448.getClass(), "attributes", term49450);
        setField(term49448, term49448.getClass(), "baseUri", null);
        setIntField(term49448, term49448.getClass(), "siblingIndex", 0);
        term49451 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term49452 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49451, term49451.getClass(), "elements", null);
        setField(term49451, term49451.getClass(), "tag", null);
        setField(term49451, term49451.getClass(), "parentNode", null);
        setField(term49451, term49451.getClass(), "childNodes", null);
        setField(term49452, term49452.getClass(), "attributes", null);
        setField(term49451, term49451.getClass(), "attributes", term49452);
        setField(term49451, term49451.getClass(), "baseUri", null);
        setIntField(term49451, term49451.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49373;
        callMethod(klass, "equals", argTypes, term49239, args);
        assertTrue(recursiveEquals(term49239, term49448));
        assertTrue(recursiveEquals(term49373, term49451));
    }

};


