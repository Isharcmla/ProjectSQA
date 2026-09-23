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

public class XmlTreeBuilder_insert_1967925292199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273024;
     Object term273292;
     Object term277620;
     Object term277626;

    public XmlTreeBuilder_insert_1967925292199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273114 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term273226 = new ArrayList();
        Object term273174 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term273174, term273174.getClass(), "childNodes", term273226);
        ArrayList term273076 = new ArrayList();
        ((ArrayList) term273076).add(term273114);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add((Object)null);
        ((ArrayList) term273076).add(term273174);
        term273024 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term273024, term273024.getClass(), "stack", term273076);
        char[] term272768 = (char[]) newCharArray(41);
        StringBuilder term273352 = new StringBuilder();
        ((StringBuilder) term273352).append(term272768);
        term273292 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term273292, term273292.getClass(), "data", term273352);
        setBooleanField(term273292, term273292.getClass(), "bogus", false);
        Object term277623 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term277625 = new ArrayList();
        ((ArrayList) term277625).add((Object)null);
        Object term277624 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term277624, term277624.getClass(), "elements", null);
        setField(term277624, term277624.getClass(), "tag", null);
        setField(term277624, term277624.getClass(), "shadowChildrenRef", null);
        setField(term277624, term277624.getClass(), "childNodes", term277625);
        setField(term277624, term277624.getClass(), "attributes", null);
        setField(term277624, term277624.getClass(), "baseUri", null);
        setField(term277624, term277624.getClass(), "parentNode", null);
        setIntField(term277624, term277624.getClass(), "siblingIndex", 0);
        ArrayList term277621 = new ArrayList();
        ((ArrayList) term277621).add(term277623);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add((Object)null);
        ((ArrayList) term277621).add(term277624);
        term277620 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term277620, term277620.getClass(), "reader", null);
        setField(term277620, term277620.getClass(), "tokeniser", null);
        setField(term277620, term277620.getClass(), "doc", null);
        setField(term277620, term277620.getClass(), "stack", term277621);
        setField(term277620, term277620.getClass(), "baseUri", null);
        setField(term277620, term277620.getClass(), "currentToken", null);
        setField(term277620, term277620.getClass(), "errors", null);
        setField(term277620, term277620.getClass(), "settings", null);
        setField(term277620, term277620.getClass(), "start", null);
        setField(term277620, term277620.getClass(), "end", null);
        term277626 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term277627 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term277628 = (byte[]) newByteArray(41);
        setField(term277627, term277627.getClass(), "value", term277628);
        setByteField(term277627, term277627.getClass(), "coder", (byte) 0);
        setIntField(term277627, term277627.getClass(), "count", 41);
        setField(term277626, term277626.getClass(), "data", term277627);
        setBooleanField(term277626, term277626.getClass(), "bogus", false);
        setField(term277626, term277626.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term273292;
        callMethod(klass, "insert", argTypes, term273024, args);
        assertTrue(recursiveEquals(term273024, term277620));
        assertTrue(recursiveEquals(term273292, term277626));
    }

};


