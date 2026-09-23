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

public class XmlTreeBuilder_insertNode_215006970127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142517;
     Object term142721;

    public XmlTreeBuilder_insertNode_215006970127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142607 = newInstance(Class.forName("java.lang.Object"));
        Object term142659 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term142659, term142659.getClass(), "childNodes", null);
        ArrayList term142569 = new ArrayList();
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142607);
        ((ArrayList) term142569).add(term142659);
        term142517 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term142517, term142517.getClass(), "stack", term142569);
        term142721 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        setField(term142721, term142721.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term142721;
        try {
            callMethod(klass, "insertNode", argTypes, term142517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


