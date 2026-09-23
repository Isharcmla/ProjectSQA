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

public class XmlTreeBuilder_insert_196792529285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216666;
     Object term216896;
     Object term217065;
     Object term217070;

    public XmlTreeBuilder_insert_196792529285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term216830 = new ArrayList();
        Object term216778 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term216778, term216778.getClass(), "childNodes", term216830);
        ArrayList term216718 = new ArrayList();
        ((ArrayList) term216718).add(term216778);
        term216666 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term216666, term216666.getClass(), "stack", term216718);
        char[] term216494 = (char[]) newCharArray(0);
        StringBuilder term216956 = new StringBuilder();
        ((StringBuilder) term216956).append(term216494);
        term216896 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term216896, term216896.getClass(), "data", term216956);
        setBooleanField(term216896, term216896.getClass(), "bogus", true);
        ArrayList term217069 = new ArrayList();
        ((ArrayList) term217069).add((Object)null);
        Object term217068 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term217068, term217068.getClass(), "elements", null);
        setField(term217068, term217068.getClass(), "tag", null);
        setField(term217068, term217068.getClass(), "shadowChildrenRef", null);
        setField(term217068, term217068.getClass(), "childNodes", term217069);
        setField(term217068, term217068.getClass(), "attributes", null);
        setField(term217068, term217068.getClass(), "baseUri", null);
        setField(term217068, term217068.getClass(), "parentNode", null);
        setIntField(term217068, term217068.getClass(), "siblingIndex", 0);
        ArrayList term217066 = new ArrayList();
        ((ArrayList) term217066).add(term217068);
        term217065 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term217065, term217065.getClass(), "reader", null);
        setField(term217065, term217065.getClass(), "tokeniser", null);
        setField(term217065, term217065.getClass(), "doc", null);
        setField(term217065, term217065.getClass(), "stack", term217066);
        setField(term217065, term217065.getClass(), "baseUri", null);
        setField(term217065, term217065.getClass(), "currentToken", null);
        setField(term217065, term217065.getClass(), "errors", null);
        setField(term217065, term217065.getClass(), "settings", null);
        setField(term217065, term217065.getClass(), "start", null);
        setField(term217065, term217065.getClass(), "end", null);
        term217070 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term217071 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term217072 = (byte[]) newByteArray(16);
        setField(term217071, term217071.getClass(), "value", term217072);
        setByteField(term217071, term217071.getClass(), "coder", (byte) 0);
        setIntField(term217071, term217071.getClass(), "count", 0);
        setField(term217070, term217070.getClass(), "data", term217071);
        setBooleanField(term217070, term217070.getClass(), "bogus", true);
        setField(term217070, term217070.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term216896;
        callMethod(klass, "insert", argTypes, term216666, args);
        assertTrue(recursiveEquals(term216666, term217065));
        assertTrue(recursiveEquals(term216896, term217070));
    }

};


