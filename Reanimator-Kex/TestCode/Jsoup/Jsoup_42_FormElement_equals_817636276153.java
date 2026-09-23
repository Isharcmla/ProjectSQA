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

public class FormElement_equals_817636276153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65236;
     Object term65408;
     Object term65601;
     Object term65606;

    public FormElement_equals_817636276153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65236 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term65437 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term65340 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term65236, term65236.getClass(), "childNodes", null);
        setField(term65236, term65236.getClass(), "attributes", term65437);
        setField(term65340, term65340.getClass(), "tagName", "");
        setBooleanField(term65340, term65340.getClass(), "canContainBlock", false);
        setBooleanField(term65340, term65340.getClass(), "canContainInline", true);
        setBooleanField(term65340, term65340.getClass(), "empty", false);
        setBooleanField(term65340, term65340.getClass(), "formatAsBlock", true);
        setBooleanField(term65340, term65340.getClass(), "isBlock", false);
        setField(term65236, term65236.getClass(), "tag", term65340);
        term65408 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term65483 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term65408, term65408.getClass(), "childNodes", null);
        setField(term65408, term65408.getClass(), "attributes", term65437);
        setField(term65483, term65483.getClass(), "tagName", "");
        setBooleanField(term65483, term65483.getClass(), "canContainBlock", false);
        setBooleanField(term65483, term65483.getClass(), "canContainInline", true);
        setBooleanField(term65483, term65483.getClass(), "empty", false);
        setBooleanField(term65483, term65483.getClass(), "formatAsBlock", true);
        setBooleanField(term65483, term65483.getClass(), "isBlock", true);
        setField(term65408, term65408.getClass(), "tag", term65483);
        term65601 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term65602 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term65605 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term65601, term65601.getClass(), "elements", null);
        setField(term65602, term65602.getClass(), "tagName", "");
        setBooleanField(term65602, term65602.getClass(), "isBlock", false);
        setBooleanField(term65602, term65602.getClass(), "formatAsBlock", true);
        setBooleanField(term65602, term65602.getClass(), "canContainBlock", false);
        setBooleanField(term65602, term65602.getClass(), "canContainInline", true);
        setBooleanField(term65602, term65602.getClass(), "empty", false);
        setBooleanField(term65602, term65602.getClass(), "selfClosing", false);
        setBooleanField(term65602, term65602.getClass(), "preserveWhitespace", false);
        setBooleanField(term65602, term65602.getClass(), "formList", false);
        setBooleanField(term65602, term65602.getClass(), "formSubmit", false);
        setField(term65601, term65601.getClass(), "tag", term65602);
        setField(term65601, term65601.getClass(), "parentNode", null);
        setField(term65601, term65601.getClass(), "childNodes", null);
        setField(term65605, term65605.getClass(), "attributes", null);
        setField(term65601, term65601.getClass(), "attributes", term65605);
        setField(term65601, term65601.getClass(), "baseUri", null);
        setIntField(term65601, term65601.getClass(), "siblingIndex", 0);
        term65606 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term65607 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term65610 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term65606, term65606.getClass(), "elements", null);
        setField(term65607, term65607.getClass(), "tagName", "");
        setBooleanField(term65607, term65607.getClass(), "isBlock", true);
        setBooleanField(term65607, term65607.getClass(), "formatAsBlock", true);
        setBooleanField(term65607, term65607.getClass(), "canContainBlock", false);
        setBooleanField(term65607, term65607.getClass(), "canContainInline", true);
        setBooleanField(term65607, term65607.getClass(), "empty", false);
        setBooleanField(term65607, term65607.getClass(), "selfClosing", false);
        setBooleanField(term65607, term65607.getClass(), "preserveWhitespace", false);
        setBooleanField(term65607, term65607.getClass(), "formList", false);
        setBooleanField(term65607, term65607.getClass(), "formSubmit", false);
        setField(term65606, term65606.getClass(), "tag", term65607);
        setField(term65606, term65606.getClass(), "parentNode", null);
        setField(term65606, term65606.getClass(), "childNodes", null);
        setField(term65610, term65610.getClass(), "attributes", null);
        setField(term65606, term65606.getClass(), "attributes", term65610);
        setField(term65606, term65606.getClass(), "baseUri", null);
        setIntField(term65606, term65606.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65408;
        callMethod(klass, "equals", argTypes, term65236, args);
        assertTrue(recursiveEquals(term65236, term65601));
        assertTrue(recursiveEquals(term65408, term65606));
    }

};


