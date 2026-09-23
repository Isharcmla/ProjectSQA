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

public class XmlTreeBuilder_insertNode_215006970251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292284;
     Object term292482;

    public XmlTreeBuilder_insertNode_215006970251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term292374 = newInstance(Class.forName("java.lang.Object"));
        Object term292426 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term292426, term292426.getClass(), "childNodes", null);
        ArrayList term292336 = new ArrayList();
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292374);
        ((ArrayList) term292336).add(term292426);
        term292284 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term292284, term292284.getClass(), "stack", term292336);
        term292482 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        setField(term292482, term292482.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term292482;
        try {
            callMethod(klass, "insertNode", argTypes, term292284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


