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

public class XmlDeclaration_outerHtmlHead_399181891123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38853;
     Object term38935;
     Object term39098;
     Object term39101;

    public XmlDeclaration_outerHtmlHead_399181891123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38853 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term38853, term38853.getClass(), "isProcessingInstruction", true);
        setField(term38853, term38853.getClass(), "name", "                                                 ");
        term38935 = newInstance(Class.forName("java.io.PrintStream"));
        term39098 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term39098, term39098.getClass(), "name", "                                                 ");
        setBooleanField(term39098, term39098.getClass(), "isProcessingInstruction", true);
        setField(term39098, term39098.getClass(), "parentNode", null);
        setField(term39098, term39098.getClass(), "childNodes", null);
        setField(term39098, term39098.getClass(), "attributes", null);
        setField(term39098, term39098.getClass(), "baseUri", null);
        setIntField(term39098, term39098.getClass(), "siblingIndex", 0);
        term39101 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term39101, term39101.getClass(), "autoFlush", false);
        setBooleanField(term39101, term39101.getClass(), "trouble", true);
        setField(term39101, term39101.getClass(), "formatter", null);
        setField(term39101, term39101.getClass(), "textOut", null);
        setField(term39101, term39101.getClass(), "charOut", null);
        setBooleanField(term39101, term39101.getClass(), "closing", false);
        setField(term39101, term39101.getClass(), "out", null);
        setBooleanField(term39101, term39101.getClass(), "closed", false);
        setField(term39101, term39101.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term38935;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term38853, args);
        assertTrue(recursiveEquals(term38853, term39098));
        assertTrue(recursiveEquals(term38935, term39101));
    }

};


