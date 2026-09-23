package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attributes_equals_1603080095153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92504;
     Object term92570;
     Object term147194;
     Object term147197;

    public Attributes_equals_1603080095153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92504 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term92570 = newInstance(Class.forName("java.lang.NullPointerException"));
        term147194 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term147194, term147194.getClass(), "size", 0);
        setField(term147194, term147194.getClass(), "keys", null);
        setField(term147194, term147194.getClass(), "vals", null);
        term147197 = newInstance(Class.forName("java.lang.NullPointerException"));
        setField(term147197, term147197.getClass(), "backtrace", null);
        setField(term147197, term147197.getClass(), "detailMessage", null);
        setField(term147197, term147197.getClass(), "cause", null);
        setField(term147197, term147197.getClass(), "stackTrace", null);
        setIntField(term147197, term147197.getClass(), "depth", 0);
        setField(term147197, term147197.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term92570;
        Object retValue = callMethod(klass, "equals", argTypes, term92504, args);
        assertTrue(recursiveEquals(term92504, term147194));
        assertTrue(recursiveEquals(term92570, term147197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


