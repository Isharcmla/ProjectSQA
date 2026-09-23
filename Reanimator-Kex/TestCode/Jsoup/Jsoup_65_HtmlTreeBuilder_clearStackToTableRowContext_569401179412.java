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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500100;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term500190 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term500152 = new ArrayList();
        ((ArrayList) term500152).add((Object)null);
        ((ArrayList) term500152).add(term500190);
        term500100 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term500100, term500100.getClass(), "stack", term500152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term500100, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


