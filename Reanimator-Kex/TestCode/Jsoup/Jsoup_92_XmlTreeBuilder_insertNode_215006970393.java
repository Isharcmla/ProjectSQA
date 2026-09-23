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

public class XmlTreeBuilder_insertNode_215006970393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358514;
     Object term358726;

    public XmlTreeBuilder_insertNode_215006970393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term358604 = newInstance(Class.forName("java.lang.Object"));
        Object term358664 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term358664, term358664.getClass(), "childNodes", null);
        ArrayList term358566 = new ArrayList();
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358604);
        ((ArrayList) term358566).add(term358664);
        term358514 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term358514, term358514.getClass(), "stack", term358566);
        term358726 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        setField(term358726, term358726.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term358726;
        try {
            callMethod(klass, "insertNode", argTypes, term358514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


