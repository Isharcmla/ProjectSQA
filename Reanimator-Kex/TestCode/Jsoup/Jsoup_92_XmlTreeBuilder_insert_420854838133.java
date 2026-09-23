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

public class XmlTreeBuilder_insert_420854838133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233223;
     Object term233443;
     Object term233543;
     Object term233548;

    public XmlTreeBuilder_insert_420854838133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term233381 = new ArrayList();
        Object term233329 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term233329, term233329.getClass(), "childNodes", term233381);
        ArrayList term233275 = new ArrayList();
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add((Object)null);
        ((ArrayList) term233275).add(term233329);
        term233223 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233223, term233223.getClass(), "stack", term233275);
        term233443 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term233443, term233443.getClass(), "data", "");
        ArrayList term233547 = new ArrayList();
        ((ArrayList) term233547).add((Object)null);
        Object term233546 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term233546, term233546.getClass(), "outputSettings", null);
        setField(term233546, term233546.getClass(), "parser", null);
        setField(term233546, term233546.getClass(), "quirksMode", null);
        setField(term233546, term233546.getClass(), "location", null);
        setBooleanField(term233546, term233546.getClass(), "updateMetaCharset", false);
        setField(term233546, term233546.getClass(), "tag", null);
        setField(term233546, term233546.getClass(), "shadowChildrenRef", null);
        setField(term233546, term233546.getClass(), "childNodes", term233547);
        setField(term233546, term233546.getClass(), "attributes", null);
        setField(term233546, term233546.getClass(), "baseUri", null);
        setField(term233546, term233546.getClass(), "parentNode", null);
        setIntField(term233546, term233546.getClass(), "siblingIndex", 0);
        ArrayList term233544 = new ArrayList();
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add((Object)null);
        ((ArrayList) term233544).add(term233546);
        term233543 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233543, term233543.getClass(), "parser", null);
        setField(term233543, term233543.getClass(), "reader", null);
        setField(term233543, term233543.getClass(), "tokeniser", null);
        setField(term233543, term233543.getClass(), "doc", null);
        setField(term233543, term233543.getClass(), "stack", term233544);
        setField(term233543, term233543.getClass(), "baseUri", null);
        setField(term233543, term233543.getClass(), "currentToken", null);
        setField(term233543, term233543.getClass(), "settings", null);
        setField(term233543, term233543.getClass(), "start", null);
        setField(term233543, term233543.getClass(), "end", null);
        term233548 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term233548, term233548.getClass(), "data", "");
        setField(term233548, term233548.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term233443;
        callMethod(klass, "insert", argTypes, term233223, args);
        assertTrue(recursiveEquals(term233223, term233543));
        assertTrue(recursiveEquals(term233443, term233548));
    }

};


