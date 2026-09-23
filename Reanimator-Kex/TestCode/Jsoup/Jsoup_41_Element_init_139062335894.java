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
import java.util.ArrayList;

public class Element_init_139062335894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term8554;
     Object term8565;

    public Element_init_139062335894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term80, term80.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term80, term80.getClass(), "isBlock", true);
        setBooleanField(term80, term80.getClass(), "formatAsBlock", false);
        setBooleanField(term80, term80.getClass(), "canContainBlock", true);
        setBooleanField(term80, term80.getClass(), "canContainInline", false);
        setBooleanField(term80, term80.getClass(), "empty", true);
        setBooleanField(term80, term80.getClass(), "selfClosing", false);
        setBooleanField(term80, term80.getClass(), "preserveWhitespace", false);
        setBooleanField(term80, term80.getClass(), "formList", true);
        setBooleanField(term80, term80.getClass(), "formSubmit", true);
        ArrayList term8558 = new ArrayList();
        term8554 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8560 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8555, term8555.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term8555, term8555.getClass(), "isBlock", true);
        setBooleanField(term8555, term8555.getClass(), "formatAsBlock", false);
        setBooleanField(term8555, term8555.getClass(), "canContainBlock", true);
        setBooleanField(term8555, term8555.getClass(), "canContainInline", false);
        setBooleanField(term8555, term8555.getClass(), "empty", true);
        setBooleanField(term8555, term8555.getClass(), "selfClosing", false);
        setBooleanField(term8555, term8555.getClass(), "preserveWhitespace", false);
        setBooleanField(term8555, term8555.getClass(), "formList", true);
        setBooleanField(term8555, term8555.getClass(), "formSubmit", true);
        setField(term8554, term8554.getClass(), "tag", term8555);
        setField(term8554, term8554.getClass(), "parentNode", null);
        setField(term8554, term8554.getClass(), "childNodes", term8558);
        setField(term8560, term8560.getClass(), "attributes", null);
        setField(term8554, term8554.getClass(), "attributes", term8560);
        setField(term8554, term8554.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term8554, term8554.getClass(), "siblingIndex", 0);
        term8565 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8565, term8565.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term8565, term8565.getClass(), "isBlock", true);
        setBooleanField(term8565, term8565.getClass(), "formatAsBlock", false);
        setBooleanField(term8565, term8565.getClass(), "canContainBlock", true);
        setBooleanField(term8565, term8565.getClass(), "canContainInline", false);
        setBooleanField(term8565, term8565.getClass(), "empty", true);
        setBooleanField(term8565, term8565.getClass(), "selfClosing", false);
        setBooleanField(term8565, term8565.getClass(), "preserveWhitespace", false);
        setBooleanField(term8565, term8565.getClass(), "formList", true);
        setBooleanField(term8565, term8565.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term80;
        args[1] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8554));
        assertTrue(recursiveEquals(term80, "SzjVpOQTyS"));
    }

};


