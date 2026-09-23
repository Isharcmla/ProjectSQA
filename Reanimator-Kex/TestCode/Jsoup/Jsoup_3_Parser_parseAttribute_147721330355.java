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
     Object term36532;
     Object term36851;

    public Parser_parseAttribute_147721330355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term36750 = new Character((char) 0);
        LinkedList term36646 = new LinkedList();
        ((LinkedList) term36646).add(term36750);
        term36532 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term36592 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term36592, term36592.getClass(), "queue", term36646);
        setField(term36532, term36532.getClass(), "tq", term36592);
        LinkedList term36853 = new LinkedList();
        term36851 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term36852 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term36851, term36851.getClass(), "stack", null);
        setField(term36852, term36852.getClass(), "queue", term36853);
        setField(term36851, term36851.getClass(), "tq", term36852);
        setField(term36851, term36851.getClass(), "doc", null);
        setField(term36851, term36851.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parseAttribute", argTypes, term36532, args);
        assertTrue(recursiveEquals(term36532, term36851));
        assertTrue(recursiveEquals(retValue, null));
    }

};


