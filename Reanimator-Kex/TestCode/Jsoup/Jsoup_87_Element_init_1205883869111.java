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

public class Element_init_1205883869111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56061;

    public Element_init_1205883869111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56061 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56062 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56065 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term56066 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56067 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56068 = (Object[]) newArray("java.lang.String", 0);
        setField(term56062, term56062.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term56062, term56062.getClass(), "isBlock", false);
        setBooleanField(term56062, term56062.getClass(), "formatAsBlock", true);
        setBooleanField(term56062, term56062.getClass(), "canContainInline", true);
        setBooleanField(term56062, term56062.getClass(), "empty", false);
        setBooleanField(term56062, term56062.getClass(), "selfClosing", false);
        setBooleanField(term56062, term56062.getClass(), "preserveWhitespace", false);
        setBooleanField(term56062, term56062.getClass(), "formList", false);
        setBooleanField(term56062, term56062.getClass(), "formSubmit", false);
        setField(term56061, term56061.getClass(), "tag", term56062);
        setField(term56061, term56061.getClass(), "shadowChildrenRef", null);
        setIntField(term56065, term56065.getClass(), "modCount", 0);
        setField(term56061, term56061.getClass(), "childNodes", term56065);
        setIntField(term56066, term56066.getClass(), "size", 0);
        setField(term56066, term56066.getClass(), "keys", term56067);
        setField(term56066, term56066.getClass(), "vals", term56068);
        setField(term56061, term56061.getClass(), "attributes", term56066);
        setField(term56061, term56061.getClass(), "baseUri", "");
        setField(term56061, term56061.getClass(), "parentNode", null);
        setIntField(term56061, term56061.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56061));
    }

};


