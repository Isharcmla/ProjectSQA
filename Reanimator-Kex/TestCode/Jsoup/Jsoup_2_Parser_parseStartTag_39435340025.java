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

public class Parser_parseStartTag_39435340025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;

    public Parser_parseStartTag_39435340025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term549 = new HashSet();
        ArrayList term550 = new ArrayList();
        ((ArrayList) term550).add((Object)null);
        ((ArrayList) term550).add((Object)null);
        ((ArrayList) term550).add((Object)null);
        ((ArrayList) term550).add((Object)null);
        Object term541 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term542 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term542, term542.getClass(), "tagName", null);
        setBooleanField(term542, term542.getClass(), "isBlock", true);
        setBooleanField(term542, term542.getClass(), "canContainBlock", true);
        setBooleanField(term542, term542.getClass(), "canContainInline", true);
        setBooleanField(term542, term542.getClass(), "optionalClosing", false);
        setBooleanField(term542, term542.getClass(), "empty", true);
        setBooleanField(term542, term542.getClass(), "preserveWhitespace", true);
        setField(term542, term542.getClass(), "ancestors", null);
        setField(term541, term541.getClass(), "tag", term542);
        setField(term541, term541.getClass(), "classNames", term549);
        setField(term541, term541.getClass(), "parentNode", null);
        setField(term541, term541.getClass(), "childNodes", term550);
        setField(term553, term553.getClass(), "attributes", null);
        setField(term541, term541.getClass(), "attributes", term553);
        setField(term541, term541.getClass(), "baseUri", "");
        Object term556 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term556, term556.getClass(), "tag", null);
        setField(term556, term556.getClass(), "classNames", null);
        setField(term556, term556.getClass(), "parentNode", null);
        setField(term556, term556.getClass(), "childNodes", null);
        setField(term556, term556.getClass(), "attributes", null);
        setField(term556, term556.getClass(), "baseUri", null);
        LinkedList term538 = new LinkedList();
        ((LinkedList) term538).add(term541);
        ((LinkedList) term538).add(term556);
        ((LinkedList) term538).add((Object)null);
        ((LinkedList) term538).add((Object)null);
        ((LinkedList) term538).add((Object)null);
        ((LinkedList) term538).add((Object)null);
        Character term581 = new Character('E');
        Character term584 = new Character('t');
        LinkedList term578 = new LinkedList();
        ((LinkedList) term578).add(term581);
        ((LinkedList) term578).add(term584);
        ((LinkedList) term578).add((Object)null);
        ((LinkedList) term578).add((Object)null);
        ((LinkedList) term578).add((Object)null);
        HashMap term602 = new HashMap();
        Set<Object> term23833 =  ((Map) term602).keySet();
        HashSet term601 = new HashSet((Collection<? extends Object>) term23833);
        ArrayList term608 = new ArrayList();
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        ((ArrayList) term608).add((Object)null);
        LinkedHashMap term613 = new LinkedHashMap();
        term537 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term577 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term593 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term612 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term537, term537.getClass(), "stack", term538);
        setField(term577, term577.getClass(), "queue", term578);
        setField(term537, term537.getClass(), "tq", term577);
        setField(term594, term594.getClass(), "tagName", null);
        setBooleanField(term594, term594.getClass(), "isBlock", false);
        setBooleanField(term594, term594.getClass(), "canContainBlock", false);
        setBooleanField(term594, term594.getClass(), "canContainInline", false);
        setBooleanField(term594, term594.getClass(), "optionalClosing", false);
        setBooleanField(term594, term594.getClass(), "empty", false);
        setBooleanField(term594, term594.getClass(), "preserveWhitespace", false);
        setField(term594, term594.getClass(), "ancestors", null);
        setField(term593, term593.getClass(), "tag", term594);
        setField(term593, term593.getClass(), "classNames", term601);
        setField(term593, term593.getClass(), "parentNode", null);
        setField(term593, term593.getClass(), "childNodes", term608);
        setField(term612, term612.getClass(), "attributes", term613);
        setField(term593, term593.getClass(), "attributes", term612);
        setField(term593, term593.getClass(), "baseUri", "qCpEbQDHdF");
        setField(term537, term537.getClass(), "doc", term593);
        setField(term537, term537.getClass(), "baseUri", "AHbZyFOmlo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseStartTag", argTypes, term537, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


