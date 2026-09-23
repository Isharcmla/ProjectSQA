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

public class FormElement_equals_817636276129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55643;
     Object term55815;
     Object term56007;
     Object term56012;

    public FormElement_equals_817636276129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55643 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55701 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term55747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55643, term55643.getClass(), "childNodes", null);
        setField(term55701, term55701.getClass(), "attributes", null);
        setField(term55643, term55643.getClass(), "attributes", term55701);
        setField(term55747, term55747.getClass(), "tagName", "byte");
        setField(term55643, term55643.getClass(), "tag", term55747);
        term55815 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term55873 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term55919 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55815, term55815.getClass(), "childNodes", null);
        setField(term55873, term55873.getClass(), "attributes", null);
        setField(term55815, term55815.getClass(), "attributes", term55873);
        setField(term55919, term55919.getClass(), "tagName", null);
        setField(term55815, term55815.getClass(), "tag", term55919);
        term56007 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56008 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56011 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56007, term56007.getClass(), "elements", null);
        setField(term56008, term56008.getClass(), "tagName", "byte");
        setBooleanField(term56008, term56008.getClass(), "isBlock", false);
        setBooleanField(term56008, term56008.getClass(), "formatAsBlock", false);
        setBooleanField(term56008, term56008.getClass(), "canContainBlock", false);
        setBooleanField(term56008, term56008.getClass(), "canContainInline", false);
        setBooleanField(term56008, term56008.getClass(), "empty", false);
        setBooleanField(term56008, term56008.getClass(), "selfClosing", false);
        setBooleanField(term56008, term56008.getClass(), "preserveWhitespace", false);
        setBooleanField(term56008, term56008.getClass(), "formList", false);
        setBooleanField(term56008, term56008.getClass(), "formSubmit", false);
        setField(term56007, term56007.getClass(), "tag", term56008);
        setField(term56007, term56007.getClass(), "parentNode", null);
        setField(term56007, term56007.getClass(), "childNodes", null);
        setField(term56011, term56011.getClass(), "attributes", null);
        setField(term56007, term56007.getClass(), "attributes", term56011);
        setField(term56007, term56007.getClass(), "baseUri", null);
        setIntField(term56007, term56007.getClass(), "siblingIndex", 0);
        term56012 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56013 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56014 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56012, term56012.getClass(), "elements", null);
        setField(term56013, term56013.getClass(), "tagName", null);
        setBooleanField(term56013, term56013.getClass(), "isBlock", false);
        setBooleanField(term56013, term56013.getClass(), "formatAsBlock", false);
        setBooleanField(term56013, term56013.getClass(), "canContainBlock", false);
        setBooleanField(term56013, term56013.getClass(), "canContainInline", false);
        setBooleanField(term56013, term56013.getClass(), "empty", false);
        setBooleanField(term56013, term56013.getClass(), "selfClosing", false);
        setBooleanField(term56013, term56013.getClass(), "preserveWhitespace", false);
        setBooleanField(term56013, term56013.getClass(), "formList", false);
        setBooleanField(term56013, term56013.getClass(), "formSubmit", false);
        setField(term56012, term56012.getClass(), "tag", term56013);
        setField(term56012, term56012.getClass(), "parentNode", null);
        setField(term56012, term56012.getClass(), "childNodes", null);
        setField(term56014, term56014.getClass(), "attributes", null);
        setField(term56012, term56012.getClass(), "attributes", term56014);
        setField(term56012, term56012.getClass(), "baseUri", null);
        setIntField(term56012, term56012.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55815;
        callMethod(klass, "equals", argTypes, term55643, args);
        assertTrue(recursiveEquals(term55643, term56007));
        assertTrue(recursiveEquals(term55815, term56012));
    }

};


