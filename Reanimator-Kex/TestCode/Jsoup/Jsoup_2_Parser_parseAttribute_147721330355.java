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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Character;

public class Parser_parseAttribute_147721330355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36195;
     Object term36514;

    public Parser_parseAttribute_147721330355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term36413 = new Character((char) 0);
        LinkedList term36309 = new LinkedList();
        ((LinkedList) term36309).add(term36413);
        term36195 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term36255 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term36255, term36255.getClass(), "queue", term36309);
        setField(term36195, term36195.getClass(), "tq", term36255);
        LinkedList term36516 = new LinkedList();
        term36514 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term36515 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term36514, term36514.getClass(), "stack", null);
        setField(term36515, term36515.getClass(), "queue", term36516);
        setField(term36514, term36514.getClass(), "tq", term36515);
        setField(term36514, term36514.getClass(), "doc", null);
        setField(term36514, term36514.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parseAttribute", argTypes, term36195, args);
        assertTrue(recursiveEquals(term36195, term36514));
        assertTrue(recursiveEquals(retValue, null));
    }

};


