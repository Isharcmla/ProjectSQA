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

public class XmlTreeBuilder_insertNode_215006970455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383026;
     Object term383242;

    public XmlTreeBuilder_insertNode_215006970455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term383116 = newInstance(Class.forName("java.lang.Object"));
        Object term383188 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term383188, term383188.getClass(), "childNodes", null);
        ArrayList term383078 = new ArrayList();
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383116);
        ((ArrayList) term383078).add(term383188);
        term383026 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term383026, term383026.getClass(), "stack", term383078);
        term383242 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        setField(term383242, term383242.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term383242;
        try {
            callMethod(klass, "insertNode", argTypes, term383026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


