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

public class HtmlTreeBuilder_inScope_28471792456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298537;

    public HtmlTreeBuilder_inScope_28471792456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term298627 = newInstance(Class.forName("java.lang.Object"));
        Object term298687 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term298733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term298687, term298687.getClass(), "tag", term298733);
        ArrayList term298589 = new ArrayList();
        ((ArrayList) term298589).add((Object)null);
        ((ArrayList) term298589).add((Object)null);
        ((ArrayList) term298589).add(term298627);
        ((ArrayList) term298589).add(term298687);
        term298537 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term298537, term298537.getClass(), "stack", term298589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inScope", argTypes, term298537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


