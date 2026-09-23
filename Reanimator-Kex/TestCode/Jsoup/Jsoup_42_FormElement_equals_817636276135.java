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

public class FormElement_equals_817636276135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57645;
     Object term57817;
     Object term58050;
     Object term58055;

    public FormElement_equals_817636276135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57645 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term57846 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term57749 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term57645, term57645.getClass(), "childNodes", null);
        setField(term57645, term57645.getClass(), "attributes", term57846);
        setField(term57749, term57749.getClass(), "tagName", "byte[]");
        setField(term57645, term57645.getClass(), "tag", term57749);
        term57817 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term57892 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term57817, term57817.getClass(), "childNodes", null);
        setField(term57817, term57817.getClass(), "attributes", term57846);
        setField(term57892, term57892.getClass(), "tagName", "byte[]");
        setField(term57817, term57817.getClass(), "tag", term57892);
        term58050 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58051 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term58050, term58050.getClass(), "elements", null);
        setField(term58051, term58051.getClass(), "tagName", "byte[]");
        setBooleanField(term58051, term58051.getClass(), "isBlock", false);
        setBooleanField(term58051, term58051.getClass(), "formatAsBlock", false);
        setBooleanField(term58051, term58051.getClass(), "canContainBlock", false);
        setBooleanField(term58051, term58051.getClass(), "canContainInline", false);
        setBooleanField(term58051, term58051.getClass(), "empty", false);
        setBooleanField(term58051, term58051.getClass(), "selfClosing", false);
        setBooleanField(term58051, term58051.getClass(), "preserveWhitespace", false);
        setBooleanField(term58051, term58051.getClass(), "formList", false);
        setBooleanField(term58051, term58051.getClass(), "formSubmit", false);
        setField(term58050, term58050.getClass(), "tag", term58051);
        setField(term58050, term58050.getClass(), "parentNode", null);
        setField(term58050, term58050.getClass(), "childNodes", null);
        setField(term58054, term58054.getClass(), "attributes", null);
        setField(term58050, term58050.getClass(), "attributes", term58054);
        setField(term58050, term58050.getClass(), "baseUri", null);
        setIntField(term58050, term58050.getClass(), "siblingIndex", 0);
        term58055 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58056 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58059 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term58055, term58055.getClass(), "elements", null);
        setField(term58056, term58056.getClass(), "tagName", "byte[]");
        setBooleanField(term58056, term58056.getClass(), "isBlock", false);
        setBooleanField(term58056, term58056.getClass(), "formatAsBlock", false);
        setBooleanField(term58056, term58056.getClass(), "canContainBlock", false);
        setBooleanField(term58056, term58056.getClass(), "canContainInline", false);
        setBooleanField(term58056, term58056.getClass(), "empty", false);
        setBooleanField(term58056, term58056.getClass(), "selfClosing", false);
        setBooleanField(term58056, term58056.getClass(), "preserveWhitespace", false);
        setBooleanField(term58056, term58056.getClass(), "formList", false);
        setBooleanField(term58056, term58056.getClass(), "formSubmit", false);
        setField(term58055, term58055.getClass(), "tag", term58056);
        setField(term58055, term58055.getClass(), "parentNode", null);
        setField(term58055, term58055.getClass(), "childNodes", null);
        setField(term58059, term58059.getClass(), "attributes", null);
        setField(term58055, term58055.getClass(), "attributes", term58059);
        setField(term58055, term58055.getClass(), "baseUri", null);
        setIntField(term58055, term58055.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57817;
        callMethod(klass, "equals", argTypes, term57645, args);
        assertTrue(recursiveEquals(term57645, term58050));
        assertTrue(recursiveEquals(term57817, term58055));
    }

};


