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

public class Element_parent_836683031108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;
     Object term10311;

    public Element_parent_836683031108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term905 = new ArrayList();
        ((ArrayList) term905).add((Object)null);
        LinkedHashMap term910 = new LinkedHashMap();
        term883 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term884 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term884, term884.getClass(), "tagName", "MLqYREekMl");
        setBooleanField(term884, term884.getClass(), "isBlock", true);
        setBooleanField(term884, term884.getClass(), "formatAsBlock", true);
        setBooleanField(term884, term884.getClass(), "canContainInline", true);
        setBooleanField(term884, term884.getClass(), "empty", true);
        setBooleanField(term884, term884.getClass(), "selfClosing", true);
        setBooleanField(term884, term884.getClass(), "preserveWhitespace", false);
        setBooleanField(term884, term884.getClass(), "formList", false);
        setBooleanField(term884, term884.getClass(), "formSubmit", true);
        setField(term883, term883.getClass(), "tag", term884);
        setField(term883, term883.getClass(), "parentNode", null);
        setField(term883, term883.getClass(), "childNodes", term905);
        setField(term909, term909.getClass(), "attributes", term910);
        setField(term883, term883.getClass(), "attributes", term909);
        setField(term883, term883.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term883, term883.getClass(), "siblingIndex", -1339778481);
        ArrayList term10315 = new ArrayList();
        ((ArrayList) term10315).add((Object)null);
        LinkedHashMap term10318 = new LinkedHashMap();
        term10311 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10312 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10317 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10312, term10312.getClass(), "tagName", "MLqYREekMl");
        setBooleanField(term10312, term10312.getClass(), "isBlock", true);
        setBooleanField(term10312, term10312.getClass(), "formatAsBlock", true);
        setBooleanField(term10312, term10312.getClass(), "canContainInline", true);
        setBooleanField(term10312, term10312.getClass(), "empty", true);
        setBooleanField(term10312, term10312.getClass(), "selfClosing", true);
        setBooleanField(term10312, term10312.getClass(), "preserveWhitespace", false);
        setBooleanField(term10312, term10312.getClass(), "formList", false);
        setBooleanField(term10312, term10312.getClass(), "formSubmit", true);
        setField(term10311, term10311.getClass(), "tag", term10312);
        setField(term10311, term10311.getClass(), "parentNode", null);
        setField(term10311, term10311.getClass(), "childNodes", term10315);
        setField(term10317, term10317.getClass(), "attributes", term10318);
        setField(term10311, term10311.getClass(), "attributes", term10317);
        setField(term10311, term10311.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term10311, term10311.getClass(), "siblingIndex", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term883, args);
        assertTrue(recursiveEquals(term883, term10311));
        assertTrue(recursiveEquals(retValue, null));
    }

};


