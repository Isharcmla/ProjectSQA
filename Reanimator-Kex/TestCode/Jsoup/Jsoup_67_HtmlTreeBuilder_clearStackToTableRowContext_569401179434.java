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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287847;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term287899 = new ArrayList();
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        ((ArrayList) term287899).add("tr");
        term287847 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term287847, term287847.getClass(), "stack", term287899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term287847, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


