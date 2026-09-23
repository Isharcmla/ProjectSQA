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

public class Attributes_putIgnoreCase_1473599146245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601929;
     Object term2300411;

    public Attributes_putIgnoreCase_1473599146245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601929 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term601827 = (Object[]) newArray("java.lang.String", 0);
        Object[] term601830 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term601929, term601929.getClass(), "size", 0);
        setField(term601929, term601929.getClass(), "keys", term601827);
        setField(term601929, term601929.getClass(), "vals", term601830);
        term2300411 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2300412 = (Object[]) newArray("java.lang.String", 4);
        Object[] term2300415 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term2300411, term2300411.getClass(), "size", 1);
        setElement(term2300412, 0, "");
        setField(term2300411, term2300411.getClass(), "keys", term2300412);
        setField(term2300411, term2300411.getClass(), "vals", term2300415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        callMethod(klass, "putIgnoreCase", argTypes, term601929, args);
        assertTrue(recursiveEquals(term601929, term2300411));
    }

};


