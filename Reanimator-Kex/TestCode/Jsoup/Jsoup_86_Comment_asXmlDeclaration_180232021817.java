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

public class Comment_asXmlDeclaration_180232021817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47441;

    public Comment_asXmlDeclaration_180232021817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47441 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term47442 = newInstance(Class.forName("java.lang.Object"));
        setField(term47441, term47441.getClass(), "value", term47442);
        setField(term47441, term47441.getClass(), "parentNode", null);
        setIntField(term47441, term47441.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asXmlDeclaration", argTypes, term47441, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


