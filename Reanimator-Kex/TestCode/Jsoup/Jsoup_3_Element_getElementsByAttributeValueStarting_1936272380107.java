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

public class Element_getElementsByAttributeValueStarting_1936272380107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4177;
     Object term47895;
     Object term47890;

    public Element_getElementsByAttributeValueStarting_1936272380107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4199 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4199, term4199.getClass(), "tagName", null);
        setBooleanField(term4199, term4199.getClass(), "isBlock", false);
        setBooleanField(term4199, term4199.getClass(), "canContainBlock", false);
        setBooleanField(term4199, term4199.getClass(), "canContainInline", true);
        setBooleanField(term4199, term4199.getClass(), "optionalClosing", false);
        setBooleanField(term4199, term4199.getClass(), "empty", false);
        setBooleanField(term4199, term4199.getClass(), "preserveWhitespace", false);
        setField(term4199, term4199.getClass(), "ancestors", null);
        Object term4206 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4206, term4206.getClass(), "tagName", null);
        setBooleanField(term4206, term4206.getClass(), "isBlock", false);
        setBooleanField(term4206, term4206.getClass(), "canContainBlock", true);
        setBooleanField(term4206, term4206.getClass(), "canContainInline", false);
        setBooleanField(term4206, term4206.getClass(), "optionalClosing", false);
        setBooleanField(term4206, term4206.getClass(), "empty", false);
        setBooleanField(term4206, term4206.getClass(), "preserveWhitespace", true);
        setField(term4206, term4206.getClass(), "ancestors", null);
        ArrayList term4197 = new ArrayList();
        ((ArrayList) term4197).add(term4199);
        ((ArrayList) term4197).add(term4199);
        ((ArrayList) term4197).add(term4206);
        HashMap term4216 = new HashMap();
        Set<Object> term47925 =  ((Map) term4216).keySet();
        HashSet term4215 = new HashSet((Collection<? extends Object>) term47925);
        ArrayList term4230 = new ArrayList();
        ((ArrayList) term4230).add((Object)null);
        ((ArrayList) term4230).add((Object)null);
        ((ArrayList) term4230).add((Object)null);
        ((ArrayList) term4230).add((Object)null);
        ((ArrayList) term4230).add((Object)null);
        ((ArrayList) term4230).add((Object)null);
        LinkedHashMap term4235 = new LinkedHashMap();
        term4177 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4178 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4234 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4178, term4178.getClass(), "tagName", "BsuVlGUUjV");
        setBooleanField(term4178, term4178.getClass(), "isBlock", true);
        setBooleanField(term4178, term4178.getClass(), "canContainBlock", true);
        setBooleanField(term4178, term4178.getClass(), "canContainInline", true);
        setBooleanField(term4178, term4178.getClass(), "optionalClosing", true);
        setBooleanField(term4178, term4178.getClass(), "empty", false);
        setBooleanField(term4178, term4178.getClass(), "preserveWhitespace", false);
        setField(term4178, term4178.getClass(), "ancestors", term4197);
        setField(term4177, term4177.getClass(), "tag", term4178);
        setField(term4177, term4177.getClass(), "classNames", term4215);
        setField(term4177, term4177.getClass(), "parentNode", null);
        setField(term4177, term4177.getClass(), "childNodes", term4230);
        setField(term4234, term4234.getClass(), "attributes", term4235);
        setField(term4177, term4177.getClass(), "attributes", term4234);
        setField(term4177, term4177.getClass(), "baseUri", "tOszriqETr");
        Object term47901 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47901, term47901.getClass(), "tagName", null);
        setBooleanField(term47901, term47901.getClass(), "isBlock", false);
        setBooleanField(term47901, term47901.getClass(), "canContainBlock", false);
        setBooleanField(term47901, term47901.getClass(), "canContainInline", true);
        setBooleanField(term47901, term47901.getClass(), "optionalClosing", false);
        setBooleanField(term47901, term47901.getClass(), "empty", false);
        setBooleanField(term47901, term47901.getClass(), "preserveWhitespace", false);
        setField(term47901, term47901.getClass(), "ancestors", null);
        Object term47902 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47902, term47902.getClass(), "tagName", null);
        setBooleanField(term47902, term47902.getClass(), "isBlock", false);
        setBooleanField(term47902, term47902.getClass(), "canContainBlock", true);
        setBooleanField(term47902, term47902.getClass(), "canContainInline", false);
        setBooleanField(term47902, term47902.getClass(), "optionalClosing", false);
        setBooleanField(term47902, term47902.getClass(), "empty", false);
        setBooleanField(term47902, term47902.getClass(), "preserveWhitespace", true);
        setField(term47902, term47902.getClass(), "ancestors", null);
        ArrayList term47899 = new ArrayList();
        ((ArrayList) term47899).add(term47901);
        ((ArrayList) term47899).add(term47901);
        ((ArrayList) term47899).add(term47902);
        HashMap term47904 = new HashMap();
        Set<Object> term47966 =  ((Map) term47904).keySet();
        HashSet term47903 = new HashSet((Collection<? extends Object>) term47966);
        ArrayList term47905 = new ArrayList();
        ((ArrayList) term47905).add((Object)null);
        ((ArrayList) term47905).add((Object)null);
        ((ArrayList) term47905).add((Object)null);
        ((ArrayList) term47905).add((Object)null);
        ((ArrayList) term47905).add((Object)null);
        ((ArrayList) term47905).add((Object)null);
        LinkedHashMap term47908 = new LinkedHashMap();
        term47895 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term47896 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term47907 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term47896, term47896.getClass(), "tagName", "BsuVlGUUjV");
        setBooleanField(term47896, term47896.getClass(), "isBlock", true);
        setBooleanField(term47896, term47896.getClass(), "canContainBlock", true);
        setBooleanField(term47896, term47896.getClass(), "canContainInline", true);
        setBooleanField(term47896, term47896.getClass(), "optionalClosing", true);
        setBooleanField(term47896, term47896.getClass(), "empty", false);
        setBooleanField(term47896, term47896.getClass(), "preserveWhitespace", false);
        setField(term47896, term47896.getClass(), "ancestors", term47899);
        setField(term47895, term47895.getClass(), "tag", term47896);
        setField(term47895, term47895.getClass(), "classNames", term47903);
        setField(term47895, term47895.getClass(), "parentNode", null);
        setField(term47895, term47895.getClass(), "childNodes", term47905);
        setField(term47907, term47907.getClass(), "attributes", term47908);
        setField(term47895, term47895.getClass(), "attributes", term47907);
        setField(term47895, term47895.getClass(), "baseUri", "tOszriqETr");
        ArrayList term47891 = new ArrayList();
        term47890 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term47890, term47890.getClass(), "contents", term47891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "ncSPTkhKjO";
        args[1] = "jcWKHRWhyj";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4177, args);
        assertTrue(recursiveEquals(term4177, term47895));
        assertTrue(recursiveEquals(retValue, term47890));
    }

};


