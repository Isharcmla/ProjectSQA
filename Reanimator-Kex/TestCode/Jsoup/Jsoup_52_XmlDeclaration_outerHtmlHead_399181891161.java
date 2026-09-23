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

public class XmlDeclaration_outerHtmlHead_399181891161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56022;
     Object term56162;
     Object term56192;
     Object term56196;

    public XmlDeclaration_outerHtmlHead_399181891161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56022 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term56118 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term56022, term56022.getClass(), "isProcessingInstruction", true);
        setField(term56022, term56022.getClass(), "name", "xml");
        setField(term56118, term56118.getClass(), "attributes", null);
        setField(term56022, term56022.getClass(), "attributes", term56118);
        term56162 = newInstance(Class.forName("java.io.PrintStream"));
        term56192 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term56195 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56192, term56192.getClass(), "name", "xml");
        setBooleanField(term56192, term56192.getClass(), "isProcessingInstruction", true);
        setField(term56192, term56192.getClass(), "parentNode", null);
        setField(term56192, term56192.getClass(), "childNodes", null);
        setField(term56195, term56195.getClass(), "attributes", null);
        setField(term56192, term56192.getClass(), "attributes", term56195);
        setField(term56192, term56192.getClass(), "baseUri", null);
        setIntField(term56192, term56192.getClass(), "siblingIndex", 0);
        term56196 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term56196, term56196.getClass(), "autoFlush", false);
        setBooleanField(term56196, term56196.getClass(), "trouble", true);
        setField(term56196, term56196.getClass(), "formatter", null);
        setField(term56196, term56196.getClass(), "textOut", null);
        setField(term56196, term56196.getClass(), "charOut", null);
        setBooleanField(term56196, term56196.getClass(), "closing", false);
        setField(term56196, term56196.getClass(), "out", null);
        setBooleanField(term56196, term56196.getClass(), "closed", false);
        setField(term56196, term56196.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term56162;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term56022, args);
        assertTrue(recursiveEquals(term56022, term56192));
        assertTrue(recursiveEquals(term56162, term56196));
    }

};


