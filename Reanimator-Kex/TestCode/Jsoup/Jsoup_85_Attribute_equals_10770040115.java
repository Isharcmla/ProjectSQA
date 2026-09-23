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

public class Attribute_equals_10770040115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155624;
     Object term155734;
     Object term155896;
     Object term155897;

    public Attribute_equals_10770040115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155624 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155734 = newInstance(Class.forName("org.jsoup.examples.HtmlToPlainText$FormattingVisitor"));
        term155896 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155896, term155896.getClass(), "key", null);
        setField(term155896, term155896.getClass(), "val", null);
        setField(term155896, term155896.getClass(), "parent", null);
        term155897 = newInstance(Class.forName("org.jsoup.examples.HtmlToPlainText$FormattingVisitor"));
        setIntField(term155897, term155897.getClass(), "width", 0);
        setField(term155897, term155897.getClass(), "accum", null);
        setField(term155897, term155897.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155734;
        Object retValue = callMethod(klass, "equals", argTypes, term155624, args);
        assertTrue(recursiveEquals(term155624, term155896));
        assertTrue(recursiveEquals(term155734, term155897));
        assertTrue(recursiveEquals(retValue, false));
    }

};


