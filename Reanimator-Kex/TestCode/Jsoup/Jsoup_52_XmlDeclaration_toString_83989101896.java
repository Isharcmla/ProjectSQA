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

public class XmlDeclaration_toString_83989101896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24487;

    public XmlDeclaration_toString_83989101896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24487 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term24541 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term24541, term24541.getClass(), "outputSettings", null);
        setField(term24487, term24487.getClass(), "parentNode", term24541);
        setBooleanField(term24487, term24487.getClass(), "isProcessingInstruction", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term24487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


