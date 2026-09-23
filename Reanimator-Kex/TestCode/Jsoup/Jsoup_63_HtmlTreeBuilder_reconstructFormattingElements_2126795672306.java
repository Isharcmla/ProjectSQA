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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231921;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term232025 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term232077 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term231973 = new ArrayList();
        ((ArrayList) term231973).add(term232025);
        ((ArrayList) term231973).add(term232025);
        ((ArrayList) term231973).add(term232077);
        Object term232181 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term232129 = new ArrayList();
        ((ArrayList) term232129).add(term232181);
        ((ArrayList) term232129).add(term232181);
        term231921 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term231921, term231921.getClass(), "formattingElements", term231973);
        setField(term231921, term231921.getClass(), "stack", term232129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reconstructFormattingElements", argTypes, term231921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


