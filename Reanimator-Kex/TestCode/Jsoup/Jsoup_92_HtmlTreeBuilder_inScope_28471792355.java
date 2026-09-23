package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_inScope_28471792355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347099;

    public HtmlTreeBuilder_inScope_28471792355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term347189 = newInstance(Class.forName("java.lang.Object"));
        Object term347227 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term347151 = new ArrayList();
        ((ArrayList) term347151).add(term347189);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        ((ArrayList) term347151).add(term347227);
        term347099 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term347099, term347099.getClass(), "stack", term347151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inScope", argTypes, term347099, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


