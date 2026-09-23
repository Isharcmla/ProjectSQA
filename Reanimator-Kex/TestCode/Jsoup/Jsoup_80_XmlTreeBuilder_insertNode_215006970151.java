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

public class XmlTreeBuilder_insertNode_215006970151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247029;
     Object term247245;

    public XmlTreeBuilder_insertNode_215006970151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term247119 = newInstance(Class.forName("java.lang.Object"));
        Object term247191 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term247191, term247191.getClass(), "childNodes", null);
        ArrayList term247081 = new ArrayList();
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247119);
        ((ArrayList) term247081).add(term247191);
        term247029 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term247029, term247029.getClass(), "stack", term247081);
        term247245 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term247245, term247245.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term247245;
        try {
            callMethod(klass, "insertNode", argTypes, term247029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


