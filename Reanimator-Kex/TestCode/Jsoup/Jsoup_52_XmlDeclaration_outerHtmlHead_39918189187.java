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

public class XmlDeclaration_outerHtmlHead_39918189187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21448;
     Object term21530;
     Object term21552;
     Object term21555;

    public XmlDeclaration_outerHtmlHead_39918189187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21448 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term21448, term21448.getClass(), "isProcessingInstruction", false);
        setField(term21448, term21448.getClass(), "name", "  ");
        term21530 = newInstance(Class.forName("java.io.PrintStream"));
        term21552 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term21552, term21552.getClass(), "name", "  ");
        setBooleanField(term21552, term21552.getClass(), "isProcessingInstruction", false);
        setField(term21552, term21552.getClass(), "parentNode", null);
        setField(term21552, term21552.getClass(), "childNodes", null);
        setField(term21552, term21552.getClass(), "attributes", null);
        setField(term21552, term21552.getClass(), "baseUri", null);
        setIntField(term21552, term21552.getClass(), "siblingIndex", 0);
        term21555 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term21555, term21555.getClass(), "autoFlush", false);
        setBooleanField(term21555, term21555.getClass(), "trouble", true);
        setField(term21555, term21555.getClass(), "formatter", null);
        setField(term21555, term21555.getClass(), "textOut", null);
        setField(term21555, term21555.getClass(), "charOut", null);
        setBooleanField(term21555, term21555.getClass(), "closing", false);
        setField(term21555, term21555.getClass(), "out", null);
        setBooleanField(term21555, term21555.getClass(), "closed", false);
        setField(term21555, term21555.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term21530;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term21448, args);
        assertTrue(recursiveEquals(term21448, term21552));
        assertTrue(recursiveEquals(term21530, term21555));
    }

};


