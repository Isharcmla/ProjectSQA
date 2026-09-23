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

public class XmlDeclaration_outerHtmlHead_39918189161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14714;
     Object term14854;
     Object term14884;
     Object term14888;

    public XmlDeclaration_outerHtmlHead_39918189161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14714 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term14810 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term14714, term14714.getClass(), "isProcessingInstruction", false);
        setField(term14714, term14714.getClass(), "name", "xml");
        setField(term14714, term14714.getClass(), "attributes", term14810);
        term14854 = newInstance(Class.forName("java.io.PrintStream"));
        term14884 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term14887 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14884, term14884.getClass(), "name", "xml");
        setBooleanField(term14884, term14884.getClass(), "isProcessingInstruction", false);
        setField(term14884, term14884.getClass(), "parentNode", null);
        setField(term14884, term14884.getClass(), "childNodes", null);
        setField(term14887, term14887.getClass(), "attributes", null);
        setField(term14884, term14884.getClass(), "attributes", term14887);
        setField(term14884, term14884.getClass(), "baseUri", null);
        setIntField(term14884, term14884.getClass(), "siblingIndex", 0);
        term14888 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term14888, term14888.getClass(), "autoFlush", false);
        setBooleanField(term14888, term14888.getClass(), "trouble", true);
        setField(term14888, term14888.getClass(), "formatter", null);
        setField(term14888, term14888.getClass(), "textOut", null);
        setField(term14888, term14888.getClass(), "charOut", null);
        setBooleanField(term14888, term14888.getClass(), "closing", false);
        setField(term14888, term14888.getClass(), "out", null);
        setBooleanField(term14888, term14888.getClass(), "closed", false);
        setField(term14888, term14888.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term14854;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term14714, args);
        assertTrue(recursiveEquals(term14714, term14884));
        assertTrue(recursiveEquals(term14854, term14888));
    }

};


