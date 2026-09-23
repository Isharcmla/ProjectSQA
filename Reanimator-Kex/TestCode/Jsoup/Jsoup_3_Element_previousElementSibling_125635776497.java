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

public class Element_previousElementSibling_125635776497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;

    public Element_previousElementSibling_125635776497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3041 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3041, term3041.getClass(), "tagName", null);
        setBooleanField(term3041, term3041.getClass(), "isBlock", true);
        setBooleanField(term3041, term3041.getClass(), "canContainBlock", false);
        setBooleanField(term3041, term3041.getClass(), "canContainInline", false);
        setBooleanField(term3041, term3041.getClass(), "optionalClosing", true);
        setBooleanField(term3041, term3041.getClass(), "empty", true);
        setBooleanField(term3041, term3041.getClass(), "preserveWhitespace", true);
        setField(term3041, term3041.getClass(), "ancestors", null);
        Object term3048 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3048, term3048.getClass(), "tagName", null);
        setBooleanField(term3048, term3048.getClass(), "isBlock", false);
        setBooleanField(term3048, term3048.getClass(), "canContainBlock", false);
        setBooleanField(term3048, term3048.getClass(), "canContainInline", false);
        setBooleanField(term3048, term3048.getClass(), "optionalClosing", true);
        setBooleanField(term3048, term3048.getClass(), "empty", true);
        setBooleanField(term3048, term3048.getClass(), "preserveWhitespace", true);
        setField(term3048, term3048.getClass(), "ancestors", null);
        ArrayList term3039 = new ArrayList();
        ((ArrayList) term3039).add(term3041);
        ((ArrayList) term3039).add(term3048);
        HashMap term3058 = new HashMap();
        Set<Object> term45245 =  ((Map) term3058).keySet();
        HashSet term3057 = new HashSet((Collection<? extends Object>) term45245);
        ArrayList term3074 = new ArrayList();
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        ((ArrayList) term3074).add((Object)null);
        LinkedHashMap term3079 = new LinkedHashMap();
        term3019 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3078 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3020, term3020.getClass(), "tagName", "UkKvaeJfEC");
        setBooleanField(term3020, term3020.getClass(), "isBlock", true);
        setBooleanField(term3020, term3020.getClass(), "canContainBlock", false);
        setBooleanField(term3020, term3020.getClass(), "canContainInline", true);
        setBooleanField(term3020, term3020.getClass(), "optionalClosing", false);
        setBooleanField(term3020, term3020.getClass(), "empty", false);
        setBooleanField(term3020, term3020.getClass(), "preserveWhitespace", true);
        setField(term3020, term3020.getClass(), "ancestors", term3039);
        setField(term3019, term3019.getClass(), "tag", term3020);
        setField(term3019, term3019.getClass(), "classNames", term3057);
        setField(term3019, term3019.getClass(), "parentNode", null);
        setField(term3019, term3019.getClass(), "childNodes", term3074);
        setField(term3078, term3078.getClass(), "attributes", term3079);
        setField(term3019, term3019.getClass(), "attributes", term3078);
        setField(term3019, term3019.getClass(), "baseUri", "SScVQYSvWH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "previousElementSibling", argTypes, term3019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


