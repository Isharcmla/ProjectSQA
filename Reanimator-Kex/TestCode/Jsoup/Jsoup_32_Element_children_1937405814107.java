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

public class Element_children_1937405814107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;
     Object term11689;
     Object term11629;

    public Element_children_1937405814107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1165 = new HashMap();
        Set<Object> term11711 =  ((Map) term1165).keySet();
        HashSet term1164 = new HashSet((Collection<? extends Object>) term11711);
        ArrayList term1181 = new ArrayList();
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        LinkedHashMap term1186 = new LinkedHashMap();
        term1143 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1144 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1185 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1144, term1144.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term1144, term1144.getClass(), "isBlock", true);
        setBooleanField(term1144, term1144.getClass(), "formatAsBlock", false);
        setBooleanField(term1144, term1144.getClass(), "canContainBlock", true);
        setBooleanField(term1144, term1144.getClass(), "canContainInline", true);
        setBooleanField(term1144, term1144.getClass(), "empty", false);
        setBooleanField(term1144, term1144.getClass(), "selfClosing", false);
        setBooleanField(term1144, term1144.getClass(), "preserveWhitespace", true);
        setField(term1143, term1143.getClass(), "tag", term1144);
        setField(term1143, term1143.getClass(), "classNames", term1164);
        setField(term1143, term1143.getClass(), "parentNode", null);
        setField(term1143, term1143.getClass(), "childNodes", term1181);
        setField(term1185, term1185.getClass(), "attributes", term1186);
        setField(term1143, term1143.getClass(), "attributes", term1185);
        setField(term1143, term1143.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term1143, term1143.getClass(), "siblingIndex", -883034806);
        HashMap term11694 = new HashMap();
        Set<Object> term11732 =  ((Map) term11694).keySet();
        HashSet term11693 = new HashSet((Collection<? extends Object>) term11732);
        ArrayList term11695 = new ArrayList();
        ((ArrayList) term11695).add((Object)null);
        ((ArrayList) term11695).add((Object)null);
        ((ArrayList) term11695).add((Object)null);
        ((ArrayList) term11695).add((Object)null);
        ((ArrayList) term11695).add((Object)null);
        ((ArrayList) term11695).add((Object)null);
        LinkedHashMap term11698 = new LinkedHashMap();
        term11689 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11690 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11697 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11690, term11690.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term11690, term11690.getClass(), "isBlock", true);
        setBooleanField(term11690, term11690.getClass(), "formatAsBlock", false);
        setBooleanField(term11690, term11690.getClass(), "canContainBlock", true);
        setBooleanField(term11690, term11690.getClass(), "canContainInline", true);
        setBooleanField(term11690, term11690.getClass(), "empty", false);
        setBooleanField(term11690, term11690.getClass(), "selfClosing", false);
        setBooleanField(term11690, term11690.getClass(), "preserveWhitespace", true);
        setField(term11689, term11689.getClass(), "tag", term11690);
        setField(term11689, term11689.getClass(), "classNames", term11693);
        setField(term11689, term11689.getClass(), "parentNode", null);
        setField(term11689, term11689.getClass(), "childNodes", term11695);
        setField(term11697, term11697.getClass(), "attributes", term11698);
        setField(term11689, term11689.getClass(), "attributes", term11697);
        setField(term11689, term11689.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term11689, term11689.getClass(), "siblingIndex", -883034806);
        ArrayList term11630 = new ArrayList();
        term11629 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term11629, term11629.getClass(), "contents", term11630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1143, args);
        assertTrue(recursiveEquals(term1143, term11689));
        assertTrue(recursiveEquals(retValue, term11629));
    }

};


