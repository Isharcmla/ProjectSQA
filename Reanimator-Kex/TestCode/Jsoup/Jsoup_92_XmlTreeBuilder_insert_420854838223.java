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

public class XmlTreeBuilder_insert_420854838223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281783;
     Object term282029;
     Object term282125;
     Object term282130;

    public XmlTreeBuilder_insert_420854838223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term281959 = new ArrayList();
        Object term281907 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term281907, term281907.getClass(), "childNodes", term281959);
        ArrayList term281835 = new ArrayList();
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add((Object)null);
        ((ArrayList) term281835).add(term281907);
        term281783 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term281783, term281783.getClass(), "stack", term281835);
        term282029 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term282029, term282029.getClass(), "data", "");
        ArrayList term282129 = new ArrayList();
        ((ArrayList) term282129).add((Object)null);
        Object term282128 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term282128, term282128.getClass(), "tag", null);
        setField(term282128, term282128.getClass(), "shadowChildrenRef", null);
        setField(term282128, term282128.getClass(), "childNodes", term282129);
        setField(term282128, term282128.getClass(), "attributes", null);
        setField(term282128, term282128.getClass(), "baseUri", null);
        setField(term282128, term282128.getClass(), "parentNode", null);
        setIntField(term282128, term282128.getClass(), "siblingIndex", 0);
        ArrayList term282126 = new ArrayList();
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add((Object)null);
        ((ArrayList) term282126).add(term282128);
        term282125 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term282125, term282125.getClass(), "parser", null);
        setField(term282125, term282125.getClass(), "reader", null);
        setField(term282125, term282125.getClass(), "tokeniser", null);
        setField(term282125, term282125.getClass(), "doc", null);
        setField(term282125, term282125.getClass(), "stack", term282126);
        setField(term282125, term282125.getClass(), "baseUri", null);
        setField(term282125, term282125.getClass(), "currentToken", null);
        setField(term282125, term282125.getClass(), "settings", null);
        setField(term282125, term282125.getClass(), "start", null);
        setField(term282125, term282125.getClass(), "end", null);
        term282130 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term282130, term282130.getClass(), "data", "");
        setField(term282130, term282130.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term282029;
        callMethod(klass, "insert", argTypes, term281783, args);
        assertTrue(recursiveEquals(term281783, term282125));
        assertTrue(recursiveEquals(term282029, term282130));
    }

};


