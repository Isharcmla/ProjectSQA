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

public class FormElement_equals_817636276105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46948;
     Object term47062;
     Object term47220;
     Object term47224;

    public FormElement_equals_817636276105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46948 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term46994 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46948, term46948.getClass(), "childNodes", null);
        setField(term46948, term46948.getClass(), "attributes", null);
        setField(term46994, term46994.getClass(), "tagName", "");
        setBooleanField(term46994, term46994.getClass(), "canContainBlock", true);
        setBooleanField(term46994, term46994.getClass(), "canContainInline", true);
        setBooleanField(term46994, term46994.getClass(), "empty", false);
        setField(term46948, term46948.getClass(), "tag", term46994);
        term47062 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47108 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47062, term47062.getClass(), "childNodes", null);
        setField(term47062, term47062.getClass(), "attributes", null);
        setField(term47108, term47108.getClass(), "tagName", "");
        setBooleanField(term47108, term47108.getClass(), "canContainBlock", true);
        setBooleanField(term47108, term47108.getClass(), "canContainInline", true);
        setBooleanField(term47108, term47108.getClass(), "empty", true);
        setField(term47062, term47062.getClass(), "tag", term47108);
        term47220 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47221 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47220, term47220.getClass(), "elements", null);
        setField(term47221, term47221.getClass(), "tagName", "");
        setBooleanField(term47221, term47221.getClass(), "isBlock", false);
        setBooleanField(term47221, term47221.getClass(), "formatAsBlock", false);
        setBooleanField(term47221, term47221.getClass(), "canContainBlock", true);
        setBooleanField(term47221, term47221.getClass(), "canContainInline", true);
        setBooleanField(term47221, term47221.getClass(), "empty", false);
        setBooleanField(term47221, term47221.getClass(), "selfClosing", false);
        setBooleanField(term47221, term47221.getClass(), "preserveWhitespace", false);
        setBooleanField(term47221, term47221.getClass(), "formList", false);
        setBooleanField(term47221, term47221.getClass(), "formSubmit", false);
        setField(term47220, term47220.getClass(), "tag", term47221);
        setField(term47220, term47220.getClass(), "parentNode", null);
        setField(term47220, term47220.getClass(), "childNodes", null);
        setField(term47220, term47220.getClass(), "attributes", null);
        setField(term47220, term47220.getClass(), "baseUri", null);
        setIntField(term47220, term47220.getClass(), "siblingIndex", 0);
        term47224 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term47225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47224, term47224.getClass(), "elements", null);
        setField(term47225, term47225.getClass(), "tagName", "");
        setBooleanField(term47225, term47225.getClass(), "isBlock", false);
        setBooleanField(term47225, term47225.getClass(), "formatAsBlock", false);
        setBooleanField(term47225, term47225.getClass(), "canContainBlock", true);
        setBooleanField(term47225, term47225.getClass(), "canContainInline", true);
        setBooleanField(term47225, term47225.getClass(), "empty", true);
        setBooleanField(term47225, term47225.getClass(), "selfClosing", false);
        setBooleanField(term47225, term47225.getClass(), "preserveWhitespace", false);
        setBooleanField(term47225, term47225.getClass(), "formList", false);
        setBooleanField(term47225, term47225.getClass(), "formSubmit", false);
        setField(term47224, term47224.getClass(), "tag", term47225);
        setField(term47224, term47224.getClass(), "parentNode", null);
        setField(term47224, term47224.getClass(), "childNodes", null);
        setField(term47224, term47224.getClass(), "attributes", null);
        setField(term47224, term47224.getClass(), "baseUri", null);
        setIntField(term47224, term47224.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47062;
        callMethod(klass, "equals", argTypes, term46948, args);
        assertTrue(recursiveEquals(term46948, term47220));
        assertTrue(recursiveEquals(term47062, term47224));
    }

};


