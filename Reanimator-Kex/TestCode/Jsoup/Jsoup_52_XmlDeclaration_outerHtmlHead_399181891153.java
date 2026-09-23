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

public class XmlDeclaration_outerHtmlHead_399181891153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54264;
     Object term54404;
     Object term54434;
     Object term54438;

    public XmlDeclaration_outerHtmlHead_399181891153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54264 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term54360 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term54264, term54264.getClass(), "isProcessingInstruction", true);
        setField(term54264, term54264.getClass(), "name", "xml");
        setField(term54360, term54360.getClass(), "attributes", null);
        setField(term54264, term54264.getClass(), "attributes", term54360);
        term54404 = newInstance(Class.forName("java.io.PrintStream"));
        term54434 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term54437 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term54434, term54434.getClass(), "name", "xml");
        setBooleanField(term54434, term54434.getClass(), "isProcessingInstruction", true);
        setField(term54434, term54434.getClass(), "parentNode", null);
        setField(term54434, term54434.getClass(), "childNodes", null);
        setField(term54437, term54437.getClass(), "attributes", null);
        setField(term54434, term54434.getClass(), "attributes", term54437);
        setField(term54434, term54434.getClass(), "baseUri", null);
        setIntField(term54434, term54434.getClass(), "siblingIndex", 0);
        term54438 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term54438, term54438.getClass(), "autoFlush", false);
        setBooleanField(term54438, term54438.getClass(), "trouble", true);
        setField(term54438, term54438.getClass(), "formatter", null);
        setField(term54438, term54438.getClass(), "textOut", null);
        setField(term54438, term54438.getClass(), "charOut", null);
        setBooleanField(term54438, term54438.getClass(), "closing", false);
        setField(term54438, term54438.getClass(), "out", null);
        setBooleanField(term54438, term54438.getClass(), "closed", false);
        setField(term54438, term54438.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term54404;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term54264, args);
        assertTrue(recursiveEquals(term54264, term54434));
        assertTrue(recursiveEquals(term54404, term54438));
    }

};


