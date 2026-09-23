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
import java.lang.Object;

public class Comment_isXmlDeclaration_158745458825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90961;
     Object term91076;

    public Comment_isXmlDeclaration_158745458825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90961 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term91019 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term90961, term90961.getClass(), "value", term91019);
        term91076 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term91077 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term91077, term91077.getClass(), "size", 0);
        setField(term91077, term91077.getClass(), "keys", null);
        setField(term91077, term91077.getClass(), "vals", null);
        setField(term91076, term91076.getClass(), "value", term91077);
        setField(term91076, term91076.getClass(), "parentNode", null);
        setIntField(term91076, term91076.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isXmlDeclaration", argTypes, term90961, args);
        assertTrue(recursiveEquals(term90961, term91076));
        assertTrue(recursiveEquals(retValue, false));
    }

};


