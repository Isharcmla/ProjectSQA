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
import java.lang.Object;
import java.util.LinkedList;

public class Parser_parse_165820430107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69664;

    public Parser_parse_165820430107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69868 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term69778 = new LinkedList();
        ((LinkedList) term69778).add(term69868);
        ((LinkedList) term69778).add((Object)null);
        term69664 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term69724 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term69724, term69724.getClass(), "queue", term69778);
        setField(term69664, term69664.getClass(), "tq", term69724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term69664, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


