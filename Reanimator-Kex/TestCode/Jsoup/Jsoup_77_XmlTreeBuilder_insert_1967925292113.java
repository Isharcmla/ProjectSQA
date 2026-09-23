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

public class XmlTreeBuilder_insert_1967925292113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232616;
     Object term232840;
     Object term233016;
     Object term233021;

    public XmlTreeBuilder_insert_1967925292113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term232774 = new ArrayList();
        Object term232722 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term232722, term232722.getClass(), "childNodes", term232774);
        ArrayList term232668 = new ArrayList();
        ((ArrayList) term232668).add(term232722);
        term232616 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term232616, term232616.getClass(), "stack", term232668);
        char[] term232444 = (char[]) newCharArray(0);
        StringBuilder term232900 = new StringBuilder();
        ((StringBuilder) term232900).append(term232444);
        term232840 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term232840, term232840.getClass(), "data", term232900);
        setBooleanField(term232840, term232840.getClass(), "bogus", true);
        ArrayList term233020 = new ArrayList();
        ((ArrayList) term233020).add((Object)null);
        Object term233019 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term233019, term233019.getClass(), "outputSettings", null);
        setField(term233019, term233019.getClass(), "quirksMode", null);
        setField(term233019, term233019.getClass(), "location", null);
        setBooleanField(term233019, term233019.getClass(), "updateMetaCharset", false);
        setField(term233019, term233019.getClass(), "tag", null);
        setField(term233019, term233019.getClass(), "shadowChildrenRef", null);
        setField(term233019, term233019.getClass(), "childNodes", term233020);
        setField(term233019, term233019.getClass(), "attributes", null);
        setField(term233019, term233019.getClass(), "baseUri", null);
        setField(term233019, term233019.getClass(), "parentNode", null);
        setIntField(term233019, term233019.getClass(), "siblingIndex", 0);
        ArrayList term233017 = new ArrayList();
        ((ArrayList) term233017).add(term233019);
        term233016 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233016, term233016.getClass(), "reader", null);
        setField(term233016, term233016.getClass(), "tokeniser", null);
        setField(term233016, term233016.getClass(), "doc", null);
        setField(term233016, term233016.getClass(), "stack", term233017);
        setField(term233016, term233016.getClass(), "baseUri", null);
        setField(term233016, term233016.getClass(), "currentToken", null);
        setField(term233016, term233016.getClass(), "errors", null);
        setField(term233016, term233016.getClass(), "settings", null);
        setField(term233016, term233016.getClass(), "start", null);
        setField(term233016, term233016.getClass(), "end", null);
        term233021 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term233022 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term233023 = (byte[]) newByteArray(16);
        setField(term233022, term233022.getClass(), "value", term233023);
        setByteField(term233022, term233022.getClass(), "coder", (byte) 0);
        setIntField(term233022, term233022.getClass(), "count", 0);
        setField(term233021, term233021.getClass(), "data", term233022);
        setBooleanField(term233021, term233021.getClass(), "bogus", true);
        setField(term233021, term233021.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term232840;
        callMethod(klass, "insert", argTypes, term232616, args);
        assertTrue(recursiveEquals(term232616, term233016));
        assertTrue(recursiveEquals(term232840, term233021));
    }

};


