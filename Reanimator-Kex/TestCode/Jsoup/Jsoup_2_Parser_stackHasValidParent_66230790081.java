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

public class Parser_stackHasValidParent_66230790081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45770;
     Object term45937;

    public Parser_stackHasValidParent_66230790081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45914 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term45824 = new LinkedList();
        ((LinkedList) term45824).add(term45914);
        term45770 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term45770, term45770.getClass(), "stack", term45824);
        term45937 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term45937, term45937.getClass(), "canContainBlock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term45937;
        try {
            callMethod(klass, "stackHasValidParent", argTypes, term45770, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


