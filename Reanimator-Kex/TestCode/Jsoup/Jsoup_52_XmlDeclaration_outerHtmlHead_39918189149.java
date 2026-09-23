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

public class XmlDeclaration_outerHtmlHead_39918189149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11919;
     Object term12001;
     Object term12068;
     Object term12071;

    public XmlDeclaration_outerHtmlHead_39918189149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11919 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term11919, term11919.getClass(), "isProcessingInstruction", false);
        setField(term11919, term11919.getClass(), "name", "                 ");
        term12001 = newInstance(Class.forName("java.io.PrintStream"));
        term12068 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term12068, term12068.getClass(), "name", "                 ");
        setBooleanField(term12068, term12068.getClass(), "isProcessingInstruction", false);
        setField(term12068, term12068.getClass(), "parentNode", null);
        setField(term12068, term12068.getClass(), "childNodes", null);
        setField(term12068, term12068.getClass(), "attributes", null);
        setField(term12068, term12068.getClass(), "baseUri", null);
        setIntField(term12068, term12068.getClass(), "siblingIndex", 0);
        term12071 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term12071, term12071.getClass(), "autoFlush", false);
        setBooleanField(term12071, term12071.getClass(), "trouble", true);
        setField(term12071, term12071.getClass(), "formatter", null);
        setField(term12071, term12071.getClass(), "textOut", null);
        setField(term12071, term12071.getClass(), "charOut", null);
        setBooleanField(term12071, term12071.getClass(), "closing", false);
        setField(term12071, term12071.getClass(), "out", null);
        setBooleanField(term12071, term12071.getClass(), "closed", false);
        setField(term12071, term12071.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term12001;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term11919, args);
        assertTrue(recursiveEquals(term11919, term12068));
        assertTrue(recursiveEquals(term12001, term12071));
    }

};


