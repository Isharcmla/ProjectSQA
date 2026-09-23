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

public class FormElement_init_3636430785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term34;
     Object term472;
     Object term484;
     Object term489;

    public FormElement_init_3636430785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1, term1.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "isBlock", false);
        setBooleanField(term1, term1.getClass(), "formatAsBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainInline", false);
        setBooleanField(term1, term1.getClass(), "empty", false);
        setBooleanField(term1, term1.getClass(), "selfClosing", true);
        setBooleanField(term1, term1.getClass(), "preserveWhitespace", true);
        setBooleanField(term1, term1.getClass(), "formList", true);
        setBooleanField(term1, term1.getClass(), "formSubmit", true);
        term34 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term36 = (Object[]) newArray("java.lang.String", 0);
        Object[] term37 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term34, term34.getClass(), "size", 568599855);
        setField(term34, term34.getClass(), "keys", term36);
        setField(term34, term34.getClass(), "vals", term37);
        term472 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term473 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term474 = (Object[]) newArray("java.lang.Object", 0);
        Object term475 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term478 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term479 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term480 = (Object[]) newArray("java.lang.String", 0);
        Object[] term481 = (Object[]) newArray("java.lang.String", 0);
        setField(term473, term473.getClass(), "elementData", term474);
        setIntField(term473, term473.getClass(), "size", 0);
        setIntField(term473, term473.getClass(), "modCount", 0);
        setField(term472, term472.getClass(), "elements", term473);
        setField(term475, term475.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term475, term475.getClass(), "isBlock", false);
        setBooleanField(term475, term475.getClass(), "formatAsBlock", false);
        setBooleanField(term475, term475.getClass(), "canContainInline", false);
        setBooleanField(term475, term475.getClass(), "empty", false);
        setBooleanField(term475, term475.getClass(), "selfClosing", true);
        setBooleanField(term475, term475.getClass(), "preserveWhitespace", true);
        setBooleanField(term475, term475.getClass(), "formList", true);
        setBooleanField(term475, term475.getClass(), "formSubmit", true);
        setField(term472, term472.getClass(), "tag", term475);
        setField(term472, term472.getClass(), "shadowChildrenRef", null);
        setIntField(term478, term478.getClass(), "modCount", 0);
        setField(term472, term472.getClass(), "childNodes", term478);
        setIntField(term479, term479.getClass(), "size", 568599855);
        setField(term479, term479.getClass(), "keys", term480);
        setField(term479, term479.getClass(), "vals", term481);
        setField(term472, term472.getClass(), "attributes", term479);
        setField(term472, term472.getClass(), "baseUri", "sjlJAEtRrb");
        setField(term472, term472.getClass(), "parentNode", null);
        setIntField(term472, term472.getClass(), "siblingIndex", 0);
        term484 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term484, term484.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term484, term484.getClass(), "isBlock", false);
        setBooleanField(term484, term484.getClass(), "formatAsBlock", false);
        setBooleanField(term484, term484.getClass(), "canContainInline", false);
        setBooleanField(term484, term484.getClass(), "empty", false);
        setBooleanField(term484, term484.getClass(), "selfClosing", true);
        setBooleanField(term484, term484.getClass(), "preserveWhitespace", true);
        setBooleanField(term484, term484.getClass(), "formList", true);
        setBooleanField(term484, term484.getClass(), "formSubmit", true);
        term489 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term490 = (Object[]) newArray("java.lang.String", 0);
        Object[] term491 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term489, term489.getClass(), "size", 568599855);
        setField(term489, term489.getClass(), "keys", term490);
        setField(term489, term489.getClass(), "vals", term491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = term34;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term472));
        assertTrue(recursiveEquals(term1, term484));
        assertTrue(recursiveEquals(term34, term489));
    }

};


