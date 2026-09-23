package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DateUtils_modify_157495637596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17073;
     Object term17074;
     Object term17076;

    public DateUtils_modify_157495637596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17073 = newInstance(Class.forName("org.apache.commons.lang3.time.DateUtils"));
        term17074 = new Integer(0);
        term17076 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Calendar");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term17074;
        args[2] = term17076;
        callMethod(klass, "modify", argTypes, term17073, args);
    }

};


