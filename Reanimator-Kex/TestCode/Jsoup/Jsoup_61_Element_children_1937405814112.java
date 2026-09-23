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
import java.util.LinkedHashMap;

public class Element_children_1937405814112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term11208;
     Object term11154;

    public Element_children_1937405814112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1122 = new ArrayList();
        ((ArrayList) term1122).add((Object)null);
        ((ArrayList) term1122).add((Object)null);
        LinkedHashMap term1127 = new LinkedHashMap();
        term1100 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1126 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1101, term1101.getClass(), "tagName", "vQVyKLdtaz");
        setBooleanField(term1101, term1101.getClass(), "isBlock", false);
        setBooleanField(term1101, term1101.getClass(), "formatAsBlock", false);
        setBooleanField(term1101, term1101.getClass(), "canContainInline", false);
        setBooleanField(term1101, term1101.getClass(), "empty", false);
        setBooleanField(term1101, term1101.getClass(), "selfClosing", false);
        setBooleanField(term1101, term1101.getClass(), "preserveWhitespace", true);
        setBooleanField(term1101, term1101.getClass(), "formList", false);
        setBooleanField(term1101, term1101.getClass(), "formSubmit", false);
        setField(term1100, term1100.getClass(), "tag", term1101);
        setField(term1100, term1100.getClass(), "parentNode", null);
        setField(term1100, term1100.getClass(), "childNodes", term1122);
        setField(term1126, term1126.getClass(), "attributes", term1127);
        setField(term1100, term1100.getClass(), "attributes", term1126);
        setField(term1100, term1100.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term1100, term1100.getClass(), "siblingIndex", 1585847225);
        ArrayList term11212 = new ArrayList();
        ((ArrayList) term11212).add((Object)null);
        ((ArrayList) term11212).add((Object)null);
        LinkedHashMap term11215 = new LinkedHashMap();
        term11208 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11209 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11214 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11209, term11209.getClass(), "tagName", "vQVyKLdtaz");
        setBooleanField(term11209, term11209.getClass(), "isBlock", false);
        setBooleanField(term11209, term11209.getClass(), "formatAsBlock", false);
        setBooleanField(term11209, term11209.getClass(), "canContainInline", false);
        setBooleanField(term11209, term11209.getClass(), "empty", false);
        setBooleanField(term11209, term11209.getClass(), "selfClosing", false);
        setBooleanField(term11209, term11209.getClass(), "preserveWhitespace", true);
        setBooleanField(term11209, term11209.getClass(), "formList", false);
        setBooleanField(term11209, term11209.getClass(), "formSubmit", false);
        setField(term11208, term11208.getClass(), "tag", term11209);
        setField(term11208, term11208.getClass(), "parentNode", null);
        setField(term11208, term11208.getClass(), "childNodes", term11212);
        setField(term11214, term11214.getClass(), "attributes", term11215);
        setField(term11208, term11208.getClass(), "attributes", term11214);
        setField(term11208, term11208.getClass(), "baseUri", "VgZnGoIFwQ");
        setIntField(term11208, term11208.getClass(), "siblingIndex", 1585847225);
        term11154 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term11155 = (Object[]) newArray("java.lang.Object", 0);
        setField(term11154, term11154.getClass(), "elementData", term11155);
        setIntField(term11154, term11154.getClass(), "size", 0);
        setIntField(term11154, term11154.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1100, args);
        assertTrue(recursiveEquals(term1100, term11208));
        assertTrue(recursiveEquals(retValue, term11154));
    }

};


