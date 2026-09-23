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

public class XmlDeclaration_outerHtmlHead_399181891147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52949;
     Object term53089;
     Object term53119;
     Object term53123;

    public XmlDeclaration_outerHtmlHead_399181891147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52949 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term53045 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term52949, term52949.getClass(), "isProcessingInstruction", true);
        setField(term52949, term52949.getClass(), "name", "xml");
        setField(term53045, term53045.getClass(), "attributes", null);
        setField(term52949, term52949.getClass(), "attributes", term53045);
        term53089 = newInstance(Class.forName("java.io.PrintStream"));
        term53119 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term53122 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term53119, term53119.getClass(), "name", "xml");
        setBooleanField(term53119, term53119.getClass(), "isProcessingInstruction", true);
        setField(term53119, term53119.getClass(), "parentNode", null);
        setField(term53119, term53119.getClass(), "childNodes", null);
        setField(term53122, term53122.getClass(), "attributes", null);
        setField(term53119, term53119.getClass(), "attributes", term53122);
        setField(term53119, term53119.getClass(), "baseUri", null);
        setIntField(term53119, term53119.getClass(), "siblingIndex", 0);
        term53123 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term53123, term53123.getClass(), "autoFlush", false);
        setBooleanField(term53123, term53123.getClass(), "trouble", true);
        setField(term53123, term53123.getClass(), "formatter", null);
        setField(term53123, term53123.getClass(), "textOut", null);
        setField(term53123, term53123.getClass(), "charOut", null);
        setBooleanField(term53123, term53123.getClass(), "closing", false);
        setField(term53123, term53123.getClass(), "out", null);
        setBooleanField(term53123, term53123.getClass(), "closed", false);
        setField(term53123, term53123.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term53089;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term52949, args);
        assertTrue(recursiveEquals(term52949, term53119));
        assertTrue(recursiveEquals(term53089, term53123));
    }

};


