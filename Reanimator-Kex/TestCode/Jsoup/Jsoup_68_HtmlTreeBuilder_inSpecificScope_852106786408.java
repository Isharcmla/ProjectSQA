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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_inSpecificScope_852106786408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320601;

    public HtmlTreeBuilder_inSpecificScope_852106786408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term320653 = new ArrayList();
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        ((ArrayList) term320653).add((Object)null);
        term320601 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term320601, term320601.getClass(), "stack", term320653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "inSpecificScope", argTypes, term320601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


