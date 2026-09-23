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

public class XmlTreeBuilder_insert_1967925292247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291102;
     Object term291344;
     Object term291515;
     Object term291520;

    public XmlTreeBuilder_insert_1967925292247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term291278 = new ArrayList();
        Object term291226 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term291226, term291226.getClass(), "childNodes", term291278);
        ArrayList term291154 = new ArrayList();
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add((Object)null);
        ((ArrayList) term291154).add(term291226);
        term291102 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term291102, term291102.getClass(), "stack", term291154);
        char[] term290928 = (char[]) newCharArray(0);
        StringBuilder term291404 = new StringBuilder();
        ((StringBuilder) term291404).append(term290928);
        term291344 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term291344, term291344.getClass(), "data", term291404);
        setBooleanField(term291344, term291344.getClass(), "bogus", true);
        ArrayList term291519 = new ArrayList();
        ((ArrayList) term291519).add((Object)null);
        Object term291518 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term291518, term291518.getClass(), "tag", null);
        setField(term291518, term291518.getClass(), "shadowChildrenRef", null);
        setField(term291518, term291518.getClass(), "childNodes", term291519);
        setField(term291518, term291518.getClass(), "attributes", null);
        setField(term291518, term291518.getClass(), "baseUri", null);
        setField(term291518, term291518.getClass(), "parentNode", null);
        setIntField(term291518, term291518.getClass(), "siblingIndex", 0);
        ArrayList term291516 = new ArrayList();
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add((Object)null);
        ((ArrayList) term291516).add(term291518);
        term291515 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term291515, term291515.getClass(), "parser", null);
        setField(term291515, term291515.getClass(), "reader", null);
        setField(term291515, term291515.getClass(), "tokeniser", null);
        setField(term291515, term291515.getClass(), "doc", null);
        setField(term291515, term291515.getClass(), "stack", term291516);
        setField(term291515, term291515.getClass(), "baseUri", null);
        setField(term291515, term291515.getClass(), "currentToken", null);
        setField(term291515, term291515.getClass(), "settings", null);
        setField(term291515, term291515.getClass(), "start", null);
        setField(term291515, term291515.getClass(), "end", null);
        term291520 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term291521 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term291522 = (byte[]) newByteArray(16);
        setField(term291521, term291521.getClass(), "value", term291522);
        setByteField(term291521, term291521.getClass(), "coder", (byte) 0);
        setIntField(term291521, term291521.getClass(), "count", 0);
        setField(term291520, term291520.getClass(), "data", term291521);
        setBooleanField(term291520, term291520.getClass(), "bogus", true);
        setField(term291520, term291520.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term291344;
        callMethod(klass, "insert", argTypes, term291102, args);
        assertTrue(recursiveEquals(term291102, term291515));
        assertTrue(recursiveEquals(term291344, term291520));
    }

};


