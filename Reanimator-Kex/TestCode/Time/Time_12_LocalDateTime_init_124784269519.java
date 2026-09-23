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

public class LocalDateTime_init_124784269519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;
     Object term713;
     Object term715;
     Object term717;
     Object term719;
     Object term721;
     Object term723;

    public LocalDateTime_init_124784269519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711 = new Integer(1048535127);
        term713 = new Integer(-655067527);
        term715 = new Integer(-6029667);
        term717 = new Integer(-2068769794);
        term719 = new Integer(-117576464);
        term721 = new Integer(-1007160944);
        term723 = new Integer(1135664017);
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
        args[0] = term711;
        args[1] = term713;
        args[2] = term715;
        args[3] = term717;
        args[4] = term719;
        args[5] = term721;
        args[6] = term723;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


