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

public class XmlTreeBuilder_insertNode_215006970615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456677;
     Object term456887;

    public XmlTreeBuilder_insertNode_215006970615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term456767 = newInstance(Class.forName("java.lang.Object"));
        Object term456821 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term456821, term456821.getClass(), "childNodes", null);
        ArrayList term456729 = new ArrayList();
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456767);
        ((ArrayList) term456729).add(term456821);
        term456677 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term456677, term456677.getClass(), "stack", term456729);
        term456887 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term456887, term456887.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term456887;
        try {
            callMethod(klass, "insertNode", argTypes, term456677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


