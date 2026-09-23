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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716829;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term716919 = newInstance(Class.forName("java.lang.Object"));
        Object term717009 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term717055 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term717009, term717009.getClass(), "tag", term717055);
        ArrayList term716881 = new ArrayList();
        ((ArrayList) term716881).add(term716919);
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add("thead");
        ((ArrayList) term716881).add(term717009);
        term716829 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term716829, term716829.getClass(), "stack", term716881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableBodyContext", argTypes, term716829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


