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

public class HtmlTreeBuilder_insert_1024743636480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311783;

    public HtmlTreeBuilder_insert_1024743636480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term311895 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term311941 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term311941, term311941.getClass(), "tagName", "");
        setField(term311895, term311895.getClass(), "tag", term311941);
        ArrayList term311835 = new ArrayList();
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add((Object)null);
        ((ArrayList) term311835).add(term311895);
        term311783 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term311783, term311783.getClass(), "stack", term311835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term311783, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


