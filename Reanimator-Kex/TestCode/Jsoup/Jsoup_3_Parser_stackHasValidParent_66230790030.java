package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Character;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class Parser_stackHasValidParent_66230790030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1286;
     Object term1389;

    public Parser_stackHasValidParent_66230790030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term1298 = new HashSet();
        ArrayList term1299 = new ArrayList();
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        Object term1290 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1291 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1302 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1291, term1291.getClass(), "tagName", null);
        setBooleanField(term1291, term1291.getClass(), "isBlock", false);
        setBooleanField(term1291, term1291.getClass(), "canContainBlock", false);
        setBooleanField(term1291, term1291.getClass(), "canContainInline", false);
        setBooleanField(term1291, term1291.getClass(), "optionalClosing", true);
        setBooleanField(term1291, term1291.getClass(), "empty", false);
        setBooleanField(term1291, term1291.getClass(), "preserveWhitespace", false);
        setField(term1291, term1291.getClass(), "ancestors", null);
        setField(term1290, term1290.getClass(), "tag", term1291);
        setField(term1290, term1290.getClass(), "classNames", term1298);
        setField(term1290, term1290.getClass(), "parentNode", null);
        setField(term1290, term1290.getClass(), "childNodes", term1299);
        setField(term1302, term1302.getClass(), "attributes", null);
        setField(term1290, term1290.getClass(), "attributes", term1302);
        setField(term1290, term1290.getClass(), "baseUri", "");
        Object term1305 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1305, term1305.getClass(), "tag", null);
        setField(term1305, term1305.getClass(), "classNames", null);
        setField(term1305, term1305.getClass(), "parentNode", null);
        setField(term1305, term1305.getClass(), "childNodes", null);
        setField(term1305, term1305.getClass(), "attributes", null);
        setField(term1305, term1305.getClass(), "baseUri", null);
        LinkedList term1287 = new LinkedList();
        ((LinkedList) term1287).add(term1290);
        ((LinkedList) term1287).add(term1305);
        ((LinkedList) term1287).add((Object)null);
        ((LinkedList) term1287).add((Object)null);
        ((LinkedList) term1287).add((Object)null);
        ((LinkedList) term1287).add((Object)null);
        ((LinkedList) term1287).add((Object)null);
        Character term1330 = new Character('C');
        Character term1333 = new Character('Z');
        LinkedList term1327 = new LinkedList();
        ((LinkedList) term1327).add(term1330);
        ((LinkedList) term1327).add(term1333);
        ((LinkedList) term1327).add((Object)null);
        HashMap term1348 = new HashMap();
        Set<Object> term25983 =  ((Map) term1348).keySet();
        HashSet term1347 = new HashSet((Collection<? extends Object>) term25983);
        ArrayList term1354 = new ArrayList();
        LinkedHashMap term1359 = new LinkedHashMap();
        term1286 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1326 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term1339 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1340 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1358 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1286, term1286.getClass(), "stack", term1287);
        setField(term1326, term1326.getClass(), "queue", term1327);
        setField(term1286, term1286.getClass(), "tq", term1326);
        setField(term1340, term1340.getClass(), "tagName", null);
        setBooleanField(term1340, term1340.getClass(), "isBlock", false);
        setBooleanField(term1340, term1340.getClass(), "canContainBlock", false);
        setBooleanField(term1340, term1340.getClass(), "canContainInline", false);
        setBooleanField(term1340, term1340.getClass(), "optionalClosing", false);
        setBooleanField(term1340, term1340.getClass(), "empty", false);
        setBooleanField(term1340, term1340.getClass(), "preserveWhitespace", false);
        setField(term1340, term1340.getClass(), "ancestors", null);
        setField(term1339, term1339.getClass(), "tag", term1340);
        setField(term1339, term1339.getClass(), "classNames", term1347);
        setField(term1339, term1339.getClass(), "parentNode", null);
        setField(term1339, term1339.getClass(), "childNodes", term1354);
        setField(term1358, term1358.getClass(), "attributes", term1359);
        setField(term1339, term1339.getClass(), "attributes", term1358);
        setField(term1339, term1339.getClass(), "baseUri", "KarbTXFmUU");
        setField(term1286, term1286.getClass(), "doc", term1339);
        setField(term1286, term1286.getClass(), "baseUri", "jiUSjqwSIQ");
        ArrayList term1408 = new ArrayList();
        term1389 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1389, term1389.getClass(), "tagName", "MgLCedQfoj");
        setBooleanField(term1389, term1389.getClass(), "isBlock", true);
        setBooleanField(term1389, term1389.getClass(), "canContainBlock", false);
        setBooleanField(term1389, term1389.getClass(), "canContainInline", false);
        setBooleanField(term1389, term1389.getClass(), "optionalClosing", false);
        setBooleanField(term1389, term1389.getClass(), "empty", true);
        setBooleanField(term1389, term1389.getClass(), "preserveWhitespace", false);
        setField(term1389, term1389.getClass(), "ancestors", term1408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term1389;
        try {
            callMethod(klass, "stackHasValidParent", argTypes, term1286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


