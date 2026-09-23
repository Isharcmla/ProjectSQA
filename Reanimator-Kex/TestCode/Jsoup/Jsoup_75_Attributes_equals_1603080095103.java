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

public class Attributes_equals_1603080095103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65585;
     Object term65641;
     Object term65649;
     Object term65650;

    public Attributes_equals_1603080095103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65585 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term65641 = newInstance(Class.forName("org.jsoup.helper.Validate"));
        term65649 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term65649, term65649.getClass(), "size", 0);
        setField(term65649, term65649.getClass(), "keys", null);
        setField(term65649, term65649.getClass(), "vals", null);
        term65650 = newInstance(Class.forName("org.jsoup.helper.Validate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65641;
        Object retValue = callMethod(klass, "equals", argTypes, term65585, args);
        assertTrue(recursiveEquals(term65585, term65649));
        assertTrue(recursiveEquals(term65641, term65650));
        assertTrue(recursiveEquals(retValue, false));
    }

};


