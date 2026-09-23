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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inButtonScope_1961631170261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618850;

    public HtmlTreeBuilder_inButtonScope_1961631170261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term618940 = new ArrayList();
        term618850 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term618662 = (Object[]) newArray("java.lang.String", 1);
        setElement(term618662, 0, "th");
        setField(term618850, term618850.getClass(), "specificScopeTarget", term618662);
        setField(term618850, term618850.getClass(), "stack", term618940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "inButtonScope", argTypes, term618850, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


