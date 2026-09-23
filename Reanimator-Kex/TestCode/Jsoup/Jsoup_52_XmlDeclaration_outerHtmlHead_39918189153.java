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

public class XmlDeclaration_outerHtmlHead_39918189153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12564;
     Object term12646;
     Object term12662;
     Object term12665;

    public XmlDeclaration_outerHtmlHead_39918189153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12564 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term12564, term12564.getClass(), "isProcessingInstruction", false);
        setField(term12564, term12564.getClass(), "name", "");
        term12646 = newInstance(Class.forName("java.io.PrintStream"));
        term12662 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term12662, term12662.getClass(), "name", "");
        setBooleanField(term12662, term12662.getClass(), "isProcessingInstruction", false);
        setField(term12662, term12662.getClass(), "parentNode", null);
        setField(term12662, term12662.getClass(), "childNodes", null);
        setField(term12662, term12662.getClass(), "attributes", null);
        setField(term12662, term12662.getClass(), "baseUri", null);
        setIntField(term12662, term12662.getClass(), "siblingIndex", 0);
        term12665 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term12665, term12665.getClass(), "autoFlush", false);
        setBooleanField(term12665, term12665.getClass(), "trouble", true);
        setField(term12665, term12665.getClass(), "formatter", null);
        setField(term12665, term12665.getClass(), "textOut", null);
        setField(term12665, term12665.getClass(), "charOut", null);
        setBooleanField(term12665, term12665.getClass(), "closing", false);
        setField(term12665, term12665.getClass(), "out", null);
        setBooleanField(term12665, term12665.getClass(), "closed", false);
        setField(term12665, term12665.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term12646;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term12564, args);
        assertTrue(recursiveEquals(term12564, term12662));
        assertTrue(recursiveEquals(term12646, term12665));
    }

};


