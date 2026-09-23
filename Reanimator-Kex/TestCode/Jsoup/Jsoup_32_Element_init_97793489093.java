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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.ArrayList;

public class Element_init_97793489093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term33;
     Object term9212;
     Object term9224;
     Object term9226;

    public Element_init_97793489093() {
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
        setBooleanField(term1, term1.getClass(), "canContainBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainInline", false);
        setBooleanField(term1, term1.getClass(), "empty", true);
        setBooleanField(term1, term1.getClass(), "selfClosing", true);
        setBooleanField(term1, term1.getClass(), "preserveWhitespace", true);
        LinkedHashMap term34 = new LinkedHashMap();
        term33 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term33, term33.getClass(), "attributes", term34);
        ArrayList term9216 = new ArrayList();
        LinkedHashMap term9219 = new LinkedHashMap();
        term9212 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9213 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9218 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9213, term9213.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term9213, term9213.getClass(), "isBlock", false);
        setBooleanField(term9213, term9213.getClass(), "formatAsBlock", false);
        setBooleanField(term9213, term9213.getClass(), "canContainBlock", false);
        setBooleanField(term9213, term9213.getClass(), "canContainInline", false);
        setBooleanField(term9213, term9213.getClass(), "empty", true);
        setBooleanField(term9213, term9213.getClass(), "selfClosing", true);
        setBooleanField(term9213, term9213.getClass(), "preserveWhitespace", true);
        setField(term9212, term9212.getClass(), "tag", term9213);
        setField(term9212, term9212.getClass(), "classNames", null);
        setField(term9212, term9212.getClass(), "parentNode", null);
        setField(term9212, term9212.getClass(), "childNodes", term9216);
        setField(term9218, term9218.getClass(), "attributes", term9219);
        setField(term9212, term9212.getClass(), "attributes", term9218);
        setField(term9212, term9212.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term9212, term9212.getClass(), "siblingIndex", 0);
        LinkedHashMap term9225 = new LinkedHashMap();
        term9224 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9224, term9224.getClass(), "attributes", term9225);
        term9226 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9226, term9226.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term9226, term9226.getClass(), "isBlock", false);
        setBooleanField(term9226, term9226.getClass(), "formatAsBlock", false);
        setBooleanField(term9226, term9226.getClass(), "canContainBlock", false);
        setBooleanField(term9226, term9226.getClass(), "canContainInline", false);
        setBooleanField(term9226, term9226.getClass(), "empty", true);
        setBooleanField(term9226, term9226.getClass(), "selfClosing", true);
        setBooleanField(term9226, term9226.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = term33;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9212));
        assertTrue(recursiveEquals(term1, "sjlJAEtRrb"));
        assertTrue(recursiveEquals(term33, term9226));
    }

};


