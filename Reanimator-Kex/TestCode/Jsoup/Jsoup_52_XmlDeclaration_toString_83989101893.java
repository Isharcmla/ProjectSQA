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

public class XmlDeclaration_toString_83989101893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22926;

    public XmlDeclaration_toString_83989101893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22926 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term22980 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term22980, term22980.getClass(), "outputSettings", null);
        setField(term22926, term22926.getClass(), "parentNode", term22980);
        setBooleanField(term22926, term22926.getClass(), "isProcessingInstruction", false);
        setField(term22926, term22926.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term22926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


