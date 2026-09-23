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

public class XmlTreeBuilder_insert_420854838135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240161;
     Object term240395;
     Object term240491;
     Object term240496;

    public XmlTreeBuilder_insert_420854838135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term240325 = new ArrayList();
        Object term240273 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term240273, term240273.getClass(), "childNodes", term240325);
        ArrayList term240213 = new ArrayList();
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add((Object)null);
        ((ArrayList) term240213).add(term240273);
        term240161 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term240161, term240161.getClass(), "stack", term240213);
        term240395 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term240395, term240395.getClass(), "data", "");
        ArrayList term240495 = new ArrayList();
        ((ArrayList) term240495).add((Object)null);
        Object term240494 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term240494, term240494.getClass(), "elements", null);
        setField(term240494, term240494.getClass(), "tag", null);
        setField(term240494, term240494.getClass(), "shadowChildrenRef", null);
        setField(term240494, term240494.getClass(), "childNodes", term240495);
        setField(term240494, term240494.getClass(), "attributes", null);
        setField(term240494, term240494.getClass(), "baseUri", null);
        setField(term240494, term240494.getClass(), "parentNode", null);
        setIntField(term240494, term240494.getClass(), "siblingIndex", 0);
        ArrayList term240492 = new ArrayList();
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add((Object)null);
        ((ArrayList) term240492).add(term240494);
        term240491 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term240491, term240491.getClass(), "reader", null);
        setField(term240491, term240491.getClass(), "tokeniser", null);
        setField(term240491, term240491.getClass(), "doc", null);
        setField(term240491, term240491.getClass(), "stack", term240492);
        setField(term240491, term240491.getClass(), "baseUri", null);
        setField(term240491, term240491.getClass(), "currentToken", null);
        setField(term240491, term240491.getClass(), "errors", null);
        setField(term240491, term240491.getClass(), "settings", null);
        setField(term240491, term240491.getClass(), "start", null);
        setField(term240491, term240491.getClass(), "end", null);
        term240496 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term240496, term240496.getClass(), "data", "");
        setField(term240496, term240496.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term240395;
        callMethod(klass, "insert", argTypes, term240161, args);
        assertTrue(recursiveEquals(term240161, term240491));
        assertTrue(recursiveEquals(term240395, term240496));
    }

};


