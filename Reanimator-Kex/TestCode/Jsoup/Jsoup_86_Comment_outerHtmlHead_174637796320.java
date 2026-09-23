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

public class Comment_outerHtmlHead_174637796320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89727;
     Object term89787;
     Object term89871;

    public Comment_outerHtmlHead_174637796320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89727 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        term89787 = newInstance(Class.forName("java.nio.DirectCharBufferRU"));
        term89871 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setBooleanField(term89871, term89871.getClass(), "prettyPrint", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term89787;
        args[1] = 0;
        args[2] = term89871;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term89727, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


