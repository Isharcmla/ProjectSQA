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

public class Parser_isTrackErrors_124299863528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3305;
     Object term3371;

    public Parser_isTrackErrors_124299863528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3305 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setIntField(term3305, term3305.getClass(), "maxErrors", 1);
        term3371 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term3371, term3371.getClass(), "treeBuilder", null);
        setIntField(term3371, term3371.getClass(), "maxErrors", 1);
        setField(term3371, term3371.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isTrackErrors", argTypes, term3305, args);
        assertTrue(recursiveEquals(term3305, term3371));
        assertTrue(recursiveEquals(retValue, true));
    }

};


