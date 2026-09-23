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

public class Attribute_createFromEncoded_15272709730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123778;

    public Attribute_createFromEncoded_15272709730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123778 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term123778, term123778.getClass(), "key", "xOEqzGAmDU");
        setField(term123778, term123778.getClass(), "val", "eZFUvlxvGV");
        setField(term123778, term123778.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = "eZFUvlxvGV";
        Object retValue = callMethod(klass, "createFromEncoded", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term123778));
    }

};


