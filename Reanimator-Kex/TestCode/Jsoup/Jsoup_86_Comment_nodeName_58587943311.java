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

public class Comment_nodeName_58587943311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term47613;

    public Comment_nodeName_58587943311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        setField(term67, term67.getClass(), "value", term68);
        setField(term67, term67.getClass(), "parentNode", null);
        setIntField(term67, term67.getClass(), "siblingIndex", 568599855);
        term47613 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term47614 = newInstance(Class.forName("java.lang.Object"));
        setField(term47613, term47613.getClass(), "value", term47614);
        setField(term47613, term47613.getClass(), "parentNode", null);
        setIntField(term47613, term47613.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term67, args);
        assertTrue(recursiveEquals(term67, term47613));
        assertTrue(recursiveEquals(retValue, "#comment"));
    }

};


