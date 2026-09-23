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

public class XmlTreeBuilder_insert_420854838113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133454;
     Object term133726;
     Object term133823;
     Object term133830;

    public XmlTreeBuilder_insert_420854838113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term133656 = new ArrayList();
        Object term133604 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term133604, term133604.getClass(), "childNodes", term133656);
        ArrayList term133544 = new ArrayList();
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add((Object)null);
        ((ArrayList) term133544).add(term133604);
        term133454 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term133454, term133454.getClass(), "baseUri", "");
        setField(term133454, term133454.getClass(), "stack", term133544);
        term133726 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term133726, term133726.getClass(), "data", "");
        ArrayList term133827 = new ArrayList();
        ((ArrayList) term133827).add((Object)null);
        Object term133826 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term133826, term133826.getClass(), "elements", null);
        setField(term133826, term133826.getClass(), "tag", null);
        setField(term133826, term133826.getClass(), "parentNode", null);
        setField(term133826, term133826.getClass(), "childNodes", term133827);
        setField(term133826, term133826.getClass(), "attributes", null);
        setField(term133826, term133826.getClass(), "baseUri", null);
        setIntField(term133826, term133826.getClass(), "siblingIndex", 0);
        ArrayList term133824 = new ArrayList();
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add((Object)null);
        ((ArrayList) term133824).add(term133826);
        term133823 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term133823, term133823.getClass(), "reader", null);
        setField(term133823, term133823.getClass(), "tokeniser", null);
        setField(term133823, term133823.getClass(), "doc", null);
        setField(term133823, term133823.getClass(), "stack", term133824);
        setField(term133823, term133823.getClass(), "baseUri", "");
        setField(term133823, term133823.getClass(), "currentToken", null);
        setField(term133823, term133823.getClass(), "errors", null);
        setField(term133823, term133823.getClass(), "settings", null);
        setField(term133823, term133823.getClass(), "start", null);
        setField(term133823, term133823.getClass(), "end", null);
        term133830 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term133830, term133830.getClass(), "data", "");
        setField(term133830, term133830.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term133726;
        callMethod(klass, "insert", argTypes, term133454, args);
        assertTrue(recursiveEquals(term133454, term133823));
        assertTrue(recursiveEquals(term133726, term133830));
    }

};


