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

public class XmlDeclaration_outerHtmlHead_399181891103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26310;
     Object term26652;
     Object term26787;
     Object term26795;

    public XmlDeclaration_outerHtmlHead_399181891103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26556 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term26466 = new LinkedHashMap();
        ((LinkedHashMap) term26466).put((Object)null, (Object)null);
        ((LinkedHashMap) term26466).put(term26556, term26556);
        term26310 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term26406 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term26310, term26310.getClass(), "isProcessingInstruction", false);
        setField(term26310, term26310.getClass(), "name", "xml");
        setField(term26406, term26406.getClass(), "attributes", term26466);
        setField(term26310, term26310.getClass(), "attributes", term26406);
        term26652 = newInstance(Class.forName("java.io.PrintStream"));
        LinkedHashMap term26791 = new LinkedHashMap();
        term26787 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term26790 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26787, term26787.getClass(), "name", "xml");
        setBooleanField(term26787, term26787.getClass(), "isProcessingInstruction", false);
        setField(term26787, term26787.getClass(), "parentNode", null);
        setField(term26787, term26787.getClass(), "childNodes", null);
        setField(term26790, term26790.getClass(), "attributes", term26791);
        setField(term26787, term26787.getClass(), "attributes", term26790);
        setField(term26787, term26787.getClass(), "baseUri", null);
        setIntField(term26787, term26787.getClass(), "siblingIndex", 0);
        term26795 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term26795, term26795.getClass(), "autoFlush", false);
        setBooleanField(term26795, term26795.getClass(), "trouble", true);
        setField(term26795, term26795.getClass(), "formatter", null);
        setField(term26795, term26795.getClass(), "textOut", null);
        setField(term26795, term26795.getClass(), "charOut", null);
        setBooleanField(term26795, term26795.getClass(), "closing", false);
        setField(term26795, term26795.getClass(), "out", null);
        setBooleanField(term26795, term26795.getClass(), "closed", false);
        setField(term26795, term26795.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term26652;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term26310, args);
        assertTrue(recursiveEquals(term26310, term26787));
        assertTrue(recursiveEquals(term26652, term26795));
    }

};


