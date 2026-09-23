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

public class Parser_addChildToParent_715844109105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66969;
     Object term67183;

    public Parser_addChildToParent_715844109105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term67023 = new LinkedList();
        term66969 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term66969, term66969.getClass(), "stack", term67023);
        term67183 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term67183, term67183.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term67183;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term66969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


