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
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inScope_28471792259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618073;

    public HtmlTreeBuilder_inScope_28471792259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term618163 = new ArrayList();
        ((ArrayList) term618163).add("table");
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        ((ArrayList) term618163).add((Object)null);
        term618073 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term617893 = (Object[]) newArray("java.lang.String", 32);
        setElement(term617893, 0, "table");
        setField(term618073, term618073.getClass(), "specificScopeTarget", term617893);
        setField(term618073, term618073.getClass(), "stack", term618163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inScope", argTypes, term618073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


