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

public class FormElement_equals_817636276155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66052;
     Object term66224;
     Object term66449;
     Object term66454;

    public FormElement_equals_817636276155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66052 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66110 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term66156 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term66052, term66052.getClass(), "childNodes", null);
        setField(term66110, term66110.getClass(), "attributes", null);
        setField(term66052, term66052.getClass(), "attributes", term66110);
        setField(term66156, term66156.getClass(), "tagName", "");
        setBooleanField(term66156, term66156.getClass(), "canContainBlock", true);
        setBooleanField(term66156, term66156.getClass(), "canContainInline", true);
        setBooleanField(term66156, term66156.getClass(), "empty", false);
        setField(term66052, term66052.getClass(), "tag", term66156);
        term66224 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66282 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term66328 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term66224, term66224.getClass(), "childNodes", null);
        setField(term66282, term66282.getClass(), "attributes", null);
        setField(term66224, term66224.getClass(), "attributes", term66282);
        setField(term66328, term66328.getClass(), "tagName", "");
        setBooleanField(term66328, term66328.getClass(), "canContainBlock", true);
        setBooleanField(term66328, term66328.getClass(), "canContainInline", true);
        setBooleanField(term66328, term66328.getClass(), "empty", true);
        setField(term66224, term66224.getClass(), "tag", term66328);
        term66449 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66450 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term66453 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term66449, term66449.getClass(), "elements", null);
        setField(term66450, term66450.getClass(), "tagName", "");
        setBooleanField(term66450, term66450.getClass(), "isBlock", false);
        setBooleanField(term66450, term66450.getClass(), "formatAsBlock", false);
        setBooleanField(term66450, term66450.getClass(), "canContainBlock", true);
        setBooleanField(term66450, term66450.getClass(), "canContainInline", true);
        setBooleanField(term66450, term66450.getClass(), "empty", false);
        setBooleanField(term66450, term66450.getClass(), "selfClosing", false);
        setBooleanField(term66450, term66450.getClass(), "preserveWhitespace", false);
        setBooleanField(term66450, term66450.getClass(), "formList", false);
        setBooleanField(term66450, term66450.getClass(), "formSubmit", false);
        setField(term66449, term66449.getClass(), "tag", term66450);
        setField(term66449, term66449.getClass(), "parentNode", null);
        setField(term66449, term66449.getClass(), "childNodes", null);
        setField(term66453, term66453.getClass(), "attributes", null);
        setField(term66449, term66449.getClass(), "attributes", term66453);
        setField(term66449, term66449.getClass(), "baseUri", null);
        setIntField(term66449, term66449.getClass(), "siblingIndex", 0);
        term66454 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66455 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term66458 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term66454, term66454.getClass(), "elements", null);
        setField(term66455, term66455.getClass(), "tagName", "");
        setBooleanField(term66455, term66455.getClass(), "isBlock", false);
        setBooleanField(term66455, term66455.getClass(), "formatAsBlock", false);
        setBooleanField(term66455, term66455.getClass(), "canContainBlock", true);
        setBooleanField(term66455, term66455.getClass(), "canContainInline", true);
        setBooleanField(term66455, term66455.getClass(), "empty", true);
        setBooleanField(term66455, term66455.getClass(), "selfClosing", false);
        setBooleanField(term66455, term66455.getClass(), "preserveWhitespace", false);
        setBooleanField(term66455, term66455.getClass(), "formList", false);
        setBooleanField(term66455, term66455.getClass(), "formSubmit", false);
        setField(term66454, term66454.getClass(), "tag", term66455);
        setField(term66454, term66454.getClass(), "parentNode", null);
        setField(term66454, term66454.getClass(), "childNodes", null);
        setField(term66458, term66458.getClass(), "attributes", null);
        setField(term66454, term66454.getClass(), "attributes", term66458);
        setField(term66454, term66454.getClass(), "baseUri", null);
        setIntField(term66454, term66454.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66224;
        callMethod(klass, "equals", argTypes, term66052, args);
        assertTrue(recursiveEquals(term66052, term66449));
        assertTrue(recursiveEquals(term66224, term66454));
    }

};


