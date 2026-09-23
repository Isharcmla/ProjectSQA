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

public class XmlDeclaration_outerHtmlHead_39918189197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24664;
     Object term24804;
     Object term25402;
     Object term25406;

    public XmlDeclaration_outerHtmlHead_39918189197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24664 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term24760 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term24664, term24664.getClass(), "isProcessingInstruction", true);
        setField(term24664, term24664.getClass(), "name", "xml");
        setField(term24664, term24664.getClass(), "attributes", term24760);
        term24804 = newInstance(Class.forName("java.io.PrintStream"));
        term25402 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term25405 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25402, term25402.getClass(), "name", "xml");
        setBooleanField(term25402, term25402.getClass(), "isProcessingInstruction", true);
        setField(term25402, term25402.getClass(), "parentNode", null);
        setField(term25402, term25402.getClass(), "childNodes", null);
        setField(term25405, term25405.getClass(), "attributes", null);
        setField(term25402, term25402.getClass(), "attributes", term25405);
        setField(term25402, term25402.getClass(), "baseUri", null);
        setIntField(term25402, term25402.getClass(), "siblingIndex", 0);
        term25406 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term25406, term25406.getClass(), "autoFlush", false);
        setBooleanField(term25406, term25406.getClass(), "trouble", true);
        setField(term25406, term25406.getClass(), "formatter", null);
        setField(term25406, term25406.getClass(), "textOut", null);
        setField(term25406, term25406.getClass(), "charOut", null);
        setBooleanField(term25406, term25406.getClass(), "closing", false);
        setField(term25406, term25406.getClass(), "out", null);
        setBooleanField(term25406, term25406.getClass(), "closed", false);
        setField(term25406, term25406.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term24804;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term24664, args);
        assertTrue(recursiveEquals(term24664, term25402));
        assertTrue(recursiveEquals(term24804, term25406));
    }

};


