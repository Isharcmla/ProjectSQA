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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_putIgnoreCase_1473599146525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13897480;

    public Attributes_putIgnoreCase_1473599146525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13897480 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13897391 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term13897480, term13897480.getClass(), "size", 1);
        setElement(term13897391, 0, "");
        setField(term13897480, term13897480.getClass(), "keys", term13897391);
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
        try {
            callMethod(klass, "putIgnoreCase", argTypes, term13897480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


