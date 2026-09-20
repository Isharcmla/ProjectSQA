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

public class Document_nodeName_1582854324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177;
     Object term6191;

    public Document_nodeName_1582854324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1199 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1199, term1199.getClass(), "tagName", null);
        setBooleanField(term1199, term1199.getClass(), "isBlock", true);
        setBooleanField(term1199, term1199.getClass(), "canContainBlock", false);
        setBooleanField(term1199, term1199.getClass(), "canContainInline", true);
        setBooleanField(term1199, term1199.getClass(), "optionalClosing", false);
        setBooleanField(term1199, term1199.getClass(), "empty", true);
        setBooleanField(term1199, term1199.getClass(), "preserveWhitespace", true);
        setField(term1199, term1199.getClass(), "ancestors", null);
        Object term1206 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1206, term1206.getClass(), "tagName", null);
        setBooleanField(term1206, term1206.getClass(), "isBlock", false);
        setBooleanField(term1206, term1206.getClass(), "canContainBlock", false);
        setBooleanField(term1206, term1206.getClass(), "canContainInline", true);
        setBooleanField(term1206, term1206.getClass(), "optionalClosing", false);
        setBooleanField(term1206, term1206.getClass(), "empty", false);
        setBooleanField(term1206, term1206.getClass(), "preserveWhitespace", false);
        setField(term1206, term1206.getClass(), "ancestors", null);
        ArrayList term1197 = new ArrayList();
        ((ArrayList) term1197).add(term1199);
        ((ArrayList) term1197).add(term1206);
        HashMap term1216 = new HashMap();
        Set<Object> term6228 =  ((Map) term1216).keySet();
        HashSet term1215 = new HashSet((Collection<? extends Object>) term6228);
        ArrayList term1232 = new ArrayList();
        ((ArrayList) term1232).add((Object)null);
        ((ArrayList) term1232).add((Object)null);
        ((ArrayList) term1232).add((Object)null);
        LinkedHashMap term1237 = new LinkedHashMap();
        term1177 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1178 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1236 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1178, term1178.getClass(), "tagName", "MwwjNtdOFT");
        setBooleanField(term1178, term1178.getClass(), "isBlock", false);
        setBooleanField(term1178, term1178.getClass(), "canContainBlock", true);
        setBooleanField(term1178, term1178.getClass(), "canContainInline", true);
        setBooleanField(term1178, term1178.getClass(), "optionalClosing", false);
        setBooleanField(term1178, term1178.getClass(), "empty", false);
        setBooleanField(term1178, term1178.getClass(), "preserveWhitespace", true);
        setField(term1178, term1178.getClass(), "ancestors", term1197);
        setField(term1177, term1177.getClass(), "tag", term1178);
        setField(term1177, term1177.getClass(), "classNames", term1215);
        setField(term1177, term1177.getClass(), "parentNode", null);
        setField(term1177, term1177.getClass(), "childNodes", term1232);
        setField(term1236, term1236.getClass(), "attributes", term1237);
        setField(term1177, term1177.getClass(), "attributes", term1236);
        setField(term1177, term1177.getClass(), "baseUri", "OYbzXylRWW");
        Object term6197 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6197, term6197.getClass(), "tagName", null);
        setBooleanField(term6197, term6197.getClass(), "isBlock", true);
        setBooleanField(term6197, term6197.getClass(), "canContainBlock", false);
        setBooleanField(term6197, term6197.getClass(), "canContainInline", true);
        setBooleanField(term6197, term6197.getClass(), "optionalClosing", false);
        setBooleanField(term6197, term6197.getClass(), "empty", true);
        setBooleanField(term6197, term6197.getClass(), "preserveWhitespace", true);
        setField(term6197, term6197.getClass(), "ancestors", null);
        Object term6198 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6198, term6198.getClass(), "tagName", null);
        setBooleanField(term6198, term6198.getClass(), "isBlock", false);
        setBooleanField(term6198, term6198.getClass(), "canContainBlock", false);
        setBooleanField(term6198, term6198.getClass(), "canContainInline", true);
        setBooleanField(term6198, term6198.getClass(), "optionalClosing", false);
        setBooleanField(term6198, term6198.getClass(), "empty", false);
        setBooleanField(term6198, term6198.getClass(), "preserveWhitespace", false);
        setField(term6198, term6198.getClass(), "ancestors", null);
        ArrayList term6195 = new ArrayList();
        ((ArrayList) term6195).add(term6197);
        ((ArrayList) term6195).add(term6198);
        HashMap term6200 = new HashMap();
        Set<Object> term6249 =  ((Map) term6200).keySet();
        HashSet term6199 = new HashSet((Collection<? extends Object>) term6249);
        ArrayList term6201 = new ArrayList();
        ((ArrayList) term6201).add((Object)null);
        ((ArrayList) term6201).add((Object)null);
        ((ArrayList) term6201).add((Object)null);
        LinkedHashMap term6204 = new LinkedHashMap();
        term6191 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term6192 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6203 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6192, term6192.getClass(), "tagName", "MwwjNtdOFT");
        setBooleanField(term6192, term6192.getClass(), "isBlock", false);
        setBooleanField(term6192, term6192.getClass(), "canContainBlock", true);
        setBooleanField(term6192, term6192.getClass(), "canContainInline", true);
        setBooleanField(term6192, term6192.getClass(), "optionalClosing", false);
        setBooleanField(term6192, term6192.getClass(), "empty", false);
        setBooleanField(term6192, term6192.getClass(), "preserveWhitespace", true);
        setField(term6192, term6192.getClass(), "ancestors", term6195);
        setField(term6191, term6191.getClass(), "tag", term6192);
        setField(term6191, term6191.getClass(), "classNames", term6199);
        setField(term6191, term6191.getClass(), "parentNode", null);
        setField(term6191, term6191.getClass(), "childNodes", term6201);
        setField(term6203, term6203.getClass(), "attributes", term6204);
        setField(term6191, term6191.getClass(), "attributes", term6203);
        setField(term6191, term6191.getClass(), "baseUri", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term1177, args);
        assertTrue(recursiveEquals(term1177, term6191));
        assertTrue(recursiveEquals(retValue, "#document"));
    }

};
