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

public class Attributes_checkCapacity_1404490313160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199832;
     Object term279190;

    public Attributes_checkCapacity_1404490313160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199832 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term199740 = (Object[]) newArray("java.lang.String", 0);
        Object[] term199743 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term199832, term199832.getClass(), "size", 1);
        setField(term199832, term199832.getClass(), "keys", term199740);
        setField(term199832, term199832.getClass(), "vals", term199743);
        term279190 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term279216 = (Object[]) newArray("java.lang.String", 4);
        Object[] term279244 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term279190, term279190.getClass(), "size", 1);
        setField(term279190, term279190.getClass(), "keys", term279216);
        setField(term279190, term279190.getClass(), "vals", term279244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "checkCapacity", argTypes, term199832, args);
        assertTrue(recursiveEquals(term199832, term279190));
    }

};


