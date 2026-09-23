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

public class XmlDeclaration_outerHtmlHead_39918189175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17713;
     Object term17795;
     Object term17811;
     Object term17814;

    public XmlDeclaration_outerHtmlHead_39918189175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17713 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term17713, term17713.getClass(), "isProcessingInstruction", false);
        setField(term17713, term17713.getClass(), "name", "");
        term17795 = newInstance(Class.forName("java.io.PrintStream"));
        term17811 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term17811, term17811.getClass(), "name", "");
        setBooleanField(term17811, term17811.getClass(), "isProcessingInstruction", false);
        setField(term17811, term17811.getClass(), "parentNode", null);
        setField(term17811, term17811.getClass(), "childNodes", null);
        setField(term17811, term17811.getClass(), "attributes", null);
        setField(term17811, term17811.getClass(), "baseUri", null);
        setIntField(term17811, term17811.getClass(), "siblingIndex", 0);
        term17814 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term17814, term17814.getClass(), "autoFlush", false);
        setBooleanField(term17814, term17814.getClass(), "trouble", true);
        setField(term17814, term17814.getClass(), "formatter", null);
        setField(term17814, term17814.getClass(), "textOut", null);
        setField(term17814, term17814.getClass(), "charOut", null);
        setBooleanField(term17814, term17814.getClass(), "closing", false);
        setField(term17814, term17814.getClass(), "out", null);
        setBooleanField(term17814, term17814.getClass(), "closed", false);
        setField(term17814, term17814.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term17795;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term17713, args);
        assertTrue(recursiveEquals(term17713, term17811));
        assertTrue(recursiveEquals(term17795, term17814));
    }

};


