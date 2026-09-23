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

public class Comment_isXmlDeclaration_158745458851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150662;
     Object term153681;

    public Comment_isXmlDeclaration_158745458851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150662 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        setField(term150662, term150662.getClass(), "value", "#comment                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        term153681 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        setField(term153681, term153681.getClass(), "value", "#comment                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term153681, term153681.getClass(), "parentNode", null);
        setIntField(term153681, term153681.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isXmlDeclaration", argTypes, term150662, args);
        assertTrue(recursiveEquals(term150662, term153681));
        assertTrue(recursiveEquals(retValue, false));
    }

};


