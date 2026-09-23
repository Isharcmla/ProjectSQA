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

public class Element_attr_298745360100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;
     Object term10376;
     Object term10318;

    public Element_attr_298745360100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term700 = new HashMap();
        Set<Object> term10406 =  ((Map) term700).keySet();
        HashSet term699 = new HashSet((Collection<? extends Object>) term10406);
        ArrayList term716 = new ArrayList();
        ((ArrayList) term716).add((Object)null);
        ((ArrayList) term716).add((Object)null);
        LinkedHashMap term721 = new LinkedHashMap();
        term676 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term677, term677.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term677, term677.getClass(), "isBlock", false);
        setBooleanField(term677, term677.getClass(), "formatAsBlock", false);
        setBooleanField(term677, term677.getClass(), "canContainBlock", false);
        setBooleanField(term677, term677.getClass(), "canContainInline", false);
        setBooleanField(term677, term677.getClass(), "empty", true);
        setBooleanField(term677, term677.getClass(), "selfClosing", false);
        setBooleanField(term677, term677.getClass(), "preserveWhitespace", false);
        setBooleanField(term677, term677.getClass(), "formList", true);
        setBooleanField(term677, term677.getClass(), "formSubmit", false);
        setField(term676, term676.getClass(), "tag", term677);
        setField(term676, term676.getClass(), "classNames", term699);
        setField(term676, term676.getClass(), "parentNode", null);
        setField(term676, term676.getClass(), "childNodes", term716);
        setField(term720, term720.getClass(), "attributes", term721);
        setField(term676, term676.getClass(), "attributes", term720);
        setField(term676, term676.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term676, term676.getClass(), "siblingIndex", -1955890973);
        HashMap term10381 = new HashMap();
        Set<Object> term10447 =  ((Map) term10381).keySet();
        HashSet term10380 = new HashSet((Collection<? extends Object>) term10447);
        ArrayList term10382 = new ArrayList();
        ((ArrayList) term10382).add((Object)null);
        ((ArrayList) term10382).add((Object)null);
        LinkedHashMap term10385 = new LinkedHashMap();
        term10376 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10377 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10384 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10377, term10377.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term10377, term10377.getClass(), "isBlock", false);
        setBooleanField(term10377, term10377.getClass(), "formatAsBlock", false);
        setBooleanField(term10377, term10377.getClass(), "canContainBlock", false);
        setBooleanField(term10377, term10377.getClass(), "canContainInline", false);
        setBooleanField(term10377, term10377.getClass(), "empty", true);
        setBooleanField(term10377, term10377.getClass(), "selfClosing", false);
        setBooleanField(term10377, term10377.getClass(), "preserveWhitespace", false);
        setBooleanField(term10377, term10377.getClass(), "formList", true);
        setBooleanField(term10377, term10377.getClass(), "formSubmit", false);
        setField(term10376, term10376.getClass(), "tag", term10377);
        setField(term10376, term10376.getClass(), "classNames", term10380);
        setField(term10376, term10376.getClass(), "parentNode", null);
        setField(term10376, term10376.getClass(), "childNodes", term10382);
        setField(term10384, term10384.getClass(), "attributes", term10385);
        setField(term10376, term10376.getClass(), "attributes", term10384);
        setField(term10376, term10376.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term10376, term10376.getClass(), "siblingIndex", -1955890973);
        HashMap term10342 = new HashMap();
        Set<Object> term10488 =  ((Map) term10342).keySet();
        HashSet term10341 = new HashSet((Collection<? extends Object>) term10488);
        ArrayList term10347 = new ArrayList();
        ((ArrayList) term10347).add((Object)null);
        ((ArrayList) term10347).add((Object)null);
        LinkedHashMap term10352 = new LinkedHashMap();
        term10318 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10319 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10351 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10319, term10319.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term10319, term10319.getClass(), "isBlock", false);
        setBooleanField(term10319, term10319.getClass(), "formatAsBlock", false);
        setBooleanField(term10319, term10319.getClass(), "canContainBlock", false);
        setBooleanField(term10319, term10319.getClass(), "canContainInline", false);
        setBooleanField(term10319, term10319.getClass(), "empty", true);
        setBooleanField(term10319, term10319.getClass(), "selfClosing", false);
        setBooleanField(term10319, term10319.getClass(), "preserveWhitespace", false);
        setBooleanField(term10319, term10319.getClass(), "formList", true);
        setBooleanField(term10319, term10319.getClass(), "formSubmit", false);
        setField(term10318, term10318.getClass(), "tag", term10319);
        setField(term10318, term10318.getClass(), "classNames", term10341);
        setField(term10318, term10318.getClass(), "parentNode", null);
        setField(term10318, term10318.getClass(), "childNodes", term10347);
        setField(term10351, term10351.getClass(), "attributes", term10352);
        setField(term10318, term10318.getClass(), "attributes", term10351);
        setField(term10318, term10318.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term10318, term10318.getClass(), "siblingIndex", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JUmudUmaaV";
        args[1] = "KoyGrUJeJW";
        Object retValue = callMethod(klass, "attr", argTypes, term676, args);
        assertTrue(recursiveEquals(term676, term10376));
        assertTrue(recursiveEquals(retValue, term10318));
    }

};


