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

public class FormElement_equals_817636276117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51524;
     Object term51638;
     Object term51801;
     Object term51805;

    public FormElement_equals_817636276117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51524 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51570 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51524, term51524.getClass(), "childNodes", null);
        setField(term51524, term51524.getClass(), "attributes", null);
        setField(term51570, term51570.getClass(), "tagName", "");
        setBooleanField(term51570, term51570.getClass(), "canContainBlock", true);
        setBooleanField(term51570, term51570.getClass(), "canContainInline", true);
        setBooleanField(term51570, term51570.getClass(), "empty", true);
        setBooleanField(term51570, term51570.getClass(), "formatAsBlock", false);
        setBooleanField(term51570, term51570.getClass(), "isBlock", true);
        setBooleanField(term51570, term51570.getClass(), "preserveWhitespace", true);
        setBooleanField(term51570, term51570.getClass(), "selfClosing", true);
        setBooleanField(term51570, term51570.getClass(), "formList", true);
        setField(term51524, term51524.getClass(), "tag", term51570);
        term51638 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51684 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51638, term51638.getClass(), "childNodes", null);
        setField(term51638, term51638.getClass(), "attributes", null);
        setField(term51684, term51684.getClass(), "tagName", "");
        setBooleanField(term51684, term51684.getClass(), "canContainBlock", true);
        setBooleanField(term51684, term51684.getClass(), "canContainInline", true);
        setBooleanField(term51684, term51684.getClass(), "empty", true);
        setBooleanField(term51684, term51684.getClass(), "formatAsBlock", false);
        setBooleanField(term51684, term51684.getClass(), "isBlock", true);
        setBooleanField(term51684, term51684.getClass(), "preserveWhitespace", true);
        setBooleanField(term51684, term51684.getClass(), "selfClosing", true);
        setBooleanField(term51684, term51684.getClass(), "formList", false);
        setField(term51638, term51638.getClass(), "tag", term51684);
        term51801 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51802 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51801, term51801.getClass(), "elements", null);
        setField(term51802, term51802.getClass(), "tagName", "");
        setBooleanField(term51802, term51802.getClass(), "isBlock", true);
        setBooleanField(term51802, term51802.getClass(), "formatAsBlock", false);
        setBooleanField(term51802, term51802.getClass(), "canContainBlock", true);
        setBooleanField(term51802, term51802.getClass(), "canContainInline", true);
        setBooleanField(term51802, term51802.getClass(), "empty", true);
        setBooleanField(term51802, term51802.getClass(), "selfClosing", true);
        setBooleanField(term51802, term51802.getClass(), "preserveWhitespace", true);
        setBooleanField(term51802, term51802.getClass(), "formList", true);
        setBooleanField(term51802, term51802.getClass(), "formSubmit", false);
        setField(term51801, term51801.getClass(), "tag", term51802);
        setField(term51801, term51801.getClass(), "parentNode", null);
        setField(term51801, term51801.getClass(), "childNodes", null);
        setField(term51801, term51801.getClass(), "attributes", null);
        setField(term51801, term51801.getClass(), "baseUri", null);
        setIntField(term51801, term51801.getClass(), "siblingIndex", 0);
        term51805 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term51806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51805, term51805.getClass(), "elements", null);
        setField(term51806, term51806.getClass(), "tagName", "");
        setBooleanField(term51806, term51806.getClass(), "isBlock", true);
        setBooleanField(term51806, term51806.getClass(), "formatAsBlock", false);
        setBooleanField(term51806, term51806.getClass(), "canContainBlock", true);
        setBooleanField(term51806, term51806.getClass(), "canContainInline", true);
        setBooleanField(term51806, term51806.getClass(), "empty", true);
        setBooleanField(term51806, term51806.getClass(), "selfClosing", true);
        setBooleanField(term51806, term51806.getClass(), "preserveWhitespace", true);
        setBooleanField(term51806, term51806.getClass(), "formList", false);
        setBooleanField(term51806, term51806.getClass(), "formSubmit", false);
        setField(term51805, term51805.getClass(), "tag", term51806);
        setField(term51805, term51805.getClass(), "parentNode", null);
        setField(term51805, term51805.getClass(), "childNodes", null);
        setField(term51805, term51805.getClass(), "attributes", null);
        setField(term51805, term51805.getClass(), "baseUri", null);
        setIntField(term51805, term51805.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51638;
        callMethod(klass, "equals", argTypes, term51524, args);
        assertTrue(recursiveEquals(term51524, term51801));
        assertTrue(recursiveEquals(term51638, term51805));
    }

};


