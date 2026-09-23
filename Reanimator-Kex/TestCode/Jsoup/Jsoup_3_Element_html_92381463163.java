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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_html_92381463163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7275;

    public Element_html_92381463163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7297 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7297, term7297.getClass(), "tagName", null);
        setBooleanField(term7297, term7297.getClass(), "isBlock", true);
        setBooleanField(term7297, term7297.getClass(), "canContainBlock", true);
        setBooleanField(term7297, term7297.getClass(), "canContainInline", true);
        setBooleanField(term7297, term7297.getClass(), "optionalClosing", true);
        setBooleanField(term7297, term7297.getClass(), "empty", false);
        setBooleanField(term7297, term7297.getClass(), "preserveWhitespace", true);
        setField(term7297, term7297.getClass(), "ancestors", null);
        Object term7304 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7304, term7304.getClass(), "tagName", null);
        setBooleanField(term7304, term7304.getClass(), "isBlock", false);
        setBooleanField(term7304, term7304.getClass(), "canContainBlock", true);
        setBooleanField(term7304, term7304.getClass(), "canContainInline", true);
        setBooleanField(term7304, term7304.getClass(), "optionalClosing", true);
        setBooleanField(term7304, term7304.getClass(), "empty", true);
        setBooleanField(term7304, term7304.getClass(), "preserveWhitespace", true);
        setField(term7304, term7304.getClass(), "ancestors", null);
        Object term7311 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7311, term7311.getClass(), "tagName", null);
        setBooleanField(term7311, term7311.getClass(), "isBlock", false);
        setBooleanField(term7311, term7311.getClass(), "canContainBlock", true);
        setBooleanField(term7311, term7311.getClass(), "canContainInline", true);
        setBooleanField(term7311, term7311.getClass(), "optionalClosing", true);
        setBooleanField(term7311, term7311.getClass(), "empty", true);
        setBooleanField(term7311, term7311.getClass(), "preserveWhitespace", false);
        setField(term7311, term7311.getClass(), "ancestors", null);
        ArrayList term7295 = new ArrayList();
        ((ArrayList) term7295).add(term7297);
        ((ArrayList) term7295).add(term7304);
        ((ArrayList) term7295).add(term7297);
        ((ArrayList) term7295).add(term7311);
        ((ArrayList) term7295).add(term7311);
        HashMap term7321 = new HashMap();
        Set<Object> term7371 =  ((Map) term7321).keySet();
        HashSet term7320 = new HashSet((Collection<? extends Object>) term7371);
        ArrayList term7326 = new ArrayList();
        ((ArrayList) term7326).add((Object)null);
        ((ArrayList) term7326).add((Object)null);
        LinkedHashMap term7331 = new LinkedHashMap();
        term7275 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7276 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7330 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7276, term7276.getClass(), "tagName", "osFrHWYeRy");
        setBooleanField(term7276, term7276.getClass(), "isBlock", false);
        setBooleanField(term7276, term7276.getClass(), "canContainBlock", true);
        setBooleanField(term7276, term7276.getClass(), "canContainInline", false);
        setBooleanField(term7276, term7276.getClass(), "optionalClosing", true);
        setBooleanField(term7276, term7276.getClass(), "empty", false);
        setBooleanField(term7276, term7276.getClass(), "preserveWhitespace", true);
        setField(term7276, term7276.getClass(), "ancestors", term7295);
        setField(term7275, term7275.getClass(), "tag", term7276);
        setField(term7275, term7275.getClass(), "classNames", term7320);
        setField(term7275, term7275.getClass(), "parentNode", null);
        setField(term7275, term7275.getClass(), "childNodes", term7326);
        setField(term7330, term7330.getClass(), "attributes", term7331);
        setField(term7275, term7275.getClass(), "attributes", term7330);
        setField(term7275, term7275.getClass(), "baseUri", "dirFuhqyNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YVLRenzuoR";
        callMethod(klass, "html", argTypes, term7275, args);
    }

};


