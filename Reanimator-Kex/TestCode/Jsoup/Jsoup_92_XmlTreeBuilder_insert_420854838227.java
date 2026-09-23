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

public class XmlTreeBuilder_insert_420854838227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284103;
     Object term284331;
     Object term284431;
     Object term284436;

    public XmlTreeBuilder_insert_420854838227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term284261 = new ArrayList();
        Object term284209 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term284209, term284209.getClass(), "childNodes", term284261);
        ArrayList term284155 = new ArrayList();
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add((Object)null);
        ((ArrayList) term284155).add(term284209);
        term284103 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term284103, term284103.getClass(), "stack", term284155);
        term284331 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term284331, term284331.getClass(), "data", "");
        ArrayList term284435 = new ArrayList();
        ((ArrayList) term284435).add((Object)null);
        Object term284434 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term284434, term284434.getClass(), "outputSettings", null);
        setField(term284434, term284434.getClass(), "parser", null);
        setField(term284434, term284434.getClass(), "quirksMode", null);
        setField(term284434, term284434.getClass(), "location", null);
        setBooleanField(term284434, term284434.getClass(), "updateMetaCharset", false);
        setField(term284434, term284434.getClass(), "tag", null);
        setField(term284434, term284434.getClass(), "shadowChildrenRef", null);
        setField(term284434, term284434.getClass(), "childNodes", term284435);
        setField(term284434, term284434.getClass(), "attributes", null);
        setField(term284434, term284434.getClass(), "baseUri", null);
        setField(term284434, term284434.getClass(), "parentNode", null);
        setIntField(term284434, term284434.getClass(), "siblingIndex", 0);
        ArrayList term284432 = new ArrayList();
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add((Object)null);
        ((ArrayList) term284432).add(term284434);
        term284431 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term284431, term284431.getClass(), "parser", null);
        setField(term284431, term284431.getClass(), "reader", null);
        setField(term284431, term284431.getClass(), "tokeniser", null);
        setField(term284431, term284431.getClass(), "doc", null);
        setField(term284431, term284431.getClass(), "stack", term284432);
        setField(term284431, term284431.getClass(), "baseUri", null);
        setField(term284431, term284431.getClass(), "currentToken", null);
        setField(term284431, term284431.getClass(), "settings", null);
        setField(term284431, term284431.getClass(), "start", null);
        setField(term284431, term284431.getClass(), "end", null);
        term284436 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term284436, term284436.getClass(), "data", "");
        setField(term284436, term284436.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term284331;
        callMethod(klass, "insert", argTypes, term284103, args);
        assertTrue(recursiveEquals(term284103, term284431));
        assertTrue(recursiveEquals(term284331, term284436));
    }

};


