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

public class FormElement_equals_817636276127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54961;
     Object term55075;
     Object term55237;
     Object term55241;

    public FormElement_equals_817636276127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54961 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55007 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term54961, term54961.getClass(), "childNodes", null);
        setField(term54961, term54961.getClass(), "attributes", null);
        setField(term55007, term55007.getClass(), "tagName", "");
        setBooleanField(term55007, term55007.getClass(), "canContainBlock", true);
        setBooleanField(term55007, term55007.getClass(), "canContainInline", true);
        setBooleanField(term55007, term55007.getClass(), "empty", true);
        setBooleanField(term55007, term55007.getClass(), "formatAsBlock", true);
        setBooleanField(term55007, term55007.getClass(), "isBlock", true);
        setBooleanField(term55007, term55007.getClass(), "preserveWhitespace", true);
        setBooleanField(term55007, term55007.getClass(), "selfClosing", true);
        setField(term54961, term54961.getClass(), "tag", term55007);
        term55075 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55121 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55075, term55075.getClass(), "childNodes", null);
        setField(term55075, term55075.getClass(), "attributes", null);
        setField(term55121, term55121.getClass(), "tagName", "");
        setBooleanField(term55121, term55121.getClass(), "canContainBlock", true);
        setBooleanField(term55121, term55121.getClass(), "canContainInline", true);
        setBooleanField(term55121, term55121.getClass(), "empty", true);
        setBooleanField(term55121, term55121.getClass(), "formatAsBlock", true);
        setBooleanField(term55121, term55121.getClass(), "isBlock", true);
        setBooleanField(term55121, term55121.getClass(), "preserveWhitespace", true);
        setBooleanField(term55121, term55121.getClass(), "selfClosing", false);
        setField(term55075, term55075.getClass(), "tag", term55121);
        term55237 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55238 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55237, term55237.getClass(), "elements", null);
        setField(term55238, term55238.getClass(), "tagName", "");
        setBooleanField(term55238, term55238.getClass(), "isBlock", true);
        setBooleanField(term55238, term55238.getClass(), "formatAsBlock", true);
        setBooleanField(term55238, term55238.getClass(), "canContainBlock", true);
        setBooleanField(term55238, term55238.getClass(), "canContainInline", true);
        setBooleanField(term55238, term55238.getClass(), "empty", true);
        setBooleanField(term55238, term55238.getClass(), "selfClosing", true);
        setBooleanField(term55238, term55238.getClass(), "preserveWhitespace", true);
        setBooleanField(term55238, term55238.getClass(), "formList", false);
        setBooleanField(term55238, term55238.getClass(), "formSubmit", false);
        setField(term55237, term55237.getClass(), "tag", term55238);
        setField(term55237, term55237.getClass(), "parentNode", null);
        setField(term55237, term55237.getClass(), "childNodes", null);
        setField(term55237, term55237.getClass(), "attributes", null);
        setField(term55237, term55237.getClass(), "baseUri", null);
        setIntField(term55237, term55237.getClass(), "siblingIndex", 0);
        term55241 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55242 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55241, term55241.getClass(), "elements", null);
        setField(term55242, term55242.getClass(), "tagName", "");
        setBooleanField(term55242, term55242.getClass(), "isBlock", true);
        setBooleanField(term55242, term55242.getClass(), "formatAsBlock", true);
        setBooleanField(term55242, term55242.getClass(), "canContainBlock", true);
        setBooleanField(term55242, term55242.getClass(), "canContainInline", true);
        setBooleanField(term55242, term55242.getClass(), "empty", true);
        setBooleanField(term55242, term55242.getClass(), "selfClosing", false);
        setBooleanField(term55242, term55242.getClass(), "preserveWhitespace", true);
        setBooleanField(term55242, term55242.getClass(), "formList", false);
        setBooleanField(term55242, term55242.getClass(), "formSubmit", false);
        setField(term55241, term55241.getClass(), "tag", term55242);
        setField(term55241, term55241.getClass(), "parentNode", null);
        setField(term55241, term55241.getClass(), "childNodes", null);
        setField(term55241, term55241.getClass(), "attributes", null);
        setField(term55241, term55241.getClass(), "baseUri", null);
        setIntField(term55241, term55241.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55075;
        callMethod(klass, "equals", argTypes, term54961, args);
        assertTrue(recursiveEquals(term54961, term55237));
        assertTrue(recursiveEquals(term55075, term55241));
    }

};


