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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605823;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term605973 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term606019 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term605973, term605973.getClass(), "tag", term606019);
        ArrayList term605875 = new ArrayList();
        ((ArrayList) term605875).add((Object)null);
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add((Object)null);
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add("tr");
        ((ArrayList) term605875).add(term605973);
        term605823 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term605823, term605823.getClass(), "stack", term605875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term605823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


