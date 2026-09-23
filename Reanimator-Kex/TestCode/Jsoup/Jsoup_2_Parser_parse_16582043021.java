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

public class Parser_parse_16582043021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public Parser_parse_16582043021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term147 = new HashSet();
        ArrayList term148 = new ArrayList();
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        ((ArrayList) term148).add((Object)null);
        Object term139 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term140 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term140, term140.getClass(), "tagName", null);
        setBooleanField(term140, term140.getClass(), "isBlock", false);
        setBooleanField(term140, term140.getClass(), "canContainBlock", false);
        setBooleanField(term140, term140.getClass(), "canContainInline", false);
        setBooleanField(term140, term140.getClass(), "optionalClosing", true);
        setBooleanField(term140, term140.getClass(), "empty", true);
        setBooleanField(term140, term140.getClass(), "preserveWhitespace", true);
        setField(term140, term140.getClass(), "ancestors", null);
        setField(term139, term139.getClass(), "tag", term140);
        setField(term139, term139.getClass(), "classNames", term147);
        setField(term139, term139.getClass(), "parentNode", null);
        setField(term139, term139.getClass(), "childNodes", term148);
        setField(term151, term151.getClass(), "attributes", null);
        setField(term139, term139.getClass(), "attributes", term151);
        setField(term139, term139.getClass(), "baseUri", "");
        Object term154 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term154, term154.getClass(), "tag", null);
        setField(term154, term154.getClass(), "classNames", null);
        setField(term154, term154.getClass(), "parentNode", null);
        setField(term154, term154.getClass(), "childNodes", null);
        setField(term154, term154.getClass(), "attributes", null);
        setField(term154, term154.getClass(), "baseUri", null);
        LinkedList term136 = new LinkedList();
        ((LinkedList) term136).add(term139);
        ((LinkedList) term136).add(term154);
        ((LinkedList) term136).add((Object)null);
        ((LinkedList) term136).add((Object)null);
        ((LinkedList) term136).add((Object)null);
        Character term178 = new Character('P');
        Character term181 = new Character('A');
        LinkedList term175 = new LinkedList();
        ((LinkedList) term175).add(term178);
        ((LinkedList) term175).add(term181);
        ((LinkedList) term175).add((Object)null);
        ((LinkedList) term175).add((Object)null);
        ((LinkedList) term175).add((Object)null);
        ((LinkedList) term175).add((Object)null);
        ArrayList term210 = new ArrayList();
        ((ArrayList) term210).add((Object)null);
        ((ArrayList) term210).add((Object)null);
        ((ArrayList) term210).add((Object)null);
        ((ArrayList) term210).add((Object)null);
        ((ArrayList) term210).add((Object)null);
        ((ArrayList) term210).add((Object)null);
        HashMap term215 = new HashMap();
        Set<Object> term22639 =  ((Map) term215).keySet();
        HashSet term214 = new HashSet((Collection<? extends Object>) term22639);
        ArrayList term221 = new ArrayList();
        ((ArrayList) term221).add((Object)null);
        LinkedHashMap term226 = new LinkedHashMap();
        term135 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term174 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term190 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term191 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term225 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term135, term135.getClass(), "stack", term136);
        setField(term174, term174.getClass(), "queue", term175);
        setField(term135, term135.getClass(), "tq", term174);
        setField(term191, term191.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term191, term191.getClass(), "isBlock", true);
        setBooleanField(term191, term191.getClass(), "canContainBlock", true);
        setBooleanField(term191, term191.getClass(), "canContainInline", false);
        setBooleanField(term191, term191.getClass(), "optionalClosing", false);
        setBooleanField(term191, term191.getClass(), "empty", false);
        setBooleanField(term191, term191.getClass(), "preserveWhitespace", true);
        setField(term191, term191.getClass(), "ancestors", term210);
        setField(term190, term190.getClass(), "tag", term191);
        setField(term190, term190.getClass(), "classNames", term214);
        setField(term190, term190.getClass(), "parentNode", null);
        setField(term190, term190.getClass(), "childNodes", term221);
        setField(term225, term225.getClass(), "attributes", term226);
        setField(term190, term190.getClass(), "attributes", term225);
        setField(term190, term190.getClass(), "baseUri", "AijpHYOFuy");
        setField(term135, term135.getClass(), "doc", term190);
        setField(term135, term135.getClass(), "baseUri", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


