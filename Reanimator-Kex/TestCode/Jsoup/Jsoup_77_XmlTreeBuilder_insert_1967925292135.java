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

public class XmlTreeBuilder_insert_1967925292135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245841;
     Object term246109;
     Object term246476;
     Object term246482;

    public XmlTreeBuilder_insert_1967925292135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term245931 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term246043 = new ArrayList();
        Object term245991 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term245991, term245991.getClass(), "childNodes", term246043);
        ArrayList term245893 = new ArrayList();
        ((ArrayList) term245893).add(term245931);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add((Object)null);
        ((ArrayList) term245893).add(term245991);
        term245841 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term245841, term245841.getClass(), "stack", term245893);
        char[] term245585 = (char[]) newCharArray(41);
        StringBuilder term246169 = new StringBuilder();
        ((StringBuilder) term246169).append(term245585);
        term246109 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term246109, term246109.getClass(), "data", term246169);
        setBooleanField(term246109, term246109.getClass(), "bogus", false);
        Object term246479 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term246481 = new ArrayList();
        ((ArrayList) term246481).add((Object)null);
        Object term246480 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term246480, term246480.getClass(), "elements", null);
        setField(term246480, term246480.getClass(), "tag", null);
        setField(term246480, term246480.getClass(), "shadowChildrenRef", null);
        setField(term246480, term246480.getClass(), "childNodes", term246481);
        setField(term246480, term246480.getClass(), "attributes", null);
        setField(term246480, term246480.getClass(), "baseUri", null);
        setField(term246480, term246480.getClass(), "parentNode", null);
        setIntField(term246480, term246480.getClass(), "siblingIndex", 0);
        ArrayList term246477 = new ArrayList();
        ((ArrayList) term246477).add(term246479);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add((Object)null);
        ((ArrayList) term246477).add(term246480);
        term246476 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term246476, term246476.getClass(), "reader", null);
        setField(term246476, term246476.getClass(), "tokeniser", null);
        setField(term246476, term246476.getClass(), "doc", null);
        setField(term246476, term246476.getClass(), "stack", term246477);
        setField(term246476, term246476.getClass(), "baseUri", null);
        setField(term246476, term246476.getClass(), "currentToken", null);
        setField(term246476, term246476.getClass(), "errors", null);
        setField(term246476, term246476.getClass(), "settings", null);
        setField(term246476, term246476.getClass(), "start", null);
        setField(term246476, term246476.getClass(), "end", null);
        term246482 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term246483 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term246484 = (byte[]) newByteArray(41);
        setField(term246483, term246483.getClass(), "value", term246484);
        setByteField(term246483, term246483.getClass(), "coder", (byte) 0);
        setIntField(term246483, term246483.getClass(), "count", 41);
        setField(term246482, term246482.getClass(), "data", term246483);
        setBooleanField(term246482, term246482.getClass(), "bogus", false);
        setField(term246482, term246482.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term246109;
        callMethod(klass, "insert", argTypes, term245841, args);
        assertTrue(recursiveEquals(term245841, term246476));
        assertTrue(recursiveEquals(term246109, term246482));
    }

};


