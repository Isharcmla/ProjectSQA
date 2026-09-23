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

public class XmlDeclaration_outerHtmlHead_399181891145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52570;
     Object term52710;
     Object term52740;
     Object term52744;

    public XmlDeclaration_outerHtmlHead_399181891145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52570 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term52666 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term52570, term52570.getClass(), "isProcessingInstruction", false);
        setField(term52570, term52570.getClass(), "name", "xml");
        setField(term52666, term52666.getClass(), "attributes", null);
        setField(term52570, term52570.getClass(), "attributes", term52666);
        term52710 = newInstance(Class.forName("java.io.PrintStream"));
        term52740 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term52743 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term52740, term52740.getClass(), "name", "xml");
        setBooleanField(term52740, term52740.getClass(), "isProcessingInstruction", false);
        setField(term52740, term52740.getClass(), "parentNode", null);
        setField(term52740, term52740.getClass(), "childNodes", null);
        setField(term52743, term52743.getClass(), "attributes", null);
        setField(term52740, term52740.getClass(), "attributes", term52743);
        setField(term52740, term52740.getClass(), "baseUri", null);
        setIntField(term52740, term52740.getClass(), "siblingIndex", 0);
        term52744 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term52744, term52744.getClass(), "autoFlush", false);
        setBooleanField(term52744, term52744.getClass(), "trouble", true);
        setField(term52744, term52744.getClass(), "formatter", null);
        setField(term52744, term52744.getClass(), "textOut", null);
        setField(term52744, term52744.getClass(), "charOut", null);
        setBooleanField(term52744, term52744.getClass(), "closing", false);
        setField(term52744, term52744.getClass(), "out", null);
        setBooleanField(term52744, term52744.getClass(), "closed", false);
        setField(term52744, term52744.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term52710;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term52570, args);
        assertTrue(recursiveEquals(term52570, term52740));
        assertTrue(recursiveEquals(term52710, term52744));
    }

};


