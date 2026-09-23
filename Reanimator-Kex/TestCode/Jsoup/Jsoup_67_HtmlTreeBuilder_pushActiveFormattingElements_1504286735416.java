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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277186;
     Object term277404;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term277290 = new ArrayList();
        Object term277344 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term277238 = new ArrayList();
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add((Object)null);
        ((ArrayList) term277238).add(term277290);
        ((ArrayList) term277238).add(term277344);
        term277186 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term277186, term277186.getClass(), "formattingElements", term277238);
        term277404 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term277450 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term277450, term277450.getClass(), "tagName", " ");
        setField(term277404, term277404.getClass(), "tag", term277450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term277404;
        try {
            callMethod(klass, "pushActiveFormattingElements", argTypes, term277186, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


