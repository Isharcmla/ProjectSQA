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

public class XmlDeclaration_outerHtmlHead_39918189177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18058;
     Object term18140;
     Object term18498;
     Object term18501;

    public XmlDeclaration_outerHtmlHead_39918189177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18058 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term18058, term18058.getClass(), "isProcessingInstruction", true);
        setField(term18058, term18058.getClass(), "name", "                                                                                                                  ");
        term18140 = newInstance(Class.forName("java.io.PrintStream"));
        term18498 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term18498, term18498.getClass(), "name", "                                                                                                                  ");
        setBooleanField(term18498, term18498.getClass(), "isProcessingInstruction", true);
        setField(term18498, term18498.getClass(), "parentNode", null);
        setField(term18498, term18498.getClass(), "childNodes", null);
        setField(term18498, term18498.getClass(), "attributes", null);
        setField(term18498, term18498.getClass(), "baseUri", null);
        setIntField(term18498, term18498.getClass(), "siblingIndex", 0);
        term18501 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term18501, term18501.getClass(), "autoFlush", false);
        setBooleanField(term18501, term18501.getClass(), "trouble", true);
        setField(term18501, term18501.getClass(), "formatter", null);
        setField(term18501, term18501.getClass(), "textOut", null);
        setField(term18501, term18501.getClass(), "charOut", null);
        setBooleanField(term18501, term18501.getClass(), "closing", false);
        setField(term18501, term18501.getClass(), "out", null);
        setBooleanField(term18501, term18501.getClass(), "closed", false);
        setField(term18501, term18501.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term18140;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term18058, args);
        assertTrue(recursiveEquals(term18058, term18498));
        assertTrue(recursiveEquals(term18140, term18501));
    }

};


