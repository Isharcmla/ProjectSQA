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

public class XmlDeclaration_outerHtmlHead_399181891151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53719;
     Object term54023;
     Object term54065;
     Object term54070;

    public XmlDeclaration_outerHtmlHead_399181891151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term53875 = new LinkedHashMap();
        term53719 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term53815 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term53719, term53719.getClass(), "isProcessingInstruction", false);
        setField(term53719, term53719.getClass(), "name", "xml");
        setField(term53815, term53815.getClass(), "attributes", term53875);
        setField(term53719, term53719.getClass(), "attributes", term53815);
        term54023 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term54069 = new LinkedHashMap();
        term54065 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term54068 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term54065, term54065.getClass(), "name", "xml");
        setBooleanField(term54065, term54065.getClass(), "isProcessingInstruction", false);
        setField(term54065, term54065.getClass(), "parentNode", null);
        setField(term54065, term54065.getClass(), "childNodes", null);
        setField(term54068, term54068.getClass(), "attributes", term54069);
        setField(term54065, term54065.getClass(), "attributes", term54068);
        setField(term54065, term54065.getClass(), "baseUri", null);
        setIntField(term54065, term54065.getClass(), "siblingIndex", 0);
        term54070 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term54070, term54070.getClass(), "autoFlush", false);
        setBooleanField(term54070, term54070.getClass(), "trouble", true);
        setField(term54070, term54070.getClass(), "formatter", null);
        setField(term54070, term54070.getClass(), "textOut", null);
        setField(term54070, term54070.getClass(), "charOut", null);
        setBooleanField(term54070, term54070.getClass(), "closing", false);
        setField(term54070, term54070.getClass(), "out", null);
        setBooleanField(term54070, term54070.getClass(), "closed", false);
        setField(term54070, term54070.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term54023;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term53719, args);
        assertTrue(recursiveEquals(term53719, term54065));
        assertTrue(recursiveEquals(term54023, term54070));
    }

};


