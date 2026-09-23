package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.tz.EqualityUtils.*;
import java.util.HashMap;
import java.util.ArrayList;

public class ZoneInfoCompiler_init_77840009930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57908;

    public ZoneInfoCompiler_init_77840009930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57909 = new HashMap();
        ArrayList term57910 = new ArrayList();
        ArrayList term57912 = new ArrayList();
        term57908 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term57908, term57908.getClass(), "iRuleSets", term57909);
        setField(term57908, term57908.getClass(), "iZones", term57910);
        setField(term57908, term57908.getClass(), "iLinks", term57912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57908));
    }

};


