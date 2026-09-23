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

public class Parser_parseComment_212222533522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;

    public Parser_parseComment_212222533522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term299 = new HashSet();
        ArrayList term300 = new ArrayList();
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        Object term291 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term292 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term303 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term292, term292.getClass(), "tagName", null);
        setBooleanField(term292, term292.getClass(), "isBlock", true);
        setBooleanField(term292, term292.getClass(), "canContainBlock", false);
        setBooleanField(term292, term292.getClass(), "canContainInline", false);
        setBooleanField(term292, term292.getClass(), "optionalClosing", true);
        setBooleanField(term292, term292.getClass(), "empty", false);
        setBooleanField(term292, term292.getClass(), "preserveWhitespace", true);
        setField(term292, term292.getClass(), "ancestors", null);
        setField(term291, term291.getClass(), "tag", term292);
        setField(term291, term291.getClass(), "classNames", term299);
        setField(term291, term291.getClass(), "parentNode", null);
        setField(term291, term291.getClass(), "childNodes", term300);
        setField(term303, term303.getClass(), "attributes", null);
        setField(term291, term291.getClass(), "attributes", term303);
        setField(term291, term291.getClass(), "baseUri", "");
        Object term306 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term306, term306.getClass(), "tag", null);
        setField(term306, term306.getClass(), "classNames", null);
        setField(term306, term306.getClass(), "parentNode", null);
        setField(term306, term306.getClass(), "childNodes", null);
        setField(term306, term306.getClass(), "attributes", null);
        setField(term306, term306.getClass(), "baseUri", null);
        LinkedList term288 = new LinkedList();
        ((LinkedList) term288).add(term291);
        ((LinkedList) term288).add(term306);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        ((LinkedList) term288).add((Object)null);
        term287 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term322 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term323 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term287, term287.getClass(), "stack", term288);
        setField(term322, term322.getClass(), "queue", null);
        setField(term287, term287.getClass(), "tq", term322);
        setField(term323, term323.getClass(), "tag", null);
        setField(term323, term323.getClass(), "classNames", null);
        setField(term323, term323.getClass(), "parentNode", null);
        setField(term323, term323.getClass(), "childNodes", null);
        setField(term323, term323.getClass(), "attributes", null);
        setField(term323, term323.getClass(), "baseUri", null);
        setField(term287, term287.getClass(), "doc", term323);
        setField(term287, term287.getClass(), "baseUri", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseComment", argTypes, term287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


