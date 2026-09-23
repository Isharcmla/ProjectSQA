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

public class XmlTreeBuilder_insert_1967925292433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372080;
     Object term372348;
     Object term373025;
     Object term373031;

    public XmlTreeBuilder_insert_1967925292433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term372170 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term372282 = new ArrayList();
        Object term372230 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term372230, term372230.getClass(), "childNodes", term372282);
        ArrayList term372132 = new ArrayList();
        ((ArrayList) term372132).add(term372170);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add((Object)null);
        ((ArrayList) term372132).add(term372230);
        term372080 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term372080, term372080.getClass(), "stack", term372132);
        char[] term371824 = (char[]) newCharArray(41);
        StringBuilder term372408 = new StringBuilder();
        ((StringBuilder) term372408).append(term371824);
        term372348 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term372348, term372348.getClass(), "data", term372408);
        setBooleanField(term372348, term372348.getClass(), "bogus", false);
        Object term373028 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term373030 = new ArrayList();
        ((ArrayList) term373030).add((Object)null);
        Object term373029 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term373029, term373029.getClass(), "elements", null);
        setField(term373029, term373029.getClass(), "tag", null);
        setField(term373029, term373029.getClass(), "shadowChildrenRef", null);
        setField(term373029, term373029.getClass(), "childNodes", term373030);
        setField(term373029, term373029.getClass(), "attributes", null);
        setField(term373029, term373029.getClass(), "baseUri", null);
        setField(term373029, term373029.getClass(), "parentNode", null);
        setIntField(term373029, term373029.getClass(), "siblingIndex", 0);
        ArrayList term373026 = new ArrayList();
        ((ArrayList) term373026).add(term373028);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add((Object)null);
        ((ArrayList) term373026).add(term373029);
        term373025 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term373025, term373025.getClass(), "parser", null);
        setField(term373025, term373025.getClass(), "reader", null);
        setField(term373025, term373025.getClass(), "tokeniser", null);
        setField(term373025, term373025.getClass(), "doc", null);
        setField(term373025, term373025.getClass(), "stack", term373026);
        setField(term373025, term373025.getClass(), "baseUri", null);
        setField(term373025, term373025.getClass(), "currentToken", null);
        setField(term373025, term373025.getClass(), "settings", null);
        setField(term373025, term373025.getClass(), "start", null);
        setField(term373025, term373025.getClass(), "end", null);
        term373031 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term373032 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term373033 = (byte[]) newByteArray(41);
        setField(term373032, term373032.getClass(), "value", term373033);
        setByteField(term373032, term373032.getClass(), "coder", (byte) 0);
        setIntField(term373032, term373032.getClass(), "count", 41);
        setField(term373031, term373031.getClass(), "data", term373032);
        setBooleanField(term373031, term373031.getClass(), "bogus", false);
        setField(term373031, term373031.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term372348;
        callMethod(klass, "insert", argTypes, term372080, args);
        assertTrue(recursiveEquals(term372080, term373025));
        assertTrue(recursiveEquals(term372348, term373031));
    }

};


