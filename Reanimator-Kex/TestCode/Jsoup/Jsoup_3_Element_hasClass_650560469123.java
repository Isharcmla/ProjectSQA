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

public class Element_hasClass_650560469123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6138;
     Object term51147;

    public Element_hasClass_650560469123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6160 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6160, term6160.getClass(), "tagName", null);
        setBooleanField(term6160, term6160.getClass(), "isBlock", true);
        setBooleanField(term6160, term6160.getClass(), "canContainBlock", false);
        setBooleanField(term6160, term6160.getClass(), "canContainInline", false);
        setBooleanField(term6160, term6160.getClass(), "optionalClosing", true);
        setBooleanField(term6160, term6160.getClass(), "empty", true);
        setBooleanField(term6160, term6160.getClass(), "preserveWhitespace", true);
        setField(term6160, term6160.getClass(), "ancestors", null);
        ArrayList term6158 = new ArrayList();
        ((ArrayList) term6158).add(term6160);
        HashMap term6170 = new HashMap();
        Set<Object> term51174 =  ((Map) term6170).keySet();
        HashSet term6169 = new HashSet((Collection<? extends Object>) term51174);
        ArrayList term6182 = new ArrayList();
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        ((ArrayList) term6182).add((Object)null);
        LinkedHashMap term6187 = new LinkedHashMap();
        term6138 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6139 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6186 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6139, term6139.getClass(), "tagName", "YupgKTSEiI");
        setBooleanField(term6139, term6139.getClass(), "isBlock", true);
        setBooleanField(term6139, term6139.getClass(), "canContainBlock", false);
        setBooleanField(term6139, term6139.getClass(), "canContainInline", false);
        setBooleanField(term6139, term6139.getClass(), "optionalClosing", true);
        setBooleanField(term6139, term6139.getClass(), "empty", false);
        setBooleanField(term6139, term6139.getClass(), "preserveWhitespace", true);
        setField(term6139, term6139.getClass(), "ancestors", term6158);
        setField(term6138, term6138.getClass(), "tag", term6139);
        setField(term6138, term6138.getClass(), "classNames", term6169);
        setField(term6138, term6138.getClass(), "parentNode", null);
        setField(term6138, term6138.getClass(), "childNodes", term6182);
        setField(term6186, term6186.getClass(), "attributes", term6187);
        setField(term6138, term6138.getClass(), "attributes", term6186);
        setField(term6138, term6138.getClass(), "baseUri", "Bcivwcjece");
        Object term51153 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51153, term51153.getClass(), "tagName", null);
        setBooleanField(term51153, term51153.getClass(), "isBlock", true);
        setBooleanField(term51153, term51153.getClass(), "canContainBlock", false);
        setBooleanField(term51153, term51153.getClass(), "canContainInline", false);
        setBooleanField(term51153, term51153.getClass(), "optionalClosing", true);
        setBooleanField(term51153, term51153.getClass(), "empty", true);
        setBooleanField(term51153, term51153.getClass(), "preserveWhitespace", true);
        setField(term51153, term51153.getClass(), "ancestors", null);
        ArrayList term51151 = new ArrayList();
        ((ArrayList) term51151).add(term51153);
        HashMap term51155 = new HashMap();
        Set<Object> term51205 =  ((Map) term51155).keySet();
        HashSet term51154 = new HashSet((Collection<? extends Object>) term51205);
        ArrayList term51156 = new ArrayList();
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        ((ArrayList) term51156).add((Object)null);
        LinkedHashMap term51159 = new LinkedHashMap();
        term51147 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term51148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term51158 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term51148, term51148.getClass(), "tagName", "YupgKTSEiI");
        setBooleanField(term51148, term51148.getClass(), "isBlock", true);
        setBooleanField(term51148, term51148.getClass(), "canContainBlock", false);
        setBooleanField(term51148, term51148.getClass(), "canContainInline", false);
        setBooleanField(term51148, term51148.getClass(), "optionalClosing", true);
        setBooleanField(term51148, term51148.getClass(), "empty", false);
        setBooleanField(term51148, term51148.getClass(), "preserveWhitespace", true);
        setField(term51148, term51148.getClass(), "ancestors", term51151);
        setField(term51147, term51147.getClass(), "tag", term51148);
        setField(term51147, term51147.getClass(), "classNames", term51154);
        setField(term51147, term51147.getClass(), "parentNode", null);
        setField(term51147, term51147.getClass(), "childNodes", term51156);
        setField(term51158, term51158.getClass(), "attributes", term51159);
        setField(term51147, term51147.getClass(), "attributes", term51158);
        setField(term51147, term51147.getClass(), "baseUri", "Bcivwcjece");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QTefjRuiez";
        callMethod(klass, "hasClass", argTypes, term6138, args);
        assertTrue(recursiveEquals(term6138, term51147));
    }

};


