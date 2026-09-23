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

public class XmlDeclaration_outerHtmlHead_39918189191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22043;
     Object term22243;
     Object term22285;
     Object term22290;

    public XmlDeclaration_outerHtmlHead_39918189191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term22199 = new LinkedHashMap();
        term22043 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term22139 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term22043, term22043.getClass(), "isProcessingInstruction", false);
        setField(term22043, term22043.getClass(), "name", "xml");
        setField(term22139, term22139.getClass(), "attributes", term22199);
        setField(term22043, term22043.getClass(), "attributes", term22139);
        term22243 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term22289 = new LinkedHashMap();
        term22285 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term22288 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22285, term22285.getClass(), "name", "xml");
        setBooleanField(term22285, term22285.getClass(), "isProcessingInstruction", false);
        setField(term22285, term22285.getClass(), "parentNode", null);
        setField(term22285, term22285.getClass(), "childNodes", null);
        setField(term22288, term22288.getClass(), "attributes", term22289);
        setField(term22285, term22285.getClass(), "attributes", term22288);
        setField(term22285, term22285.getClass(), "baseUri", null);
        setIntField(term22285, term22285.getClass(), "siblingIndex", 0);
        term22290 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term22290, term22290.getClass(), "autoFlush", false);
        setBooleanField(term22290, term22290.getClass(), "trouble", true);
        setField(term22290, term22290.getClass(), "formatter", null);
        setField(term22290, term22290.getClass(), "textOut", null);
        setField(term22290, term22290.getClass(), "charOut", null);
        setBooleanField(term22290, term22290.getClass(), "closing", false);
        setField(term22290, term22290.getClass(), "out", null);
        setBooleanField(term22290, term22290.getClass(), "closed", false);
        setField(term22290, term22290.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term22243;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term22043, args);
        assertTrue(recursiveEquals(term22043, term22285));
        assertTrue(recursiveEquals(term22243, term22290));
    }

};


