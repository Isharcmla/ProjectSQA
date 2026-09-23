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

public class XmlTreeBuilder_insert_420854838179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296779;
     Object term296985;

    public XmlTreeBuilder_insert_420854838179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term296869 = newInstance(Class.forName("java.lang.Object"));
        Object term296923 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term296831 = new ArrayList();
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296869);
        ((ArrayList) term296831).add(term296923);
        term296779 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term296779, term296779.getClass(), "stack", term296831);
        term296985 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term296985, term296985.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term296985;
        try {
            callMethod(klass, "insert", argTypes, term296779, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


