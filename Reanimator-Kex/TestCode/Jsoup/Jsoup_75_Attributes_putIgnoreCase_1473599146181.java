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

public class Attributes_putIgnoreCase_1473599146181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352014;
     Object term352077;

    public Attributes_putIgnoreCase_1473599146181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352014 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term351912 = (Object[]) newArray("java.lang.String", 0);
        Object[] term351915 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term352014, term352014.getClass(), "size", 0);
        setField(term352014, term352014.getClass(), "keys", term351912);
        setField(term352014, term352014.getClass(), "vals", term351915);
        term352077 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term352078 = (Object[]) newArray("java.lang.String", 4);
        Object[] term352081 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term352077, term352077.getClass(), "size", 1);
        setElement(term352078, 0, "");
        setField(term352077, term352077.getClass(), "keys", term352078);
        setField(term352077, term352077.getClass(), "vals", term352081);
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
        callMethod(klass, "putIgnoreCase", argTypes, term352014, args);
        assertTrue(recursiveEquals(term352014, term352077));
    }

};


