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

public class XmlTreeBuilder_insertNode_215006970337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347033;
     Object term347247;

    public XmlTreeBuilder_insertNode_215006970337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term347123 = newInstance(Class.forName("java.lang.Object"));
        Object term347195 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term347195, term347195.getClass(), "childNodes", null);
        ArrayList term347085 = new ArrayList();
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347123);
        ((ArrayList) term347085).add(term347195);
        term347033 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term347033, term347033.getClass(), "stack", term347085);
        term347247 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        setField(term347247, term347247.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term347247;
        try {
            callMethod(klass, "insertNode", argTypes, term347033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


