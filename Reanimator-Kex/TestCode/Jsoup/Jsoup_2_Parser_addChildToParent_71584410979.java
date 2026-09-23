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
import java.util.LinkedList;
import java.lang.Object;

public class Parser_addChildToParent_71584410979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44999;
     Object term45107;

    public Parser_addChildToParent_71584410979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term45053 = new LinkedList();
        term44999 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term44999, term44999.getClass(), "stack", term45053);
        term45107 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term45153 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45107, term45107.getClass(), "tag", term45153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term45107;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term44999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


