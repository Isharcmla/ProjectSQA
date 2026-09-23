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

public class XmlDeclaration_outerHtmlHead_399181891141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51907;
     Object term51989;
     Object term52035;
     Object term52038;

    public XmlDeclaration_outerHtmlHead_399181891141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51907 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term51907, term51907.getClass(), "isProcessingInstruction", true);
        setField(term51907, term51907.getClass(), "name", "          ");
        term51989 = newInstance(Class.forName("java.io.PrintStream"));
        term52035 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term52035, term52035.getClass(), "name", "          ");
        setBooleanField(term52035, term52035.getClass(), "isProcessingInstruction", true);
        setField(term52035, term52035.getClass(), "parentNode", null);
        setField(term52035, term52035.getClass(), "childNodes", null);
        setField(term52035, term52035.getClass(), "attributes", null);
        setField(term52035, term52035.getClass(), "baseUri", null);
        setIntField(term52035, term52035.getClass(), "siblingIndex", 0);
        term52038 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term52038, term52038.getClass(), "autoFlush", false);
        setBooleanField(term52038, term52038.getClass(), "trouble", true);
        setField(term52038, term52038.getClass(), "formatter", null);
        setField(term52038, term52038.getClass(), "textOut", null);
        setField(term52038, term52038.getClass(), "charOut", null);
        setBooleanField(term52038, term52038.getClass(), "closing", false);
        setField(term52038, term52038.getClass(), "out", null);
        setBooleanField(term52038, term52038.getClass(), "closed", false);
        setField(term52038, term52038.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term51989;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term51907, args);
        assertTrue(recursiveEquals(term51907, term52035));
        assertTrue(recursiveEquals(term51989, term52038));
    }

};


