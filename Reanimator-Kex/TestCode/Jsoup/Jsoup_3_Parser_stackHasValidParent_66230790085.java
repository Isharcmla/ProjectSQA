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

public class Parser_stackHasValidParent_66230790085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53457;
     Object term53624;

    public Parser_stackHasValidParent_66230790085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53601 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term53511 = new LinkedList();
        ((LinkedList) term53511).add(term53601);
        term53457 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term53457, term53457.getClass(), "stack", term53511);
        term53624 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term53624, term53624.getClass(), "canContainBlock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term53624;
        try {
            callMethod(klass, "stackHasValidParent", argTypes, term53457, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


