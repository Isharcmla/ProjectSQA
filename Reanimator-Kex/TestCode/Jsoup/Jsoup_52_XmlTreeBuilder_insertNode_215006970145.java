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

public class XmlTreeBuilder_insertNode_215006970145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174971;
     Object term175167;

    public XmlTreeBuilder_insertNode_215006970145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term175061 = newInstance(Class.forName("java.lang.Object"));
        Object term175113 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term175113, term175113.getClass(), "childNodes", null);
        ArrayList term175023 = new ArrayList();
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175061);
        ((ArrayList) term175023).add(term175113);
        term174971 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term174971, term174971.getClass(), "stack", term175023);
        term175167 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        setField(term175167, term175167.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term175167;
        try {
            callMethod(klass, "insertNode", argTypes, term174971, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


