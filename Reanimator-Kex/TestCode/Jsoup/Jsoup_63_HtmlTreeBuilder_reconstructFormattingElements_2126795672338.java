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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241729;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term241833 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term241893 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term241947 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term241781 = new ArrayList();
        ((ArrayList) term241781).add(term241833);
        ((ArrayList) term241781).add(term241833);
        ((ArrayList) term241781).add(term241893);
        ((ArrayList) term241781).add(term241947);
        ArrayList term241999 = new ArrayList();
        ((ArrayList) term241999).add(term241893);
        ((ArrayList) term241999).add(term241833);
        term241729 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term241729, term241729.getClass(), "formattingElements", term241781);
        setField(term241729, term241729.getClass(), "stack", term241999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reconstructFormattingElements", argTypes, term241729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


