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

public class XmlTreeBuilder_insertNode_215006970245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290414;
     Object term290632;

    public XmlTreeBuilder_insertNode_215006970245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term290504 = newInstance(Class.forName("java.lang.Object"));
        Object term290576 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term290576, term290576.getClass(), "childNodes", null);
        ArrayList term290466 = new ArrayList();
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290504);
        ((ArrayList) term290466).add(term290576);
        term290414 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term290414, term290414.getClass(), "stack", term290466);
        term290632 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        setField(term290632, term290632.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term290632;
        try {
            callMethod(klass, "insertNode", argTypes, term290414, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


