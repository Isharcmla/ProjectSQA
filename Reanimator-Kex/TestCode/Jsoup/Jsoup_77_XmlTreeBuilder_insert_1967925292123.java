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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236023;
     Object term236247;
     Object term236387;
     Object term236392;

    public XmlTreeBuilder_insert_1967925292123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term236181 = new ArrayList();
        Object term236129 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term236129, term236129.getClass(), "childNodes", term236181);
        ArrayList term236075 = new ArrayList();
        ((ArrayList) term236075).add((Object)null);
        ((ArrayList) term236075).add(term236129);
        term236023 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term236023, term236023.getClass(), "stack", term236075);
        StringBuilder term236307 = new StringBuilder();
        term236247 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term236247, term236247.getClass(), "data", term236307);
        setBooleanField(term236247, term236247.getClass(), "bogus", false);
        ArrayList term236391 = new ArrayList();
        ((ArrayList) term236391).add((Object)null);
        Object term236390 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term236390, term236390.getClass(), "outputSettings", null);
        setField(term236390, term236390.getClass(), "quirksMode", null);
        setField(term236390, term236390.getClass(), "location", null);
        setBooleanField(term236390, term236390.getClass(), "updateMetaCharset", false);
        setField(term236390, term236390.getClass(), "tag", null);
        setField(term236390, term236390.getClass(), "shadowChildrenRef", null);
        setField(term236390, term236390.getClass(), "childNodes", term236391);
        setField(term236390, term236390.getClass(), "attributes", null);
        setField(term236390, term236390.getClass(), "baseUri", null);
        setField(term236390, term236390.getClass(), "parentNode", null);
        setIntField(term236390, term236390.getClass(), "siblingIndex", 0);
        ArrayList term236388 = new ArrayList();
        ((ArrayList) term236388).add((Object)null);
        ((ArrayList) term236388).add(term236390);
        term236387 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term236387, term236387.getClass(), "reader", null);
        setField(term236387, term236387.getClass(), "tokeniser", null);
        setField(term236387, term236387.getClass(), "doc", null);
        setField(term236387, term236387.getClass(), "stack", term236388);
        setField(term236387, term236387.getClass(), "baseUri", null);
        setField(term236387, term236387.getClass(), "currentToken", null);
        setField(term236387, term236387.getClass(), "errors", null);
        setField(term236387, term236387.getClass(), "settings", null);
        setField(term236387, term236387.getClass(), "start", null);
        setField(term236387, term236387.getClass(), "end", null);
        term236392 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term236393 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term236394 = (byte[]) newByteArray(16);
        setField(term236393, term236393.getClass(), "value", term236394);
        setByteField(term236393, term236393.getClass(), "coder", (byte) 0);
        setIntField(term236393, term236393.getClass(), "count", 0);
        setField(term236392, term236392.getClass(), "data", term236393);
        setBooleanField(term236392, term236392.getClass(), "bogus", false);
        setField(term236392, term236392.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term236247;
        callMethod(klass, "insert", argTypes, term236023, args);
        assertTrue(recursiveEquals(term236023, term236387));
        assertTrue(recursiveEquals(term236247, term236392));
    }

};


