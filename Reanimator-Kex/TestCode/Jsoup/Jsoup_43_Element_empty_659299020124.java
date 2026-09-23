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

public class Element_empty_659299020124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2350;
     Object term18071;
     Object term18024;

    public Element_empty_659299020124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2373 = new ArrayList();
        ((ArrayList) term2373).add((Object)null);
        ((ArrayList) term2373).add((Object)null);
        LinkedHashMap term2378 = new LinkedHashMap();
        term2350 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2351 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2351, term2351.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term2351, term2351.getClass(), "isBlock", false);
        setBooleanField(term2351, term2351.getClass(), "formatAsBlock", true);
        setBooleanField(term2351, term2351.getClass(), "canContainBlock", true);
        setBooleanField(term2351, term2351.getClass(), "canContainInline", false);
        setBooleanField(term2351, term2351.getClass(), "empty", true);
        setBooleanField(term2351, term2351.getClass(), "selfClosing", true);
        setBooleanField(term2351, term2351.getClass(), "preserveWhitespace", true);
        setBooleanField(term2351, term2351.getClass(), "formList", true);
        setBooleanField(term2351, term2351.getClass(), "formSubmit", true);
        setField(term2350, term2350.getClass(), "tag", term2351);
        setField(term2350, term2350.getClass(), "parentNode", null);
        setField(term2350, term2350.getClass(), "childNodes", term2373);
        setField(term2377, term2377.getClass(), "attributes", term2378);
        setField(term2350, term2350.getClass(), "attributes", term2377);
        setField(term2350, term2350.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term2350, term2350.getClass(), "siblingIndex", -1179120542);
        ArrayList term18075 = new ArrayList();
        LinkedHashMap term18078 = new LinkedHashMap();
        term18071 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18072 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18077 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18072, term18072.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term18072, term18072.getClass(), "isBlock", false);
        setBooleanField(term18072, term18072.getClass(), "formatAsBlock", true);
        setBooleanField(term18072, term18072.getClass(), "canContainBlock", true);
        setBooleanField(term18072, term18072.getClass(), "canContainInline", false);
        setBooleanField(term18072, term18072.getClass(), "empty", true);
        setBooleanField(term18072, term18072.getClass(), "selfClosing", true);
        setBooleanField(term18072, term18072.getClass(), "preserveWhitespace", true);
        setBooleanField(term18072, term18072.getClass(), "formList", true);
        setBooleanField(term18072, term18072.getClass(), "formSubmit", true);
        setField(term18071, term18071.getClass(), "tag", term18072);
        setField(term18071, term18071.getClass(), "parentNode", null);
        setField(term18071, term18071.getClass(), "childNodes", term18075);
        setField(term18077, term18077.getClass(), "attributes", term18078);
        setField(term18071, term18071.getClass(), "attributes", term18077);
        setField(term18071, term18071.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term18071, term18071.getClass(), "siblingIndex", -1179120542);
        ArrayList term18047 = new ArrayList();
        LinkedHashMap term18052 = new LinkedHashMap();
        term18024 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18025 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18051 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18025, term18025.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term18025, term18025.getClass(), "isBlock", false);
        setBooleanField(term18025, term18025.getClass(), "formatAsBlock", true);
        setBooleanField(term18025, term18025.getClass(), "canContainBlock", true);
        setBooleanField(term18025, term18025.getClass(), "canContainInline", false);
        setBooleanField(term18025, term18025.getClass(), "empty", true);
        setBooleanField(term18025, term18025.getClass(), "selfClosing", true);
        setBooleanField(term18025, term18025.getClass(), "preserveWhitespace", true);
        setBooleanField(term18025, term18025.getClass(), "formList", true);
        setBooleanField(term18025, term18025.getClass(), "formSubmit", true);
        setField(term18024, term18024.getClass(), "tag", term18025);
        setField(term18024, term18024.getClass(), "parentNode", null);
        setField(term18024, term18024.getClass(), "childNodes", term18047);
        setField(term18051, term18051.getClass(), "attributes", term18052);
        setField(term18024, term18024.getClass(), "attributes", term18051);
        setField(term18024, term18024.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term18024, term18024.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2350, args);
        assertTrue(recursiveEquals(term2350, term18071));
        assertTrue(recursiveEquals(retValue, term18024));
    }

};


