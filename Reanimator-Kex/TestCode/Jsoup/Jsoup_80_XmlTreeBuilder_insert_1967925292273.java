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

public class XmlTreeBuilder_insert_1967925292273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322772;
     Object term323014;
     Object term323183;
     Object term323188;

    public XmlTreeBuilder_insert_1967925292273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term322948 = new ArrayList();
        Object term322896 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term322896, term322896.getClass(), "childNodes", term322948);
        ArrayList term322824 = new ArrayList();
        ((ArrayList) term322824).add(term322896);
        term322772 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term322772, term322772.getClass(), "stack", term322824);
        char[] term322600 = (char[]) newCharArray(0);
        StringBuilder term323074 = new StringBuilder();
        ((StringBuilder) term323074).append(term322600);
        term323014 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term323014, term323014.getClass(), "data", term323074);
        setBooleanField(term323014, term323014.getClass(), "bogus", true);
        ArrayList term323187 = new ArrayList();
        ((ArrayList) term323187).add((Object)null);
        Object term323186 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term323186, term323186.getClass(), "tag", null);
        setField(term323186, term323186.getClass(), "shadowChildrenRef", null);
        setField(term323186, term323186.getClass(), "childNodes", term323187);
        setField(term323186, term323186.getClass(), "attributes", null);
        setField(term323186, term323186.getClass(), "baseUri", null);
        setField(term323186, term323186.getClass(), "parentNode", null);
        setIntField(term323186, term323186.getClass(), "siblingIndex", 0);
        ArrayList term323184 = new ArrayList();
        ((ArrayList) term323184).add(term323186);
        term323183 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term323183, term323183.getClass(), "reader", null);
        setField(term323183, term323183.getClass(), "tokeniser", null);
        setField(term323183, term323183.getClass(), "doc", null);
        setField(term323183, term323183.getClass(), "stack", term323184);
        setField(term323183, term323183.getClass(), "baseUri", null);
        setField(term323183, term323183.getClass(), "currentToken", null);
        setField(term323183, term323183.getClass(), "errors", null);
        setField(term323183, term323183.getClass(), "settings", null);
        setField(term323183, term323183.getClass(), "start", null);
        setField(term323183, term323183.getClass(), "end", null);
        term323188 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term323189 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term323190 = (byte[]) newByteArray(16);
        setField(term323189, term323189.getClass(), "value", term323190);
        setByteField(term323189, term323189.getClass(), "coder", (byte) 0);
        setIntField(term323189, term323189.getClass(), "count", 0);
        setField(term323188, term323188.getClass(), "data", term323189);
        setBooleanField(term323188, term323188.getClass(), "bogus", true);
        setField(term323188, term323188.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term323014;
        callMethod(klass, "insert", argTypes, term322772, args);
        assertTrue(recursiveEquals(term322772, term323183));
        assertTrue(recursiveEquals(term323014, term323188));
    }

};


