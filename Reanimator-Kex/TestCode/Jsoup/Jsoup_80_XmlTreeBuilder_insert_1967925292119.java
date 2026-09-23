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

public class XmlTreeBuilder_insert_1967925292119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230192;
     Object term230420;

    public XmlTreeBuilder_insert_1967925292119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230282 = newInstance(Class.forName("java.lang.Object"));
        Object term230354 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term230244 = new ArrayList();
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add(term230282);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add((Object)null);
        ((ArrayList) term230244).add(term230354);
        term230192 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term230192, term230192.getClass(), "stack", term230244);
        char[] term230030 = (char[]) newCharArray(1);
        StringBuilder term230480 = new StringBuilder();
        ((StringBuilder) term230480).append(term230030);
        term230420 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term230420, term230420.getClass(), "data", term230480);
        setBooleanField(term230420, term230420.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term230420;
        try {
            callMethod(klass, "insert", argTypes, term230192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


