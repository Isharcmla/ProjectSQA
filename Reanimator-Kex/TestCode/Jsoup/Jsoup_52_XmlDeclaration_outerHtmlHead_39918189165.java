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

public class XmlDeclaration_outerHtmlHead_39918189165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15369;
     Object term15451;
     Object term15518;
     Object term15521;

    public XmlDeclaration_outerHtmlHead_39918189165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15369 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term15369, term15369.getClass(), "isProcessingInstruction", true);
        setField(term15369, term15369.getClass(), "name", "                 ");
        term15451 = newInstance(Class.forName("java.io.PrintStream"));
        term15518 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term15518, term15518.getClass(), "name", "                 ");
        setBooleanField(term15518, term15518.getClass(), "isProcessingInstruction", true);
        setField(term15518, term15518.getClass(), "parentNode", null);
        setField(term15518, term15518.getClass(), "childNodes", null);
        setField(term15518, term15518.getClass(), "attributes", null);
        setField(term15518, term15518.getClass(), "baseUri", null);
        setIntField(term15518, term15518.getClass(), "siblingIndex", 0);
        term15521 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term15521, term15521.getClass(), "autoFlush", false);
        setBooleanField(term15521, term15521.getClass(), "trouble", true);
        setField(term15521, term15521.getClass(), "formatter", null);
        setField(term15521, term15521.getClass(), "textOut", null);
        setField(term15521, term15521.getClass(), "charOut", null);
        setBooleanField(term15521, term15521.getClass(), "closing", false);
        setField(term15521, term15521.getClass(), "out", null);
        setBooleanField(term15521, term15521.getClass(), "closed", false);
        setField(term15521, term15521.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term15451;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term15369, args);
        assertTrue(recursiveEquals(term15369, term15518));
        assertTrue(recursiveEquals(term15451, term15521));
    }

};


