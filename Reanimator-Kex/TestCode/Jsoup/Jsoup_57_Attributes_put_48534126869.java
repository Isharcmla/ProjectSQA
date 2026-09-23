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
import java.util.LinkedHashMap;

public class Attributes_put_48534126869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14762;
     Object term14996;

    public Attributes_put_48534126869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14762 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14762, term14762.getClass(), "attributes", null);
        LinkedHashMap term14997 = new LinkedHashMap();
        term14996 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14996, term14996.getClass(), "attributes", term14997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                ";
        args[1] = "";
        callMethod(klass, "put", argTypes, term14762, args);
        assertTrue(recursiveEquals(term14762, term14996));
    }

};


