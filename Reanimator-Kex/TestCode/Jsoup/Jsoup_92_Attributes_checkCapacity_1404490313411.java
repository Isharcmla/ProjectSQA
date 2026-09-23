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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_checkCapacity_1404490313411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8317710;

    public Attributes_checkCapacity_1404490313411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8317710 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8317628 = (Object[]) newArray("java.lang.String", 512);
        setIntField(term8317710, term8317710.getClass(), "size", -58589376);
        setField(term8317710, term8317710.getClass(), "keys", term8317628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 956563073;
        try {
            callMethod(klass, "checkCapacity", argTypes, term8317710, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


