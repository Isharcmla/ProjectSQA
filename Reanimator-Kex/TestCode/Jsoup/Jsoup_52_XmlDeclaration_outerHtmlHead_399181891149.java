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

public class XmlDeclaration_outerHtmlHead_399181891149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53278;
     Object term53478;
     Object term53520;
     Object term53525;

    public XmlDeclaration_outerHtmlHead_399181891149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term53434 = new LinkedHashMap();
        term53278 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term53374 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term53278, term53278.getClass(), "isProcessingInstruction", true);
        setField(term53278, term53278.getClass(), "name", "xml");
        setField(term53374, term53374.getClass(), "attributes", term53434);
        setField(term53278, term53278.getClass(), "attributes", term53374);
        term53478 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term53524 = new LinkedHashMap();
        term53520 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term53523 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53520, term53520.getClass(), "name", "xml");
        setBooleanField(term53520, term53520.getClass(), "isProcessingInstruction", true);
        setField(term53520, term53520.getClass(), "parentNode", null);
        setField(term53520, term53520.getClass(), "childNodes", null);
        setField(term53523, term53523.getClass(), "attributes", term53524);
        setField(term53520, term53520.getClass(), "attributes", term53523);
        setField(term53520, term53520.getClass(), "baseUri", null);
        setIntField(term53520, term53520.getClass(), "siblingIndex", 0);
        term53525 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term53525, term53525.getClass(), "autoFlush", false);
        setBooleanField(term53525, term53525.getClass(), "trouble", true);
        setField(term53525, term53525.getClass(), "formatter", null);
        setField(term53525, term53525.getClass(), "textOut", null);
        setField(term53525, term53525.getClass(), "charOut", null);
        setBooleanField(term53525, term53525.getClass(), "closing", false);
        setField(term53525, term53525.getClass(), "out", null);
        setBooleanField(term53525, term53525.getClass(), "closed", false);
        setField(term53525, term53525.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term53478;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term53278, args);
        assertTrue(recursiveEquals(term53278, term53520));
        assertTrue(recursiveEquals(term53478, term53525));
    }

};


