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

public class Element_init_139062335893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term9218;
     Object term9229;

    public Element_init_139062335893() {
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
        ArrayList term9222 = new ArrayList();
        term9218 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9219 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9224 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9219, term9219.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term9219, term9219.getClass(), "isBlock", true);
        setBooleanField(term9219, term9219.getClass(), "formatAsBlock", false);
        setBooleanField(term9219, term9219.getClass(), "canContainBlock", true);
        setBooleanField(term9219, term9219.getClass(), "canContainInline", false);
        setBooleanField(term9219, term9219.getClass(), "empty", true);
        setBooleanField(term9219, term9219.getClass(), "selfClosing", false);
        setBooleanField(term9219, term9219.getClass(), "preserveWhitespace", false);
        setBooleanField(term9219, term9219.getClass(), "formList", true);
        setBooleanField(term9219, term9219.getClass(), "formSubmit", true);
        setField(term9218, term9218.getClass(), "tag", term9219);
        setField(term9218, term9218.getClass(), "classNames", null);
        setField(term9218, term9218.getClass(), "parentNode", null);
        setField(term9218, term9218.getClass(), "childNodes", term9222);
        setField(term9224, term9224.getClass(), "attributes", null);
        setField(term9218, term9218.getClass(), "attributes", term9224);
        setField(term9218, term9218.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term9218, term9218.getClass(), "siblingIndex", 0);
        term9229 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9229, term9229.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term9229, term9229.getClass(), "isBlock", true);
        setBooleanField(term9229, term9229.getClass(), "formatAsBlock", false);
        setBooleanField(term9229, term9229.getClass(), "canContainBlock", true);
        setBooleanField(term9229, term9229.getClass(), "canContainInline", false);
        setBooleanField(term9229, term9229.getClass(), "empty", true);
        setBooleanField(term9229, term9229.getClass(), "selfClosing", false);
        setBooleanField(term9229, term9229.getClass(), "preserveWhitespace", false);
        setBooleanField(term9229, term9229.getClass(), "formList", true);
        setBooleanField(term9229, term9229.getClass(), "formSubmit", true);
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
        assertTrue(recursiveEquals(instance, term9218));
        assertTrue(recursiveEquals(term80, "SzjVpOQTyS"));
    }

};


