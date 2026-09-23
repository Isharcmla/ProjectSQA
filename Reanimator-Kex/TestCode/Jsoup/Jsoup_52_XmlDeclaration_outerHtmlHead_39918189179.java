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

public class XmlDeclaration_outerHtmlHead_39918189179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18779;
     Object term18861;
     Object term18928;
     Object term18931;

    public XmlDeclaration_outerHtmlHead_39918189179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18779 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term18779, term18779.getClass(), "isProcessingInstruction", false);
        setField(term18779, term18779.getClass(), "name", "                 ");
        term18861 = newInstance(Class.forName("java.io.PrintStream"));
        term18928 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term18928, term18928.getClass(), "name", "                 ");
        setBooleanField(term18928, term18928.getClass(), "isProcessingInstruction", false);
        setField(term18928, term18928.getClass(), "parentNode", null);
        setField(term18928, term18928.getClass(), "childNodes", null);
        setField(term18928, term18928.getClass(), "attributes", null);
        setField(term18928, term18928.getClass(), "baseUri", null);
        setIntField(term18928, term18928.getClass(), "siblingIndex", 0);
        term18931 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term18931, term18931.getClass(), "autoFlush", false);
        setBooleanField(term18931, term18931.getClass(), "trouble", true);
        setField(term18931, term18931.getClass(), "formatter", null);
        setField(term18931, term18931.getClass(), "textOut", null);
        setField(term18931, term18931.getClass(), "charOut", null);
        setBooleanField(term18931, term18931.getClass(), "closing", false);
        setField(term18931, term18931.getClass(), "out", null);
        setBooleanField(term18931, term18931.getClass(), "closed", false);
        setField(term18931, term18931.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term18861;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term18779, args);
        assertTrue(recursiveEquals(term18779, term18928));
        assertTrue(recursiveEquals(term18861, term18931));
    }

};


