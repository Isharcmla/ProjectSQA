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

public class XmlDeclaration_outerHtmlHead_39918189137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9710;
     Object term9792;
     Object term9808;
     Object term9811;

    public XmlDeclaration_outerHtmlHead_39918189137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9710 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term9710, term9710.getClass(), "isProcessingInstruction", false);
        setField(term9710, term9710.getClass(), "name", "");
        term9792 = newInstance(Class.forName("java.io.PrintStream"));
        term9808 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term9808, term9808.getClass(), "name", "");
        setBooleanField(term9808, term9808.getClass(), "isProcessingInstruction", false);
        setField(term9808, term9808.getClass(), "parentNode", null);
        setField(term9808, term9808.getClass(), "childNodes", null);
        setField(term9808, term9808.getClass(), "attributes", null);
        setField(term9808, term9808.getClass(), "baseUri", null);
        setIntField(term9808, term9808.getClass(), "siblingIndex", 0);
        term9811 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term9811, term9811.getClass(), "autoFlush", false);
        setBooleanField(term9811, term9811.getClass(), "trouble", true);
        setField(term9811, term9811.getClass(), "formatter", null);
        setField(term9811, term9811.getClass(), "textOut", null);
        setField(term9811, term9811.getClass(), "charOut", null);
        setBooleanField(term9811, term9811.getClass(), "closing", false);
        setField(term9811, term9811.getClass(), "out", null);
        setBooleanField(term9811, term9811.getClass(), "closed", false);
        setField(term9811, term9811.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term9792;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term9710, args);
        assertTrue(recursiveEquals(term9710, term9808));
        assertTrue(recursiveEquals(term9792, term9811));
    }

};


