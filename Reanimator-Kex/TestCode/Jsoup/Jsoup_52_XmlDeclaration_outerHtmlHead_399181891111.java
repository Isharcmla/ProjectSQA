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

public class XmlDeclaration_outerHtmlHead_399181891111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29015;
     Object term29319;
     Object term29361;
     Object term29366;

    public XmlDeclaration_outerHtmlHead_399181891111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term29171 = new LinkedHashMap();
        term29015 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term29111 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term29015, term29015.getClass(), "isProcessingInstruction", false);
        setField(term29015, term29015.getClass(), "name", "xml");
        setField(term29111, term29111.getClass(), "attributes", term29171);
        setField(term29015, term29015.getClass(), "attributes", term29111);
        term29319 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term29365 = new LinkedHashMap();
        term29361 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term29364 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29361, term29361.getClass(), "name", "xml");
        setBooleanField(term29361, term29361.getClass(), "isProcessingInstruction", false);
        setField(term29361, term29361.getClass(), "parentNode", null);
        setField(term29361, term29361.getClass(), "childNodes", null);
        setField(term29364, term29364.getClass(), "attributes", term29365);
        setField(term29361, term29361.getClass(), "attributes", term29364);
        setField(term29361, term29361.getClass(), "baseUri", null);
        setIntField(term29361, term29361.getClass(), "siblingIndex", 0);
        term29366 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term29366, term29366.getClass(), "autoFlush", false);
        setBooleanField(term29366, term29366.getClass(), "trouble", true);
        setField(term29366, term29366.getClass(), "formatter", null);
        setField(term29366, term29366.getClass(), "textOut", null);
        setField(term29366, term29366.getClass(), "charOut", null);
        setBooleanField(term29366, term29366.getClass(), "closing", false);
        setField(term29366, term29366.getClass(), "out", null);
        setBooleanField(term29366, term29366.getClass(), "closed", false);
        setField(term29366, term29366.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term29319;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term29015, args);
        assertTrue(recursiveEquals(term29015, term29361));
        assertTrue(recursiveEquals(term29319, term29366));
    }

};


