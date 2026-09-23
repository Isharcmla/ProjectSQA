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

public class XmlDeclaration_outerHtmlHead_399181891143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52255;
     Object term52337;
     Object term52389;
     Object term52392;

    public XmlDeclaration_outerHtmlHead_399181891143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52255 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term52255, term52255.getClass(), "isProcessingInstruction", true);
        setField(term52255, term52255.getClass(), "name", " !!!!!!!!!!!");
        term52337 = newInstance(Class.forName("java.io.PrintStream"));
        term52389 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term52389, term52389.getClass(), "name", " !!!!!!!!!!!");
        setBooleanField(term52389, term52389.getClass(), "isProcessingInstruction", true);
        setField(term52389, term52389.getClass(), "parentNode", null);
        setField(term52389, term52389.getClass(), "childNodes", null);
        setField(term52389, term52389.getClass(), "attributes", null);
        setField(term52389, term52389.getClass(), "baseUri", null);
        setIntField(term52389, term52389.getClass(), "siblingIndex", 0);
        term52392 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term52392, term52392.getClass(), "autoFlush", false);
        setBooleanField(term52392, term52392.getClass(), "trouble", true);
        setField(term52392, term52392.getClass(), "formatter", null);
        setField(term52392, term52392.getClass(), "textOut", null);
        setField(term52392, term52392.getClass(), "charOut", null);
        setBooleanField(term52392, term52392.getClass(), "closing", false);
        setField(term52392, term52392.getClass(), "out", null);
        setBooleanField(term52392, term52392.getClass(), "closed", false);
        setField(term52392, term52392.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term52337;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term52255, args);
        assertTrue(recursiveEquals(term52255, term52389));
        assertTrue(recursiveEquals(term52337, term52392));
    }

};


