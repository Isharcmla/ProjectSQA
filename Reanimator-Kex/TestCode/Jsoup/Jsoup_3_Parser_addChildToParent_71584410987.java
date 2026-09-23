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
import java.util.LinkedList;
import java.lang.Object;

public class Parser_addChildToParent_71584410987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54706;
     Object term54904;

    public Parser_addChildToParent_71584410987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54850 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term54760 = new LinkedList();
        ((LinkedList) term54760).add(term54850);
        term54706 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term54706, term54706.getClass(), "stack", term54760);
        term54904 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term54904, term54904.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term54904;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term54706, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


