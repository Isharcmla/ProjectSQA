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

public class XmlTreeBuilder_insert_1967925292353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340306;
     Object term340536;
     Object term344172;
     Object term344177;

    public XmlTreeBuilder_insert_1967925292353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term340470 = new ArrayList();
        Object term340418 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term340418, term340418.getClass(), "childNodes", term340470);
        ArrayList term340358 = new ArrayList();
        ((ArrayList) term340358).add((Object)null);
        ((ArrayList) term340358).add(term340418);
        term340306 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term340306, term340306.getClass(), "stack", term340358);
        StringBuilder term340596 = new StringBuilder();
        term340536 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term340536, term340536.getClass(), "data", term340596);
        setBooleanField(term340536, term340536.getClass(), "bogus", false);
        ArrayList term344176 = new ArrayList();
        ((ArrayList) term344176).add((Object)null);
        Object term344175 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term344175, term344175.getClass(), "elements", null);
        setField(term344175, term344175.getClass(), "tag", null);
        setField(term344175, term344175.getClass(), "shadowChildrenRef", null);
        setField(term344175, term344175.getClass(), "childNodes", term344176);
        setField(term344175, term344175.getClass(), "attributes", null);
        setField(term344175, term344175.getClass(), "baseUri", null);
        setField(term344175, term344175.getClass(), "parentNode", null);
        setIntField(term344175, term344175.getClass(), "siblingIndex", 0);
        ArrayList term344173 = new ArrayList();
        ((ArrayList) term344173).add((Object)null);
        ((ArrayList) term344173).add(term344175);
        term344172 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term344172, term344172.getClass(), "parser", null);
        setField(term344172, term344172.getClass(), "reader", null);
        setField(term344172, term344172.getClass(), "tokeniser", null);
        setField(term344172, term344172.getClass(), "doc", null);
        setField(term344172, term344172.getClass(), "stack", term344173);
        setField(term344172, term344172.getClass(), "baseUri", null);
        setField(term344172, term344172.getClass(), "currentToken", null);
        setField(term344172, term344172.getClass(), "settings", null);
        setField(term344172, term344172.getClass(), "start", null);
        setField(term344172, term344172.getClass(), "end", null);
        term344177 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term344178 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term344179 = (byte[]) newByteArray(16);
        setField(term344178, term344178.getClass(), "value", term344179);
        setByteField(term344178, term344178.getClass(), "coder", (byte) 0);
        setIntField(term344178, term344178.getClass(), "count", 0);
        setField(term344177, term344177.getClass(), "data", term344178);
        setBooleanField(term344177, term344177.getClass(), "bogus", false);
        setField(term344177, term344177.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term340536;
        callMethod(klass, "insert", argTypes, term340306, args);
        assertTrue(recursiveEquals(term340306, term344172));
        assertTrue(recursiveEquals(term340536, term344177));
    }

};


