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

public class XmlTreeBuilder_insert_1967925292281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326556;
     Object term326798;
     Object term326934;
     Object term326939;

    public XmlTreeBuilder_insert_1967925292281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term326732 = new ArrayList();
        Object term326680 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term326680, term326680.getClass(), "childNodes", term326732);
        ArrayList term326608 = new ArrayList();
        ((ArrayList) term326608).add((Object)null);
        ((ArrayList) term326608).add(term326680);
        term326556 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term326556, term326556.getClass(), "stack", term326608);
        StringBuilder term326858 = new StringBuilder();
        term326798 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term326798, term326798.getClass(), "data", term326858);
        setBooleanField(term326798, term326798.getClass(), "bogus", false);
        ArrayList term326938 = new ArrayList();
        ((ArrayList) term326938).add((Object)null);
        Object term326937 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term326937, term326937.getClass(), "tag", null);
        setField(term326937, term326937.getClass(), "shadowChildrenRef", null);
        setField(term326937, term326937.getClass(), "childNodes", term326938);
        setField(term326937, term326937.getClass(), "attributes", null);
        setField(term326937, term326937.getClass(), "baseUri", null);
        setField(term326937, term326937.getClass(), "parentNode", null);
        setIntField(term326937, term326937.getClass(), "siblingIndex", 0);
        ArrayList term326935 = new ArrayList();
        ((ArrayList) term326935).add((Object)null);
        ((ArrayList) term326935).add(term326937);
        term326934 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term326934, term326934.getClass(), "reader", null);
        setField(term326934, term326934.getClass(), "tokeniser", null);
        setField(term326934, term326934.getClass(), "doc", null);
        setField(term326934, term326934.getClass(), "stack", term326935);
        setField(term326934, term326934.getClass(), "baseUri", null);
        setField(term326934, term326934.getClass(), "currentToken", null);
        setField(term326934, term326934.getClass(), "errors", null);
        setField(term326934, term326934.getClass(), "settings", null);
        setField(term326934, term326934.getClass(), "start", null);
        setField(term326934, term326934.getClass(), "end", null);
        term326939 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term326940 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term326941 = (byte[]) newByteArray(16);
        setField(term326940, term326940.getClass(), "value", term326941);
        setByteField(term326940, term326940.getClass(), "coder", (byte) 0);
        setIntField(term326940, term326940.getClass(), "count", 0);
        setField(term326939, term326939.getClass(), "data", term326940);
        setBooleanField(term326939, term326939.getClass(), "bogus", false);
        setField(term326939, term326939.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term326798;
        callMethod(klass, "insert", argTypes, term326556, args);
        assertTrue(recursiveEquals(term326556, term326934));
        assertTrue(recursiveEquals(term326798, term326939));
    }

};


