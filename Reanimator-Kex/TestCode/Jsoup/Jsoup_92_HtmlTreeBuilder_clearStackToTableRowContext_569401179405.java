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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364654;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term364706 = new ArrayList();
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        ((ArrayList) term364706).add("tr");
        term364654 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term364654, term364654.getClass(), "stack", term364706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term364654, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


