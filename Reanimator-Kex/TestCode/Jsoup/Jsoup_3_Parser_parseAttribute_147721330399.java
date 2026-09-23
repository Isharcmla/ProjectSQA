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

public class Parser_parseAttribute_147721330399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63146;

    public Parser_parseAttribute_147721330399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term63260 = new LinkedList();
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        ((LinkedList) term63260).add((Object)null);
        term63146 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term63206 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term63206, term63206.getClass(), "queue", term63260);
        setField(term63146, term63146.getClass(), "tq", term63206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseAttribute", argTypes, term63146, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


