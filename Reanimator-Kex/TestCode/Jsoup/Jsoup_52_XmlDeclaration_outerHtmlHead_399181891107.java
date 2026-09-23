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

public class XmlDeclaration_outerHtmlHead_399181891107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28437;
     Object term28519;
     Object term28541;
     Object term28544;

    public XmlDeclaration_outerHtmlHead_399181891107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28437 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term28437, term28437.getClass(), "isProcessingInstruction", false);
        setField(term28437, term28437.getClass(), "name", "  ");
        term28519 = newInstance(Class.forName("java.io.PrintStream"));
        term28541 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term28541, term28541.getClass(), "name", "  ");
        setBooleanField(term28541, term28541.getClass(), "isProcessingInstruction", false);
        setField(term28541, term28541.getClass(), "parentNode", null);
        setField(term28541, term28541.getClass(), "childNodes", null);
        setField(term28541, term28541.getClass(), "attributes", null);
        setField(term28541, term28541.getClass(), "baseUri", null);
        setIntField(term28541, term28541.getClass(), "siblingIndex", 0);
        term28544 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term28544, term28544.getClass(), "autoFlush", false);
        setBooleanField(term28544, term28544.getClass(), "trouble", true);
        setField(term28544, term28544.getClass(), "formatter", null);
        setField(term28544, term28544.getClass(), "textOut", null);
        setField(term28544, term28544.getClass(), "charOut", null);
        setBooleanField(term28544, term28544.getClass(), "closing", false);
        setField(term28544, term28544.getClass(), "out", null);
        setBooleanField(term28544, term28544.getClass(), "closed", false);
        setField(term28544, term28544.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term28519;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term28437, args);
        assertTrue(recursiveEquals(term28437, term28541));
        assertTrue(recursiveEquals(term28519, term28544));
    }

};


