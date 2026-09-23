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

public class FormElement_equals_817636276149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63490;
     Object term63662;
     Object term63891;
     Object term63896;

    public FormElement_equals_817636276149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63490 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63548 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term63594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term63490, term63490.getClass(), "childNodes", null);
        setField(term63548, term63548.getClass(), "attributes", null);
        setField(term63490, term63490.getClass(), "attributes", term63548);
        setField(term63594, term63594.getClass(), "tagName", "");
        setBooleanField(term63594, term63594.getClass(), "canContainBlock", true);
        setBooleanField(term63594, term63594.getClass(), "canContainInline", false);
        setBooleanField(term63594, term63594.getClass(), "empty", true);
        setBooleanField(term63594, term63594.getClass(), "formatAsBlock", true);
        setBooleanField(term63594, term63594.getClass(), "isBlock", true);
        setBooleanField(term63594, term63594.getClass(), "preserveWhitespace", true);
        setBooleanField(term63594, term63594.getClass(), "selfClosing", true);
        setField(term63490, term63490.getClass(), "tag", term63594);
        term63662 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term63766 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term63662, term63662.getClass(), "childNodes", null);
        setField(term63720, term63720.getClass(), "attributes", null);
        setField(term63662, term63662.getClass(), "attributes", term63720);
        setField(term63766, term63766.getClass(), "tagName", "");
        setBooleanField(term63766, term63766.getClass(), "canContainBlock", true);
        setBooleanField(term63766, term63766.getClass(), "canContainInline", false);
        setBooleanField(term63766, term63766.getClass(), "empty", true);
        setBooleanField(term63766, term63766.getClass(), "formatAsBlock", true);
        setBooleanField(term63766, term63766.getClass(), "isBlock", true);
        setBooleanField(term63766, term63766.getClass(), "preserveWhitespace", true);
        setBooleanField(term63766, term63766.getClass(), "selfClosing", false);
        setField(term63662, term63662.getClass(), "tag", term63766);
        term63891 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63892 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term63895 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term63891, term63891.getClass(), "elements", null);
        setField(term63892, term63892.getClass(), "tagName", "");
        setBooleanField(term63892, term63892.getClass(), "isBlock", true);
        setBooleanField(term63892, term63892.getClass(), "formatAsBlock", true);
        setBooleanField(term63892, term63892.getClass(), "canContainBlock", true);
        setBooleanField(term63892, term63892.getClass(), "canContainInline", false);
        setBooleanField(term63892, term63892.getClass(), "empty", true);
        setBooleanField(term63892, term63892.getClass(), "selfClosing", true);
        setBooleanField(term63892, term63892.getClass(), "preserveWhitespace", true);
        setBooleanField(term63892, term63892.getClass(), "formList", false);
        setBooleanField(term63892, term63892.getClass(), "formSubmit", false);
        setField(term63891, term63891.getClass(), "tag", term63892);
        setField(term63891, term63891.getClass(), "parentNode", null);
        setField(term63891, term63891.getClass(), "childNodes", null);
        setField(term63895, term63895.getClass(), "attributes", null);
        setField(term63891, term63891.getClass(), "attributes", term63895);
        setField(term63891, term63891.getClass(), "baseUri", null);
        setIntField(term63891, term63891.getClass(), "siblingIndex", 0);
        term63896 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term63897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term63900 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term63896, term63896.getClass(), "elements", null);
        setField(term63897, term63897.getClass(), "tagName", "");
        setBooleanField(term63897, term63897.getClass(), "isBlock", true);
        setBooleanField(term63897, term63897.getClass(), "formatAsBlock", true);
        setBooleanField(term63897, term63897.getClass(), "canContainBlock", true);
        setBooleanField(term63897, term63897.getClass(), "canContainInline", false);
        setBooleanField(term63897, term63897.getClass(), "empty", true);
        setBooleanField(term63897, term63897.getClass(), "selfClosing", false);
        setBooleanField(term63897, term63897.getClass(), "preserveWhitespace", true);
        setBooleanField(term63897, term63897.getClass(), "formList", false);
        setBooleanField(term63897, term63897.getClass(), "formSubmit", false);
        setField(term63896, term63896.getClass(), "tag", term63897);
        setField(term63896, term63896.getClass(), "parentNode", null);
        setField(term63896, term63896.getClass(), "childNodes", null);
        setField(term63900, term63900.getClass(), "attributes", null);
        setField(term63896, term63896.getClass(), "attributes", term63900);
        setField(term63896, term63896.getClass(), "baseUri", null);
        setIntField(term63896, term63896.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63662;
        callMethod(klass, "equals", argTypes, term63490, args);
        assertTrue(recursiveEquals(term63490, term63891));
        assertTrue(recursiveEquals(term63662, term63896));
    }

};


