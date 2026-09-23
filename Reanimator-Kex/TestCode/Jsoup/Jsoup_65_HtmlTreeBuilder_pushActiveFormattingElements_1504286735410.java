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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496972;
     Object term497222;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term497245 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term497245, term497245.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Object term497162 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term497024 = new ArrayList();
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add((Object)null);
        ((ArrayList) term497024).add(term497245);
        ((ArrayList) term497024).add(term497162);
        term496972 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term496972, term496972.getClass(), "formattingElements", term497024);
        term497222 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term497222, term497222.getClass(), "tag", term497245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term497222;
        try {
            callMethod(klass, "pushActiveFormattingElements", argTypes, term496972, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


