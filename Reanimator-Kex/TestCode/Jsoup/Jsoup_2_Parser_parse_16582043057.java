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
import java.lang.Object;
import java.util.LinkedList;

public class Parser_parse_16582043057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36699;

    public Parser_parse_16582043057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term36813 = new LinkedList();
        ((LinkedList) term36813).add((Object)null);
        term36699 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term36759 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term36759, term36759.getClass(), "queue", term36813);
        setField(term36699, term36699.getClass(), "tq", term36759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term36699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


