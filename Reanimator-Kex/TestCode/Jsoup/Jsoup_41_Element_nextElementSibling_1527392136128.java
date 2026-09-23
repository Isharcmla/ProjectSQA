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

public class Element_nextElementSibling_1527392136128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2660;
     Object term19571;

    public Element_nextElementSibling_1527392136128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2683 = new ArrayList();
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        ((ArrayList) term2683).add((Object)null);
        LinkedHashMap term2688 = new LinkedHashMap();
        term2660 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2661 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2687 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2661, term2661.getClass(), "tagName", "YpJbIgJWWv");
        setBooleanField(term2661, term2661.getClass(), "isBlock", false);
        setBooleanField(term2661, term2661.getClass(), "formatAsBlock", true);
        setBooleanField(term2661, term2661.getClass(), "canContainBlock", false);
        setBooleanField(term2661, term2661.getClass(), "canContainInline", false);
        setBooleanField(term2661, term2661.getClass(), "empty", true);
        setBooleanField(term2661, term2661.getClass(), "selfClosing", false);
        setBooleanField(term2661, term2661.getClass(), "preserveWhitespace", true);
        setBooleanField(term2661, term2661.getClass(), "formList", true);
        setBooleanField(term2661, term2661.getClass(), "formSubmit", false);
        setField(term2660, term2660.getClass(), "tag", term2661);
        setField(term2660, term2660.getClass(), "parentNode", null);
        setField(term2660, term2660.getClass(), "childNodes", term2683);
        setField(term2687, term2687.getClass(), "attributes", term2688);
        setField(term2660, term2660.getClass(), "attributes", term2687);
        setField(term2660, term2660.getClass(), "baseUri", "vKQukfbJUd");
        setIntField(term2660, term2660.getClass(), "siblingIndex", -1087774327);
        ArrayList term19575 = new ArrayList();
        ((ArrayList) term19575).add((Object)null);
        ((ArrayList) term19575).add((Object)null);
        ((ArrayList) term19575).add((Object)null);
        ((ArrayList) term19575).add((Object)null);
        ((ArrayList) term19575).add((Object)null);
        LinkedHashMap term19578 = new LinkedHashMap();
        term19571 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19572 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19577 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19572, term19572.getClass(), "tagName", "YpJbIgJWWv");
        setBooleanField(term19572, term19572.getClass(), "isBlock", false);
        setBooleanField(term19572, term19572.getClass(), "formatAsBlock", true);
        setBooleanField(term19572, term19572.getClass(), "canContainBlock", false);
        setBooleanField(term19572, term19572.getClass(), "canContainInline", false);
        setBooleanField(term19572, term19572.getClass(), "empty", true);
        setBooleanField(term19572, term19572.getClass(), "selfClosing", false);
        setBooleanField(term19572, term19572.getClass(), "preserveWhitespace", true);
        setBooleanField(term19572, term19572.getClass(), "formList", true);
        setBooleanField(term19572, term19572.getClass(), "formSubmit", false);
        setField(term19571, term19571.getClass(), "tag", term19572);
        setField(term19571, term19571.getClass(), "parentNode", null);
        setField(term19571, term19571.getClass(), "childNodes", term19575);
        setField(term19577, term19577.getClass(), "attributes", term19578);
        setField(term19571, term19571.getClass(), "attributes", term19577);
        setField(term19571, term19571.getClass(), "baseUri", "vKQukfbJUd");
        setIntField(term19571, term19571.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term2660, args);
        assertTrue(recursiveEquals(term2660, term19571));
        assertTrue(recursiveEquals(retValue, null));
    }

};


