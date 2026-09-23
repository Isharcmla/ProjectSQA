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
import java.nio.ReadOnlyBufferException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Comment_outerHtmlHead_174637796341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145908;
     Object term145962;
     Object term146046;

    public Comment_outerHtmlHead_174637796341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145908 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        term145962 = newInstance(Class.forName("java.nio.HeapCharBufferR"));
        term146046 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setBooleanField(term146046, term146046.getClass(), "prettyPrint", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term145962;
        args[1] = 0;
        args[2] = term146046;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term145908, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


