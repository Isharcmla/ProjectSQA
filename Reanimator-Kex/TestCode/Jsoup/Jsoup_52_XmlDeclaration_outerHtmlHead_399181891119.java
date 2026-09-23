package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class XmlDeclaration_outerHtmlHead_399181891119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30803;
     Object term30943;
     Object term37575;
     Object term37579;

    public XmlDeclaration_outerHtmlHead_399181891119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30803 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term30899 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term30803, term30803.getClass(), "isProcessingInstruction", false);
        setField(term30803, term30803.getClass(), "name", "xml");
        setField(term30899, term30899.getClass(), "attributes", null);
        setField(term30803, term30803.getClass(), "attributes", term30899);
        term30943 = newInstance(Class.forName("java.io.PrintStream"));
        term37575 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term37578 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37575, term37575.getClass(), "name", "xml");
        setBooleanField(term37575, term37575.getClass(), "isProcessingInstruction", false);
        setField(term37575, term37575.getClass(), "parentNode", null);
        setField(term37575, term37575.getClass(), "childNodes", null);
        setField(term37578, term37578.getClass(), "attributes", null);
        setField(term37575, term37575.getClass(), "attributes", term37578);
        setField(term37575, term37575.getClass(), "baseUri", null);
        setIntField(term37575, term37575.getClass(), "siblingIndex", 0);
        term37579 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term37579, term37579.getClass(), "autoFlush", false);
        setBooleanField(term37579, term37579.getClass(), "trouble", true);
        setField(term37579, term37579.getClass(), "formatter", null);
        setField(term37579, term37579.getClass(), "textOut", null);
        setField(term37579, term37579.getClass(), "charOut", null);
        setBooleanField(term37579, term37579.getClass(), "closing", false);
        setField(term37579, term37579.getClass(), "out", null);
        setBooleanField(term37579, term37579.getClass(), "closed", false);
        setField(term37579, term37579.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term30943;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term30803, args);
        assertTrue(recursiveEquals(term30803, term37575));
        assertTrue(recursiveEquals(term30943, term37579));
    }

};


