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

public class Parser_stackHasValidParent_662307900129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88359;
     Object term88511;

    public Parser_stackHasValidParent_662307900129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term88413 = new LinkedList();
        ((LinkedList) term88413).add((Object)null);
        term88359 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term88359, term88359.getClass(), "stack", term88413);
        term88511 = newInstance(Class.forName("org.jsoup.parser.Tag"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term88511;
        try {
            callMethod(klass, "stackHasValidParent", argTypes, term88359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


