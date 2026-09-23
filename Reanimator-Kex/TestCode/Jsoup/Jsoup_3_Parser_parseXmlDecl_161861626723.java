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

public class Parser_parseXmlDecl_161861626723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;

    public Parser_parseXmlDecl_161861626723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term358 = new HashSet();
        ArrayList term359 = new ArrayList();
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        ((ArrayList) term359).add((Object)null);
        Object term350 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term351 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term362 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term351, term351.getClass(), "tagName", null);
        setBooleanField(term351, term351.getClass(), "isBlock", true);
        setBooleanField(term351, term351.getClass(), "canContainBlock", true);
        setBooleanField(term351, term351.getClass(), "canContainInline", false);
        setBooleanField(term351, term351.getClass(), "optionalClosing", true);
        setBooleanField(term351, term351.getClass(), "empty", true);
        setBooleanField(term351, term351.getClass(), "preserveWhitespace", false);
        setField(term351, term351.getClass(), "ancestors", null);
        setField(term350, term350.getClass(), "tag", term351);
        setField(term350, term350.getClass(), "classNames", term358);
        setField(term350, term350.getClass(), "parentNode", null);
        setField(term350, term350.getClass(), "childNodes", term359);
        setField(term362, term362.getClass(), "attributes", null);
        setField(term350, term350.getClass(), "attributes", term362);
        setField(term350, term350.getClass(), "baseUri", "");
        Object term365 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term365, term365.getClass(), "tag", null);
        setField(term365, term365.getClass(), "classNames", null);
        setField(term365, term365.getClass(), "parentNode", null);
        setField(term365, term365.getClass(), "childNodes", null);
        setField(term365, term365.getClass(), "attributes", null);
        setField(term365, term365.getClass(), "baseUri", null);
        LinkedList term347 = new LinkedList();
        ((LinkedList) term347).add(term350);
        ((LinkedList) term347).add(term365);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        ((LinkedList) term347).add((Object)null);
        term346 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term381 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term382 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term346, term346.getClass(), "stack", term347);
        setField(term381, term381.getClass(), "queue", null);
        setField(term346, term346.getClass(), "tq", term381);
        setField(term382, term382.getClass(), "tag", null);
        setField(term382, term382.getClass(), "classNames", null);
        setField(term382, term382.getClass(), "parentNode", null);
        setField(term382, term382.getClass(), "childNodes", null);
        setField(term382, term382.getClass(), "attributes", null);
        setField(term382, term382.getClass(), "baseUri", null);
        setField(term346, term346.getClass(), "doc", term382);
        setField(term346, term346.getClass(), "baseUri", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseXmlDecl", argTypes, term346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


