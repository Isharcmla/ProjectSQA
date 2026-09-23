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

public class XmlTreeBuilder_insertNode_215006970359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358556;
     Object term358750;

    public XmlTreeBuilder_insertNode_215006970359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term358646 = newInstance(Class.forName("java.lang.Object"));
        Object term358698 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term358698, term358698.getClass(), "childNodes", null);
        ArrayList term358608 = new ArrayList();
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358646);
        ((ArrayList) term358608).add(term358698);
        term358556 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term358556, term358556.getClass(), "stack", term358608);
        term358750 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        setField(term358750, term358750.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term358750;
        try {
            callMethod(klass, "insertNode", argTypes, term358556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


