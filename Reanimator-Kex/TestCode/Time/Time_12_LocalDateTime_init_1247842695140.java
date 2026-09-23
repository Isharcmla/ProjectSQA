package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LocalDateTime_init_1247842695140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38270;
     Object term38272;
     Object term38274;
     Object term38276;
     Object term38278;
     Object term38280;
     Object term38282;

    public LocalDateTime_init_1247842695140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38270 = new Integer(0);
        term38272 = new Integer(0);
        term38274 = new Integer(0);
        term38276 = new Integer(0);
        term38278 = new Integer(0);
        term38280 = new Integer(0);
        term38282 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[8];
        args[0] = term38270;
        args[1] = term38272;
        args[2] = term38274;
        args[3] = term38276;
        args[4] = term38278;
        args[5] = term38280;
        args[6] = term38282;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


