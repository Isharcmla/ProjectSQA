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
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Boolean;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Character;

public class Parser_init_60704104118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term2229;

    public Parser_init_60704104118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Boolean(false);
        ArrayList term2234 = new ArrayList();
        Object term2232 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2233 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2235 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2233, term2233.getClass(), "tagName", null);
        setBooleanField(term2233, term2233.getClass(), "isBlock", false);
        setBooleanField(term2233, term2233.getClass(), "canContainBlock", true);
        setBooleanField(term2233, term2233.getClass(), "canContainInline", true);
        setBooleanField(term2233, term2233.getClass(), "optionalClosing", false);
        setBooleanField(term2233, term2233.getClass(), "empty", false);
        setBooleanField(term2233, term2233.getClass(), "preserveWhitespace", false);
        setField(term2233, term2233.getClass(), "ancestors", null);
        setField(term2232, term2232.getClass(), "tag", term2233);
        setField(term2232, term2232.getClass(), "classNames", null);
        setField(term2232, term2232.getClass(), "parentNode", null);
        setField(term2232, term2232.getClass(), "childNodes", term2234);
        setField(term2235, term2235.getClass(), "attributes", null);
        setField(term2232, term2232.getClass(), "attributes", term2235);
        setField(term2232, term2232.getClass(), "baseUri", "");
        LinkedList term2230 = new LinkedList();
        ((LinkedList) term2230).add(term2232);
        Character term2240 = new Character('P');
        Character term2242 = new Character('A');
        LinkedList term2238 = new LinkedList();
        ((LinkedList) term2238).add(term2240);
        ((LinkedList) term2238).add(term2242);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        ((LinkedList) term2238).add((Object)null);
        term2229 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term2237 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2229, term2229.getClass(), "stack", term2230);
        setField(term2237, term2237.getClass(), "queue", term2238);
        setField(term2229, term2229.getClass(), "tq", term2237);
        setField(term2229, term2229.getClass(), "doc", term2232);
        setField(term2229, term2229.getClass(), "baseUri", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2229));
        assertTrue(recursiveEquals(term25, false));
    }

};


