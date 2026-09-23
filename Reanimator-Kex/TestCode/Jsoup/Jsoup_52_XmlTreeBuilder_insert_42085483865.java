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
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_42085483865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85262;
     Object term85528;
     Object term85623;
     Object term85629;

    public XmlTreeBuilder_insert_42085483865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85352 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term85458 = new ArrayList();
        Object term85406 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term85406, term85406.getClass(), "childNodes", term85458);
        ArrayList term85314 = new ArrayList();
        ((ArrayList) term85314).add(term85352);
        ((ArrayList) term85314).add(term85406);
        term85262 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term85262, term85262.getClass(), "baseUri", null);
        setField(term85262, term85262.getClass(), "stack", term85314);
        term85528 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term85528, term85528.getClass(), "data", "");
        Object term85626 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term85628 = new ArrayList();
        ((ArrayList) term85628).add((Object)null);
        Object term85627 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term85627, term85627.getClass(), "outputSettings", null);
        setField(term85627, term85627.getClass(), "quirksMode", null);
        setField(term85627, term85627.getClass(), "location", null);
        setBooleanField(term85627, term85627.getClass(), "updateMetaCharset", false);
        setField(term85627, term85627.getClass(), "tag", null);
        setField(term85627, term85627.getClass(), "parentNode", null);
        setField(term85627, term85627.getClass(), "childNodes", term85628);
        setField(term85627, term85627.getClass(), "attributes", null);
        setField(term85627, term85627.getClass(), "baseUri", null);
        setIntField(term85627, term85627.getClass(), "siblingIndex", 0);
        ArrayList term85624 = new ArrayList();
        ((ArrayList) term85624).add(term85626);
        ((ArrayList) term85624).add(term85627);
        term85623 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term85623, term85623.getClass(), "reader", null);
        setField(term85623, term85623.getClass(), "tokeniser", null);
        setField(term85623, term85623.getClass(), "doc", null);
        setField(term85623, term85623.getClass(), "stack", term85624);
        setField(term85623, term85623.getClass(), "baseUri", null);
        setField(term85623, term85623.getClass(), "currentToken", null);
        setField(term85623, term85623.getClass(), "errors", null);
        setField(term85623, term85623.getClass(), "start", null);
        setField(term85623, term85623.getClass(), "end", null);
        term85629 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term85629, term85629.getClass(), "data", "");
        setField(term85629, term85629.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term85528;
        callMethod(klass, "insert", argTypes, term85262, args);
        assertTrue(recursiveEquals(term85262, term85623));
        assertTrue(recursiveEquals(term85528, term85629));
    }

};


