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

public class Attributes_checkCapacity_1404490313159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231731;
     Object term233295;

    public Attributes_checkCapacity_1404490313159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231731 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term231635 = (Object[]) newArray("java.lang.String", 514);
        Object[] term231638 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term231731, term231731.getClass(), "size", 384);
        setField(term231731, term231731.getClass(), "keys", term231635);
        setField(term231731, term231731.getClass(), "vals", term231638);
        term233295 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term233296 = (Object[]) newArray("java.lang.String", 768);
        Object[] term233297 = (Object[]) newArray("java.lang.String", 768);
        setIntField(term233295, term233295.getClass(), "size", 384);
        setField(term233295, term233295.getClass(), "keys", term233296);
        setField(term233295, term233295.getClass(), "vals", term233297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 515;
        callMethod(klass, "checkCapacity", argTypes, term231731, args);
        assertTrue(recursiveEquals(term231731, term233295));
    }

};


