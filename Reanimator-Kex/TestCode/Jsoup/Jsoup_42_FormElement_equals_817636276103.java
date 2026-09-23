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

public class FormElement_equals_817636276103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46256;
     Object term46370;
     Object term46531;
     Object term46535;

    public FormElement_equals_817636276103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46256 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term46302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46256, term46256.getClass(), "childNodes", null);
        setField(term46256, term46256.getClass(), "attributes", null);
        setField(term46302, term46302.getClass(), "tagName", "");
        setBooleanField(term46302, term46302.getClass(), "canContainBlock", true);
        setBooleanField(term46302, term46302.getClass(), "canContainInline", true);
        setBooleanField(term46302, term46302.getClass(), "empty", true);
        setBooleanField(term46302, term46302.getClass(), "formatAsBlock", true);
        setBooleanField(term46302, term46302.getClass(), "isBlock", true);
        setBooleanField(term46302, term46302.getClass(), "preserveWhitespace", false);
        setField(term46256, term46256.getClass(), "tag", term46302);
        term46370 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term46416 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46370, term46370.getClass(), "childNodes", null);
        setField(term46370, term46370.getClass(), "attributes", null);
        setField(term46416, term46416.getClass(), "tagName", "");
        setBooleanField(term46416, term46416.getClass(), "canContainBlock", true);
        setBooleanField(term46416, term46416.getClass(), "canContainInline", true);
        setBooleanField(term46416, term46416.getClass(), "empty", true);
        setBooleanField(term46416, term46416.getClass(), "formatAsBlock", true);
        setBooleanField(term46416, term46416.getClass(), "isBlock", true);
        setBooleanField(term46416, term46416.getClass(), "preserveWhitespace", true);
        setField(term46370, term46370.getClass(), "tag", term46416);
        term46531 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term46532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46531, term46531.getClass(), "elements", null);
        setField(term46532, term46532.getClass(), "tagName", "");
        setBooleanField(term46532, term46532.getClass(), "isBlock", true);
        setBooleanField(term46532, term46532.getClass(), "formatAsBlock", true);
        setBooleanField(term46532, term46532.getClass(), "canContainBlock", true);
        setBooleanField(term46532, term46532.getClass(), "canContainInline", true);
        setBooleanField(term46532, term46532.getClass(), "empty", true);
        setBooleanField(term46532, term46532.getClass(), "selfClosing", false);
        setBooleanField(term46532, term46532.getClass(), "preserveWhitespace", false);
        setBooleanField(term46532, term46532.getClass(), "formList", false);
        setBooleanField(term46532, term46532.getClass(), "formSubmit", false);
        setField(term46531, term46531.getClass(), "tag", term46532);
        setField(term46531, term46531.getClass(), "parentNode", null);
        setField(term46531, term46531.getClass(), "childNodes", null);
        setField(term46531, term46531.getClass(), "attributes", null);
        setField(term46531, term46531.getClass(), "baseUri", null);
        setIntField(term46531, term46531.getClass(), "siblingIndex", 0);
        term46535 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term46536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46535, term46535.getClass(), "elements", null);
        setField(term46536, term46536.getClass(), "tagName", "");
        setBooleanField(term46536, term46536.getClass(), "isBlock", true);
        setBooleanField(term46536, term46536.getClass(), "formatAsBlock", true);
        setBooleanField(term46536, term46536.getClass(), "canContainBlock", true);
        setBooleanField(term46536, term46536.getClass(), "canContainInline", true);
        setBooleanField(term46536, term46536.getClass(), "empty", true);
        setBooleanField(term46536, term46536.getClass(), "selfClosing", false);
        setBooleanField(term46536, term46536.getClass(), "preserveWhitespace", true);
        setBooleanField(term46536, term46536.getClass(), "formList", false);
        setBooleanField(term46536, term46536.getClass(), "formSubmit", false);
        setField(term46535, term46535.getClass(), "tag", term46536);
        setField(term46535, term46535.getClass(), "parentNode", null);
        setField(term46535, term46535.getClass(), "childNodes", null);
        setField(term46535, term46535.getClass(), "attributes", null);
        setField(term46535, term46535.getClass(), "baseUri", null);
        setIntField(term46535, term46535.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term46370;
        callMethod(klass, "equals", argTypes, term46256, args);
        assertTrue(recursiveEquals(term46256, term46531));
        assertTrue(recursiveEquals(term46370, term46535));
    }

};


