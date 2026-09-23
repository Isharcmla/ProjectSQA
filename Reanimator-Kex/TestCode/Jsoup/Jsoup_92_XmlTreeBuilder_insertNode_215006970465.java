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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386528;
     Object term386796;

    public XmlTreeBuilder_insertNode_215006970465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term386618 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term386858 = new ArrayList();
        Object term386832 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term386832, term386832.getClass(), "childNodes", term386858);
        ArrayList term386580 = new ArrayList();
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386618);
        ((ArrayList) term386580).add(term386832);
        term386528 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term386528, term386528.getClass(), "stack", term386580);
        term386796 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term386796, term386796.getClass(), "parentNode", term386832);
        setIntField(term386796, term386796.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term386796;
        try {
            callMethod(klass, "insertNode", argTypes, term386528, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


