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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingText_2847184147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5426;
     Object term30323;
     Object term30318;

    public Element_getElementsContainingText_2847184147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5450 = new HashMap();
        Set<Object> term30347 =  ((Map) term5450).keySet();
        HashSet term5449 = new HashSet((Collection<? extends Object>) term30347);
        ArrayList term5462 = new ArrayList();
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        LinkedHashMap term5467 = new LinkedHashMap();
        term5426 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5427 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5466 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5427, term5427.getClass(), "tagName", "lbmSGBwIiV");
        setBooleanField(term5427, term5427.getClass(), "isBlock", false);
        setBooleanField(term5427, term5427.getClass(), "formatAsBlock", false);
        setBooleanField(term5427, term5427.getClass(), "canContainBlock", true);
        setBooleanField(term5427, term5427.getClass(), "canContainInline", false);
        setBooleanField(term5427, term5427.getClass(), "empty", true);
        setBooleanField(term5427, term5427.getClass(), "selfClosing", false);
        setBooleanField(term5427, term5427.getClass(), "preserveWhitespace", false);
        setBooleanField(term5427, term5427.getClass(), "formList", true);
        setBooleanField(term5427, term5427.getClass(), "formSubmit", true);
        setField(term5426, term5426.getClass(), "tag", term5427);
        setField(term5426, term5426.getClass(), "classNames", term5449);
        setField(term5426, term5426.getClass(), "parentNode", null);
        setField(term5426, term5426.getClass(), "childNodes", term5462);
        setField(term5466, term5466.getClass(), "attributes", term5467);
        setField(term5426, term5426.getClass(), "attributes", term5466);
        setField(term5426, term5426.getClass(), "baseUri", "ONcbPCQnHd");
        setIntField(term5426, term5426.getClass(), "siblingIndex", 972867650);
        HashMap term30328 = new HashMap();
        Set<Object> term30378 =  ((Map) term30328).keySet();
        HashSet term30327 = new HashSet((Collection<? extends Object>) term30378);
        ArrayList term30329 = new ArrayList();
        ((ArrayList) term30329).add((Object)null);
        ((ArrayList) term30329).add((Object)null);
        ((ArrayList) term30329).add((Object)null);
        ((ArrayList) term30329).add((Object)null);
        LinkedHashMap term30332 = new LinkedHashMap();
        term30323 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30324 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30331 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30324, term30324.getClass(), "tagName", "lbmSGBwIiV");
        setBooleanField(term30324, term30324.getClass(), "isBlock", false);
        setBooleanField(term30324, term30324.getClass(), "formatAsBlock", false);
        setBooleanField(term30324, term30324.getClass(), "canContainBlock", true);
        setBooleanField(term30324, term30324.getClass(), "canContainInline", false);
        setBooleanField(term30324, term30324.getClass(), "empty", true);
        setBooleanField(term30324, term30324.getClass(), "selfClosing", false);
        setBooleanField(term30324, term30324.getClass(), "preserveWhitespace", false);
        setBooleanField(term30324, term30324.getClass(), "formList", true);
        setBooleanField(term30324, term30324.getClass(), "formSubmit", true);
        setField(term30323, term30323.getClass(), "tag", term30324);
        setField(term30323, term30323.getClass(), "classNames", term30327);
        setField(term30323, term30323.getClass(), "parentNode", null);
        setField(term30323, term30323.getClass(), "childNodes", term30329);
        setField(term30331, term30331.getClass(), "attributes", term30332);
        setField(term30323, term30323.getClass(), "attributes", term30331);
        setField(term30323, term30323.getClass(), "baseUri", "ONcbPCQnHd");
        setIntField(term30323, term30323.getClass(), "siblingIndex", 972867650);
        ArrayList term30319 = new ArrayList();
        term30318 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term30318, term30318.getClass(), "contents", term30319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AobDaplFLl";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term5426, args);
        assertTrue(recursiveEquals(term5426, term30323));
        assertTrue(recursiveEquals(retValue, term30318));
    }

};


