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

public class Element_textNodes_938431844113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;
     Object term11316;
     Object term11265;

    public Element_textNodes_938431844113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1193 = new ArrayList();
        ((ArrayList) term1193).add((Object)null);
        ((ArrayList) term1193).add((Object)null);
        ((ArrayList) term1193).add((Object)null);
        LinkedHashMap term1198 = new LinkedHashMap();
        term1171 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1172 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1197 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1172, term1172.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term1172, term1172.getClass(), "isBlock", true);
        setBooleanField(term1172, term1172.getClass(), "formatAsBlock", true);
        setBooleanField(term1172, term1172.getClass(), "canContainInline", false);
        setBooleanField(term1172, term1172.getClass(), "empty", false);
        setBooleanField(term1172, term1172.getClass(), "selfClosing", true);
        setBooleanField(term1172, term1172.getClass(), "preserveWhitespace", false);
        setBooleanField(term1172, term1172.getClass(), "formList", true);
        setBooleanField(term1172, term1172.getClass(), "formSubmit", false);
        setField(term1171, term1171.getClass(), "tag", term1172);
        setField(term1171, term1171.getClass(), "parentNode", null);
        setField(term1171, term1171.getClass(), "childNodes", term1193);
        setField(term1197, term1197.getClass(), "attributes", term1198);
        setField(term1171, term1171.getClass(), "attributes", term1197);
        setField(term1171, term1171.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term1171, term1171.getClass(), "siblingIndex", 597278769);
        ArrayList term11320 = new ArrayList();
        ((ArrayList) term11320).add((Object)null);
        ((ArrayList) term11320).add((Object)null);
        ((ArrayList) term11320).add((Object)null);
        LinkedHashMap term11323 = new LinkedHashMap();
        term11316 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11317 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11322 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11317, term11317.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term11317, term11317.getClass(), "isBlock", true);
        setBooleanField(term11317, term11317.getClass(), "formatAsBlock", true);
        setBooleanField(term11317, term11317.getClass(), "canContainInline", false);
        setBooleanField(term11317, term11317.getClass(), "empty", false);
        setBooleanField(term11317, term11317.getClass(), "selfClosing", true);
        setBooleanField(term11317, term11317.getClass(), "preserveWhitespace", false);
        setBooleanField(term11317, term11317.getClass(), "formList", true);
        setBooleanField(term11317, term11317.getClass(), "formSubmit", false);
        setField(term11316, term11316.getClass(), "tag", term11317);
        setField(term11316, term11316.getClass(), "parentNode", null);
        setField(term11316, term11316.getClass(), "childNodes", term11320);
        setField(term11322, term11322.getClass(), "attributes", term11323);
        setField(term11316, term11316.getClass(), "attributes", term11322);
        setField(term11316, term11316.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term11316, term11316.getClass(), "siblingIndex", 597278769);
        ArrayList term11266 = new ArrayList();
        term11265 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11265, term11265.getClass(), "list", term11266);
        setField(term11265, term11265.getClass(), "c", term11266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1171, args);
        assertTrue(recursiveEquals(term1171, term11316));
        assertTrue(recursiveEquals(retValue, term11265));
    }

};


