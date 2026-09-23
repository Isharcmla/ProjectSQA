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

public class XmlTreeBuilder_insertNode_215006970784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594975;
     Object term595243;

    public XmlTreeBuilder_insertNode_215006970784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term595065 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term595296 = new ArrayList();
        Object term595270 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term595270, term595270.getClass(), "childNodes", term595296);
        ArrayList term595027 = new ArrayList();
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595065);
        ((ArrayList) term595027).add(term595270);
        term594975 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term594975, term594975.getClass(), "stack", term595027);
        term595243 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term595243, term595243.getClass(), "parentNode", term595270);
        setIntField(term595243, term595243.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term595243;
        try {
            callMethod(klass, "insertNode", argTypes, term594975, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


