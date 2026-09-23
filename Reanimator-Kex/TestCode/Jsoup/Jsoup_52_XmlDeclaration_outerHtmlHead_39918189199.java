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

public class XmlDeclaration_outerHtmlHead_39918189199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25552;
     Object term25692;
     Object term25722;
     Object term25726;

    public XmlDeclaration_outerHtmlHead_39918189199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25552 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term25648 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term25552, term25552.getClass(), "isProcessingInstruction", false);
        setField(term25552, term25552.getClass(), "name", "xml");
        setField(term25648, term25648.getClass(), "attributes", null);
        setField(term25552, term25552.getClass(), "attributes", term25648);
        term25692 = newInstance(Class.forName("java.io.PrintStream"));
        term25722 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term25725 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25722, term25722.getClass(), "name", "xml");
        setBooleanField(term25722, term25722.getClass(), "isProcessingInstruction", false);
        setField(term25722, term25722.getClass(), "parentNode", null);
        setField(term25722, term25722.getClass(), "childNodes", null);
        setField(term25725, term25725.getClass(), "attributes", null);
        setField(term25722, term25722.getClass(), "attributes", term25725);
        setField(term25722, term25722.getClass(), "baseUri", null);
        setIntField(term25722, term25722.getClass(), "siblingIndex", 0);
        term25726 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term25726, term25726.getClass(), "autoFlush", false);
        setBooleanField(term25726, term25726.getClass(), "trouble", true);
        setField(term25726, term25726.getClass(), "formatter", null);
        setField(term25726, term25726.getClass(), "textOut", null);
        setField(term25726, term25726.getClass(), "charOut", null);
        setBooleanField(term25726, term25726.getClass(), "closing", false);
        setField(term25726, term25726.getClass(), "out", null);
        setBooleanField(term25726, term25726.getClass(), "closed", false);
        setField(term25726, term25726.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term25692;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term25552, args);
        assertTrue(recursiveEquals(term25552, term25722));
        assertTrue(recursiveEquals(term25692, term25726));
    }

};


