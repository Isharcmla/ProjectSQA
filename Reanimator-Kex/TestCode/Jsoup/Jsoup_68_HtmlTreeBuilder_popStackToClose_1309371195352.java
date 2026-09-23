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

public class HtmlTreeBuilder_popStackToClose_1309371195352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293551;

    public HtmlTreeBuilder_popStackToClose_1309371195352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293641 = newInstance(Class.forName("java.lang.Object"));
        Object term293701 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term293747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term293701, term293701.getClass(), "tag", term293747);
        ArrayList term293603 = new ArrayList();
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add(term293641);
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add((Object)null);
        ((ArrayList) term293603).add(term293701);
        term293551 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term293551, term293551.getClass(), "stack", term293603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term293551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


