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
import java.lang.ClassCastException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class XmlDeclaration_outerHtmlHead_399181891137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50320;
     Object term50738;

    public XmlDeclaration_outerHtmlHead_399181891137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50604 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term50476 = new LinkedHashMap();
        ((LinkedHashMap) term50476).put("version", "version");
        ((LinkedHashMap) term50476).put(term50604, term50604);
        term50320 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term50416 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term50320, term50320.getClass(), "isProcessingInstruction", false);
        setField(term50320, term50320.getClass(), "name", "xml");
        setField(term50416, term50416.getClass(), "attributes", term50476);
        setField(term50320, term50320.getClass(), "attributes", term50416);
        term50738 = newInstance(Class.forName("java.io.PrintStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term50738;
        args[1] = 0;
        args[2] = null;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term50320, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


