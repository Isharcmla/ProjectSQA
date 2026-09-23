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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_firstElementSibling_1098119627130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2804;

    public Element_firstElementSibling_1098119627130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2827 = new ArrayList();
        ((ArrayList) term2827).add((Object)null);
        ((ArrayList) term2827).add((Object)null);
        ((ArrayList) term2827).add((Object)null);
        ((ArrayList) term2827).add((Object)null);
        ((ArrayList) term2827).add((Object)null);
        LinkedHashMap term2832 = new LinkedHashMap();
        term2804 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2805 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2831 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2805, term2805.getClass(), "tagName", "PgPzMSEjjX");
        setBooleanField(term2805, term2805.getClass(), "isBlock", false);
        setBooleanField(term2805, term2805.getClass(), "formatAsBlock", true);
        setBooleanField(term2805, term2805.getClass(), "canContainBlock", false);
        setBooleanField(term2805, term2805.getClass(), "canContainInline", true);
        setBooleanField(term2805, term2805.getClass(), "empty", true);
        setBooleanField(term2805, term2805.getClass(), "selfClosing", false);
        setBooleanField(term2805, term2805.getClass(), "preserveWhitespace", true);
        setBooleanField(term2805, term2805.getClass(), "formList", false);
        setBooleanField(term2805, term2805.getClass(), "formSubmit", false);
        setField(term2804, term2804.getClass(), "tag", term2805);
        setField(term2804, term2804.getClass(), "parentNode", null);
        setField(term2804, term2804.getClass(), "childNodes", term2827);
        setField(term2831, term2831.getClass(), "attributes", term2832);
        setField(term2804, term2804.getClass(), "attributes", term2831);
        setField(term2804, term2804.getClass(), "baseUri", "HDaezxQfQR");
        setIntField(term2804, term2804.getClass(), "siblingIndex", -469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "firstElementSibling", argTypes, term2804, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


