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

public class FormElement_equals_817636276143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60934;
     Object term61106;
     Object term61296;
     Object term61301;

    public FormElement_equals_817636276143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60934 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61135 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term61038 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term60934, term60934.getClass(), "childNodes", null);
        setField(term60934, term60934.getClass(), "attributes", term61135);
        setField(term61038, term61038.getClass(), "tagName", "");
        setBooleanField(term61038, term61038.getClass(), "canContainBlock", false);
        setBooleanField(term61038, term61038.getClass(), "canContainInline", true);
        setField(term60934, term60934.getClass(), "tag", term61038);
        term61106 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61181 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term61106, term61106.getClass(), "childNodes", null);
        setField(term61106, term61106.getClass(), "attributes", term61135);
        setField(term61181, term61181.getClass(), "tagName", "");
        setBooleanField(term61181, term61181.getClass(), "canContainBlock", false);
        setBooleanField(term61181, term61181.getClass(), "canContainInline", false);
        setField(term61106, term61106.getClass(), "tag", term61181);
        term61296 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61297 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term61296, term61296.getClass(), "elements", null);
        setField(term61297, term61297.getClass(), "tagName", "");
        setBooleanField(term61297, term61297.getClass(), "isBlock", false);
        setBooleanField(term61297, term61297.getClass(), "formatAsBlock", false);
        setBooleanField(term61297, term61297.getClass(), "canContainBlock", false);
        setBooleanField(term61297, term61297.getClass(), "canContainInline", true);
        setBooleanField(term61297, term61297.getClass(), "empty", false);
        setBooleanField(term61297, term61297.getClass(), "selfClosing", false);
        setBooleanField(term61297, term61297.getClass(), "preserveWhitespace", false);
        setBooleanField(term61297, term61297.getClass(), "formList", false);
        setBooleanField(term61297, term61297.getClass(), "formSubmit", false);
        setField(term61296, term61296.getClass(), "tag", term61297);
        setField(term61296, term61296.getClass(), "parentNode", null);
        setField(term61296, term61296.getClass(), "childNodes", null);
        setField(term61300, term61300.getClass(), "attributes", null);
        setField(term61296, term61296.getClass(), "attributes", term61300);
        setField(term61296, term61296.getClass(), "baseUri", null);
        setIntField(term61296, term61296.getClass(), "siblingIndex", 0);
        term61301 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term61305 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term61301, term61301.getClass(), "elements", null);
        setField(term61302, term61302.getClass(), "tagName", "");
        setBooleanField(term61302, term61302.getClass(), "isBlock", false);
        setBooleanField(term61302, term61302.getClass(), "formatAsBlock", false);
        setBooleanField(term61302, term61302.getClass(), "canContainBlock", false);
        setBooleanField(term61302, term61302.getClass(), "canContainInline", false);
        setBooleanField(term61302, term61302.getClass(), "empty", false);
        setBooleanField(term61302, term61302.getClass(), "selfClosing", false);
        setBooleanField(term61302, term61302.getClass(), "preserveWhitespace", false);
        setBooleanField(term61302, term61302.getClass(), "formList", false);
        setBooleanField(term61302, term61302.getClass(), "formSubmit", false);
        setField(term61301, term61301.getClass(), "tag", term61302);
        setField(term61301, term61301.getClass(), "parentNode", null);
        setField(term61301, term61301.getClass(), "childNodes", null);
        setField(term61305, term61305.getClass(), "attributes", null);
        setField(term61301, term61301.getClass(), "attributes", term61305);
        setField(term61301, term61301.getClass(), "baseUri", null);
        setIntField(term61301, term61301.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61106;
        callMethod(klass, "equals", argTypes, term60934, args);
        assertTrue(recursiveEquals(term60934, term61296));
        assertTrue(recursiveEquals(term61106, term61301));
    }

};


