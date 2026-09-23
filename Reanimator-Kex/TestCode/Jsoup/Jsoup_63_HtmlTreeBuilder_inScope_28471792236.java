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

public class HtmlTreeBuilder_inScope_28471792236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218610;

    public HtmlTreeBuilder_inScope_28471792236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term218700 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term218662 = new ArrayList();
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add(term218700);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        ((ArrayList) term218662).add((Object)null);
        term218610 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term218511 = (Object[]) newArray("java.lang.String", 9);
        setField(term218610, term218610.getClass(), "specificScopeTarget", term218511);
        setField(term218610, term218610.getClass(), "stack", term218662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "inScope", argTypes, term218610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


