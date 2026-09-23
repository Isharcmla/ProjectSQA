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

public class XmlDeclaration_outerHtmlHead_399181891135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41634;
     Object term41938;
     Object term48259;
     Object term48264;

    public XmlDeclaration_outerHtmlHead_399181891135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term41790 = new LinkedHashMap();
        term41634 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term41730 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term41634, term41634.getClass(), "isProcessingInstruction", false);
        setField(term41634, term41634.getClass(), "name", "xml");
        setField(term41730, term41730.getClass(), "attributes", term41790);
        setField(term41634, term41634.getClass(), "attributes", term41730);
        term41938 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term48263 = new LinkedHashMap();
        term48259 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term48262 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term48259, term48259.getClass(), "name", "xml");
        setBooleanField(term48259, term48259.getClass(), "isProcessingInstruction", false);
        setField(term48259, term48259.getClass(), "parentNode", null);
        setField(term48259, term48259.getClass(), "childNodes", null);
        setField(term48262, term48262.getClass(), "attributes", term48263);
        setField(term48259, term48259.getClass(), "attributes", term48262);
        setField(term48259, term48259.getClass(), "baseUri", null);
        setIntField(term48259, term48259.getClass(), "siblingIndex", 0);
        term48264 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term48264, term48264.getClass(), "autoFlush", false);
        setBooleanField(term48264, term48264.getClass(), "trouble", true);
        setField(term48264, term48264.getClass(), "formatter", null);
        setField(term48264, term48264.getClass(), "textOut", null);
        setField(term48264, term48264.getClass(), "charOut", null);
        setBooleanField(term48264, term48264.getClass(), "closing", false);
        setField(term48264, term48264.getClass(), "out", null);
        setBooleanField(term48264, term48264.getClass(), "closed", false);
        setField(term48264, term48264.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term41938;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term41634, args);
        assertTrue(recursiveEquals(term41634, term48259));
        assertTrue(recursiveEquals(term41938, term48264));
    }

};


