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

public class Comment_getData_10832813223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90744;
     Object term90859;

    public Comment_getData_10832813223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90744 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term90802 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term90744, term90744.getClass(), "value", term90802);
        term90859 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term90860 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term90860, term90860.getClass(), "size", 0);
        setField(term90860, term90860.getClass(), "keys", null);
        setField(term90860, term90860.getClass(), "vals", null);
        setField(term90859, term90859.getClass(), "value", term90860);
        setField(term90859, term90859.getClass(), "parentNode", null);
        setIntField(term90859, term90859.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term90744, args);
        assertTrue(recursiveEquals(term90744, term90859));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


