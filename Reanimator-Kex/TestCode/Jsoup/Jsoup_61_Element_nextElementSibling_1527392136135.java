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

public class Element_nextElementSibling_1527392136135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2908;
     Object term21076;

    public Element_nextElementSibling_1527392136135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2930 = new ArrayList();
        ((ArrayList) term2930).add((Object)null);
        ((ArrayList) term2930).add((Object)null);
        ((ArrayList) term2930).add((Object)null);
        ((ArrayList) term2930).add((Object)null);
        ((ArrayList) term2930).add((Object)null);
        LinkedHashMap term2935 = new LinkedHashMap();
        term2908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2934 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2909, term2909.getClass(), "tagName", "tXfQjSqDzN");
        setBooleanField(term2909, term2909.getClass(), "isBlock", true);
        setBooleanField(term2909, term2909.getClass(), "formatAsBlock", false);
        setBooleanField(term2909, term2909.getClass(), "canContainInline", false);
        setBooleanField(term2909, term2909.getClass(), "empty", true);
        setBooleanField(term2909, term2909.getClass(), "selfClosing", true);
        setBooleanField(term2909, term2909.getClass(), "preserveWhitespace", true);
        setBooleanField(term2909, term2909.getClass(), "formList", true);
        setBooleanField(term2909, term2909.getClass(), "formSubmit", true);
        setField(term2908, term2908.getClass(), "tag", term2909);
        setField(term2908, term2908.getClass(), "parentNode", null);
        setField(term2908, term2908.getClass(), "childNodes", term2930);
        setField(term2934, term2934.getClass(), "attributes", term2935);
        setField(term2908, term2908.getClass(), "attributes", term2934);
        setField(term2908, term2908.getClass(), "baseUri", "AZdLeSugwv");
        setIntField(term2908, term2908.getClass(), "siblingIndex", -1145578966);
        ArrayList term21080 = new ArrayList();
        ((ArrayList) term21080).add((Object)null);
        ((ArrayList) term21080).add((Object)null);
        ((ArrayList) term21080).add((Object)null);
        ((ArrayList) term21080).add((Object)null);
        ((ArrayList) term21080).add((Object)null);
        LinkedHashMap term21083 = new LinkedHashMap();
        term21076 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21082 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21077, term21077.getClass(), "tagName", "tXfQjSqDzN");
        setBooleanField(term21077, term21077.getClass(), "isBlock", true);
        setBooleanField(term21077, term21077.getClass(), "formatAsBlock", false);
        setBooleanField(term21077, term21077.getClass(), "canContainInline", false);
        setBooleanField(term21077, term21077.getClass(), "empty", true);
        setBooleanField(term21077, term21077.getClass(), "selfClosing", true);
        setBooleanField(term21077, term21077.getClass(), "preserveWhitespace", true);
        setBooleanField(term21077, term21077.getClass(), "formList", true);
        setBooleanField(term21077, term21077.getClass(), "formSubmit", true);
        setField(term21076, term21076.getClass(), "tag", term21077);
        setField(term21076, term21076.getClass(), "parentNode", null);
        setField(term21076, term21076.getClass(), "childNodes", term21080);
        setField(term21082, term21082.getClass(), "attributes", term21083);
        setField(term21076, term21076.getClass(), "attributes", term21082);
        setField(term21076, term21076.getClass(), "baseUri", "AZdLeSugwv");
        setIntField(term21076, term21076.getClass(), "siblingIndex", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term2908, args);
        assertTrue(recursiveEquals(term2908, term21076));
        assertTrue(recursiveEquals(retValue, null));
    }

};


