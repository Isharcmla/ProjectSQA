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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_html_92381463187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17321;

    public Element_html_92381463187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17343 = new HashMap();
        Set<Object> term17399 =  ((Map) term17343).keySet();
        HashSet term17342 = new HashSet((Collection<? extends Object>) term17399);
        ArrayList term17348 = new ArrayList();
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        ((ArrayList) term17348).add((Object)null);
        LinkedHashMap term17353 = new LinkedHashMap();
        term17321 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17352 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17322, term17322.getClass(), "tagName", "zZxoNkohbw");
        setBooleanField(term17322, term17322.getClass(), "isBlock", false);
        setBooleanField(term17322, term17322.getClass(), "formatAsBlock", false);
        setBooleanField(term17322, term17322.getClass(), "canContainBlock", false);
        setBooleanField(term17322, term17322.getClass(), "canContainInline", true);
        setBooleanField(term17322, term17322.getClass(), "empty", true);
        setBooleanField(term17322, term17322.getClass(), "selfClosing", true);
        setBooleanField(term17322, term17322.getClass(), "preserveWhitespace", true);
        setField(term17321, term17321.getClass(), "tag", term17322);
        setField(term17321, term17321.getClass(), "classNames", term17342);
        setField(term17321, term17321.getClass(), "parentNode", null);
        setField(term17321, term17321.getClass(), "childNodes", term17348);
        setField(term17352, term17352.getClass(), "attributes", term17353);
        setField(term17321, term17321.getClass(), "attributes", term17352);
        setField(term17321, term17321.getClass(), "baseUri", "UsxeLMVkAK");
        setIntField(term17321, term17321.getClass(), "siblingIndex", -506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ITrhiKKzcb";
        callMethod(klass, "html", argTypes, term17321, args);
    }

};


