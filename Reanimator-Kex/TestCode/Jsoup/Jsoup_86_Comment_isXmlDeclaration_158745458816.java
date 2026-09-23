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

public class Comment_isXmlDeclaration_158745458816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47438;

    public Comment_isXmlDeclaration_158745458816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47438 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term47439 = newInstance(Class.forName("java.lang.Object"));
        setField(term47438, term47438.getClass(), "value", term47439);
        setField(term47438, term47438.getClass(), "parentNode", null);
        setIntField(term47438, term47438.getClass(), "siblingIndex", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isXmlDeclaration", argTypes, term47438, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


