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
import java.util.LinkedHashMap;

public class XmlDeclaration_outerHtmlHead_399181891159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55527;
     Object term55831;
     Object term55873;
     Object term55878;

    public XmlDeclaration_outerHtmlHead_399181891159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term55683 = new LinkedHashMap();
        term55527 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term55623 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term55527, term55527.getClass(), "isProcessingInstruction", false);
        setField(term55527, term55527.getClass(), "name", "xml");
        setField(term55623, term55623.getClass(), "attributes", term55683);
        setField(term55527, term55527.getClass(), "attributes", term55623);
        term55831 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term55877 = new LinkedHashMap();
        term55873 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term55876 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term55873, term55873.getClass(), "name", "xml");
        setBooleanField(term55873, term55873.getClass(), "isProcessingInstruction", false);
        setField(term55873, term55873.getClass(), "parentNode", null);
        setField(term55873, term55873.getClass(), "childNodes", null);
        setField(term55876, term55876.getClass(), "attributes", term55877);
        setField(term55873, term55873.getClass(), "attributes", term55876);
        setField(term55873, term55873.getClass(), "baseUri", null);
        setIntField(term55873, term55873.getClass(), "siblingIndex", 0);
        term55878 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term55878, term55878.getClass(), "autoFlush", false);
        setBooleanField(term55878, term55878.getClass(), "trouble", true);
        setField(term55878, term55878.getClass(), "formatter", null);
        setField(term55878, term55878.getClass(), "textOut", null);
        setField(term55878, term55878.getClass(), "charOut", null);
        setBooleanField(term55878, term55878.getClass(), "closing", false);
        setField(term55878, term55878.getClass(), "out", null);
        setBooleanField(term55878, term55878.getClass(), "closed", false);
        setField(term55878, term55878.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term55831;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term55527, args);
        assertTrue(recursiveEquals(term55527, term55873));
        assertTrue(recursiveEquals(term55831, term55878));
    }

};


