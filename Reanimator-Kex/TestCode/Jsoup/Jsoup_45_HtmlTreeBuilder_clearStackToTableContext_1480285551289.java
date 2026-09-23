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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647124;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term647214 = newInstance(Class.forName("java.lang.Object"));
        Object term647268 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term647176 = new ArrayList();
        ((ArrayList) term647176).add(term647214);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        ((ArrayList) term647176).add(term647268);
        term647124 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term647124, term647124.getClass(), "stack", term647176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableContext", argTypes, term647124, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


