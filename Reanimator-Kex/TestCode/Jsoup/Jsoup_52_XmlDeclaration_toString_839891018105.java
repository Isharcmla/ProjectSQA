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
import java.lang.Object;

public class XmlDeclaration_toString_839891018105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27464;

    public XmlDeclaration_toString_839891018105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27464 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term27518 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term27602 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term27518, term27518.getClass(), "outputSettings", term27602);
        setField(term27464, term27464.getClass(), "parentNode", term27518);
        setBooleanField(term27464, term27464.getClass(), "isProcessingInstruction", false);
        setField(term27464, term27464.getClass(), "name", "xml");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term27464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


