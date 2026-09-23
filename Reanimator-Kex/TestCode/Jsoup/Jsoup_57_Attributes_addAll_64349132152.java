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

public class Attributes_addAll_64349132152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10003;
     Object term11151;
     Object term11152;

    public Attributes_addAll_64349132152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10003 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10003, term10003.getClass(), "attributes", null);
        term11151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11151, term11151.getClass(), "attributes", null);
        term11152 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11152, term11152.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term10003;
        callMethod(klass, "addAll", argTypes, term10003, args);
        assertTrue(recursiveEquals(term10003, term11151));
        assertTrue(recursiveEquals(term10003, term11152));
    }

};


