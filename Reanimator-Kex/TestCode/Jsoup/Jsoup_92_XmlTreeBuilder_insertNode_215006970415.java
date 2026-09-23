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

public class XmlTreeBuilder_insertNode_215006970415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366967;
     Object term367163;

    public XmlTreeBuilder_insertNode_215006970415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term367057 = newInstance(Class.forName("java.lang.Object"));
        Object term367109 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term367109, term367109.getClass(), "childNodes", null);
        ArrayList term367019 = new ArrayList();
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367057);
        ((ArrayList) term367019).add(term367109);
        term366967 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term366967, term366967.getClass(), "stack", term367019);
        term367163 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        setField(term367163, term367163.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term367163;
        try {
            callMethod(klass, "insertNode", argTypes, term366967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


