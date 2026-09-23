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

public class XmlTreeBuilder_insertNode_215006970215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363233;
     Object term363449;

    public XmlTreeBuilder_insertNode_215006970215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term363323 = newInstance(Class.forName("java.lang.Object"));
        Object term363395 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term363395, term363395.getClass(), "childNodes", null);
        ArrayList term363285 = new ArrayList();
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363323);
        ((ArrayList) term363285).add(term363395);
        term363233 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term363233, term363233.getClass(), "stack", term363285);
        term363449 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term363449, term363449.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term363449;
        try {
            callMethod(klass, "insertNode", argTypes, term363233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


