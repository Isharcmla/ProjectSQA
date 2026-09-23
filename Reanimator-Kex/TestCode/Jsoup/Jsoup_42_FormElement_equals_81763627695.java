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

public class FormElement_equals_81763627695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43500;
     Object term43634;
     Object term43765;
     Object term43768;

    public FormElement_equals_81763627695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43500 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43558 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term43715 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43500, term43500.getClass(), "childNodes", null);
        setField(term43558, term43558.getClass(), "attributes", null);
        setField(term43500, term43500.getClass(), "attributes", term43558);
        setField(term43500, term43500.getClass(), "tag", term43715);
        term43634 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43692 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43634, term43634.getClass(), "childNodes", null);
        setField(term43692, term43692.getClass(), "attributes", null);
        setField(term43634, term43634.getClass(), "attributes", term43692);
        setField(term43634, term43634.getClass(), "tag", term43715);
        term43765 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43766 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term43767 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43765, term43765.getClass(), "elements", null);
        setField(term43766, term43766.getClass(), "tagName", null);
        setBooleanField(term43766, term43766.getClass(), "isBlock", false);
        setBooleanField(term43766, term43766.getClass(), "formatAsBlock", false);
        setBooleanField(term43766, term43766.getClass(), "canContainBlock", false);
        setBooleanField(term43766, term43766.getClass(), "canContainInline", false);
        setBooleanField(term43766, term43766.getClass(), "empty", false);
        setBooleanField(term43766, term43766.getClass(), "selfClosing", false);
        setBooleanField(term43766, term43766.getClass(), "preserveWhitespace", false);
        setBooleanField(term43766, term43766.getClass(), "formList", false);
        setBooleanField(term43766, term43766.getClass(), "formSubmit", false);
        setField(term43765, term43765.getClass(), "tag", term43766);
        setField(term43765, term43765.getClass(), "parentNode", null);
        setField(term43765, term43765.getClass(), "childNodes", null);
        setField(term43767, term43767.getClass(), "attributes", null);
        setField(term43765, term43765.getClass(), "attributes", term43767);
        setField(term43765, term43765.getClass(), "baseUri", null);
        setIntField(term43765, term43765.getClass(), "siblingIndex", 0);
        term43768 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43769 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term43770 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43768, term43768.getClass(), "elements", null);
        setField(term43769, term43769.getClass(), "tagName", null);
        setBooleanField(term43769, term43769.getClass(), "isBlock", false);
        setBooleanField(term43769, term43769.getClass(), "formatAsBlock", false);
        setBooleanField(term43769, term43769.getClass(), "canContainBlock", false);
        setBooleanField(term43769, term43769.getClass(), "canContainInline", false);
        setBooleanField(term43769, term43769.getClass(), "empty", false);
        setBooleanField(term43769, term43769.getClass(), "selfClosing", false);
        setBooleanField(term43769, term43769.getClass(), "preserveWhitespace", false);
        setBooleanField(term43769, term43769.getClass(), "formList", false);
        setBooleanField(term43769, term43769.getClass(), "formSubmit", false);
        setField(term43768, term43768.getClass(), "tag", term43769);
        setField(term43768, term43768.getClass(), "parentNode", null);
        setField(term43768, term43768.getClass(), "childNodes", null);
        setField(term43770, term43770.getClass(), "attributes", null);
        setField(term43768, term43768.getClass(), "attributes", term43770);
        setField(term43768, term43768.getClass(), "baseUri", null);
        setIntField(term43768, term43768.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43634;
        callMethod(klass, "equals", argTypes, term43500, args);
        assertTrue(recursiveEquals(term43500, term43765));
        assertTrue(recursiveEquals(term43634, term43768));
    }

};


