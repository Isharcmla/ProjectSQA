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

public class XmlDeclaration_outerHtmlHead_399181891109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28715;
     Object term28797;
     Object term28816;
     Object term28819;

    public XmlDeclaration_outerHtmlHead_399181891109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28715 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term28715, term28715.getClass(), "isProcessingInstruction", false);
        setField(term28715, term28715.getClass(), "name", " ");
        term28797 = newInstance(Class.forName("java.io.PrintStream"));
        term28816 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term28816, term28816.getClass(), "name", " ");
        setBooleanField(term28816, term28816.getClass(), "isProcessingInstruction", false);
        setField(term28816, term28816.getClass(), "parentNode", null);
        setField(term28816, term28816.getClass(), "childNodes", null);
        setField(term28816, term28816.getClass(), "attributes", null);
        setField(term28816, term28816.getClass(), "baseUri", null);
        setIntField(term28816, term28816.getClass(), "siblingIndex", 0);
        term28819 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term28819, term28819.getClass(), "autoFlush", false);
        setBooleanField(term28819, term28819.getClass(), "trouble", true);
        setField(term28819, term28819.getClass(), "formatter", null);
        setField(term28819, term28819.getClass(), "textOut", null);
        setField(term28819, term28819.getClass(), "charOut", null);
        setBooleanField(term28819, term28819.getClass(), "closing", false);
        setField(term28819, term28819.getClass(), "out", null);
        setBooleanField(term28819, term28819.getClass(), "closed", false);
        setField(term28819, term28819.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term28797;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term28715, args);
        assertTrue(recursiveEquals(term28715, term28816));
        assertTrue(recursiveEquals(term28797, term28819));
    }

};


