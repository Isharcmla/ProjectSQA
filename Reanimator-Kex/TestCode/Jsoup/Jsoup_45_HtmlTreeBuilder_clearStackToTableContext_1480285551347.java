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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718702;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term718830 = newInstance(Class.forName("java.lang.Object"));
        Object term718890 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term718936 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term718936, term718936.getClass(), "tagName", "");
        setField(term718890, term718890.getClass(), "tag", term718936);
        ArrayList term718754 = new ArrayList();
        ((ArrayList) term718754).add((Object)null);
        ((ArrayList) term718754).add((Object)null);
        ((ArrayList) term718754).add("table");
        ((ArrayList) term718754).add("table");
        ((ArrayList) term718754).add(term718830);
        ((ArrayList) term718754).add("table");
        ((ArrayList) term718754).add("table");
        ((ArrayList) term718754).add(term718890);
        term718702 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term718702, term718702.getClass(), "stack", term718754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableContext", argTypes, term718702, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


