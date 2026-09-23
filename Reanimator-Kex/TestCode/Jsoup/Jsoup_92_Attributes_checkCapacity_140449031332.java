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
import java.lang.Integer;

public class Attributes_checkCapacity_140449031332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term5;

    public Attributes_checkCapacity_140449031332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1, term1.getClass(), "size", 568599855);
        setField(term1, term1.getClass(), "keys", term3);
        setField(term1, term1.getClass(), "vals", term4);
        term5 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5;
        try {
            callMethod(klass, "checkCapacity", argTypes, term1, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


