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

public class XmlTreeBuilder_insertNode_215006970195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270854;
     Object term271128;

    public XmlTreeBuilder_insertNode_215006970195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270944 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term271190 = new ArrayList();
        Object term271164 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term271164, term271164.getClass(), "childNodes", term271190);
        ArrayList term270906 = new ArrayList();
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term270944);
        ((ArrayList) term270906).add(term271164);
        term270854 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term270854, term270854.getClass(), "stack", term270906);
        term271128 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term271128, term271128.getClass(), "parentNode", term271164);
        setIntField(term271128, term271128.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term271128;
        try {
            callMethod(klass, "insertNode", argTypes, term270854, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


