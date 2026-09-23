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

public class XmlDeclaration_outerHtmlHead_39918189163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15060;
     Object term15142;
     Object term15194;
     Object term15197;

    public XmlDeclaration_outerHtmlHead_39918189163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15060 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term15060, term15060.getClass(), "isProcessingInstruction", false);
        setField(term15060, term15060.getClass(), "name", " xxxxxxxxxxx");
        term15142 = newInstance(Class.forName("java.io.PrintStream"));
        term15194 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term15194, term15194.getClass(), "name", " xxxxxxxxxxx");
        setBooleanField(term15194, term15194.getClass(), "isProcessingInstruction", false);
        setField(term15194, term15194.getClass(), "parentNode", null);
        setField(term15194, term15194.getClass(), "childNodes", null);
        setField(term15194, term15194.getClass(), "attributes", null);
        setField(term15194, term15194.getClass(), "baseUri", null);
        setIntField(term15194, term15194.getClass(), "siblingIndex", 0);
        term15197 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term15197, term15197.getClass(), "autoFlush", false);
        setBooleanField(term15197, term15197.getClass(), "trouble", true);
        setField(term15197, term15197.getClass(), "formatter", null);
        setField(term15197, term15197.getClass(), "textOut", null);
        setField(term15197, term15197.getClass(), "charOut", null);
        setBooleanField(term15197, term15197.getClass(), "closing", false);
        setField(term15197, term15197.getClass(), "out", null);
        setBooleanField(term15197, term15197.getClass(), "closed", false);
        setField(term15197, term15197.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term15142;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term15060, args);
        assertTrue(recursiveEquals(term15060, term15194));
        assertTrue(recursiveEquals(term15142, term15197));
    }

};


