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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_hasKeyIgnoreCase_25862520548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public Attributes_hasKeyIgnoreCase_25862520548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term557 = (Object[]) newArray("java.lang.String", 0);
        Object[] term558 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term555, term555.getClass(), "size", 1622346318);
        setField(term555, term555.getClass(), "keys", term557);
        setField(term555, term555.getClass(), "vals", term558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        try {
            callMethod(klass, "hasKeyIgnoreCase", argTypes, term555, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


