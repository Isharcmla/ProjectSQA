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

public class XmlDeclaration_outerHtmlHead_399181891163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56373;
     Object term56677;
     Object term56719;
     Object term56724;

    public XmlDeclaration_outerHtmlHead_399181891163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term56529 = new LinkedHashMap();
        term56373 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term56469 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term56373, term56373.getClass(), "isProcessingInstruction", false);
        setField(term56373, term56373.getClass(), "name", "xml");
        setField(term56469, term56469.getClass(), "attributes", term56529);
        setField(term56373, term56373.getClass(), "attributes", term56469);
        term56677 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term56723 = new LinkedHashMap();
        term56719 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term56722 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56719, term56719.getClass(), "name", "xml");
        setBooleanField(term56719, term56719.getClass(), "isProcessingInstruction", false);
        setField(term56719, term56719.getClass(), "parentNode", null);
        setField(term56719, term56719.getClass(), "childNodes", null);
        setField(term56722, term56722.getClass(), "attributes", term56723);
        setField(term56719, term56719.getClass(), "attributes", term56722);
        setField(term56719, term56719.getClass(), "baseUri", null);
        setIntField(term56719, term56719.getClass(), "siblingIndex", 0);
        term56724 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term56724, term56724.getClass(), "autoFlush", false);
        setBooleanField(term56724, term56724.getClass(), "trouble", true);
        setField(term56724, term56724.getClass(), "formatter", null);
        setField(term56724, term56724.getClass(), "textOut", null);
        setField(term56724, term56724.getClass(), "charOut", null);
        setBooleanField(term56724, term56724.getClass(), "closing", false);
        setField(term56724, term56724.getClass(), "out", null);
        setBooleanField(term56724, term56724.getClass(), "closed", false);
        setField(term56724, term56724.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term56677;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term56373, args);
        assertTrue(recursiveEquals(term56373, term56719));
        assertTrue(recursiveEquals(term56677, term56724));
    }

};


