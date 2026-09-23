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

public class XmlDeclaration_outerHtmlHead_399181891118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30524;
     Object term30664;
     Object term37538;
     Object term37542;

    public XmlDeclaration_outerHtmlHead_399181891118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30524 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term30620 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term30524, term30524.getClass(), "isProcessingInstruction", false);
        setField(term30524, term30524.getClass(), "name", "xml");
        setField(term30620, term30620.getClass(), "attributes", null);
        setField(term30524, term30524.getClass(), "attributes", term30620);
        term30664 = newInstance(Class.forName("java.io.PrintStream"));
        term37538 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term37541 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37538, term37538.getClass(), "name", "xml");
        setBooleanField(term37538, term37538.getClass(), "isProcessingInstruction", false);
        setField(term37538, term37538.getClass(), "parentNode", null);
        setField(term37538, term37538.getClass(), "childNodes", null);
        setField(term37541, term37541.getClass(), "attributes", null);
        setField(term37538, term37538.getClass(), "attributes", term37541);
        setField(term37538, term37538.getClass(), "baseUri", null);
        setIntField(term37538, term37538.getClass(), "siblingIndex", 0);
        term37542 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term37542, term37542.getClass(), "autoFlush", false);
        setBooleanField(term37542, term37542.getClass(), "trouble", true);
        setField(term37542, term37542.getClass(), "formatter", null);
        setField(term37542, term37542.getClass(), "textOut", null);
        setField(term37542, term37542.getClass(), "charOut", null);
        setBooleanField(term37542, term37542.getClass(), "closing", false);
        setField(term37542, term37542.getClass(), "out", null);
        setBooleanField(term37542, term37542.getClass(), "closed", false);
        setField(term37542, term37542.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term30664;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term30524, args);
        assertTrue(recursiveEquals(term30524, term37538));
        assertTrue(recursiveEquals(term30664, term37542));
    }

};


