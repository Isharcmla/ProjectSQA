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

public class XmlTreeBuilder_insert_1967925292127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230522;
     Object term230694;

    public XmlTreeBuilder_insert_1967925292127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230628 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term230574 = new ArrayList();
        ((ArrayList) term230574).add((Object)null);
        ((ArrayList) term230574).add((Object)null);
        ((ArrayList) term230574).add((Object)null);
        ((ArrayList) term230574).add(term230628);
        term230522 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term230522, term230522.getClass(), "stack", term230574);
        char[] term230360 = (char[]) newCharArray(0);
        StringBuilder term230754 = new StringBuilder();
        ((StringBuilder) term230754).append(term230360);
        term230694 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term230694, term230694.getClass(), "data", term230754);
        setBooleanField(term230694, term230694.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term230694;
        try {
            callMethod(klass, "insert", argTypes, term230522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


