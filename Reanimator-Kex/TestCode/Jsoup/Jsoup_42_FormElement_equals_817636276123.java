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

public class FormElement_equals_817636276123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53439;
     Object term53573;
     Object term53670;
     Object term53673;

    public FormElement_equals_817636276123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53439 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53602 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term53625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term53439, term53439.getClass(), "childNodes", null);
        setField(term53439, term53439.getClass(), "attributes", term53602);
        setField(term53439, term53439.getClass(), "tag", term53625);
        term53573 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term53573, term53573.getClass(), "childNodes", null);
        setField(term53573, term53573.getClass(), "attributes", term53602);
        setField(term53573, term53573.getClass(), "tag", term53625);
        term53670 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53671 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term53672 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53670, term53670.getClass(), "elements", null);
        setField(term53671, term53671.getClass(), "tagName", null);
        setBooleanField(term53671, term53671.getClass(), "isBlock", false);
        setBooleanField(term53671, term53671.getClass(), "formatAsBlock", false);
        setBooleanField(term53671, term53671.getClass(), "canContainBlock", false);
        setBooleanField(term53671, term53671.getClass(), "canContainInline", false);
        setBooleanField(term53671, term53671.getClass(), "empty", false);
        setBooleanField(term53671, term53671.getClass(), "selfClosing", false);
        setBooleanField(term53671, term53671.getClass(), "preserveWhitespace", false);
        setBooleanField(term53671, term53671.getClass(), "formList", false);
        setBooleanField(term53671, term53671.getClass(), "formSubmit", false);
        setField(term53670, term53670.getClass(), "tag", term53671);
        setField(term53670, term53670.getClass(), "parentNode", null);
        setField(term53670, term53670.getClass(), "childNodes", null);
        setField(term53672, term53672.getClass(), "attributes", null);
        setField(term53670, term53670.getClass(), "attributes", term53672);
        setField(term53670, term53670.getClass(), "baseUri", null);
        setIntField(term53670, term53670.getClass(), "siblingIndex", 0);
        term53673 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term53674 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term53675 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53673, term53673.getClass(), "elements", null);
        setField(term53674, term53674.getClass(), "tagName", null);
        setBooleanField(term53674, term53674.getClass(), "isBlock", false);
        setBooleanField(term53674, term53674.getClass(), "formatAsBlock", false);
        setBooleanField(term53674, term53674.getClass(), "canContainBlock", false);
        setBooleanField(term53674, term53674.getClass(), "canContainInline", false);
        setBooleanField(term53674, term53674.getClass(), "empty", false);
        setBooleanField(term53674, term53674.getClass(), "selfClosing", false);
        setBooleanField(term53674, term53674.getClass(), "preserveWhitespace", false);
        setBooleanField(term53674, term53674.getClass(), "formList", false);
        setBooleanField(term53674, term53674.getClass(), "formSubmit", false);
        setField(term53673, term53673.getClass(), "tag", term53674);
        setField(term53673, term53673.getClass(), "parentNode", null);
        setField(term53673, term53673.getClass(), "childNodes", null);
        setField(term53675, term53675.getClass(), "attributes", null);
        setField(term53673, term53673.getClass(), "attributes", term53675);
        setField(term53673, term53673.getClass(), "baseUri", null);
        setIntField(term53673, term53673.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53573;
        callMethod(klass, "equals", argTypes, term53439, args);
        assertTrue(recursiveEquals(term53439, term53670));
        assertTrue(recursiveEquals(term53573, term53673));
    }

};


