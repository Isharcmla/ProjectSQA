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

public class Parser_parseEndTag_118774657724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;

    public Parser_parseEndTag_118774657724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term417 = new HashSet();
        ArrayList term418 = new ArrayList();
        Object term409 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term410 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term421 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term410, term410.getClass(), "tagName", null);
        setBooleanField(term410, term410.getClass(), "isBlock", false);
        setBooleanField(term410, term410.getClass(), "canContainBlock", true);
        setBooleanField(term410, term410.getClass(), "canContainInline", true);
        setBooleanField(term410, term410.getClass(), "optionalClosing", false);
        setBooleanField(term410, term410.getClass(), "empty", false);
        setBooleanField(term410, term410.getClass(), "preserveWhitespace", false);
        setField(term410, term410.getClass(), "ancestors", null);
        setField(term409, term409.getClass(), "tag", term410);
        setField(term409, term409.getClass(), "classNames", term417);
        setField(term409, term409.getClass(), "parentNode", null);
        setField(term409, term409.getClass(), "childNodes", term418);
        setField(term421, term421.getClass(), "attributes", null);
        setField(term409, term409.getClass(), "attributes", term421);
        setField(term409, term409.getClass(), "baseUri", "");
        LinkedList term406 = new LinkedList();
        ((LinkedList) term406).add(term409);
        Character term428 = new Character('Z');
        Character term431 = new Character('t');
        LinkedList term425 = new LinkedList();
        ((LinkedList) term425).add(term428);
        ((LinkedList) term425).add(term431);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ((LinkedList) term425).add((Object)null);
        ArrayList term460 = new ArrayList();
        ((ArrayList) term460).add((Object)null);
        HashMap term465 = new HashMap();
        Set<Object> term23547 =  ((Map) term465).keySet();
        HashSet term464 = new HashSet((Collection<? extends Object>) term23547);
        ArrayList term471 = new ArrayList();
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        ((ArrayList) term471).add((Object)null);
        LinkedHashMap term476 = new LinkedHashMap();
        term405 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term424 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term440 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term441 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term475 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term405, term405.getClass(), "stack", term406);
        setField(term424, term424.getClass(), "queue", term425);
        setField(term405, term405.getClass(), "tq", term424);
        setField(term441, term441.getClass(), "tagName", "PapWxkhEWe");
        setBooleanField(term441, term441.getClass(), "isBlock", true);
        setBooleanField(term441, term441.getClass(), "canContainBlock", false);
        setBooleanField(term441, term441.getClass(), "canContainInline", false);
        setBooleanField(term441, term441.getClass(), "optionalClosing", true);
        setBooleanField(term441, term441.getClass(), "empty", true);
        setBooleanField(term441, term441.getClass(), "preserveWhitespace", true);
        setField(term441, term441.getClass(), "ancestors", term460);
        setField(term440, term440.getClass(), "tag", term441);
        setField(term440, term440.getClass(), "classNames", term464);
        setField(term440, term440.getClass(), "parentNode", null);
        setField(term440, term440.getClass(), "childNodes", term471);
        setField(term475, term475.getClass(), "attributes", term476);
        setField(term440, term440.getClass(), "attributes", term475);
        setField(term440, term440.getClass(), "baseUri", "ekxGuOYIwi");
        setField(term405, term405.getClass(), "doc", term440);
        setField(term405, term405.getClass(), "baseUri", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseEndTag", argTypes, term405, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


