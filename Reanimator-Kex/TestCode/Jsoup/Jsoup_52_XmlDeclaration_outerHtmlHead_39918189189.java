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

public class XmlDeclaration_outerHtmlHead_39918189189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21707;
     Object term21789;
     Object term21856;
     Object term21859;

    public XmlDeclaration_outerHtmlHead_39918189189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21707 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term21707, term21707.getClass(), "isProcessingInstruction", true);
        setField(term21707, term21707.getClass(), "name", "                 ");
        term21789 = newInstance(Class.forName("java.io.PrintStream"));
        term21856 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setField(term21856, term21856.getClass(), "name", "                 ");
        setBooleanField(term21856, term21856.getClass(), "isProcessingInstruction", true);
        setField(term21856, term21856.getClass(), "parentNode", null);
        setField(term21856, term21856.getClass(), "childNodes", null);
        setField(term21856, term21856.getClass(), "attributes", null);
        setField(term21856, term21856.getClass(), "baseUri", null);
        setIntField(term21856, term21856.getClass(), "siblingIndex", 0);
        term21859 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term21859, term21859.getClass(), "autoFlush", false);
        setBooleanField(term21859, term21859.getClass(), "trouble", true);
        setField(term21859, term21859.getClass(), "formatter", null);
        setField(term21859, term21859.getClass(), "textOut", null);
        setField(term21859, term21859.getClass(), "charOut", null);
        setBooleanField(term21859, term21859.getClass(), "closing", false);
        setField(term21859, term21859.getClass(), "out", null);
        setBooleanField(term21859, term21859.getClass(), "closed", false);
        setField(term21859, term21859.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term21789;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term21707, args);
        assertTrue(recursiveEquals(term21707, term21856));
        assertTrue(recursiveEquals(term21789, term21859));
    }

};


