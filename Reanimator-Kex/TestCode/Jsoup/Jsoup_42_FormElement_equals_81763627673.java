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

public class FormElement_equals_81763627673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36622;
     Object term36698;
     Object term36762;
     Object term36764;

    public FormElement_equals_81763627673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36622 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term36721 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36622, term36622.getClass(), "childNodes", null);
        setField(term36622, term36622.getClass(), "attributes", null);
        setField(term36622, term36622.getClass(), "tag", term36721);
        term36698 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term36698, term36698.getClass(), "childNodes", null);
        setField(term36698, term36698.getClass(), "attributes", null);
        setField(term36698, term36698.getClass(), "tag", term36721);
        term36762 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term36763 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36762, term36762.getClass(), "elements", null);
        setField(term36763, term36763.getClass(), "tagName", null);
        setBooleanField(term36763, term36763.getClass(), "isBlock", false);
        setBooleanField(term36763, term36763.getClass(), "formatAsBlock", false);
        setBooleanField(term36763, term36763.getClass(), "canContainBlock", false);
        setBooleanField(term36763, term36763.getClass(), "canContainInline", false);
        setBooleanField(term36763, term36763.getClass(), "empty", false);
        setBooleanField(term36763, term36763.getClass(), "selfClosing", false);
        setBooleanField(term36763, term36763.getClass(), "preserveWhitespace", false);
        setBooleanField(term36763, term36763.getClass(), "formList", false);
        setBooleanField(term36763, term36763.getClass(), "formSubmit", false);
        setField(term36762, term36762.getClass(), "tag", term36763);
        setField(term36762, term36762.getClass(), "parentNode", null);
        setField(term36762, term36762.getClass(), "childNodes", null);
        setField(term36762, term36762.getClass(), "attributes", null);
        setField(term36762, term36762.getClass(), "baseUri", null);
        setIntField(term36762, term36762.getClass(), "siblingIndex", 0);
        term36764 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term36765 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36764, term36764.getClass(), "elements", null);
        setField(term36765, term36765.getClass(), "tagName", null);
        setBooleanField(term36765, term36765.getClass(), "isBlock", false);
        setBooleanField(term36765, term36765.getClass(), "formatAsBlock", false);
        setBooleanField(term36765, term36765.getClass(), "canContainBlock", false);
        setBooleanField(term36765, term36765.getClass(), "canContainInline", false);
        setBooleanField(term36765, term36765.getClass(), "empty", false);
        setBooleanField(term36765, term36765.getClass(), "selfClosing", false);
        setBooleanField(term36765, term36765.getClass(), "preserveWhitespace", false);
        setBooleanField(term36765, term36765.getClass(), "formList", false);
        setBooleanField(term36765, term36765.getClass(), "formSubmit", false);
        setField(term36764, term36764.getClass(), "tag", term36765);
        setField(term36764, term36764.getClass(), "parentNode", null);
        setField(term36764, term36764.getClass(), "childNodes", null);
        setField(term36764, term36764.getClass(), "attributes", null);
        setField(term36764, term36764.getClass(), "baseUri", null);
        setIntField(term36764, term36764.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36698;
        callMethod(klass, "equals", argTypes, term36622, args);
        assertTrue(recursiveEquals(term36622, term36762));
        assertTrue(recursiveEquals(term36698, term36764));
    }

};


