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

public class XmlTreeBuilder_insert_1967925292191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269247;
     Object term269477;
     Object term269664;
     Object term269669;

    public XmlTreeBuilder_insert_1967925292191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term269411 = new ArrayList();
        Object term269359 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term269359, term269359.getClass(), "childNodes", term269411);
        ArrayList term269299 = new ArrayList();
        ((ArrayList) term269299).add(term269359);
        term269247 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term269247, term269247.getClass(), "stack", term269299);
        char[] term269073 = (char[]) newCharArray(0);
        StringBuilder term269537 = new StringBuilder();
        ((StringBuilder) term269537).append(term269073);
        term269477 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term269477, term269477.getClass(), "data", term269537);
        setBooleanField(term269477, term269477.getClass(), "bogus", true);
        ArrayList term269668 = new ArrayList();
        ((ArrayList) term269668).add((Object)null);
        Object term269667 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term269667, term269667.getClass(), "elements", null);
        setField(term269667, term269667.getClass(), "tag", null);
        setField(term269667, term269667.getClass(), "shadowChildrenRef", null);
        setField(term269667, term269667.getClass(), "childNodes", term269668);
        setField(term269667, term269667.getClass(), "attributes", null);
        setField(term269667, term269667.getClass(), "baseUri", null);
        setField(term269667, term269667.getClass(), "parentNode", null);
        setIntField(term269667, term269667.getClass(), "siblingIndex", 0);
        ArrayList term269665 = new ArrayList();
        ((ArrayList) term269665).add(term269667);
        term269664 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term269664, term269664.getClass(), "parser", null);
        setField(term269664, term269664.getClass(), "reader", null);
        setField(term269664, term269664.getClass(), "tokeniser", null);
        setField(term269664, term269664.getClass(), "doc", null);
        setField(term269664, term269664.getClass(), "stack", term269665);
        setField(term269664, term269664.getClass(), "baseUri", null);
        setField(term269664, term269664.getClass(), "currentToken", null);
        setField(term269664, term269664.getClass(), "settings", null);
        setField(term269664, term269664.getClass(), "start", null);
        setField(term269664, term269664.getClass(), "end", null);
        term269669 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term269670 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term269671 = (byte[]) newByteArray(16);
        setField(term269670, term269670.getClass(), "value", term269671);
        setByteField(term269670, term269670.getClass(), "coder", (byte) 0);
        setIntField(term269670, term269670.getClass(), "count", 0);
        setField(term269669, term269669.getClass(), "data", term269670);
        setBooleanField(term269669, term269669.getClass(), "bogus", true);
        setField(term269669, term269669.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term269477;
        callMethod(klass, "insert", argTypes, term269247, args);
        assertTrue(recursiveEquals(term269247, term269664));
        assertTrue(recursiveEquals(term269477, term269669));
    }

};


