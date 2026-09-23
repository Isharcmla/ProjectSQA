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
     Object term19392;

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
        ArrayList term19396 = new ArrayList();
        ((ArrayList) term19396).add((Object)null);
        ((ArrayList) term19396).add((Object)null);
        ((ArrayList) term19396).add((Object)null);
        ((ArrayList) term19396).add((Object)null);
        ((ArrayList) term19396).add((Object)null);
        LinkedHashMap term19399 = new LinkedHashMap();
        term19392 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19393 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19398 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19393, term19393.getClass(), "tagName", "YpJbIgJWWv");
        setBooleanField(term19393, term19393.getClass(), "isBlock", false);
        setBooleanField(term19393, term19393.getClass(), "formatAsBlock", true);
        setBooleanField(term19393, term19393.getClass(), "canContainBlock", false);
        setBooleanField(term19393, term19393.getClass(), "canContainInline", false);
        setBooleanField(term19393, term19393.getClass(), "empty", true);
        setBooleanField(term19393, term19393.getClass(), "selfClosing", false);
        setBooleanField(term19393, term19393.getClass(), "preserveWhitespace", true);
        setBooleanField(term19393, term19393.getClass(), "formList", true);
        setBooleanField(term19393, term19393.getClass(), "formSubmit", false);
        setField(term19392, term19392.getClass(), "tag", term19393);
        setField(term19392, term19392.getClass(), "parentNode", null);
        setField(term19392, term19392.getClass(), "childNodes", term19396);
        setField(term19398, term19398.getClass(), "attributes", term19399);
        setField(term19392, term19392.getClass(), "attributes", term19398);
        setField(term19392, term19392.getClass(), "baseUri", "vKQukfbJUd");
        setIntField(term19392, term19392.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term2660, args);
        assertTrue(recursiveEquals(term2660, term19392));
        assertTrue(recursiveEquals(retValue, null));
    }

};


