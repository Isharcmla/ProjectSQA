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

public class XmlDeclaration_outerHtmlHead_399181891133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41114;
     Object term41254;
     Object term47959;
     Object term47963;

    public XmlDeclaration_outerHtmlHead_399181891133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41114 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term41210 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term41114, term41114.getClass(), "isProcessingInstruction", true);
        setField(term41114, term41114.getClass(), "name", "xml");
        setField(term41210, term41210.getClass(), "attributes", null);
        setField(term41114, term41114.getClass(), "attributes", term41210);
        term41254 = newInstance(Class.forName("java.io.PrintStream"));
        term47959 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term47962 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term47959, term47959.getClass(), "name", "xml");
        setBooleanField(term47959, term47959.getClass(), "isProcessingInstruction", true);
        setField(term47959, term47959.getClass(), "parentNode", null);
        setField(term47959, term47959.getClass(), "childNodes", null);
        setField(term47962, term47962.getClass(), "attributes", null);
        setField(term47959, term47959.getClass(), "attributes", term47962);
        setField(term47959, term47959.getClass(), "baseUri", null);
        setIntField(term47959, term47959.getClass(), "siblingIndex", 0);
        term47963 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term47963, term47963.getClass(), "autoFlush", false);
        setBooleanField(term47963, term47963.getClass(), "trouble", true);
        setField(term47963, term47963.getClass(), "formatter", null);
        setField(term47963, term47963.getClass(), "textOut", null);
        setField(term47963, term47963.getClass(), "charOut", null);
        setBooleanField(term47963, term47963.getClass(), "closing", false);
        setField(term47963, term47963.getClass(), "out", null);
        setBooleanField(term47963, term47963.getClass(), "closed", false);
        setField(term47963, term47963.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term41254;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term41114, args);
        assertTrue(recursiveEquals(term41114, term47959));
        assertTrue(recursiveEquals(term41254, term47963));
    }

};


