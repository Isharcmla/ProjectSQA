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

public class Parser_isTrackErrors_124299863541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15680;
     Object term15685;

    public Parser_isTrackErrors_124299863541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15680 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setIntField(term15680, term15680.getClass(), "maxErrors", 1);
        term15685 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term15685, term15685.getClass(), "treeBuilder", null);
        setIntField(term15685, term15685.getClass(), "maxErrors", 1);
        setField(term15685, term15685.getClass(), "errors", null);
        setField(term15685, term15685.getClass(), "settings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isTrackErrors", argTypes, term15680, args);
        assertTrue(recursiveEquals(term15680, term15685));
        assertTrue(recursiveEquals(retValue, true));
    }

};


