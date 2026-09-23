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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235063;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235167 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term235219 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term235115 = new ArrayList();
        ((ArrayList) term235115).add(term235167);
        ((ArrayList) term235115).add(term235219);
        Object term235323 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term235271 = new ArrayList();
        ((ArrayList) term235271).add(term235323);
        ((ArrayList) term235271).add(term235323);
        term235063 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term235063, term235063.getClass(), "formattingElements", term235115);
        setField(term235063, term235063.getClass(), "stack", term235271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reconstructFormattingElements", argTypes, term235063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


