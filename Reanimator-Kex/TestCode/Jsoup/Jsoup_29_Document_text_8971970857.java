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
import java.util.ArrayList;
import java.lang.Object;

public class Document_text_8971970857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25497;

    public Document_text_8971970857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25549 = new ArrayList();
        ((ArrayList) term25549).add("body");
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        ((ArrayList) term25549).add((Object)null);
        term25497 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term25497, term25497.getClass(), "childNodes", term25549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "text", argTypes, term25497, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


