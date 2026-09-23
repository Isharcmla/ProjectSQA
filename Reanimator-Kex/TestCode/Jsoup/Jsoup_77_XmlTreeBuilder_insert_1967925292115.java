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

public class XmlTreeBuilder_insert_1967925292115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233233;
     Object term233475;
     Object term233644;
     Object term233649;

    public XmlTreeBuilder_insert_1967925292115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term233409 = new ArrayList();
        Object term233357 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term233357, term233357.getClass(), "childNodes", term233409);
        ArrayList term233285 = new ArrayList();
        ((ArrayList) term233285).add(term233357);
        term233233 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233233, term233233.getClass(), "stack", term233285);
        char[] term233061 = (char[]) newCharArray(0);
        StringBuilder term233535 = new StringBuilder();
        ((StringBuilder) term233535).append(term233061);
        term233475 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term233475, term233475.getClass(), "data", term233535);
        setBooleanField(term233475, term233475.getClass(), "bogus", true);
        ArrayList term233648 = new ArrayList();
        ((ArrayList) term233648).add((Object)null);
        Object term233647 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term233647, term233647.getClass(), "tag", null);
        setField(term233647, term233647.getClass(), "shadowChildrenRef", null);
        setField(term233647, term233647.getClass(), "childNodes", term233648);
        setField(term233647, term233647.getClass(), "attributes", null);
        setField(term233647, term233647.getClass(), "baseUri", null);
        setField(term233647, term233647.getClass(), "parentNode", null);
        setIntField(term233647, term233647.getClass(), "siblingIndex", 0);
        ArrayList term233645 = new ArrayList();
        ((ArrayList) term233645).add(term233647);
        term233644 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233644, term233644.getClass(), "reader", null);
        setField(term233644, term233644.getClass(), "tokeniser", null);
        setField(term233644, term233644.getClass(), "doc", null);
        setField(term233644, term233644.getClass(), "stack", term233645);
        setField(term233644, term233644.getClass(), "baseUri", null);
        setField(term233644, term233644.getClass(), "currentToken", null);
        setField(term233644, term233644.getClass(), "errors", null);
        setField(term233644, term233644.getClass(), "settings", null);
        setField(term233644, term233644.getClass(), "start", null);
        setField(term233644, term233644.getClass(), "end", null);
        term233649 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term233650 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term233651 = (byte[]) newByteArray(16);
        setField(term233650, term233650.getClass(), "value", term233651);
        setByteField(term233650, term233650.getClass(), "coder", (byte) 0);
        setIntField(term233650, term233650.getClass(), "count", 0);
        setField(term233649, term233649.getClass(), "data", term233650);
        setBooleanField(term233649, term233649.getClass(), "bogus", true);
        setField(term233649, term233649.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term233475;
        callMethod(klass, "insert", argTypes, term233233, args);
        assertTrue(recursiveEquals(term233233, term233644));
        assertTrue(recursiveEquals(term233475, term233649));
    }

};


