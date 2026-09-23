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
import java.lang.IndexOutOfBoundsException;
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
import java.lang.Integer;

public class Element_child_126557533178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1079;
     Object term1169;

    public Element_child_126557533178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1101, term1101.getClass(), "tagName", null);
        setBooleanField(term1101, term1101.getClass(), "isBlock", true);
        setBooleanField(term1101, term1101.getClass(), "canContainBlock", false);
        setBooleanField(term1101, term1101.getClass(), "canContainInline", false);
        setBooleanField(term1101, term1101.getClass(), "optionalClosing", false);
        setBooleanField(term1101, term1101.getClass(), "empty", false);
        setBooleanField(term1101, term1101.getClass(), "preserveWhitespace", false);
        setField(term1101, term1101.getClass(), "ancestors", null);
        Object term1108 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1108, term1108.getClass(), "tagName", null);
        setBooleanField(term1108, term1108.getClass(), "isBlock", true);
        setBooleanField(term1108, term1108.getClass(), "canContainBlock", false);
        setBooleanField(term1108, term1108.getClass(), "canContainInline", true);
        setBooleanField(term1108, term1108.getClass(), "optionalClosing", true);
        setBooleanField(term1108, term1108.getClass(), "empty", false);
        setBooleanField(term1108, term1108.getClass(), "preserveWhitespace", false);
        setField(term1108, term1108.getClass(), "ancestors", null);
        Object term1115 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1115, term1115.getClass(), "tagName", null);
        setBooleanField(term1115, term1115.getClass(), "isBlock", true);
        setBooleanField(term1115, term1115.getClass(), "canContainBlock", true);
        setBooleanField(term1115, term1115.getClass(), "canContainInline", true);
        setBooleanField(term1115, term1115.getClass(), "optionalClosing", true);
        setBooleanField(term1115, term1115.getClass(), "empty", true);
        setBooleanField(term1115, term1115.getClass(), "preserveWhitespace", false);
        setField(term1115, term1115.getClass(), "ancestors", null);
        Object term1122 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1122, term1122.getClass(), "tagName", null);
        setBooleanField(term1122, term1122.getClass(), "isBlock", true);
        setBooleanField(term1122, term1122.getClass(), "canContainBlock", false);
        setBooleanField(term1122, term1122.getClass(), "canContainInline", false);
        setBooleanField(term1122, term1122.getClass(), "optionalClosing", false);
        setBooleanField(term1122, term1122.getClass(), "empty", true);
        setBooleanField(term1122, term1122.getClass(), "preserveWhitespace", true);
        setField(term1122, term1122.getClass(), "ancestors", null);
        ArrayList term1099 = new ArrayList();
        ((ArrayList) term1099).add(term1101);
        ((ArrayList) term1099).add(term1108);
        ((ArrayList) term1099).add(term1115);
        ((ArrayList) term1099).add(term1115);
        ((ArrayList) term1099).add(term1122);
        HashMap term1132 = new HashMap();
        Set<Object> term10189 =  ((Map) term1132).keySet();
        HashSet term1131 = new HashSet((Collection<? extends Object>) term10189);
        ArrayList term1146 = new ArrayList();
        ((ArrayList) term1146).add((Object)null);
        ((ArrayList) term1146).add((Object)null);
        ((ArrayList) term1146).add((Object)null);
        ((ArrayList) term1146).add((Object)null);
        ((ArrayList) term1146).add((Object)null);
        ((ArrayList) term1146).add((Object)null);
        LinkedHashMap term1151 = new LinkedHashMap();
        term1079 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1150 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1080, term1080.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term1080, term1080.getClass(), "isBlock", false);
        setBooleanField(term1080, term1080.getClass(), "canContainBlock", true);
        setBooleanField(term1080, term1080.getClass(), "canContainInline", false);
        setBooleanField(term1080, term1080.getClass(), "optionalClosing", true);
        setBooleanField(term1080, term1080.getClass(), "empty", false);
        setBooleanField(term1080, term1080.getClass(), "preserveWhitespace", false);
        setField(term1080, term1080.getClass(), "ancestors", term1099);
        setField(term1079, term1079.getClass(), "tag", term1080);
        setField(term1079, term1079.getClass(), "classNames", term1131);
        setField(term1079, term1079.getClass(), "parentNode", null);
        setField(term1079, term1079.getClass(), "childNodes", term1146);
        setField(term1150, term1150.getClass(), "attributes", term1151);
        setField(term1079, term1079.getClass(), "attributes", term1150);
        setField(term1079, term1079.getClass(), "baseUri", "OYbzXylRWW");
        term1169 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1169;
        try {
            callMethod(klass, "child", argTypes, term1079, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


