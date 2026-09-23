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

public class Element_previousElementSibling_1256357764129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2732;
     Object term19669;

    public Element_previousElementSibling_1256357764129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2755 = new ArrayList();
        ((ArrayList) term2755).add((Object)null);
        ((ArrayList) term2755).add((Object)null);
        ((ArrayList) term2755).add((Object)null);
        LinkedHashMap term2760 = new LinkedHashMap();
        term2732 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2759 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2733, term2733.getClass(), "tagName", "lFRJFUMVbx");
        setBooleanField(term2733, term2733.getClass(), "isBlock", false);
        setBooleanField(term2733, term2733.getClass(), "formatAsBlock", true);
        setBooleanField(term2733, term2733.getClass(), "canContainBlock", true);
        setBooleanField(term2733, term2733.getClass(), "canContainInline", false);
        setBooleanField(term2733, term2733.getClass(), "empty", true);
        setBooleanField(term2733, term2733.getClass(), "selfClosing", true);
        setBooleanField(term2733, term2733.getClass(), "preserveWhitespace", false);
        setBooleanField(term2733, term2733.getClass(), "formList", true);
        setBooleanField(term2733, term2733.getClass(), "formSubmit", true);
        setField(term2732, term2732.getClass(), "tag", term2733);
        setField(term2732, term2732.getClass(), "parentNode", null);
        setField(term2732, term2732.getClass(), "childNodes", term2755);
        setField(term2759, term2759.getClass(), "attributes", term2760);
        setField(term2732, term2732.getClass(), "attributes", term2759);
        setField(term2732, term2732.getClass(), "baseUri", "DhjNLmRMCu");
        setIntField(term2732, term2732.getClass(), "siblingIndex", -1530420153);
        ArrayList term19673 = new ArrayList();
        ((ArrayList) term19673).add((Object)null);
        ((ArrayList) term19673).add((Object)null);
        ((ArrayList) term19673).add((Object)null);
        LinkedHashMap term19676 = new LinkedHashMap();
        term19669 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19670 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19675 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19670, term19670.getClass(), "tagName", "lFRJFUMVbx");
        setBooleanField(term19670, term19670.getClass(), "isBlock", false);
        setBooleanField(term19670, term19670.getClass(), "formatAsBlock", true);
        setBooleanField(term19670, term19670.getClass(), "canContainBlock", true);
        setBooleanField(term19670, term19670.getClass(), "canContainInline", false);
        setBooleanField(term19670, term19670.getClass(), "empty", true);
        setBooleanField(term19670, term19670.getClass(), "selfClosing", true);
        setBooleanField(term19670, term19670.getClass(), "preserveWhitespace", false);
        setBooleanField(term19670, term19670.getClass(), "formList", true);
        setBooleanField(term19670, term19670.getClass(), "formSubmit", true);
        setField(term19669, term19669.getClass(), "tag", term19670);
        setField(term19669, term19669.getClass(), "parentNode", null);
        setField(term19669, term19669.getClass(), "childNodes", term19673);
        setField(term19675, term19675.getClass(), "attributes", term19676);
        setField(term19669, term19669.getClass(), "attributes", term19675);
        setField(term19669, term19669.getClass(), "baseUri", "DhjNLmRMCu");
        setIntField(term19669, term19669.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "previousElementSibling", argTypes, term2732, args);
        assertTrue(recursiveEquals(term2732, term19669));
        assertTrue(recursiveEquals(retValue, null));
    }

};


