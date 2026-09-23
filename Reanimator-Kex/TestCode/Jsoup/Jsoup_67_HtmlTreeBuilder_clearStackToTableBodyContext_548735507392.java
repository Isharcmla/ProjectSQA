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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271112;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term271202 = newInstance(Class.forName("java.lang.Object"));
        Object term271256 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term271302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term271302, term271302.getClass(), "tagName", "");
        setField(term271256, term271256.getClass(), "tag", term271302);
        ArrayList term271164 = new ArrayList();
        ((ArrayList) term271164).add((Object)null);
        ((ArrayList) term271164).add((Object)null);
        ((ArrayList) term271164).add((Object)null);
        ((ArrayList) term271164).add(term271202);
        ((ArrayList) term271164).add(term271256);
        term271112 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term271112, term271112.getClass(), "stack", term271164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableBodyContext", argTypes, term271112, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


