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

public class FormElement_equals_817636276169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72222;
     Object term72394;
     Object term72586;
     Object term72591;

    public FormElement_equals_817636276169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72222 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term72423 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term72326 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term72222, term72222.getClass(), "childNodes", null);
        setField(term72222, term72222.getClass(), "attributes", term72423);
        setField(term72326, term72326.getClass(), "tagName", "");
        setBooleanField(term72326, term72326.getClass(), "canContainBlock", false);
        setBooleanField(term72326, term72326.getClass(), "canContainInline", true);
        setBooleanField(term72326, term72326.getClass(), "empty", true);
        setBooleanField(term72326, term72326.getClass(), "formatAsBlock", true);
        setField(term72222, term72222.getClass(), "tag", term72326);
        term72394 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term72469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term72394, term72394.getClass(), "childNodes", null);
        setField(term72394, term72394.getClass(), "attributes", term72423);
        setField(term72469, term72469.getClass(), "tagName", "");
        setBooleanField(term72469, term72469.getClass(), "canContainBlock", false);
        setBooleanField(term72469, term72469.getClass(), "canContainInline", true);
        setBooleanField(term72469, term72469.getClass(), "empty", true);
        setBooleanField(term72469, term72469.getClass(), "formatAsBlock", false);
        setField(term72394, term72394.getClass(), "tag", term72469);
        term72586 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term72587 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term72590 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term72586, term72586.getClass(), "elements", null);
        setField(term72587, term72587.getClass(), "tagName", "");
        setBooleanField(term72587, term72587.getClass(), "isBlock", false);
        setBooleanField(term72587, term72587.getClass(), "formatAsBlock", true);
        setBooleanField(term72587, term72587.getClass(), "canContainBlock", false);
        setBooleanField(term72587, term72587.getClass(), "canContainInline", true);
        setBooleanField(term72587, term72587.getClass(), "empty", true);
        setBooleanField(term72587, term72587.getClass(), "selfClosing", false);
        setBooleanField(term72587, term72587.getClass(), "preserveWhitespace", false);
        setBooleanField(term72587, term72587.getClass(), "formList", false);
        setBooleanField(term72587, term72587.getClass(), "formSubmit", false);
        setField(term72586, term72586.getClass(), "tag", term72587);
        setField(term72586, term72586.getClass(), "parentNode", null);
        setField(term72586, term72586.getClass(), "childNodes", null);
        setField(term72590, term72590.getClass(), "attributes", null);
        setField(term72586, term72586.getClass(), "attributes", term72590);
        setField(term72586, term72586.getClass(), "baseUri", null);
        setIntField(term72586, term72586.getClass(), "siblingIndex", 0);
        term72591 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term72592 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term72595 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term72591, term72591.getClass(), "elements", null);
        setField(term72592, term72592.getClass(), "tagName", "");
        setBooleanField(term72592, term72592.getClass(), "isBlock", false);
        setBooleanField(term72592, term72592.getClass(), "formatAsBlock", false);
        setBooleanField(term72592, term72592.getClass(), "canContainBlock", false);
        setBooleanField(term72592, term72592.getClass(), "canContainInline", true);
        setBooleanField(term72592, term72592.getClass(), "empty", true);
        setBooleanField(term72592, term72592.getClass(), "selfClosing", false);
        setBooleanField(term72592, term72592.getClass(), "preserveWhitespace", false);
        setBooleanField(term72592, term72592.getClass(), "formList", false);
        setBooleanField(term72592, term72592.getClass(), "formSubmit", false);
        setField(term72591, term72591.getClass(), "tag", term72592);
        setField(term72591, term72591.getClass(), "parentNode", null);
        setField(term72591, term72591.getClass(), "childNodes", null);
        setField(term72595, term72595.getClass(), "attributes", null);
        setField(term72591, term72591.getClass(), "attributes", term72595);
        setField(term72591, term72591.getClass(), "baseUri", null);
        setIntField(term72591, term72591.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72394;
        callMethod(klass, "equals", argTypes, term72222, args);
        assertTrue(recursiveEquals(term72222, term72586));
        assertTrue(recursiveEquals(term72394, term72591));
    }

};


