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

public class XmlTreeBuilder_insert_1967925292111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225248;
     Object term225472;
     Object term225612;
     Object term225617;

    public XmlTreeBuilder_insert_1967925292111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225406 = new ArrayList();
        Object term225354 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term225354, term225354.getClass(), "childNodes", term225406);
        ArrayList term225300 = new ArrayList();
        ((ArrayList) term225300).add(term225354);
        term225248 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term225248, term225248.getClass(), "stack", term225300);
        StringBuilder term225532 = new StringBuilder();
        term225472 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term225472, term225472.getClass(), "data", term225532);
        setBooleanField(term225472, term225472.getClass(), "bogus", false);
        ArrayList term225616 = new ArrayList();
        ((ArrayList) term225616).add((Object)null);
        Object term225615 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term225615, term225615.getClass(), "outputSettings", null);
        setField(term225615, term225615.getClass(), "parser", null);
        setField(term225615, term225615.getClass(), "quirksMode", null);
        setField(term225615, term225615.getClass(), "location", null);
        setBooleanField(term225615, term225615.getClass(), "updateMetaCharset", false);
        setField(term225615, term225615.getClass(), "tag", null);
        setField(term225615, term225615.getClass(), "shadowChildrenRef", null);
        setField(term225615, term225615.getClass(), "childNodes", term225616);
        setField(term225615, term225615.getClass(), "attributes", null);
        setField(term225615, term225615.getClass(), "baseUri", null);
        setField(term225615, term225615.getClass(), "parentNode", null);
        setIntField(term225615, term225615.getClass(), "siblingIndex", 0);
        ArrayList term225613 = new ArrayList();
        ((ArrayList) term225613).add(term225615);
        term225612 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term225612, term225612.getClass(), "parser", null);
        setField(term225612, term225612.getClass(), "reader", null);
        setField(term225612, term225612.getClass(), "tokeniser", null);
        setField(term225612, term225612.getClass(), "doc", null);
        setField(term225612, term225612.getClass(), "stack", term225613);
        setField(term225612, term225612.getClass(), "baseUri", null);
        setField(term225612, term225612.getClass(), "currentToken", null);
        setField(term225612, term225612.getClass(), "settings", null);
        setField(term225612, term225612.getClass(), "start", null);
        setField(term225612, term225612.getClass(), "end", null);
        term225617 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term225618 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term225619 = (byte[]) newByteArray(16);
        setField(term225618, term225618.getClass(), "value", term225619);
        setByteField(term225618, term225618.getClass(), "coder", (byte) 0);
        setIntField(term225618, term225618.getClass(), "count", 0);
        setField(term225617, term225617.getClass(), "data", term225618);
        setBooleanField(term225617, term225617.getClass(), "bogus", false);
        setField(term225617, term225617.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term225472;
        callMethod(klass, "insert", argTypes, term225248, args);
        assertTrue(recursiveEquals(term225248, term225612));
        assertTrue(recursiveEquals(term225472, term225617));
    }

};


