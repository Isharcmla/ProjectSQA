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

public class XmlTreeBuilder_insert_420854838247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305914;
     Object term306134;
     Object term306234;
     Object term306239;

    public XmlTreeBuilder_insert_420854838247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term306072 = new ArrayList();
        Object term306020 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term306020, term306020.getClass(), "childNodes", term306072);
        ArrayList term305966 = new ArrayList();
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add((Object)null);
        ((ArrayList) term305966).add(term306020);
        term305914 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term305914, term305914.getClass(), "stack", term305966);
        term306134 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term306134, term306134.getClass(), "data", "");
        ArrayList term306238 = new ArrayList();
        ((ArrayList) term306238).add((Object)null);
        Object term306237 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term306237, term306237.getClass(), "outputSettings", null);
        setField(term306237, term306237.getClass(), "quirksMode", null);
        setField(term306237, term306237.getClass(), "location", null);
        setBooleanField(term306237, term306237.getClass(), "updateMetaCharset", false);
        setField(term306237, term306237.getClass(), "tag", null);
        setField(term306237, term306237.getClass(), "shadowChildrenRef", null);
        setField(term306237, term306237.getClass(), "childNodes", term306238);
        setField(term306237, term306237.getClass(), "attributes", null);
        setField(term306237, term306237.getClass(), "baseUri", null);
        setField(term306237, term306237.getClass(), "parentNode", null);
        setIntField(term306237, term306237.getClass(), "siblingIndex", 0);
        ArrayList term306235 = new ArrayList();
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add((Object)null);
        ((ArrayList) term306235).add(term306237);
        term306234 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term306234, term306234.getClass(), "reader", null);
        setField(term306234, term306234.getClass(), "tokeniser", null);
        setField(term306234, term306234.getClass(), "doc", null);
        setField(term306234, term306234.getClass(), "stack", term306235);
        setField(term306234, term306234.getClass(), "baseUri", null);
        setField(term306234, term306234.getClass(), "currentToken", null);
        setField(term306234, term306234.getClass(), "errors", null);
        setField(term306234, term306234.getClass(), "settings", null);
        setField(term306234, term306234.getClass(), "start", null);
        setField(term306234, term306234.getClass(), "end", null);
        term306239 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term306239, term306239.getClass(), "data", "");
        setField(term306239, term306239.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term306134;
        callMethod(klass, "insert", argTypes, term305914, args);
        assertTrue(recursiveEquals(term305914, term306234));
        assertTrue(recursiveEquals(term306134, term306239));
    }

};


