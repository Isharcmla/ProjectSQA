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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValue_1832587100105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3870;
     Object term47361;
     Object term47356;

    public Element_getElementsByAttributeValue_1832587100105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3892 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3892, term3892.getClass(), "tagName", null);
        setBooleanField(term3892, term3892.getClass(), "isBlock", true);
        setBooleanField(term3892, term3892.getClass(), "canContainBlock", false);
        setBooleanField(term3892, term3892.getClass(), "canContainInline", true);
        setBooleanField(term3892, term3892.getClass(), "optionalClosing", true);
        setBooleanField(term3892, term3892.getClass(), "empty", false);
        setBooleanField(term3892, term3892.getClass(), "preserveWhitespace", true);
        setField(term3892, term3892.getClass(), "ancestors", null);
        Object term3899 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3899, term3899.getClass(), "tagName", null);
        setBooleanField(term3899, term3899.getClass(), "isBlock", false);
        setBooleanField(term3899, term3899.getClass(), "canContainBlock", false);
        setBooleanField(term3899, term3899.getClass(), "canContainInline", false);
        setBooleanField(term3899, term3899.getClass(), "optionalClosing", false);
        setBooleanField(term3899, term3899.getClass(), "empty", false);
        setBooleanField(term3899, term3899.getClass(), "preserveWhitespace", false);
        setField(term3899, term3899.getClass(), "ancestors", null);
        Object term3906 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3906, term3906.getClass(), "tagName", null);
        setBooleanField(term3906, term3906.getClass(), "isBlock", true);
        setBooleanField(term3906, term3906.getClass(), "canContainBlock", false);
        setBooleanField(term3906, term3906.getClass(), "canContainInline", true);
        setBooleanField(term3906, term3906.getClass(), "optionalClosing", true);
        setBooleanField(term3906, term3906.getClass(), "empty", true);
        setBooleanField(term3906, term3906.getClass(), "preserveWhitespace", true);
        setField(term3906, term3906.getClass(), "ancestors", null);
        ArrayList term3890 = new ArrayList();
        ((ArrayList) term3890).add(term3892);
        ((ArrayList) term3890).add(term3899);
        ((ArrayList) term3890).add(term3892);
        ((ArrayList) term3890).add(term3906);
        HashMap term3916 = new HashMap();
        Set<Object> term47392 =  ((Map) term3916).keySet();
        HashSet term3915 = new HashSet((Collection<? extends Object>) term47392);
        ArrayList term3924 = new ArrayList();
        ((ArrayList) term3924).add((Object)null);
        LinkedHashMap term3929 = new LinkedHashMap();
        term3870 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3871 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3928 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3871, term3871.getClass(), "tagName", "OirVUQhauU");
        setBooleanField(term3871, term3871.getClass(), "isBlock", true);
        setBooleanField(term3871, term3871.getClass(), "canContainBlock", false);
        setBooleanField(term3871, term3871.getClass(), "canContainInline", true);
        setBooleanField(term3871, term3871.getClass(), "optionalClosing", false);
        setBooleanField(term3871, term3871.getClass(), "empty", false);
        setBooleanField(term3871, term3871.getClass(), "preserveWhitespace", false);
        setField(term3871, term3871.getClass(), "ancestors", term3890);
        setField(term3870, term3870.getClass(), "tag", term3871);
        setField(term3870, term3870.getClass(), "classNames", term3915);
        setField(term3870, term3870.getClass(), "parentNode", null);
        setField(term3870, term3870.getClass(), "childNodes", term3924);
        setField(term3928, term3928.getClass(), "attributes", term3929);
        setField(term3870, term3870.getClass(), "attributes", term3928);
        setField(term3870, term3870.getClass(), "baseUri", "rsumfoDNHa");
        Object term47367 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47367, term47367.getClass(), "tagName", null);
        setBooleanField(term47367, term47367.getClass(), "isBlock", true);
        setBooleanField(term47367, term47367.getClass(), "canContainBlock", false);
        setBooleanField(term47367, term47367.getClass(), "canContainInline", true);
        setBooleanField(term47367, term47367.getClass(), "optionalClosing", true);
        setBooleanField(term47367, term47367.getClass(), "empty", false);
        setBooleanField(term47367, term47367.getClass(), "preserveWhitespace", true);
        setField(term47367, term47367.getClass(), "ancestors", null);
        Object term47368 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47368, term47368.getClass(), "tagName", null);
        setBooleanField(term47368, term47368.getClass(), "isBlock", false);
        setBooleanField(term47368, term47368.getClass(), "canContainBlock", false);
        setBooleanField(term47368, term47368.getClass(), "canContainInline", false);
        setBooleanField(term47368, term47368.getClass(), "optionalClosing", false);
        setBooleanField(term47368, term47368.getClass(), "empty", false);
        setBooleanField(term47368, term47368.getClass(), "preserveWhitespace", false);
        setField(term47368, term47368.getClass(), "ancestors", null);
        Object term47369 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47369, term47369.getClass(), "tagName", null);
        setBooleanField(term47369, term47369.getClass(), "isBlock", true);
        setBooleanField(term47369, term47369.getClass(), "canContainBlock", false);
        setBooleanField(term47369, term47369.getClass(), "canContainInline", true);
        setBooleanField(term47369, term47369.getClass(), "optionalClosing", true);
        setBooleanField(term47369, term47369.getClass(), "empty", true);
        setBooleanField(term47369, term47369.getClass(), "preserveWhitespace", true);
        setField(term47369, term47369.getClass(), "ancestors", null);
        ArrayList term47365 = new ArrayList();
        ((ArrayList) term47365).add(term47367);
        ((ArrayList) term47365).add(term47368);
        ((ArrayList) term47365).add(term47367);
        ((ArrayList) term47365).add(term47369);
        HashMap term47371 = new HashMap();
        Set<Object> term47433 =  ((Map) term47371).keySet();
        HashSet term47370 = new HashSet((Collection<? extends Object>) term47433);
        ArrayList term47372 = new ArrayList();
        ((ArrayList) term47372).add((Object)null);
        LinkedHashMap term47375 = new LinkedHashMap();
        term47361 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term47362 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term47374 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term47362, term47362.getClass(), "tagName", "OirVUQhauU");
        setBooleanField(term47362, term47362.getClass(), "isBlock", true);
        setBooleanField(term47362, term47362.getClass(), "canContainBlock", false);
        setBooleanField(term47362, term47362.getClass(), "canContainInline", true);
        setBooleanField(term47362, term47362.getClass(), "optionalClosing", false);
        setBooleanField(term47362, term47362.getClass(), "empty", false);
        setBooleanField(term47362, term47362.getClass(), "preserveWhitespace", false);
        setField(term47362, term47362.getClass(), "ancestors", term47365);
        setField(term47361, term47361.getClass(), "tag", term47362);
        setField(term47361, term47361.getClass(), "classNames", term47370);
        setField(term47361, term47361.getClass(), "parentNode", null);
        setField(term47361, term47361.getClass(), "childNodes", term47372);
        setField(term47374, term47374.getClass(), "attributes", term47375);
        setField(term47361, term47361.getClass(), "attributes", term47374);
        setField(term47361, term47361.getClass(), "baseUri", "rsumfoDNHa");
        ArrayList term47357 = new ArrayList();
        term47356 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term47356, term47356.getClass(), "contents", term47357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "ceCWHUTQUM";
        args[1] = "LrqwfrKKtS";
        Object retValue = callMethod(klass, "getElementsByAttributeValue", argTypes, term3870, args);
        assertTrue(recursiveEquals(term3870, term47361));
        assertTrue(recursiveEquals(retValue, term47356));
    }

};


