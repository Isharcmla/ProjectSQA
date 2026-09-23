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

public class XmlDeclaration_outerHtmlHead_39918189167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15791;
     Object term15873;
     Object term16231;
     Object term16234;

    public XmlDeclaration_outerHtmlHead_39918189167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15791 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term15791, term15791.getClass(), "isProcessingInstruction", true);
        setField(term15791, term15791.getClass(), "name", "                                                                                                                  ");
        term15873 = newInstance(Class.forName("java.io.PrintStream"));
        term16231 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term16231, term16231.getClass(), "name", "                                                                                                                  ");
        setBooleanField(term16231, term16231.getClass(), "isProcessingInstruction", true);
        setField(term16231, term16231.getClass(), "parentNode", null);
        setField(term16231, term16231.getClass(), "childNodes", null);
        setField(term16231, term16231.getClass(), "attributes", null);
        setField(term16231, term16231.getClass(), "baseUri", null);
        setIntField(term16231, term16231.getClass(), "siblingIndex", 0);
        term16234 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term16234, term16234.getClass(), "autoFlush", false);
        setBooleanField(term16234, term16234.getClass(), "trouble", true);
        setField(term16234, term16234.getClass(), "formatter", null);
        setField(term16234, term16234.getClass(), "textOut", null);
        setField(term16234, term16234.getClass(), "charOut", null);
        setBooleanField(term16234, term16234.getClass(), "closing", false);
        setField(term16234, term16234.getClass(), "out", null);
        setBooleanField(term16234, term16234.getClass(), "closed", false);
        setField(term16234, term16234.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term15873;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term15791, args);
        assertTrue(recursiveEquals(term15791, term16231));
        assertTrue(recursiveEquals(term15873, term16234));
    }

};


