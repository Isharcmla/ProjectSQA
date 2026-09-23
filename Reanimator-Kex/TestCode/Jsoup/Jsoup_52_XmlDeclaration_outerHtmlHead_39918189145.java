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

public class XmlDeclaration_outerHtmlHead_39918189145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11199;
     Object term11281;
     Object term11297;
     Object term11300;

    public XmlDeclaration_outerHtmlHead_39918189145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11199 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term11199, term11199.getClass(), "isProcessingInstruction", true);
        setField(term11199, term11199.getClass(), "name", "");
        term11281 = newInstance(Class.forName("java.io.PrintStream"));
        term11297 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term11297, term11297.getClass(), "name", "");
        setBooleanField(term11297, term11297.getClass(), "isProcessingInstruction", true);
        setField(term11297, term11297.getClass(), "parentNode", null);
        setField(term11297, term11297.getClass(), "childNodes", null);
        setField(term11297, term11297.getClass(), "attributes", null);
        setField(term11297, term11297.getClass(), "baseUri", null);
        setIntField(term11297, term11297.getClass(), "siblingIndex", 0);
        term11300 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term11300, term11300.getClass(), "autoFlush", false);
        setBooleanField(term11300, term11300.getClass(), "trouble", true);
        setField(term11300, term11300.getClass(), "formatter", null);
        setField(term11300, term11300.getClass(), "textOut", null);
        setField(term11300, term11300.getClass(), "charOut", null);
        setBooleanField(term11300, term11300.getClass(), "closing", false);
        setField(term11300, term11300.getClass(), "out", null);
        setBooleanField(term11300, term11300.getClass(), "closed", false);
        setField(term11300, term11300.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term11281;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term11199, args);
        assertTrue(recursiveEquals(term11199, term11297));
        assertTrue(recursiveEquals(term11281, term11300));
    }

};


