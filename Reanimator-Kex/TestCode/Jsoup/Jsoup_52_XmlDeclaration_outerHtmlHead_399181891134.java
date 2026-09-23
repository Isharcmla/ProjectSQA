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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class XmlDeclaration_outerHtmlHead_399181891134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41353;
     Object term41397;

    public XmlDeclaration_outerHtmlHead_399181891134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41353 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        setBooleanField(term41353, term41353.getClass(), "isProcessingInstruction", false);
        term41397 = newInstance(Class.forName("java.io.PrintStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term41397;
        args[1] = 0;
        args[2] = null;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term41353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


