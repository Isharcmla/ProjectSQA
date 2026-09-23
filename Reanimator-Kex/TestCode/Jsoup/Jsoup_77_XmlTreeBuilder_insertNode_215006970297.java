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

public class XmlTreeBuilder_insertNode_215006970297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446245;
     Object term446441;

    public XmlTreeBuilder_insertNode_215006970297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term446335 = newInstance(Class.forName("java.lang.Object"));
        Object term446387 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term446387, term446387.getClass(), "childNodes", null);
        ArrayList term446297 = new ArrayList();
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446335);
        ((ArrayList) term446297).add(term446387);
        term446245 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term446245, term446245.getClass(), "stack", term446297);
        term446441 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        setField(term446441, term446441.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term446441;
        try {
            callMethod(klass, "insertNode", argTypes, term446245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


