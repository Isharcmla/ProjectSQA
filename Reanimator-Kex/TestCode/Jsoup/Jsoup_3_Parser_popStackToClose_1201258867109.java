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

public class Parser_popStackToClose_1201258867109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72336;

    public Parser_popStackToClose_1201258867109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72480 = newInstance(Class.forName("java.lang.Object"));
        Object term72534 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term72580 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term72534, term72534.getClass(), "tag", term72580);
        LinkedList term72390 = new LinkedList();
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72480);
        ((LinkedList) term72390).add(term72534);
        term72336 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term72336, term72336.getClass(), "stack", term72390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term72336, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


