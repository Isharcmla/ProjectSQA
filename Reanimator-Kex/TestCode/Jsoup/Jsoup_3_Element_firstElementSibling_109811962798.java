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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_firstElementSibling_109811962798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3118;

    public Element_firstElementSibling_109811962798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3140 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3140, term3140.getClass(), "tagName", null);
        setBooleanField(term3140, term3140.getClass(), "isBlock", false);
        setBooleanField(term3140, term3140.getClass(), "canContainBlock", false);
        setBooleanField(term3140, term3140.getClass(), "canContainInline", true);
        setBooleanField(term3140, term3140.getClass(), "optionalClosing", true);
        setBooleanField(term3140, term3140.getClass(), "empty", false);
        setBooleanField(term3140, term3140.getClass(), "preserveWhitespace", false);
        setField(term3140, term3140.getClass(), "ancestors", null);
        Object term3147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3147, term3147.getClass(), "tagName", null);
        setBooleanField(term3147, term3147.getClass(), "isBlock", true);
        setBooleanField(term3147, term3147.getClass(), "canContainBlock", false);
        setBooleanField(term3147, term3147.getClass(), "canContainInline", false);
        setBooleanField(term3147, term3147.getClass(), "optionalClosing", true);
        setBooleanField(term3147, term3147.getClass(), "empty", true);
        setBooleanField(term3147, term3147.getClass(), "preserveWhitespace", false);
        setField(term3147, term3147.getClass(), "ancestors", null);
        Object term3154 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3154, term3154.getClass(), "tagName", null);
        setBooleanField(term3154, term3154.getClass(), "isBlock", false);
        setBooleanField(term3154, term3154.getClass(), "canContainBlock", false);
        setBooleanField(term3154, term3154.getClass(), "canContainInline", true);
        setBooleanField(term3154, term3154.getClass(), "optionalClosing", true);
        setBooleanField(term3154, term3154.getClass(), "empty", false);
        setBooleanField(term3154, term3154.getClass(), "preserveWhitespace", true);
        setField(term3154, term3154.getClass(), "ancestors", null);
        ArrayList term3138 = new ArrayList();
        ((ArrayList) term3138).add(term3140);
        ((ArrayList) term3138).add(term3147);
        ((ArrayList) term3138).add(term3154);
        HashMap term3164 = new HashMap();
        Set<Object> term45626 =  ((Map) term3164).keySet();
        HashSet term3163 = new HashSet((Collection<? extends Object>) term45626);
        ArrayList term3178 = new ArrayList();
        ((ArrayList) term3178).add((Object)null);
        ((ArrayList) term3178).add((Object)null);
        LinkedHashMap term3183 = new LinkedHashMap();
        term3118 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3119 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3182 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3119, term3119.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term3119, term3119.getClass(), "isBlock", true);
        setBooleanField(term3119, term3119.getClass(), "canContainBlock", false);
        setBooleanField(term3119, term3119.getClass(), "canContainInline", false);
        setBooleanField(term3119, term3119.getClass(), "optionalClosing", false);
        setBooleanField(term3119, term3119.getClass(), "empty", false);
        setBooleanField(term3119, term3119.getClass(), "preserveWhitespace", true);
        setField(term3119, term3119.getClass(), "ancestors", term3138);
        setField(term3118, term3118.getClass(), "tag", term3119);
        setField(term3118, term3118.getClass(), "classNames", term3163);
        setField(term3118, term3118.getClass(), "parentNode", null);
        setField(term3118, term3118.getClass(), "childNodes", term3178);
        setField(term3182, term3182.getClass(), "attributes", term3183);
        setField(term3118, term3118.getClass(), "attributes", term3182);
        setField(term3118, term3118.getClass(), "baseUri", "NxgmYPzWCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "firstElementSibling", argTypes, term3118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


