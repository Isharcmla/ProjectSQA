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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227231;
     Object term227459;

    public XmlTreeBuilder_insert_1967925292105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term227321 = newInstance(Class.forName("java.lang.Object"));
        Object term227393 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term227283 = new ArrayList();
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add(term227321);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add((Object)null);
        ((ArrayList) term227283).add(term227393);
        term227231 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term227231, term227231.getClass(), "stack", term227283);
        char[] term227069 = (char[]) newCharArray(1);
        StringBuilder term227519 = new StringBuilder();
        ((StringBuilder) term227519).append(term227069);
        term227459 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term227459, term227459.getClass(), "data", term227519);
        setBooleanField(term227459, term227459.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term227459;
        try {
            callMethod(klass, "insert", argTypes, term227231, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


