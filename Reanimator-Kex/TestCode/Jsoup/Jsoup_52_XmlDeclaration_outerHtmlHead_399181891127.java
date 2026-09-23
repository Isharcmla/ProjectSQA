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

public class XmlDeclaration_outerHtmlHead_399181891127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40367;
     Object term40449;
     Object term40501;
     Object term40504;

    public XmlDeclaration_outerHtmlHead_399181891127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40367 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term40367, term40367.getClass(), "isProcessingInstruction", false);
        setField(term40367, term40367.getClass(), "name", " xxxxxxxxxxx");
        term40449 = newInstance(Class.forName("java.io.PrintStream"));
        term40501 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term40501, term40501.getClass(), "name", " xxxxxxxxxxx");
        setBooleanField(term40501, term40501.getClass(), "isProcessingInstruction", false);
        setField(term40501, term40501.getClass(), "parentNode", null);
        setField(term40501, term40501.getClass(), "childNodes", null);
        setField(term40501, term40501.getClass(), "attributes", null);
        setField(term40501, term40501.getClass(), "baseUri", null);
        setIntField(term40501, term40501.getClass(), "siblingIndex", 0);
        term40504 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term40504, term40504.getClass(), "autoFlush", false);
        setBooleanField(term40504, term40504.getClass(), "trouble", true);
        setField(term40504, term40504.getClass(), "formatter", null);
        setField(term40504, term40504.getClass(), "textOut", null);
        setField(term40504, term40504.getClass(), "charOut", null);
        setBooleanField(term40504, term40504.getClass(), "closing", false);
        setField(term40504, term40504.getClass(), "out", null);
        setBooleanField(term40504, term40504.getClass(), "closed", false);
        setField(term40504, term40504.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term40449;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term40367, args);
        assertTrue(recursiveEquals(term40367, term40501));
        assertTrue(recursiveEquals(term40449, term40504));
    }

};


